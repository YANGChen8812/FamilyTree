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
import javax.swing.JTextArea;

 
public class Fenetre extends JFrame{
 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
CardLayout cl = new CardLayout();
  JPanel content = new JPanel();
  //Panel list
  String[] listContent = {"Menu", "Rules", "Tree","Info","Question","Loose","Win"};
  int indice = 0;
 
  public Fenetre(){
	JFrame fen = new JFrame();
    fen.setTitle("Qui est-ce?");
    fen.setSize(400, 480);
    fen . setLayout (new BorderLayout ());
    fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fen.setLocationRelativeTo(null);
    
    // button creation
       JButton goRules = new JButton("Règles");
       goRules.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
    	  cl.show(content, listContent[1]);
    	  setTitle("Règles");
      }
    });
       JButton goTree = new JButton("Jouer");
       goTree.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent event){
    	    	  cl.show(content, listContent[2]);
    	    	  setTitle("Arbre");
       }
    });
       JButton goTree2 = new JButton("Jouer");
       goTree2.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent event){
    	    	  cl.show(content, listContent[2]);
    	    	  setTitle("Arbre");
    	    	  add( new JLabel ("choisis une personne"));
       }
    });
       JButton goTree3 = new JButton("retour");
       goTree3.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent event){
    	    	  cl.show(content, listContent[2]);
    	    	  setTitle("Arbre");
       }
    });
       JButton goTree4 = new JButton("retour");
       goTree4.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent event){
    	    	  cl.show(content, listContent[2]);
    	    	  setTitle("Arbre");
       }
    });
       JButton goTree5 = new JButton("retour");
       goTree5.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent event){
    	    	  cl.show(content, listContent[2]);
    	    	  setTitle("Arbre");
       }
    });
       JButton goTree6 = new JButton("retour");
       goTree6.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent event){
    	    	  cl.show(content, listContent[2]);
    	    	  setTitle("Arbre");
       }
    });
       
       JButton goMenu = new JButton("Menu");
       goMenu.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
     	  		cl.show(content, listContent[0]);
     	  		setTitle("Qui est-ce?");
       }
     });
       
       JButton goMenu2 = new JButton("Menu");
       goMenu2.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
     	  		cl.show(content, listContent[0]);
     	  		setTitle("Qui est-ce?");
       }
     });
       JButton goMenu3 = new JButton("Menu");
       goMenu3.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
     	  		cl.show(content, listContent[0]);
     	  		setTitle("Qui est-ce?");
       }
     });
       JButton goMenu4 = new JButton("Menu");
       goMenu4.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
     	  		cl.show(content, listContent[0]);
     	  		setTitle("Qui est-ce?");
       }
     });
       JButton goMenu5 = new JButton("Menu");
       goMenu5.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
     	  		cl.show(content, listContent[0]);
     	  		setTitle("Qui est-ce?");
       }
     });
       JButton goQuestion = new JButton("Question");
       goQuestion.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
     	  		cl.show(content, listContent[5]);
     	  		setTitle("Question");
       }
     });
       
       JButton goQuit = new JButton("Quitter");
       goQuit.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
       System.exit(0);
  
       }
     });
    
       
    //Menu panel
    JPanel menuPanel = new JPanel();
    menuPanel . setLayout ( new GridLayout (3 ,1));
    menuPanel . add( goRules);
    menuPanel . add( goTree);
    menuPanel . add( goQuit);
    
    //Rules panel
    JPanel rulesPanel = new JPanel();
    rulesPanel. setLayout ( new FlowLayout ( FlowLayout . LEFT ));
    fen.add( rulesPanel , BorderLayout . SOUTH );
    rulesPanel.add( new JTextArea("Le premier joueur choisis dans la liste la personne qu'elle souhaite faire deviner , elle peut lire les questions que l'adversaire pour l'aider dans son choix. \n"));
    rulesPanel . add (goMenu);
    rulesPanel . add (goTree2);
    
    //Tree panel
    JPanel treePanel =new JPanel();
	treePanel . add (goMenu2);
    treePanel . add (goQuestion);
    
    
    //Info panel 
    JPanel infoPanel = new JPanel();
    infoPanel . add (goTree3);
    
    //Questions panel
    JPanel questionPanel = new JPanel();
    questionPanel .add (goMenu3);
    questionPanel . add (goTree4);
    
    //Loose panel
    JPanel loosePanel = new JPanel();
    loosePanel .add (goMenu4);
    loosePanel .add (goTree5);
    
    //Win panel
    JPanel winPanel = new JPanel();
    winPanel .add (goMenu5);
    winPanel .add (goTree6);
    

    content.setLayout(cl);
    content.add(menuPanel, listContent[0]);
    content.add(rulesPanel, listContent[1]);
    content.add(treePanel, listContent[2]);
    content.add(infoPanel, listContent[3]);
    content.add(questionPanel, listContent[4]);
    content.add(loosePanel, listContent[5]);
    content.add(winPanel, listContent[6]);

 

    this.getContentPane().add(content, BorderLayout.CENTER);
    this.setVisible(true);
  } 
}