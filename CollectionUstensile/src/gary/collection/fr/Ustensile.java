package gary.collection.fr;

import java.util.ArrayList;

abstract class Ustensile {

	protected int annee;
	protected double taille;
	
	protected Ustensile(int annee, double taille) {
		this.annee = annee;
		this.taille = taille;
	}
	
	public int getAnnee() {
		return this.annee;
	}
	
	public double getTaille() {
		return this.taille;
	}
}
