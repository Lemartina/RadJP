package edunova;

import javax.swing.JOptionPane;

public class Z01_zadatak {

	public static void main(String[] args) {

		// Korisnik unosi cijeli broj
		// Za broj manji od 10
		// ispisuje se Osijek
		// inače se ispisuje Donji Miholjac
		
		
		int z = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi jedan cijeli broj")
				);

		
		if (z<10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");
		}
	} 

}
