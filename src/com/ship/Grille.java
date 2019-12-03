package com.ship;

public class Grille {
	 static int x = 10;
	 public static int y = 10;
	 public static String[][] grille = new String[x][y];

	 public Grille(){
		 System.out.print("   ");
	     for (char alphabet = 'A'; alphabet <= 'J'; alphabet++) {
	    	 System.out.print(alphabet +" ");
	     }
	     System.out.println();

	     for(int ligne = 0; ligne < grille.length; ligne++) {
	    	 for (int colonne = 0; colonne < grille[ligne].length; colonne++) {
	    		 grille[ligne][colonne] = "- ";
	             if (colonne == 0)
	            	 System.out.print(ligne + "| " + grille[ligne][colonne]);
	             else
	                 System.out.print(grille[ligne][colonne]);
	    	 }
	         System.out.println();
	     }
	     System.out.println();
	 }
}
