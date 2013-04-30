package game;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame{
 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
CardLayout cl = new CardLayout();
  JPanel content = new JPanel();
  //Liste des noms de nos conteneurs pour la pile de cartes
  String[] listContent = {"CARD_1", "CARD_2", "CARD_3","CARD_4"};
  int indice = 0;
 
  public Fenetre(){
    this.setTitle("CardLayout");
    this.setSize(400, 480);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
         
    //Menu panel
    JPanel card1 = new JPanel();
    card1 . setLayout ( new GridLayout (4 ,1));
    card1 . add( new JLabel ("Qui est-ce?"));
    card1 . add( new JButton ("Règles" ));
    card1 . add( new JButton ("Jouer" ));
    card1 . add( new JButton ("Quitter" ));      
    
    //information panel
    JPanel card2 = new JPanel();
    JPanel topPanel = new JPanel(); 
	topPanel.setLayout( new FlowLayout ( FlowLayout.CENTER)); 
	topPanel.add(new JLabel("Information"));
	
	card2.add(topPanel, BorderLayout. CENTER ); 
	
	JPanel centerPanel = new JPanel ();
	centerPanel . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
	card2 .add( centerPanel , BorderLayout . SOUTH );
	centerPanel . add( new JButton ("Retour" ));
	centerPanel . add( new JButton ("Valider" ));
    
    //question panel
    JPanel card3 = new JPanel();
    JPanel topPanel3 = new JPanel(); 
	topPanel3.setLayout( new FlowLayout ( FlowLayout.CENTER)); 
	topPanel3.add(new JLabel("A toi de jouer, choisi ta question ! "));
	
	card3.add(topPanel, BorderLayout. CENTER ); 
	
	JPanel centerPanel3 = new JPanel ();
	centerPanel3 . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
	card3 .add( centerPanel3 , BorderLayout . SOUTH );
	centerPanel3 . add( new JButton ("Menu" ));
	centerPanel3 . add( new JButton ("Arbre généalogique" ));
	
    
    //Rules Panel
    JPanel card4 = new JPanel();
    JPanel topPanel4 = new JPanel ();
	topPanel4 . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
	card4 .add( topPanel4 , BorderLayout . NORTH );
	topPanel4 . add( new JLabel ("Rules "));
	JPanel centerPanel4 = new JPanel ();
	centerPanel4 . setLayout ( new FlowLayout ( FlowLayout . CENTER ));
	card4 .add( centerPanel4 , BorderLayout . SOUTH );
	centerPanel4 . add( new JButton ("Menu" ));
	centerPanel4 . add( new JButton ("Jouer" ));

 
    JPanel boutonPane = new JPanel();
    JButton bouton = new JButton("Contenu suivant");
    //Définition de l'action du bouton
    bouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        //Via cette instruction, on passe au prochain conteneur de la pile
        cl.next(content);
      }
    });
         
    JButton bouton2 = new JButton("Contenu par indice");
    //Définition de l'action du bouton2
    bouton2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){               
        if(++indice > 3)
          indice = 0;
        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
        cl.show(content, listContent[indice]);
      }
    });
         
    boutonPane.add(bouton);
    boutonPane.add(bouton2);
    //On définit le layout
    content.setLayout(cl);
    //On ajoute les cartes à la pile avec un nom pour les retrouver
    content.add(card1, listContent[0]);
    content.add(card2, listContent[1]);
    content.add(card3, listContent[2]);
    content.add(card4, listContent[3]);

 
    this.getContentPane().add(boutonPane, BorderLayout.NORTH);
    this.getContentPane().add(content, BorderLayout.CENTER);
    this.setVisible(true);
  } 
}