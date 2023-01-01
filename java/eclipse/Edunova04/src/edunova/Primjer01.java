package edunova;

import javax.swing.JOptionPane;

public class Primjer01 {
	
	// program traži od korisnika unos broja
	// između 1 i 10
	// ako je unavedenom rasponu, program se prekida i ispisuje ga

	public static void main(String[] args) {
		int broj;
		for(;;) {
			broj= Integer.parseInt(
					JOptionPane.showInputDialog(
							"Unesi broj između 1 i 10")
					);
			if (broj>=1 && broj <=10) {
			break;
			}
		}
System.out.println(broj);
	}

}
