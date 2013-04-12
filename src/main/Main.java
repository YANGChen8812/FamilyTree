package main;
import javax.swing.JFrame;

import peopleDao.DAO;
import peopleDao.PeopleDAO;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DAO interf = new PeopleDAO();
		interf.fileFromPath("csvFiles/gen-02.csv");
		
		interf.showHumans(interf.getHumans(), interf.getLinesFromFile());
		JFrame windows = new JFrame();
		//D�finit un titre pour notre fen�tre
		windows.setTitle("Tree");
		//D�finit sa taille : 400 pixels de large et 100 pixels de haut
		windows.setSize(400, 100);
		//Nous demandons maintenant � notre objet de se positionner au centre
		windows.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windows.setVisible(true);
	}

}
