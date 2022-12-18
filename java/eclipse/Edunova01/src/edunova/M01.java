package edunova;

import javax.swing.JOptionPane;

public class M01 {

	public static void main(String[] args) {
		
		// unos godina
		
		int starost=33;
		
		System.out.println("Upisane godine"+ " " + starost);
		
		
		// izračun godina
		
		int godinaRodjenja = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi godinu rođenja")
				);
		
		int tekucaGodina = 2022;
		
		
		int starostM = tekucaGodina - godinaRodjenja;
		
		System.out.println("Izračunate godine" + " " + starostM);
		
		
		// kontola rezultata
		
	int kontrolaRezultata= starost - starostM;
	
	System.out.println("Kontola rezultata je" + " " + kontrolaRezultata);
	
		
	

	}

}
