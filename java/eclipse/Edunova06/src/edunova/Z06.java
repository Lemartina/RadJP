package edunova;

import javax.swing.JOptionPane;

public class Z06 {

	// upute:
	// string ima char
	// znakovi se stavlja u niz
	// poziva istu metodu dok ne dođe do broja manjeg od 100
	// koristiti i petlju i uvjetno grananje

//	spjiiti 2 stringa u 1
//
//	koristiti for petlju
//
//	vrti string broji a
//
//	vrti strin broji b
//
//	dobiješ niz
//
//	niz metoda rekurzivno novi = novi niz
//
//	ako je parni broj elenemana/2
//
//	/2 +1 neprarni
//
//	<100 vrati rezultat int

//	https://www.youtube.com/watch?v=mrXDivW-vP4
//	https://www.youtube.com/watch?v=iHCon5VmSyk

	public static void main(String[] args) {
		String ja=JOptionPane.showInputDialog("Kako se zoveš?");
		String ti=JOptionPane.showInputDialog("kako se zove tvoja simpatija?");
		String ljubav= ja + ti;
		char slovo;
		int brojacSlova=0;
			
		ljubav= JOptionPane.showInputDialog(
			"Koje slovo želiš staviti u brojač?");
		slovo=ljubav.charAt(0);
		
		for(int i=0;i<ljubav.length(); i++) {
			if (ljubav.charAt(i)==slovo) {
				brojacSlova = brojacSlova +1;
			}
		}
				
				System.out.println("U ljubavi " 
				+ ja + " i " + ti + " slovo " + slovo + 
				" se poanavlja " + brojacSlova + " put/puta ");
	}
	}
