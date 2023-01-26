package edunova;

import java.util.Date;

public class E02_Start {

	
	public static void main(String[] args) {
	
		Osoba osoba = new Osoba();
	
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

	
		Racun [] racuni = new Racun[3];
		
//					
//	racuni [0]=dodajRacun("2023-11-01", 2353.56f,
//				dodajKupac("Petar", "Ivana Gundulića 40"));
//	racuni [1]=dodajRacun("2022-10-01", 5698.56f, 
//dodajKupac("Ivan", "Petra Preradovića 1"));
//racuni [2]=dodajRacun("2021-09-06", 23698.89f, 
//				dodajKupac("Ivana", "ljudevita Gaja 25"));
//				
//		
		
		
			
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
	
	private static Kupac dodajKupac(
			String naziv, String adresa) {
		Kupac kupac= new Kupac();
		kupac.setNaziv(naziv);
		kupac.setAdresa(adresa);
		return kupac;
	}
	
	private static Racun dodajRacun(Date datum,
			float iznos, Kupac kupac) {
		Racun racun= new Racun();
		racun.setDatum(datum);
		racun.setIznos(iznos);
		racun.setKupac(kupac);
		return racun;
	}

	
}