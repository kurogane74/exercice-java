package assurance;

import java.util.Scanner;

public class assurance {

	public static void main(String[] args) {
		
		Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Quel votre age");
        int age = sc.nextInt();
        System.out.print("Depuis combien de temps avez vous votre permis");
        int permis = sc.nextInt();
        System.out.print("Nombre d'accidents");
        int accident = sc.nextInt();
        System.out.print("Fidelite");
        int fidelite = sc.nextInt();
        int valeur_tarif = 0;
        String tarif = null;
       
        if (age < 25 && permis < 2 && accident < 0) {
            valeur_tarif = 2;
        }
        else {
        	valeur_tarif = 1;
        }
       
        if ((age < 25 && permis >= 2) || (age >= 25 && permis < 2)) {

	        	switch(accident) {
	                case 0:
	                valeur_tarif = 3;
	                break;
	                case 1:
	                valeur_tarif = 2;
	                break;
	        	}
        	
        }
       
        if (age >= 25 && permis >= 2) {
           
            switch(accident) {
                case 0:
                valeur_tarif = 5;
                break;
                case 1:
                valeur_tarif = 4;
                break;
                case 2:
                valeur_tarif = 3;
                break;
                default:
                valeur_tarif = 1;
                break;
            }
        }
        if (fidelite >= 5 && valeur_tarif > 1) {
            valeur_tarif++;
        }
        switch(valeur_tarif) {
            case 1:
            tarif = "refuse";
            break;
            case 2:
            tarif = "rouge";
            break;
            case 3:
            tarif = "orange";
            break;
            case 4:
            tarif = "vert";
            break;
            case 5:
            tarif = "bleu";
            break;
        }
       
        System.out.print(tarif);
		
	}

}
