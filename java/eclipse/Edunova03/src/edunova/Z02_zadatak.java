package edunova;

import javax.swing.JOptionPane;

public class Z02_zadatak {

	public static void main(String[] args) {
		// Korisnik unosi cijeli broj
		// Program ispisuje da li je 
		// paran ili nije
		
		
		int x = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi jedan cijeli broj")
				);

		
		if (x%2== 0) {
			System.out.println("Ovo je paran broj");
		} else
		{
			System.out.println("Ovo nije paran broj");
		}
	}

}
