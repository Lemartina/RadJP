package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		// Korisnik unosi dva cijela broja
		// Program ispisuje
		// zbroj svih parnih brojeva
		// između dva unesena broja

		int prviB = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		int drugiB = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi cijeli broj"));
		
		int min= prviB < drugiB ? prviB : drugiB;
		int max= prviB > drugiB ? prviB : drugiB;
		
		int zbroj = 0;
		for (int i = min; i <=max; i++) {
			if (i%2 == 0) {
				zbroj+=i;
			}System.out.println(zbroj);
		}
	
	}

}
