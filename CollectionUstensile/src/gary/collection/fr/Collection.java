package gary.collection.fr;

import java.time.LocalDate;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ustensile[] us = new Ustensile[5];
		us[0] = new AssietteRonde(1926, 8.4);
		us[1] = new Cuilliere(1881, 7.3);
		us[2] = new AssietteCarree(1935, 5.6);
		us[3] = new Cuilliere(1917, 8.8);
		us[4] = new AssietteRonde(1837, 5.4);
		
		numberCuilliere(us);
		printSurfaceAssiette(us);
		printTotalSurface(us);
	}
	
	static void numberCuilliere(Ustensile[] us) {
		int nbCuilliere = 0;
		for(int i = 0; i < us.length; i++) {
			if(us[i] instanceof Cuilliere) {
				nbCuilliere += 1;
			}
		}
		
		System.out.println("Il y a " + nbCuilliere + " cuillière(s).");
	}
	
	static void numberAssietteRonde(Ustensile[] us) {
		int nbAssiette = 0;
		for(int i = 0; i < us.length; i++) {
			if(us[i] instanceof AssietteRonde) {
				nbAssiette += 1;
			}
		}
		
		System.out.println("Il y a " + nbAssiette + " assiette(s) ronde(s).");
	}
	
	static void numberAssietteCarre(Ustensile[] us) {
		int nbAssiette = 0;
		for(int i = 0; i < us.length; i++) {
			if(us[i] instanceof AssietteCarree) {
				nbAssiette += 1;
			}
		}
		
		System.out.println("Il y a " + nbAssiette + " assiette(s) carrée(s).");
	}
	
	static void printSurfaceAssiette(Ustensile[] us) {
		double somme = 0;
		for(int i = 0; i < us.length; i++) {
			if(us[i] instanceof AssietteRonde) {
				somme += 3.14 * Math.pow(us[i].getTaille(), 2) ;
			}
			if(us[i] instanceof AssietteCarree) {
				somme += Math.pow(us[i].getTaille(), 2);
			}
		}
		
		System.out.println("Surface totale des assiettes : " + somme + " cm");
	}
	
	static void printTotalSurface(Ustensile[] us) {
		double somme = 0;
		for(int i = 0; i < us.length; i++) {
			if(us[i] instanceof AssietteRonde || us[i] instanceof Cuilliere) {
				if(LocalDate.now().getYear() - us[i].getAnnee() <= 50) {
					somme += 1;
				}
				else {
					somme += LocalDate.now().getYear() - us[i].getAnnee() - 50;
				}
			}
			else {
				if(LocalDate.now().getYear() - us[i].getAnnee() <= 50) {
					somme += 5;
				}
				else {
					somme += 5 * (LocalDate.now().getYear() - us[i].getAnnee() - 50);
				}
			}
		}
		System.out.println("Valeur totale de la surface de la collection : " + somme + " francs");
	}
}
