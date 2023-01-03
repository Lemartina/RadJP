package edunova;

import javax.swing.JOptionPane;

public class ZZ03 {

	public static void main(String[] args) {
		// Kreirati program koji za dva
		// unesena broja ispisuje sve prim (djeljivi sami sobom i s 1)
		// brojeve između njih.

		int jedan = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int dva = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		System.out.println("Ovo je prvi broj: " + jedan);
		System.out.println("Ovo je drugi broj: " + dva);

		int min = jedan < dva ? jedan : dva;
		int max = jedan > dva ? jedan : dva;

		int rezultat = 0;
		for (int i = min; i < max; i++) {
			if (i / 1 == 1) {
				rezultat+=i;{
			}
				System.out.println("Ovo je rezezultat1: "+ rezultat);
			} else if (i / i == 0) {
				System.out.println("Ovo je rezultat2: " + rezultat);
				{
					rezultat += rezultat + i;
				}

			}

		}

	}
}
