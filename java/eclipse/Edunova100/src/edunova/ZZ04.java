package edunova;

import javax.swing.JOptionPane;

public class ZZ04 {

	public static void main(String[] args) {
		// Keirati program koji unosi dvije
		// matrice 4x4 te ispisuje njihov zbroj

		// 1. matrica 4*4

		System.out.println("1. matrica");
		System.out.println("\t");
		// unos podataka
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka za 1. matricu:"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca za 1. matricu:"));

		// formiranje martice i ispis

		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= 4; j++) {
				System.out.print(" " + i * j);
			}

			System.out.println();

		}

		System.out.println("\t");

		// 2. matrica 4*4

		// unos podataka

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka za 2. matricu:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sutupaca za 2. marticu"));

		System.out.println("2. matrica");
		System.out.println("\t");
		for (a = 1; a <= 4; a++) {
			for (b = 1; b <= 4; b++) {
				System.out.print(" " + a * b);
			}

			System.out.println();

		}

		System.out.println("\t");
		// zbroj matrica

		System.out.println("zbroj");
//			
		int tb1 = i * j;
		int tb2 = a * b;
		int kraj = 16;

		for (tb1 = 1; tb1 <= kraj; tb1++) {
			for (tb2 = 1; tb2 <= kraj; tb2++) {
				System.out.print(" " + (tb1 + tb2));
			}
			System.out.println();

		}
	}
}
