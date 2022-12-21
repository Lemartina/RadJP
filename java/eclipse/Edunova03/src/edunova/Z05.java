package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		// Za upisana 3 cijela broja
		// program ispisuje najveći
		
		
		int jedan = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int dva = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int tri = Integer.parseInt(JOptionPane.showInputDialog("Unesi treći broj"));
		
		int max = jedan;
		
		if (dva >max) max =dva;
		
		if (tri > max) max = tri;
		
		System.out.println("Najveći broj je: " + max);
		
		

	}

}
