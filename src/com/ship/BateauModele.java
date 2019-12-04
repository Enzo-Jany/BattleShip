package com.ship;

public enum BateauModele {
	PORTE_AVION(5, "Porte Avion"), CROISEUR(4 , "Croiseur"), CONTRE_TORPILLEURS(3 , "Contre Torpilleur"), SOUS_MARIN(3 , "Sous Marin"), TORPILLEUR(2 , "Torpilleur");
	
	private final int taille;
	private final String nom;

	
	private	BateauModele(int tailleBateau, String nomBateau){
		this.taille =tailleBateau;
		this.nom =nomBateau;
	}
	
	public int getTaille() {
		return taille;
	}
	
	public String getNom() {
		return nom;
	}

}
