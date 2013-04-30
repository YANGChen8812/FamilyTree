package basis;

import java.util.ArrayList;
import java.util.List;

public class Human {
	
	//********** VARIABLES **********
	
	private String id;
	private String fname;
	private String lname;
	private String sexe;
	private String birthDate;
	private String father;
	private String mother;
	
	//********** BUILDERS **********//
	
	public Human(){
		System.out.println("Creating a human from ZERO VALUES");
		this.id="0";
		this.fname="Inconnu";
		this.lname="Inconnu";
		this.sexe="Z";
		this.birthDate="Inconnu";
		this.father="Inconnu";
		this.mother="Inconnu";
	}
	
	public Human(String pfname, String plname, String pSexe, String pbirthDate, String pfather, String pmother, String pid){
		System.out.println("Building a human called "+plname+" "+pfname+" born "+pbirthDate+" and his father is "+pfather+" and his mother is "+pmother);
		this.fname=pfname;
		this.lname=plname;
		this.sexe=pSexe;
		this.birthDate=pbirthDate;
		this.father=pfather;
		this.mother=pmother;
		this.id=pid;
	}
	
	//********** GETTERS **********//
	
	public String getfname(){
		return this.fname;
	}
	
	public String getId(){
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
	public void setId(String pId){
		for(int i=0;i<pId.length();i++){
			if(!Character.isDigit(pId.charAt(i))){
				pId="";
				System.err.println("INVALID person ID, contains non digit character");
				break;
			}
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
		
	public void setSexe(String pSexe){
		if( pSexe=="M" || pSexe=="F" )
		{
			this.sexe=pSexe;
			
		}
		else {
			this.sexe = "Z";
			System.err.println("INVALID SEX : value :"+pSexe);
		}
	}
	
	public void setbirthDate(String pbirthDate){
		if(pbirthDate.charAt(2)!='/' || pbirthDate.charAt(5)!='/' || pbirthDate.charAt(7)!='/'){
			pbirthDate="";
			System.err.println("INVALID BIRTHDATE, bad format");
		}
		for(int i=0 ; i<2 ; i++){
			if(!Character.isDigit(pbirthDate.charAt(i))){
				pbirthDate="";
				System.err.println("INVALID BIRTHDATE, contains character");
			}
		}
		for(int i=3 ; i<5 ; i++){
			if(!Character.isDigit(pbirthDate.charAt(i))){
				pbirthDate="";
				System.err.println("INVALID BIRTHDATE, contains character");
			}
		}
		for(int i=6 ; i<10 ; i++){
			if(!Character.isDigit(pbirthDate.charAt(i))){
				pbirthDate="";
				System.err.println("INVALID BIRTHDATE, contains character");
			}
		}
		this.birthDate=pbirthDate;
	}
	
	public void setfather(String pfather){
		for(int i=0; i<pfather.length(); i++ ){
			if(!Character.isLetter(pfather.charAt(i)) && (pfather.charAt(i)!=' ') ){	 
				pfather="";
				System.err.println("INVALID FATHER NAME, contains invalid character");
				break;
			}
		}
		this.father=pfather;
	}
	
	public void setmother(String pmother){
		for(int i=0; i<pmother.length(); i++ ){
			if(!Character.isLetter(pmother.charAt(i)) && (pmother.charAt(i)!=' ') ){	 
				pmother="";
				System.err.println("INVALID MOTHER NAME, contains invalid character");
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
	
	public List<Human> parentLink(Human pPeople, List<Human> allpeople){
		List<Human> parents= new ArrayList<Human>();
		Human father= new Human();
		Human mother= new Human();
		for(Human i: allpeople){
			if(i.getfname()==pPeople.getfather()){
				father=i;
			}
			else if(i.getfname()==pPeople.getmother()){
				mother=i;
			}
		}
		parents.set(0,father);
		parents.set(1,mother);
		System.out.println("Mister "+pPeople.getlname()+" "+pPeople.getfname()+" have for father "+pPeople.getfather()+" and for mother "+pPeople.getmother());
		return parents;
	}
}
