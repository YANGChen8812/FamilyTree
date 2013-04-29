package main;

//test nico

import game.Menu;
import peopleDao.DAO;
import peopleDao.PeopleDAO;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		new GUI();
		new Menu();
		
		DAO interf = new PeopleDAO();
		interf.fileFromPath("csvFiles/gen-02.csv");
		
		interf.showHumans(interf.getHumans(), interf.getLinesFromFile());
	
	}

}
