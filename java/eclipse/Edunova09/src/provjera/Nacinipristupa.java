package provjera;

import edunova.Osoba;
import edunova.Polaznik;
import edunova.Predavac;

public class Nacinipristupa {
	
	public static void main(String[] args) {
		Polaznik p=new Polaznik("Pero", "Perić","22");
//		p.setIme("Pero");
		nasljedjivanje(p);
		
		Predavac pr= new Predavac();
		pr.setIme("Marija");
		nasljedjivanje(pr);
		
	}
private static void nasljedjivanje(Osoba o) {
	System.out.println();
}
}
