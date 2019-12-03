package com.ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case {
	public Case(List<String> coordonneeliste) {
		String coordonnees = null;
		String direction = null;
		String recupDirectionAbssice = null;
		String recupDirectionOrdonnee = null;
		char ajouteDirectionAbssice ='A';
		int ajouteDirectionOrdonnee = 0;
		String directionFinal = null;
		
		// Selection des coordonnees par le joueur
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrer les coordonnées pour le Bateau Torpilleur (Taille 2) : ");
		coordonnees = clavier.nextLine();
		
		//Ajout de la selection dans la liste
		coordonneeliste.add ( coordonnees );  
		
		//Recupere la coordonnée de l'abssice et de l'ordonnee
		recupDirectionAbssice = coordonnees.substring(0, 1);
		recupDirectionOrdonnee = coordonnees.substring(1, 2);
		
		//Recupère la direction 
		System.out.print("Entrer la direction du navire : ");
		direction = clavier.nextLine();
		
		if(direction.equals("S")) {
			ajouteDirectionAbssice = (char) (recupDirectionAbssice.charAt(0));
			ajouteDirectionOrdonnee = Integer.decode(recupDirectionOrdonnee) +1;
			
			directionFinal = Character.toString(ajouteDirectionAbssice)+ Integer.toString(ajouteDirectionOrdonnee) ;
		}
		
		if(direction.equals("N")) {
			ajouteDirectionAbssice = (char) (recupDirectionAbssice.charAt(0));
			ajouteDirectionOrdonnee = Integer.decode(recupDirectionOrdonnee) -1;
			
			directionFinal = Character.toString(ajouteDirectionAbssice)+ Integer.toString(ajouteDirectionOrdonnee) ;
		}
		
		if(direction.equals("E")) {
			ajouteDirectionAbssice = (char) (recupDirectionAbssice.charAt(0) +1);
			ajouteDirectionOrdonnee = Integer.decode(recupDirectionOrdonnee);
			
			directionFinal = Character.toString(ajouteDirectionAbssice)+ Integer.toString(ajouteDirectionOrdonnee) ;
		}
		
		if(direction.equals("W")) {
			ajouteDirectionAbssice = (char) (recupDirectionAbssice.charAt(0) -1);
			ajouteDirectionOrdonnee = Integer.decode(recupDirectionOrdonnee);
			
			directionFinal = Character.toString(ajouteDirectionAbssice)+ Integer.toString(ajouteDirectionOrdonnee) ;
		}
		
		System.out.print(directionFinal);
		
		
		
		
		
		if (coordonneeliste.contains(coordonnees) == true) {
			
			
		}
	}
}
