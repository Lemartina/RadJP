package edunova;

import java.util.Date;

public class E02_Start {

	
	public static void main(String[] args) {
		// Ovo morate znati u svako doba dana i noći
		// Objekt je instanca klase
		// Osoba je tip podatka - klasa
		// osoba je instanca klase/objekt/varijabla
		// new: ključna riječ za poziv konstruktora klase
		Osoba osoba = new Osoba();
		
		// Po OOP pravilima ne smije se omogućiti direktan pristup svojstvima
		// OVO NEĆEMO RADITI
		//osoba.ime="Pero";
		//System.out.println(osoba.ime);
		
		//postavljanje vrijednosti svojstava na objekt
		osoba.setIme(Pomocno.obavezanUnosStringa("Unesi ime"));
		osoba.setPrezime("Perić");
		osoba.setGodine(24);
		
		System.out.println(osoba.getPrezime());
		
		Osoba[] osobe = new Osoba[5];
		osobe[0] = osoba;

		osoba = new Osoba();
		osoba.setIme("Marina");
		osobe[1]=osoba;
		osobe[2] = kreirajOsobu("Ana", "Gal", 19);
		osobe[3] = kreirajOsobu("Tin", "Ked", 19);
		osobe[4] = kreirajOsobu("Lu", "Ked", 19);
		
		for(Osoba o : osobe) {
			System.out.println(o.getIme());
		}
		
		
	Mjesto mjesto= new Mjesto();
	Zupanija zupanija= new Zupanija();
	zupanija.setNaziv("OBŽ");
	mjesto.setZupanija(zupanija);
		
		System.out.println(mjesto.getZupanija().getNaziv());
		
		Grupa jp27 = kreirajGrupu(1,
				"JP27", 20, new Date(), 
				kreiraSmjer(1, "Java programiranje", 
						5999.99f, 50f, true));
		
		Grupa pp26= kreirajGrupu(1, "PP26", 20, new Date(),
				kreiraSmjer(1, "PHP programiranje", 
						5999.99f, 50f, false));
//		ovo nije dobro	
		Kupac kupac= new Kupac();
		
		//ovo je niz
		Kupac []kupac= new Kupac[3],
		kupac[0]= kreirajKupac("Iva", "I. Gundulića 40");
		kupac[1]= kreirajKupac("Maja", "P. Preradovića 12");
		kupac[2]=kreirajKupac("Marina", "LJ. Gaja 15");
		
		Racun racun= new Racun();
		
		racun.setKupac(kupac);
		
		//ovo nije niz
		
		
		Racun racun1=kreirajRacun("2023-11-01", 2353.56f,
				kreirajKupac("Petar", "Ivana Gundulića 40"));
		Racun racun2=kreirajRacun("2022-10-01", 5698.56f, 
kreirajKupac("Ivan", "Petra Preradovića 1"));
		Racun racun3=kreirajRacun("2021-09-06", 23698.89f, 
				kreirajKupac("Ivana", "ljudevita Gaja 25"));
				
		
		
		
			
	}

	private static Osoba kreirajOsobu(
			String ime, String prezime, int godine) {
		Osoba osoba = new Osoba();
		osoba.setGodine(godine);
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		return osoba;
	}
	

	private static Smjer kreiraSmjer(
			int sifra, String naziv,
			float cijena, float upisnina,
			boolean certificiaran) {
		Smjer smjer = new Smjer();
		smjer.setSifra(sifra);
		smjer.setNaziv(naziv);
		smjer.setCijena(cijena);
		smjer.setUpisnina(upisnina);
		smjer.setCertificiran(certificiaran);
		return smjer;
		
		
		
	}
	private static Grupa kreirajGrupu(
			int sifra, String naziv, 
			int mp, Date datum, Smjer s) {
		Grupa g= new Grupa();
		g.setSifra(sifra);
		g.setNaziv(naziv);
		g.setMaksimalnoPolazniak(mp);
		g.setDatumPocetka(datum);
		g.setSmjer(s);
	return g;	
	
	}
	
	private static Kupac kreirajKupac(
			String naziv, String adresa) {
		Kupac kupac= new Kupac();
		kupac.setNaziv(naziv);
		kupac.setAdresa(adresa);
		return kupac;
	}
	
	private static Racun kreirajRacun(Date datum,
			float iznos, Kupac kupac) {
		Racun racun= new Racun();
		racun.setDatum(datum);
		racun.setIznos(iznos);
		racun.setKupac(kupac);
		return racun;
	}

	
}