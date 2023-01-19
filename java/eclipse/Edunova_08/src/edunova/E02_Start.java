package edunova;

public class E02_Start {
public static void main(String[] args) {
	
	//tip podatka može biti bilo koja klasa koju smo definirali
	//Osoba je tip podataka - klada
	//osobe je instanca klase - objekt - vraijabla
	//uobijčajeno je da se objekt zove kao klasa razlik je u malo/veliko slovo
	// new poziv konstruktora klase
	Osoba osoba  = new Osoba();
	// klasa će sakriti svoja svojstva i učiniti ih dostupnima putem metoda -> getteri i setteri

osoba.setIme("Pero");
osoba.setPrezime("Perić");
osoba.setGodine(24);

System.out.println(osoba.getPrezime());

Osoba  [] osobe = new Osoba [2];
osobe[0]=osoba;


osoba = new Osoba();
osoba.setIme("Marita");
osobe[1]=osoba;

for (Osoba o: osobe) {
	System.out.println(o.getIme());
}
	
}
//private static Osoba kreirajOsobu(String ime, String prezime, int godine) {
//Osoba osoba= new Osoba();
//osoba.setGodine(godine);
//osoba.setIme(prezime);
//osoba.setPrezime();
//return osoba;
}
