package leplusgrand;

import java.util.Scanner;

public class encore {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("entrer le nombre 1");
		int nombre1 = sc.nextInt();
		int nombre2 = 1;
		int i = 2;
		int rang = 0;
		
		while (nombre2 != 0) {
			System.out.println("entrer le nombre " +i);
			nombre2 = sc.nextInt();
			if (nombre1 < nombre2) {
				nombre1 = nombre2;
				rang = i;
				
			}
			i++;
		}
		
		System.out.println("le nombre le plus grand est " +nombre1);
		System.out.println("c'etait le nombre numero " +rang);
		
		sc.close();
	}

}
