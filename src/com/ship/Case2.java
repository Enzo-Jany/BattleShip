package com.ship;

import java.util.HashMap;
import java.util.Scanner;

public class Case2 {
	private String coordonnees =null;
	private String choixModelBateau = null;
	private char recupCoordonneeAbssice = '0';
	private char recupCoordonneeOrdonne = '0';
	private String recupCoordonnee = null;
	private String direction =null;
	private Scanner clavier = new Scanner(System.in);
	private String Bateau = null;
	BateauModele bateauChoisi = null;
	private BateauModele bateauModel;
	
	private HashMap<String, String> coordonneesMap = new HashMap<String, String>();

	
	public Case2() {
		System.out.println("BATEAUX DISPONIBLE :");
		System.out.println("- PORTE AVION(5) = PA");
		System.out.println("- CROISEUR(4) = CR");
		System.out.println("- SOUS MARIN(3) = SM");
		System.out.println("- CONTRE TORPILLEURS(3) = CT");
		System.out.println("- TORPILLEUR(2) = TO");
		System.out.println();
		System.out.println("Selectionner un bateau : ");
		
		
		choixModelBateau = clavier.nextLine();
		switch(choixModelBateau) {
		case "PA":
			bateauChoisi = bateauModel.PORTE_AVION;
		case "CR":
			bateauChoisi = bateauModel.CROISEUR;
		case "CT":
			bateauChoisi = bateauModel.CONTRE_TORPILLEURS;
		case "SM":
			bateauChoisi = bateauModel.SOUS_MARIN;
		case "TO":
			bateauChoisi = bateauModel.TORPILLEUR;
		default:
			break;
		}
		
		
			//Recupere la coordonnée de l'abssice et de l'ordonnee
			System.out.print("Selectionner les coodonnes du bateau : ");
			coordonnees = clavier.nextLine();
	
			recupCoordonneeAbssice = coordonnees.charAt(0);
			recupCoordonneeOrdonne = coordonnees.charAt(1);
			
			recupCoordonnee = Character.toString(recupCoordonneeAbssice)+ Character.toString(recupCoordonneeOrdonne);
			coordonneesMap.put(recupCoordonnee, bateauChoisi.getNom() );
			
			
			//Recupère la direction
			System.out.print("Entrer la direction du navire : ");
			direction = clavier.nextLine();
			
			
			
				if(direction.equals("S")) {
					for(int i = 0; i < bateauChoisi.getTaille(); i++) {
						recupCoordonneeAbssice = (char) (coordonnees.charAt(0));
						recupCoordonneeOrdonne = (char) (coordonnees.charAt(1) +i);
						
						recupCoordonnee = Character.toString(recupCoordonneeAbssice)+ Character.toString(recupCoordonneeOrdonne);
						coordonneesMap.put(recupCoordonnee, bateauChoisi.getNom());
					}
				}
				
				if(direction.equals("N")) {
					for(int i = 0; i < bateauChoisi.getTaille(); i++) {
						recupCoordonneeAbssice = (char) (coordonnees.charAt(0));
						recupCoordonneeOrdonne = (char) (coordonnees.charAt(1) -i);
					
					
						recupCoordonnee = Character.toString(recupCoordonneeAbssice)+ Character.toString(recupCoordonneeOrdonne);
						coordonneesMap.put(recupCoordonnee, bateauChoisi.getNom());
					}
				}
				
				if(direction.equals("E")) {
					for(int i = 0; i < bateauChoisi.getTaille(); i++) {
						recupCoordonneeAbssice = (char) (coordonnees.charAt(0) +i);
						recupCoordonneeOrdonne = (char) (coordonnees.charAt(1));
						
						recupCoordonnee = Character.toString(recupCoordonneeAbssice)+ Character.toString(recupCoordonneeOrdonne);
						coordonneesMap.put(recupCoordonnee, bateauChoisi.getNom());
					}
				}
				
				if(direction.equals("W")) {
					for(int i = 0; i < bateauChoisi.getTaille(); i++) {
						recupCoordonneeAbssice = (char) (coordonnees.charAt(0) +i);
						recupCoordonneeOrdonne = (char) (coordonnees.charAt(1));
						
						recupCoordonnee = Character.toString(recupCoordonneeAbssice)+ Character.toString(recupCoordonneeOrdonne);
						coordonneesMap.put(recupCoordonnee, bateauChoisi.getNom());
					}
				}
		for (String k : coordonneesMap.keySet()) {
			System.out.println(k + " : " + coordonneesMap.get(k));
		 
				
		} 	    
	  
	}

}
