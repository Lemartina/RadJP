 package edunova;

import javax.swing.JOptionPane;

public class ZimskiZadaci6 {

	public static void main(String[] args) {
		
//Kreirati program koji ispisuje cikličnu matricu 
		
	// unos podataka
		
		int a= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka:"));
		int b= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sutupaca:"));
		
		
		for (int i=14; i<=16; i++) {
			
			System.out.println(i + "-");
						
		}

		
			
				
	for (int i=10; i<=13; i++) {
		
			System.out.print(i + "-");
			
			
		}

	System.out.print("\n");
		
		for (int i=9; i>=6; i--) {	
			System.out.println(i + "-");
		
			
		}
		
		for (int i=5; i>=1; i--) {
					
			System.out.print(i + "-");
		}

	}

}
