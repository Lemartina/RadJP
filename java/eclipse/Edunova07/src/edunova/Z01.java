package edunova;

public class Z01 {
	// Program od korisnika traži ukupan broj
	// predmeta u školi
	// Program unosi ocjene za svaki predmet
	// i ispisuje prosjek ocjena
	
	
	public static void main(String[] args) {
		
		int suma=0;
		int ukupnoPredmeta=Pomocno.ucitajCijeliPozitivniBroj(
				"Unesite ukupan broj predmeta za koji želite prosjek");
		
		for (int i=0; i<ukupnoPredmeta;i++) {
			suma+=Pomocno.ucitajCijeliBroj("Unesi"+(i+1)+". ocjenu");
		}
		System.out.println(suma/(float)ukupnoPredmeta);
	}
}
