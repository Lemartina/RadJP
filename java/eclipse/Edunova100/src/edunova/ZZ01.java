package edunova;

import javax.swing.JOptionPane;

public class ZZ01 {

	public static void main(String[] args) {
		// Kreirati program koji unosi 24 broja, 
		//ispisuje njihov zbroj, najmanji i  najveći uneseni broj.
		
		
//		zbroj prva 24 broja
//		int ukupno=0;
//		
//		
//		for(int m=1;m<=24;m++) {
//			ukupno=ukupno+m;
//		}
//System.out.println("Zbroj prva 24 broja je: " + ukupno);




// program koji zbraja 24 unesena broja

int niz[] = new int[24];
for(int i=0;i<niz.length;i++) {
	niz[i] = Integer.parseInt(
			JOptionPane.showInputDialog(
					"Unesi " + (i+1) + ". broj")
			);
}
//zbrojite vrijednosti svih elemenata niza

		int zbroj=0;
		for(int i=0;i<niz.length;i++) {
			zbroj+=niz[i];
		}
		
		//ispišite zbroj
		System.out.println(zbroj);


// ispisuje najmanji i  najveći uneseni broj
		
		









	}

}
