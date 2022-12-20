package edunova;

import javax.swing.JOptionPane;

public class Z01Test {

	public static void main(String[] args) {
	
		
		int f = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);

		
		if (f<10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");
		}
	}

}
