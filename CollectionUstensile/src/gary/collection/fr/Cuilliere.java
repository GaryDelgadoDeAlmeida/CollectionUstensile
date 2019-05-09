package gary.collection.fr;

public class Cuilliere extends Ustensile {

	public Cuilliere(int annee, double longueur) {
		super(annee, longueur);
	}
	
	@Override
	public String toString() {
		return "Cuillière des années " + this.annee + " d'une taille de " + this.taille + " cm";
	}
}
