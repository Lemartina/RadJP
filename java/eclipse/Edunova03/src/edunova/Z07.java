package edunova;

import javax.swing.JOptionPane;

public class Z07 {

	public static void main(String[] args) {
		// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inače ispisuje njihovu razliku

		
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši jedan broj"));
		int b= Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		
		
		if ((a%2==0) && (b%2==0))
		{System.out.println(a+b);
		}else {
			System.out.println(a-b);
		}
	}

}
