package main;

//test nico

import game.Fenetre;
import game.Information;
import game.Menu;
import game.Question;
import game.Rules;
import peopleDao.DAO;
import peopleDao.PeopleDAO;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		new GUI();
		new Menu();
		new Rules();
		new Information();
		new Question();
		new Fenetre();
		DAO interf = new PeopleDAO();
		interf.fileFromPath("csvFiles/gen-01.csv");
		
		interf.showHumans(interf.getHumans(), interf.getLinesFromFile());
	
	}

}
