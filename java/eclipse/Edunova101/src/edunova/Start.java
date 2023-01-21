package edunova;

public class Start {
public static void main(String[] args) {
	//4. korak unos podataka -ručno
	//slaganje u niz
	
	Racunalo[] racunala = new Racunalo[3];
	racunala[0]=kreirajRacunalo("Dell", 1236589, "da", "A", 2465.56f);
	racunala[1]=kreirajRacunalo("Asus", 566878, "ne", "C", 1546546.65f);
	racunala[2]=kreirajRacunalo("Acer", 5465, "da", "D", 5640.00f);
	
	//5.korak ispis
	

}
	
	// 3.korak vanjska metoda
	
	private static Racunalo kreirajRacunalo(
			String nazivRacunala,
			int serijskiBroj,
			boolean ugradjenaBaterija,
		char oznakaSerije,
			float cijena) {
		
		Racunalo racunalo = new Racunalo();
		racunalo.setNazivRacunala(nazivRacunala);
		racunalo.setSerijskiBroj(serijskiBroj);
		racunalo.setUgradjenaBaterija(ugradjenaBaterija);
		racunalo.setOznakaSerije(oznakaSerije);
		racunalo.setCijena(cijena);
		return racunalo;
	
	
	}
}