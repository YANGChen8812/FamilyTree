package main;

//test nico

import java.util.List;

import game.Arbre;
import game.Fenetre;
import game.Gagne;
import game.Information;
import game.Menu;
import game.Perdu;
import game.Question;
import game.Rules;
import peopleDao.DAO;
import peopleDao.PeopleDAO;
import basis.Human;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		new GUI();
		new Menu();
		new Rules();
		new Information();
		new Question();
		
		new Arbre();
		new Perdu();
		new Gagne();
		*/
		new Fenetre();
		DAO interf = new PeopleDAO();
		interf.fileFromPath("csvFiles/gen-01.csv");
		interf.findPeople();
		interf.showHumans(interf.getHumans());
		/*Test of Human method DON'T ERASE IT*/
		List<Human> testPeople=interf.getHumans();
		Human father=testPeople.get(1);
		Human son=testPeople.get(2);
		boolean bool=father.isParent(father,son);
		System.out.println(bool);
		//son.parentLink(son, testPeople); 
		
	
	}

}
