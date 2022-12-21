package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {

		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veći od 10
		// inače ispisuje Edunova

		
		
		
		int jedan = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		int dva= Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		
		int zbrojeno = jedan + dva;
		
		
		if (zbrojeno > 10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
		}
		
	}

}
