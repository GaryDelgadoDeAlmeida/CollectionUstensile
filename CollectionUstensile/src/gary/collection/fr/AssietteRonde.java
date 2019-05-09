package gary.collection.fr;

import java.util.Date;

public class AssietteRonde extends Assiette {
	
	public AssietteRonde(int annee, double rayon) {
		super(annee, rayon);
	}
	
	@Override
	public String toString() {
		return "Assiette Ronde des ann�es " + this.annee + " d'une taille de " + this.taille + " cm";
	}
}
