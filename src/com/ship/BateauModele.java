package com.ship;

public enum BateauModele {
	PORTE_AVION(5), CROISEUR(4), CONTRE_TORPILLEURS(3), SOUS_MARIN(3), TORPILLEUR(2);
	
	private final int taille;
	
	private	BateauModele(int tailleBateau){
		this.taille =tailleBateau;
	}
	
	public int getTaille() {
		return taille;
	}

}
