package edunova;

public class Polaznik extends Osoba {
			
		private String brojUgovora;


	
		public Polaznik() {
//			super();
			System.out.println("Konstruktor polaznik");
		}
		
		
		
		

		public Polaznik(String ime, String prezime, String brojUgovora) {
			super(ime, prezime);
			this.brojUgovora = brojUgovora;
		}





		public String getBrojUgovora() {
			status=1;
			broj=2;
			return brojUgovora;
			
		
		}

		public void setBrojUgovora(String brojUgovora) {
			this.brojUgovora = brojUgovora;
		}
		
	
}
