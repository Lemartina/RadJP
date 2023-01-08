package edunova;

import javax.swing.JOptionPane;

public class ZimskiZadaci6 {

	public static void main(String[] args) {

//Kreirati program koji ispisuje cikličnu matricu 

		// unos podataka
//
//		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka:"));
//		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sutupaca:"));

//		for (int i = 1; i <= red * stupac; i++) 
//		
//
//		int matrica = red * stupac;
//
//		for (int a = matrica; a >= ((a - 1)); a--) {
//
//			if (a == 0) {
//				break;
//			}
//
//					
//			System.out.print(" " + a);
//
//		}

		// Ručno vijuganje, nije dobro ni složeno

//		for (int c = 10; c <= 13; c++) {
//			System.out.print(" "+c);
//		}
//		
//		for (int d = 14; d <= 16; d++) {
//			System.out.println(" "+ d);
//		}
//		
//		for (int g = 22; g <= 23; g++) {
//			System.out.print(" "+g);
//		}
//		
//		for (int h = 25; h >= 24; h--) {
//			System.out.print(" "+ h);
//		}
//		for (int f = 21; f >= 20; f--) {
//			System.out.println(" "+ f);
//		}
//		
//	
//		
//		for (int e = 19; e >= 17; e--) {
//			System.out.print(" "+ e);
//		}
//		
//		for (int b = 9; b >= 6; b--) {
//			
//			System.out.println(" "+ b);}
//					
//		for (int a = 5; a >= 1; a--) {
//		System.out.print(" "+a);
//		}
//		INT S = INTEGER.PARSEINT(JOPTIONPANE.SHOWINPUTDIALOG("UNESI BROJ STUPACA "));// STUPAC
//		INT R = INTEGER.PARSEINT(JOPTIONPANE.SHOWINPUTDIALOG("UNESI BROJ REDAKA "));// REDAK
//		INT T = S * R;// TABLICA= STUPAC*REDAK
		int x = 5;
		int rp = 0;// red početak
		int rk = x - 1;// red kraj
		int sp = 0; // stupac početak
		int sk = x - 1; // stupac kraj
		int a, b;

		int m[][] = new int[x][x];
		int p = 1;

		// 1
		if (p <= x * x) {
			for (b = sk; b >= sp; b--) {
				m[rk][b] = p++;

				if (p > x * x)
					break;

			}
			rk--;
//2
			for (a = rk; a >= rp; a--) {
				m[a][sp] = p++;
				if (p > x)
					break;
			}
			sp++;
//3
			for (b = sp; b <= sk; b++) {
				m[rp][b] = p++;

				if (p > x * x)
					break;
			}
			sk++;
//4
			for (a = rp; a <= rk; a++) {
				m[a][sk] = p++;
			}
			sk--;

			// 5
			for (a = 0; a <= x; a++) {
				for (b = 0; b > x; b++) {
					System.out.println(m[a][b] + " ");
				}

				System.out.println();
			}
		}
	}
}