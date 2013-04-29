	package game;


	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.FlowLayout;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class Question extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Question () {
			
			JFrame fen = new JFrame();
			fen= new JFrame(" QUESTIONS ");
			fen . setPreferredSize (new Dimension (400 ,480));
			fen . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
			fen . setLayout (new BorderLayout ());
			
			JPanel topPanel = new JPanel(); 
			topPanel.setLayout( new FlowLayout ( FlowLayout.CENTER)); 
			topPanel.add(new JLabel("A toi de jouer, choisi ta question ! "));
			
			fen.add(topPanel, BorderLayout. CENTER ); 
			
			JPanel centerPanel = new JPanel ();
			centerPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
			fen .add( centerPanel , BorderLayout . SOUTH );
			centerPanel . add( new JButton ("Menu" ));
			centerPanel . add( new JButton ("Arbre généalogique" ));
			
			
			
			fen . pack ();
			fen . setVisible ( true );
		}
		
	}


