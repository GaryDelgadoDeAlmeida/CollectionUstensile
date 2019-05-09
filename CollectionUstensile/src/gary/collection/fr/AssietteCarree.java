package gary.collection.fr;

public class AssietteCarree extends Assiette {

	public AssietteCarree(int annee, double cote) {
		super(annee, cote);
	}
	
	@Override
	public String toString() {
		return "Assiette Carr�e des ann�es " + this.annee + " d'une taille de " + this.taille + " cm";
	}
}
