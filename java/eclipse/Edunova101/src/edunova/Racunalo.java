package edunova;

public class Racunalo {


	private String nazivRacunala;
	private int serijskiBroj;
	private int ugradjenaBaterija;
	private boolean brojJezgri;
	private double cijena;
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
	public int isUgradjenaBaterija() {
		return ugradjenaBaterija;
	}
	public void setUgradjenaBaterija(int i) {
		this.ugradjenaBaterija = i;
	}
	public boolean getBrojJezgri() {
		return brojJezgri;
	}
	public void setBrojJezgri(boolean b) {
		this.brojJezgri = b;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

	
}