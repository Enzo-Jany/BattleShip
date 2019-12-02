package com.ship;
import java.awt.GridLayout; 

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{
       
  public Window(){
	  this.setTitle("BattleShip");
	    this.setSize(500, 500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    //On définit le layout à utiliser sur le content pane
	    //Trois lignes sur deux colonnes
	    this.setLayout(new GridLayout(10, 10));
	    //On ajoute le bouton au content pane de la JFrame
	    
	    for(int i=0;i<100;i++){

	    this.getContentPane().add(new JButton());
	
	    }
	    
	    
	    this.setVisible(true);
  }      
}