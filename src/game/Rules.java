package game;

//Rules interface

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Rules extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Rules (){
		JFrame fen =new JFrame("Rules");
		fen . setPreferredSize (new Dimension (400 ,480));
		fen . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		fen . setLayout (new BorderLayout ());
		JPanel topPanel = new JPanel ();
		topPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
		fen .add( topPanel , BorderLayout . NORTH );
		topPanel . add( new JLabel ("Rules "));
		
		// do rules
		
		JPanel centerPanel = new JPanel ();
		centerPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
		fen .add( centerPanel , BorderLayout . SOUTH );
		centerPanel . add( new JButton ("Menu" ));
		centerPanel . add( new JButton ("Jouer" ));
		fen . pack ();
		fen . setVisible ( true );
	
		
	}

}
