package leplusgrand;

import java.util.Scanner;

public class leplusgrand {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);

		/*
		System.out.println("entrer le nombre 1");
		int nombre1 = 0;
		System.out.println("entrer le nombre 2");
		int nombre2;
		System.out.println("entrer le nombre 3");
		int nombre3;
		System.out.println("entrer le nombre 4");
		int nombre4;
		System.out.println("entrer le nombre 5");
		int nombre5;
		System.out.println("entrer le nombre 6");
		int nombre6;
		System.out.println("entrer le nombre 7");
		int nombre7;
		System.out.println("entrer le nombre 8");
		int nombre8;
		System.out.println("entrer le nombre 9");
		int nombre9;
		System.out.println("entrer le nombre 10");
		int nombre10;
		System.out.println("entrer le nombre 11");
		int nombre11;
		System.out.println("entrer le nombre 12");
		int nombre12;
		System.out.println("entrer le nombre 13");
		int nombre13;
		System.out.println("entrer le nombre 14");
		int nombre14;
		System.out.println("entrer le nombre 15");
		int nombre15;
		System.out.println("entrer le nombre 16");
		int nombre16;
		System.out.println("entrer le nombre 17");
		int nombre17;
		System.out.println("entrer le nombre 18");
		int nombre18;
		System.out.println("entrer le nombre 19");
		int nombre19;
		System.out.println("entrer le nombre 20");
		int nombre20; */
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
