package edunova;

import javax.swing.JOptionPane;

public class ZimskiZadaci6 {

	public static void main(String[] args) {

//Kreirati program koji ispisuje cikličnu matricu 

		// unos podataka
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sutupaca:"));
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka:"));
		

		int Matrica[][] = new int[stupac][red];
		int broj = 1;
		int stupacPocetak = 0;
		int stupacKraj = stupac - 1;
		int redPocetak = 0;
		int redKraj = red - 1;
		
		
		int i;
		int j;

//1

		vanjska: 
			for (i=1; broj<= stupac * red;) {
			for (i = redKraj; i >= redPocetak; i--) {
				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[stupacKraj][i] = broj++;
				}

			}
			stupacKraj--;
//2
			for (i = stupacKraj; i >= stupacPocetak; i--) {
				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[i][redPocetak] = broj++;
				}

			}
			stupacKraj++;
//3
			for (i = redPocetak; i <= redKraj; i++) {

				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[stupacPocetak][i] = broj++;

				}
			}
			stupacPocetak++;

			
			//4
			for (i = stupacPocetak; i <= stupacKraj; i++) {

				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[i][redKraj] = broj++;

				}
			}
			redKraj--;

			for (j = 0; j < stupac; j++) {
				for (i = 0; i < red; i++) {
					System.out.print(Matrica[j][i]+" ");
				}
				System.out.println();
			}

		}
	}
}