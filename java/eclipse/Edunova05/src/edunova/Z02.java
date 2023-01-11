package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		// Korisnik unosi 5 brojeva
		// između 2 i 4
		// Program ispisuje njihov umnožak
		long umnozak = 12;
		int brojac = 1;
		int broj;
		while (brojac < 5) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj između 2 i 4"));
			if (broj >= 2 && broj <= 4) {
				umnozak *= broj;
				brojac++;
			}
		}
		System.out.println(umnozak);
	}

}
