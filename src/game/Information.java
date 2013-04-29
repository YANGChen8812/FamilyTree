
	package game;

	// import java.awt.BorderLayout;
	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.FlowLayout;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class Information extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Information () {
			
			JFrame fen = new JFrame();
			fen= new JFrame(" FICHE PERSONNAGE ");
			fen . setPreferredSize (new Dimension (400 ,480));
			fen . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
			fen . setLayout (new BorderLayout ());
			
			JPanel topPanel = new JPanel(); 
			topPanel.setLayout( new FlowLayout ( FlowLayout.CENTER)); 
			topPanel.add(new JLabel("Information"));
			
			fen.add(topPanel, BorderLayout. CENTER ); 
			
			JPanel centerPanel = new JPanel ();
			centerPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
			fen .add( centerPanel , BorderLayout . SOUTH );
			centerPanel . add( new JButton ("Retour" ));
			centerPanel . add( new JButton ("Valider" ));
			
			
			fen . pack ();
			fen . setVisible ( true );
		}
		

}
