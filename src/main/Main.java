package main;

//test nico

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
		new Arbre();
		new Perdu();
		new Gagne();
		DAO interf = new PeopleDAO();
		interf.fileFromPath("csvFiles/famille-01.csv");
		interf.findPeople();
		interf.showHumans(interf.getHumans());
	
	}

}
