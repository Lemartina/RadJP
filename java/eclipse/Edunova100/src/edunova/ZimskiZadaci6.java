package edunova;

import javax.swing.JOptionPane;

public class ZimskiZadaci6 {

	public static void main(String[] args) {

//Kreirati program koji ispisuje cikličnu matricu 

		// unos podataka

		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka:"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sutupaca:"));

		int redPocetak = 1;
		int redKraj = red - 1;
		int stupacPocetak = 1;
		int stupacKraj = stupac - 1;
		int broj = 1;
		int i;



		int Matrica[][] = new int[stupac][red];

		vanjska: 
			for (;;){
			for (i = redKraj; i >= redPocetak; i--) {
				if (broj>= stupac * red) {
					break vanjska;
				} else {
					Matrica[stupacKraj][i] = broj++;
				}
				System.out.println();
			}
	}stupacKraj--;
}}