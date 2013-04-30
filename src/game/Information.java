
	package game;

	// import java.awt.BorderLayout;
	import java.awt.BorderLayout;
 //import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

	import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextField;
// import javax.swing.ScrollPaneConstants;

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
			
			fen.add(topPanel, BorderLayout. NORTH ); 
			
			JPanel centerPanel = new JPanel ();
			centerPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
			fen .add( centerPanel , BorderLayout . SOUTH );
			centerPanel . add( new JButton ("Retour" ));
			centerPanel . add( new JButton ("Valider" ));
		    //JScrollPane Info = new JScrollPane();
		    
		   
		   // setVertcialScrollBar(JScrollBar)
			//JTextField content = new JTextField (" jhjhupfchjnzkjkiiiiiiiiiiiikkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
			
			//Info.add(content);
			//fen.getContentPane().add( Info, BorderLayout.CENTER);
		 
		    
			fen . pack ();
			fen . setVisible ( true );
		}
		

}
