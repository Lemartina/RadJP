package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	// Program unosi imena dvije osobe
	// i ispisujue koliko se vole
	// metodom slučajnog broja od 10 do 90
	
	
	public static void main(String[] args) {
		String ime1=Pomocno.obavezanUnosStringa(
				"Unesi svoje ime");
		String ime2=Pomocno.obavezanUnosStringa(
				"Unesi ime svoje simpatije");
		
		int slucajniBroj=Pomocno.slucajniBrojUrasponu(10, 90);
		System.out.println(
				ime1 + " i "+ime2+" se vole" + slucajniBroj +"%");
	}
	
}
