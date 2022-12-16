package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		// Za uneseni dvoznamenkasti broj
		// ispišite jediničnu vrijednost
		// unos 21, ispis 1
		// unos 87, ispis 7
		
		int brojZaUnos = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj 21")
				);
		
		int fiksniBroj = 20;
		
		int rezultat = brojZaUnos - fiksniBroj;
		
		System.out.println(rezultat);
		
		

	}

}
