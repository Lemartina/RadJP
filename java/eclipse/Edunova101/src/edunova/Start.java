package edunova;

public class Start {
public static void main(String[] args) {
	//4. korak unos podataka -ručno
	//slaganje u niz
	
	Racunalo[] racunalo = new Racunalo[2];
	racunalo[0]=kreirajRacunalo(
			Pomocno.obavezanUnosStringa("Upiši ime računala"),
			Pomocno.ucitajCijeliBroj("Unesi serijski broj racunala"),
			Pomocno.ucitajDecimalniBroj("Unesi cijenu računala",
					"Broj mora biti zaokuržen na dvije deicimale"),
			Pomocno.obvezanUnosBoolean("Unesi true ili false"),
			Pomocno.maliBroj("Upiši broj jezgri")
			);
	
	racunalo[1]=kreirajRacunalo(
			Pomocno.obavezanUnosStringa("Upiši ime računala"),
			Pomocno.ucitajCijeliBroj("Unesi serijski broj racunala"),
			Pomocno.ucitajDecimalniBroj("Unesi cijenu računala",
					"Broj mora biti zaokuržen na dvije deicimale"),
			Pomocno.obvezanUnosBoolean("Unesi true ili false"),
			Pomocno.maliBroj("Upiši broj jezgri")
			);

	//5.korak ispis
	
	System.out.println(racunalo[0].getNazivRacunala(),
			   racunalo[0].getSerijskiBroj(),
			   racunalo[0].getBrojJezgri(),
			   racunalo[0].getCijena(),
			   racunalo[0].getNazivRacunala(),
			   racunalo[0].getUgradjenaBaterija());
			   
}
	
	// 3.korak vanjska metoda
	
	private static Racunalo kreirajRacunalo(
			String nazivRacunala,
			int serijskiBroj,
			boolean ugradjenaBaterija,
		byte brojJezgri,
double cijena) {
		
		Racunalo racunalo = new Racunalo();
		racunalo.setNazivRacunala(nazivRacunala);
		racunalo.setSerijskiBroj(serijskiBroj);
		racunalo.setUgradjenaBaterija(ugradjenaBaterija);
		racunalo.setBrojJezgri(brojJezgri);
		racunalo.setCijena(cijena);
		return racunalo;
	
	
	}
}