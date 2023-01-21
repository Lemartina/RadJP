package edunova;

public class Racunalo {

// 1. korak svojstva klase

	private String nazivRacunala;
	private int serijskiBroj;
	private boolean ugradjenaBaterija;
	private char oznakaSerije;
	private float cijena;

// 2. korak geteri i seteri
	public String getNazivRacunala() {
		return nazivRacunala;
	}

	public void setNazivRacunala(String nazivRacunala) {
		this.nazivRacunala = nazivRacunala;
	}

	public int getSerijskiBroj() {
		return serijskiBroj;
	}

	public void setSerijskiBroj(int serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}

	public boolean isUgradjenaBaterija() {
		return ugradjenaBaterija;
	}

	public void setUgradjenaBaterija(boolean ugradjenaBaterija) {
		this.ugradjenaBaterija = ugradjenaBaterija;
	}

	public char getOznakaSerije() {
		return oznakaSerije;
	}

	public void setOznakaSerije(char oznakaSerije) {
		this.oznakaSerije = oznakaSerije;
	}

	public float getCijena() {
		return cijena;
	}

	public void setCijena(float cijena) {
		this.cijena = cijena;
	}

}
