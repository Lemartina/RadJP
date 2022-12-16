package edunova;

import javax.swing.JOptionPane;

public class E04PrviProgram {

	public static void main(String[] args) {
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drgui broj")
				);

				
				int rezultat= prviBroj + drugiBroj;
				
				System.out.println(rezultat);
	}

}
