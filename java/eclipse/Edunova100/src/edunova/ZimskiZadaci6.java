package edunova;

import javax.swing.JOptionPane;

public class ZimskiZadaci6 {

	public static void main(String[] args) {

//Kreirati program koji ispisuje cikličnu matricu 

		// unos podataka
//
//		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka:"));
//		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sutupaca:"));

		for (int a = 5; a >= 1; a--) {
			for (int b = 9; b >= 6; b--) {
				for (int c = 10; c <= 13; c++) {
					for (int d = 14; d <= 16; d++) {
						for (int e = 19; e >= 17; e--) {
							for (int f = 21; f >= 20; f--) {
								for (int g = 22; g <= 23; g++) {
									for (int h = 25; h >= 24; h--) {

										System.out.print(h + "h-");
									
									}
									System.out.print(g + "-");
									
								}
								System.out.println(f + "-");
							
							}
							System.out.print(e + "-");
						
						}
						System.out.println(d + "-");
						
					}
					System.out.print(c + "-");

				}
				System.out.println(b + "-");

			}
			System.out.print(a + "-");
		
		}

		

	}

}
