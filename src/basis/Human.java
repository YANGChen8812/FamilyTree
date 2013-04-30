package basis;

import java.util.ArrayList;
import java.util.List;

public class Human {

	// ********** VARIABLES **********

	private int id;
	private String fname;
	private String lname;
	private String sexe;
	private String birthDate;
	private String father;
	private String mother;

	// ********** BUILDERS **********//

	public Human() {
		System.out.println("Creating a human from ZERO VALUES");
		this.id = 0;
		this.fname = "Inconnu";
		this.lname = "Inconnu";
		this.sexe = "Z";
		this.birthDate = "Inconnu";
		this.father = "0";
		this.mother = "0";
	}

	public Human(String pfname, String plname, String pSexe, String pbirthDate,
			String pfather, String pmother, int pid) {
		System.out.println("Building a human called " + plname + " " + pfname
				+ " born " + pbirthDate + " and his father is " + pfather
				+ " and his mother is " + pmother);
		this.fname = pfname;
		this.lname = plname;
		this.sexe = pSexe;
		this.birthDate = pbirthDate;
		this.father = pfather;
		this.mother = pmother;
		this.id = pid;
	}

	// ********** GETTERS **********//

	public String getfname() {
		return this.fname;
	}

	public int getId() {
		return this.id;
	}

	public String getlname() {
		return this.lname;
	}

	public String getSexe() {
		return this.sexe;
	}

	public String getbirthDate() {
		return this.birthDate;
	}

	public String getfather() {
		return this.father;
	}

	public String getmother() {
		return this.mother;
	}

	// ********** SETTERS **********//
	public void setId(int pId) {
		if (pId < 0) {
			System.err.println("INVALID ID, ID have to be greater than 0");
			pId = 0;
		}
		this.id = pId;
	}

	public void setfname(String pfname) {
		for (int i = 0; i < pfname.length(); i++) {
			if (!Character.isLetter(pfname.charAt(i))) {
				pfname = "";
				System.err.println("INVALID personFIRSTNAME, contains non letter character");
				break;
			}
		}
		this.fname = pfname;
	}

	public void setlname(String plname) {
		for (int i = 0; i < plname.length(); i++) {
			if (!Character.isLetter(plname.charAt(i))) {
				plname = "";
				System.err.println("INVALID personLASTNAME, contains non letter character");
				break;
			}
		}
		this.lname = plname;
	}

	public void setSexe(String pSexe) {
		if (pSexe == "M" || pSexe == "F") {
			this.sexe = pSexe;

		} else {
			this.sexe = "Z";
			System.err.println("INVALID SEX : value :" + pSexe);
		}
	}

	public void setbirthDate(String pbirthDate) {
		if (pbirthDate.length() == 10) {
			if (pbirthDate.charAt(2) != '/' || pbirthDate.charAt(5) != '/') {
				pbirthDate = "";
				System.err.println("INVALID BIRTHDATE, bad format, no slashes");
			}
			for (int i = 0; i < 2; i++) {
				if (!Character.isDigit(pbirthDate.charAt(i))) {
					pbirthDate = "";
					System.err.println("INVALID BIRTHDATE, contains character, first field is not a number");
				}
			}
			for (int i = 3; i < 5; i++) {
				if (!Character.isDigit(pbirthDate.charAt(i))) {
					pbirthDate = "";
					System.err.println("INVALID BIRTHDATE, contains character, second field is not a number");
				}
			}
			for (int i = 6; i < 10; i++) {
				if (!Character.isDigit(pbirthDate.charAt(i))) {
					pbirthDate = "";
					System.err.println("INVALID BIRTHDATE, contains character, third field is not a number");
				}
			}
		}
		else pbirthDate = "";
		this.birthDate = pbirthDate;
	}

	public void setfather(String pfather) {
		for (int i = 0; i < pfather.length(); i++) {
			if (!Character.isDigit(pfather.charAt(i)) && (pfather.charAt(i) != ' ')) {
				pfather = "0";
				System.err.println("INVALID FATHER NAME, contains invalid character");
				break;
			}
		}
		this.father = pfather;
	}

	public void setmother(String pmother) {
		for (int i = 0; i < pmother.length(); i++) {
			if (!Character.isDigit(pmother.charAt(i)) && (pmother.charAt(i) != ' ')) {
				pmother = "0";
				System.err.println("INVALID MOTHER NAME, contains invalid character");
				break;
			}
		}
		this.mother = pmother;
	}

	// *****METHODS*****
	public boolean isParent(Human pParent, Human pChild) {
		int idFather=Integer.parseInt(pChild.getfather());
		int idMother=Integer.parseInt(pChild.getmother());
		if (pParent.getId() == idFather || pParent.getId() == idMother) {
			return true;
		} else {
			return false;
		}

	}

	public List<Human> parentLink(Human pPeople, List<Human> allpeople) {
		int idFather=Integer.parseInt(pPeople.getfather());
		int idMother=Integer.parseInt(pPeople.getmother());
		List<Human> parents = new ArrayList<Human>();
		Human father = new Human();
		Human mother = new Human();
		for (Human i : allpeople) {
			if (i.getId() == idFather) {
				father = i;
			} else if (i.getId() == idMother) {
				mother = i;
			}
		}
		parents.set(0, father);
		parents.set(1, mother);
		System.out.println("Mister " + pPeople.getlname() + " "
				+ pPeople.getfname() + " have for father "
				+ father.getfname() + " and for mother "
				+ mother.getfname());
		return parents;
	}
}
