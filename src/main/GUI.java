package main;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.table.TableColumn;


public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private TableColumn aColumn;
	
	/*public Object[][] donnees = {{"", "", "", "",""},
			{"", "", "", "",""}, {"", "", "", "",""}, {"","","","",""}};
		
	public String[] nomsColonnes = {"", "A", "B", "C","D"};
	*/
	
	public GUI() {
		
		
		JTable table = new JTable();
		add(new JScrollPane(table),BorderLayout.CENTER);
		
		aColumn = new TableColumn();
		table.addColumn(aColumn);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); 
		this.setTitle("Family Tree");
		this.setLocation(150, 150);
		
	}
	
	/*public class addName {
		
		
		
		
		
	}
	*/
	
	
	
}
