package edunova;

import java.util.Date;

public class Grupa {

	
	private int sifra;
	private String naziv;
	private int maksimalnoPolazniak;
	private Date datumPocetka;
	private Smjer smjer;
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getMaksimalnoPolazniak() {
		return maksimalnoPolazniak;
	}
	public void setMaksimalnoPolazniak(int maksimalnoPolazniak) {
		this.maksimalnoPolazniak = maksimalnoPolazniak;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	
}
