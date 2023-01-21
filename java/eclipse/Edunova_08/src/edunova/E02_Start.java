package edunova;

public class E02_Start {
	public static void main(String[] args) {

		Osoba osoba = new Osoba();

		osoba.setIme(Pomocno.obavezanUnosStringa("Unesi ime"));
		osoba.setPrezime(Pomocno.obavezanUnosStringa("Unesi prezime"));
		osoba.setGodine(Pomocno.ucitajCijeliPozitivniBroj("Unesi svoje godine"));

		System.out.println(osoba.getPrezime());

	
	
		Osoba[] osobe = new Osoba[5];
		osobe[0] = osoba;

		osoba = new Osoba();
		osoba.setIme("Marina");
		osobe[1] = osoba;
		osobe[2] = kreirajOsobu("Ana", "Gal", 19);
		osobe[3] = kreirajOsobu("Tin", "Ked", 19);
		osobe[4] = kreirajOsobu("Lu", "Ked", 20);
		
		

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