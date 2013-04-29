package game;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Menu extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Menu (){
		JFrame fen =new JFrame();
		fen . setPreferredSize (new Dimension (400 ,480));
		fen . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		fen . setLayout (new BorderLayout ());
		JPanel topPanel = new JPanel ();
		topPanel . setLayout ( new FlowLayout ( FlowLayout . LEFT ));
		fen .add( topPanel , BorderLayout . NORTH );
		JPanel centerPanel = new JPanel ();
		centerPanel . setLayout ( new GridLayout (4 ,1));
		centerPanel . add( new JTextField ("Qui est-ce?"));
		centerPanel . add( new JButton ("Règles" ));
		centerPanel . add( new JButton ("Jouer" ));
		centerPanel . add( new JButton ("Quitter" ));
		fen .add( centerPanel , BorderLayout . CENTER );
		fen . pack ();
		fen . setVisible ( true );
		}
		
	}

	

