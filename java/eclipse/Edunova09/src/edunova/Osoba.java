package edunova;

public class Osoba  extends Object {
	
	private String ime;
	private String prezime;
	protected int status;
	int broj;
	
	
	
	
	public Osoba() {
	System.out.println("Konstruktor osoba");
	}
	public Osoba(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
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
	


	
	

}
