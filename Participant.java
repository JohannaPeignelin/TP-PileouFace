package m9genericite.tournoiDePileOuFace;

public class Participant {
	private String nom;

	
	//	constructeur
	public Participant(String nom) {
		super();
		this.nom = nom;
	}

	//	implémentation de la méthode toString()
@Override
	public String toString() {
		return "Le nom du participant est " + nom ;
	}

	//	getters et setters de la classe Participant
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
