package equipefoot;

import java.util.Scanner;

public class equipefoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.print("Entrez votre âge : ");
		int age = sc.nextInt();
		
		String categorie;
        switch (age) {
            case 1, 2, 3, 4:
                categorie = "Trop jeune";
                break;
            case 5, 6:
                categorie = "Débutant";
                break;
            case 7, 8:
                categorie = "Poussin";
                break;
            case 9, 10:
                categorie = "Benjamin";
                break;
            case 11, 12:
                categorie = "Pupille";
                break;
            case 13, 14:
                categorie = "Minime";
                break;
            case 15, 16:
                categorie = "Cadet";
                break;
            case 17, 18:
                categorie = "Junior";
                break;
            default:
                categorie = age <= 35 ? "Sénior" : "Vétéran";
        }
		
		        System.out.println("Votre catégorie : " + categorie);
		}


}
