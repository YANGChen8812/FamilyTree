package game;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Perdu extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Perdu (){
		JFrame fen =new JFrame("Echec");
		fen . setPreferredSize (new Dimension (400 ,480));
		fen . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		fen . setLayout (new BorderLayout ());
		JPanel topPanel = new JPanel ();
		topPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
		fen .add( topPanel , BorderLayout . NORTH );
		topPanel . add( new JLabel (" Tu as perdu ! Tu n'as pas trouvé assez rapidement la personne mystère. "));
		
		// do rules
		
		JPanel centerPanel = new JPanel ();
		centerPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
		fen .add( centerPanel , BorderLayout . SOUTH );
		centerPanel . add( new JButton ("Menu" ));
		centerPanel . add( new JButton ("Recommencer" ));
		fen . pack ();
		fen . setVisible ( true );
	
		
	}

}