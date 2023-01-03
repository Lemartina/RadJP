package edunova;

import javax.swing.JOptionPane;

public class Z06a {

	public static void main(String[] args) {
		
		// unijeli vrijdnosti za sve elemente niza
		
		int niz[] = new int[1];
		for(int a=0;a<niz.length;a++) {
			niz[a] = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Unesi broj")
					);
		}

	
		System.out.println(niz);
		
	}

}
