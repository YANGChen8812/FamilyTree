package basis;

public class Human {
	
	//********** VARIABLES **********
	
	private int id;
	private String fname;
	private String lname;
	private char sexe;
	private String birthDate;
	private String father;
	private String mother;
	
	//********** BUILDERS **********//
	
	public Human(){
		System.out.println("Creating a human");
		this.id=0;
		this.fname="Inconnu";
		this.lname="Inconnu";
		this.sexe='Z';
		this.birthDate="Inconnu";
		this.father="Inconnu";
		this.mother="Inconnu";
	}
	
	public Human(String pfname, String plname, char pSexe, String pbirthDate, String pfather, String pmother){
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
	
	public char getSexe(){
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
		if(pId<=0){
			System.err.println("INVALID personID, negative or zero value");
			pId = 0;
		}
		this.id=pId;
	}
		
	public void setfname(String pfname){
		for(int i=0; i<pfname.length(); i++ ){
			if(!Character.isLetter(pfname.charAt(i))){	 
				pfname="";
				System.err.println("INVALID personFIRSTNAME, contains non letter character");
				break;
			}
		}
		this.fname=pfname;
	}
		
	public void setlname(String plname){
		for(int i=0; i<plname.length(); i++ ){	
			if(!Character.isLetter(plname.charAt(i))){
				plname="";
				System.err.println("INVALID personLASTNAME, contains non letter character");
				break;
			}
		}
		this.lname=plname;
	}
		
	public void setSexe(char pSexe){
		if(pSexe!='M' && pSexe!='F')
			this.sexe = 'Z';
		this.sexe=pSexe;
	}
	
	public void setbirthDate(String pbirthDate){
		
		this.birthDate=pbirthDate;
	}
	
	public void setfather(String pfather){
		for(int i=0; i<pfather.length(); i++ ){
			if(!Character.isLetter(pfather.charAt(i))){	 
				pfather="";
				System.err.println("INVALID personFIRSTNAME, contains non letter character");
				break;
			}
		}
		this.father=pfather;
	}
	
	public void setmother(String pmother){
		for(int i=0; i<pmother.length(); i++ ){
			if(!Character.isLetter(pmother.charAt(i))){	 
				pmother="";
				System.err.println("INVALID personFIRSTNAME, contains non letter character");
				break;
			}
		}
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
