package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		// Za unesena dva cijela broj
		// program ispisuje veći
		// 3 i 5 -> 5
		// 5 i 3 -> 3
		// 5 i 5 ->
		
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		
		if (i>j) {
			System.out.println(i);
		}else if (i<j) {
			System.out.println(j);
		}else {
			System.out.println("Brojevi su isti");
		}

	}

}
