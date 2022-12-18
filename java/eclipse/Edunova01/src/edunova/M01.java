package edunova;

import javax.swing.JOptionPane;

public class M01 {

	public static void main(String[] args) {
		
		int starost=33;
		
		System.out.println("Upisane godine"+ " " + starost);
		
		
		
		
		int godinaRodjenja = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi godinu rođenja")
				);
		
		int tekucaGodina = 2022;
		
		
		int starostM = tekucaGodina - godinaRodjenja;
		
		System.out.println("Izračuate godine" + " " + starostM);
		
		
		// kontola rezultata
		
	int kontrolaRezultata= starost - starostM;
	
	System.out.println("Kontola rezlatata je" + " " + kontrolaRezultata);

	}

}
