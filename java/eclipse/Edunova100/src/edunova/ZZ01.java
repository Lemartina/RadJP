package edunova;

import javax.swing.JOptionPane;

public class ZZ01 {

	public static void main(String[] args) {
		
	//	System.out.println("Definirani brojevi");
		// Kreirati program koji unosi 24 broja,
		// ispisuje njihov zbroj, najmanji i najveći uneseni broj.

		//zbroj prva 24 broja, brojevi su unaprijed definirani
		//niz je od 1 do 24, gdje je najmanji 1, a najveći 24  
//		int ukupno=0;
//		
//		
//		for(int m=1;m<=24;m++) {
//			ukupno=ukupno+m;
//		}
//System.out.println("Zbroj prva 24 broja je: " + ukupno);
//		
//		int min =1;
//		int max=24;
//		
//		System.out.println("Najmanji broj je: "+ min);
//		System.out.println("Najveći broj je: "+ max);		
//		
//		
//		
		
System.out.println("Korisnik unosi brojeve");
// program koji zbraja 24 unesena broja

		// unos brojeva

		int niz[] = new int[3];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i + 1) + ". broj"));
		}
//zbrojite vrijednosti svih elemenata niza

		
		
		int zbroj = 0;
		
				
		for (int i = 0; i < niz.length; i++) {
			zbroj += niz[i];
		}

		// ispišite zbroj
		System.out.println("Zbroj unesenog niza je: "+ zbroj);
		
		

// ispisuje najmanji i  najveći uneseni broj


	}}