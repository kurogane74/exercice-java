package leplusgrand;

import java.util.Scanner;

public class leplusgrand {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int nombre2;
		System.out.println("entrer le nombre 1");
		int nombre1 = sc.nextInt();
		int rang = 1;
		

		for (int i = 2; i <= 20; i++) {
			System.out.println("entrer le nombre " +i);
			nombre2 = sc.nextInt();
			if ( nombre1 < nombre2) {
				nombre1 = nombre2;
				rang = i;
			}
		}
		
		System.out.println("le nombre le plus grand est " +nombre1);
		System.out.println("c'etait le nombre numero " +rang);

		sc.close();
	}

}
