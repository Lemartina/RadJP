package edunova;

import javax.swing.JOptionPane;

public class ZZ03 {

	public static void main(String[] args) {
		// Kreirati program koji za dva
		// unesena broja ispisuje sve prim (djeljivi sam sobom i s 1)
		// brojeve između njih.

		int jedan = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int dva = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		System.out.println("Ovo je prvi broj: " + jedan);
		System.out.println("Ovo je drugi broj: " + dva);

		// fali uvjet prosti broj djeljen prirodnim brojem s ostatkom se ne ispisuje

		for (int i = jedan; i < dva; i++) {
			if 	((i%2==1) && (i / 1 == i) && (i / i == 1)&& (i>1)))
					System.out.print(" "+ i);
				}  
		
		
		if (jedan>dva) {
										
					System.out.println("Greška: prvi broj mora biti manji od drugog");
				}



				
				
				
				
				
				
		
	
	}
		
	}

