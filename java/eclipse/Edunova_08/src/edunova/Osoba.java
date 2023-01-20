package edunova;

public class Osoba {

	// ovo su svojstva klase koja opisuju objekt
//	String ime;
//	String prezime;
//	int godine;
//	ovako nije doboro
	
// učahirivanje
// klasa će sakriti svoja svojastva i učiniti ih privatnima
// a svojstva će biti dostupna preko gettera i settera
	private String ime;
	private String prezime;
	private int godine;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	
	
	
}