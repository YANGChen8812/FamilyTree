package basis;

public class Human {
	
	//********** VARIABLES **********
	
	private int id;
	private String fname;
	private String lname;
	private String sexe;
	private String birthDate;
	private String father;
	private String mother;
	
	//********** BUILDERS **********//
	
	public Human(){
		System.out.println("Creating a human");
		this.id=0;
		this.fname="Inconnu";
		this.lname="Inconnu";
		this.sexe="Inconnu";
		this.birthDate="Inconnu";
		this.father="Inconnu";
		this.mother="Inconnu";
	}
	
	public Human(String pfname, String plname, String pSexe, String pbirthDate, String pfather, String pmother){
		System.out.println("Building a human called "+plname+" "+pfname+" born "+pbirthDate+" and his father is "+pfather+" and his mother is "+pmother);
		this.fname=pfname;
		this.lname=plname;
		this.sexe=pSexe;
		this.birthDate=pbirthDate;
		this.father=pfather;
		this.mother=pmother;
	}
	
	//********** GETTERS **********//
	
	public String getfname(){
		return this.fname;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getlname(){
		return this.lname;
	}
	
	public String getSexe(){
		return this.sexe;
	}
	
	public String getbirthDate(){
		return this.birthDate;
	}
	
	public String getfather(){
		return this.father;
	}
	
	public String getmother(){
		return this.mother;
	}
	
	//********** SETTERS **********//
	public void setId(int pId){
		this.id=pId;
	}
	
	public void setfname(String pfname){
		this.fname=pfname;
	}
	
	public void setlname(String plname){
		this.lname=plname;
	}
	
	public void setSexe(String pSexe){
		this.sexe=pSexe;
	}
	
	public void setbirthDate(String pbirthDate){
		this.birthDate=pbirthDate;
	}
	
	public void setfather(String pfather){
		this.father=pfather;
	}
	
	public void setmother(String pmother){
		this.mother=pmother;
	}
	
	//*****METHODS*****
	public boolean isParent(Human pParent, Human pChild){
		if(pParent.getfname()==pChild.getfather() || pParent.getfname()==pChild.getmother()){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public void parentLink(Human pPeople){
		System.out.println("Mister "+pPeople.getlname()+" "+pPeople.getfname()+" have for father "+pPeople);
	}
}
