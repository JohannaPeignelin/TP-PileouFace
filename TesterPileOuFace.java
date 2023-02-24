package m9genericite.tournoiDePileOuFace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TesterPileOuFace {
	private static final int MINIMUM = 1;
	private static final int POINTS_MAXIMUM = 4;

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		Set<Participant> liste = new HashSet<>();
		String nom;
		Map<String, Integer> scoreJoueur = new HashMap<>();
		boolean conditionDeSortie = false ;
		
		
	do {
		System.out.println("Rentrez le nom de la personne à inscrire");
		nom = scan.nextLine();
		liste.add(new Participant(nom));
		scoreJoueur.put(nom, 0);
		
	}while(!nom.equals("dobby"));

		
		
	do {
		boolean ifPlayerWon = false; 
		for(Participant joueur : liste) {
			

			System.out.println(joueur.getNom()+" à toi de jouer ! Pile ou Face ?");
			String saisieUtilisateur =scan.nextLine().toLowerCase();

			PileOuFace resultat = PileOuFace.lancerPiece();
			
			System.out.println("Le lancer de pièces affiche : ");
			System.out.println(resultat.toString());
			
			if(!saisieUtilisateur.equals(resultat.toString())) {
				System.out.println("Désolé vous n'avez pas gagné sur ce coup là !");
			}else if(saisieUtilisateur.equals(resultat.toString())) {
				System.out.println("Bravo, vous avez gagné ! ");
				scoreJoueur.put(joueur.getNom(), scoreJoueur.get(joueur.getNom())+1);
			}
			System.out.println(joueur.getNom()+" : "+ scoreJoueur.get(joueur.getNom()));
			
			if(scoreJoueur.get(joueur.getNom()) == POINTS_MAXIMUM) {
				ifPlayerWon = true;
			}		
		}
		
		if(ifPlayerWon) {
			conditionDeSortie = true;
		}
		
	}while(!conditionDeSortie);
	System.out.println("sortie de boucle");
	
	List<Participant> joueurAuDessus4 = new ArrayList<>();
	for (Participant joueur : liste) {
		if(scoreJoueur.get(joueur.getNom()) == POINTS_MAXIMUM){
			joueurAuDessus4.add(joueur);
			System.out.println(joueur.getNom());
		}
	}
	

	
	List<Participant> listePerdants = new ArrayList<>();
	
	while (joueurAuDessus4.size() > MINIMUM) {
		for(Participant joueur : joueurAuDessus4) {
			
					System.out.println(joueur.getNom()+" à toi de jouer ! Pile ou Face ?");
					String saisieUtilisateur =scan.nextLine().toLowerCase();
			
					PileOuFace resultat = PileOuFace.lancerPiece();
					
					System.out.println("Le lancer de pièces affiche : ");
					System.out.println(resultat.toString());
					
					if(!saisieUtilisateur.equals(resultat.toString())) {
						System.out.println("Désolé vous n'avez pas gagné sur ce coup là !");
						listePerdants.add(joueur);
					}else if(saisieUtilisateur.equals(resultat.toString())) {
						System.out.println("Bravo, vous avez gagné ! ");
					}
		}
		if(joueurAuDessus4 != listePerdants) {
			
			for(Participant perdant : listePerdants) {
				System.out.println("le joueur "+ perdant.getNom()+" et est éliminé !");
				joueurAuDessus4.remove(perdant);
			}
		}
		listePerdants = new ArrayList<>();
	}
	System.out.println("Bravo, le joueur "+ joueurAuDessus4.get(0).getNom()+" est le grand gagnant !");
	
	

		scan.close();
	}
}
