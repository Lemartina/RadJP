package edunova;

public class E02_Start {
	public static void main(String[] args) {

		// tip podatka može biti bilo koja klasa koju smo definirali
		// Osoba je tip podataka - klasa
		// osoba je instanca klase - objekt - vraijabla
		// uobijčajeno je da se objekt zove kao klasa razlika je u malo/veliko slovo
		// new poziv konstruktora klase
		Osoba osoba = new Osoba();
		// klasa će sakriti svoja svojstva i učiniti ih dostupnima putem metoda ->
		// getteri i setteri
		// OOP
		// principi:
//		1. klasa-objekt
//		2. učahurivanje
//		3. nasljeđivanje
//		4. generici
//		5. polimorfizam
//		6. sučelja
//		7. anutacije

		// postavljanje vrijednosti svojstava pomoću getera i setera
		osoba.setIme("Pero");
		osoba.setPrezime("Perić");
		osoba.setGodine(24);

		System.out.println(osoba.getPrezime());

		Osoba[] osobe = new Osoba[2];
		osobe[0] = osoba;

		osoba = new Osoba();
		osoba.setIme("Marina");
		osobe[1] = osoba;
		osobe[2] = kreirajOsobu("Ana", "Gal", 19);
		osobe[3]= kreirajOsobu("Tin", "Ked", 19); 

		for (Osoba o : osobe) {
			System.out.println(o.getIme());
		}

	}

	private static Osoba kreirajOsobu(String ime, String prezime, int godine) {
		Osoba osoba = new Osoba();
		osoba.setGodine(godine);
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		return osoba;
	}
}