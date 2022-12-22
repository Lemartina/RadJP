package edunova;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {

		// program unosi broj između 
		// 1 i 999
		// U slučaju da je izvan tog raspona
		// ispisati grešku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 greška
		// 1067 greška
		// 456 4
		// 6 6
		// 89 8
		
		
		
		int broj;
		for( int i=1; i>=100 ; i++) {
			broj = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Unesi broj između 1 i 999")
					);
			if(broj<1 && broj>100) {
				break;
			}
		}
		System.out.println();
}}