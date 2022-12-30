package edunova;

import javax.swing.JOptionPane;

public class DZ1 {

	public static void main(String[] args) {
//		Kreiraj program koji će koristeći for petlje automatizirati ispis tablice množenja u ovom obliku:
//		-------------------------------
//		: : :  TABLICA  MNOZENJA  : : :
//		-------------------------------
//		 * |  1  2  3  4  5  6  7  8  9
//		-------------------------------
//		 1 |  1  2  3  4  5  6  7  8  9
//		 2 |  2  4  6  8 10 12 14 16 18
//		 3 |  3  6  9 12 15 18 21 24 27
//		 4 |  4  8 12 16 20 24 28 32 36
//		 5 |  5 10 15 20 25 30 35 40 45
//		 6 |  6 12 18 24 30 36 42 48 54
//		 7 |  7 14 21 28 35 42 49 56 63
//		 8 |  8 16 24 32 40 48 56 64 72
//		 9 |  9 18 27 36 45 54 63 72 81
//		-------------------------------
//		:  :  :  :  :  :   :by Martina
//		-------------------------------

		//unos imena
		String ime = JOptionPane.showInputDialog("Upiši svoje ime:");
		
		//ispis prvih crta
		for (int k = 0; k < 29; k++) {
			System.out.print("-");}
		System.out.print("\n");	

		System.out.println(": : : TABLICA  MNOŽENJA : : :");

		//ispis drugih crta
		for (int k = 0; k < 29; k++) {
			System.out.print("-");}
		System.out.print("\n");	
		// ispis zaglavlja
				System.out.print("* |");
				for (int f=1; f<=9; f++) {
					System.out.print(" "+f+" ");}	
				System.out.print("\n");	
				
				//ispis trećih crta
				for (int k = 0; k < 29; k++) {
					System.out.print("-");}
				System.out.print("\n");	
		// petlja tablice

		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				if ((i * j <=9)) {
					if (j == 1) {
						System.out.print(i * j + " | ");
					} else {
						System.out.print(" ");
					}}
				if ((i>10)&&(i * j < 100)) {
					System.out.print(i * j + "c ");
				}  else {
					System.out.print(i*j+" ");
				}

			}
			if (i == 9) {
				System.out.println();
				for (int k = 0; k < 29; k++) {
					System.out.print("-");
				}
				System.out.println();

				
				
				// ispis imena
				
				
				switch (ime.length()) {
				
				case 3:
					System.out.println(" : : : : : : : : : : : by " + ime);
					break;
				case 4:
					System.out.println(" : : : : : : : : : : :by " + ime);
					break;
				case 5:
					System.out.println(" : : : : : : : : : : by " + ime);
					break;
				case 6:
					System.out.println(" : : : : : : : : : :by " + ime);
					break;
				case 7:
					System.out.println(" : : : : : : : : : by " + ime);
					break;
				case 8:
					System.out.println(" : : : : : : : : :by " + ime);
					break;
				default: 
					System.out.println("Ime nije dobro");
				}

				for (int k = 0; k < 29; k++) {
					System.out.print("-");
				}

			}
			System.out.println();
		}

	}

}