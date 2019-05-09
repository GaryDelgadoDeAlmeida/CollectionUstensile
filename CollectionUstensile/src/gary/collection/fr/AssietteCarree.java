package gary.collection.fr;

public class AssietteCarree extends Assiette {

	public AssietteCarree(int annee, double cote) {
		super(annee, cote);
	}
	
	@Override
	public String toString() {
		return "Assiette Carrée des années " + this.annee + " d'une taille de " + this.taille + " cm";
	}
}
