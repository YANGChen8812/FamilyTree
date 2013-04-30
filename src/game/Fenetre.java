package game;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
  //Panel list
  String[] listContent = {"Menu", "Rules", "Tree","Info"};
  int indice = 0;
 
  public Fenetre(){
    this.setTitle("Qui est-ce?");
    this.setSize(400, 480);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
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
       goTree2.addActionListener(new ActionListener(){
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
       
       JButton goQuit = new JButton("Quitter");
       goQuit.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent event){
       System.exit(0);
  
       }
     });

       
    //Menu panel
    JPanel menuPanel = new JPanel();
 //   menuPanel . setLayout ( new GridLayout (4 ,1));
    menuPanel . add( goRules);
    menuPanel . add( goTree);
    menuPanel . add( goQuit);
    
    //Rules panel
    JPanel rulesPanel = new JPanel();
    rulesPanel.add( new JLabel("Le premier joueur choisis dans la liste la personne qu'elle souhaite faire deviner , elle peut lire les questions que l'adversaire pour l'aider dans son choix. \n"));
    rulesPanel . add (goMenu);
    rulesPanel . add (goTree2);
    
    //Tree panel
    JPanel treePanel =new JPanel();
    treePanel . add (goMenu2);
    
    
    //Info panel 
    JPanel infoPanel = new JPanel();
    infoPanel . add (goTree3);
    
    

    content.setLayout(cl);
    content.add(menuPanel, listContent[0]);
    content.add(rulesPanel, listContent[1]);
    content.add(treePanel, listContent[2]);
    content.add(infoPanel, listContent[3]);

 

    this.getContentPane().add(content, BorderLayout.CENTER);
    this.setVisible(true);
  } 
}