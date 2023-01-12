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

		int stupacKraj = stupac - 1;
		int stupacPocetak = 0;
		int  redKraj= red - 1;
		int redPocetak = 0;

		vanjska: for (int i=0; broj <= stupac * red;) {

			for (int j = redKraj; j >= redPocetak; j--) {
				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[stupacKraj][j] = broj++;
				}

			}
			stupacKraj--;

			for (int j = stupacKraj; j >= stupacPocetak; j--) {

				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[j][redPocetak] = broj++;
				}
			}
			redPocetak++;

			for (int j = redPocetak; j <= redKraj; j++) {

				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[stupacPocetak][j] = broj++;
				}
			}
			stupacPocetak++;

			for (int j = stupacPocetak; j <= stupacKraj; j++) {

				if (broj > stupac * red) {
					break vanjska;
				} else {
					Matrica[j][redKraj] = broj++;
				}
			}
			redKraj--;
		}

		for (

				int i = 0; i < stupac; i++) {
			for (int j = 0; j < red; j++) {
				System.out.print(Matrica[i][j] + "\t");
			}
			System.out.println();
		}
	}
}