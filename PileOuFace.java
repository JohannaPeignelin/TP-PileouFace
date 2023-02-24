package m9genericite.tournoiDePileOuFace;

import java.util.Random;

public enum PileOuFace {
	PILE("pile"),
	FACE("face");
	
	private static Random rand = new Random();
	
	private String lancerDePiece;

//	création du constructeur
	PileOuFace(String lancerDePiece) {
		this.lancerDePiece = lancerDePiece;
	}
	
/*
 * 	création de la méthode lancerPiece 
 * on crée une variable lancer de type int qui va s'implémenter 
 * d'un chiffre tiré aléatoirement entre 1 et 2. 
 *
 */
    public static PileOuFace  lancerPiece() {
    	
    	int lancer = rand.nextInt(2);
        return PileOuFace.values()[lancer];
    }
	
    
//    implémentation de la méthode toString()
    public String toString() {
    	return switch(this) {
	    	case PILE -> "pile";
	    	case FACE -> "face";
    	};
    }
}
