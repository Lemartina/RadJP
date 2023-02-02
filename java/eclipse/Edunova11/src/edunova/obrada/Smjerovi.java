package edunova.obrada;

import java.util.ArrayList;
import java.util.List;

import edunova.Pomocno;
import edunova.Start;
import edunova.model.Smjer;

public class Smjerovi {
	
	
	private List<Smjer> smjerovi;

	
	
	public Smjerovi() {
		super();
		smjerovi = new ArrayList<>();
	}
	
	
	
	public void izbornik() {
		System.out.println("");
		System.out.println("Smjer izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih smjerova");
		System.out.println("2. Unos novog smjera");
		System.out.println("3. Promjena postojećeg smjera");
		System.out.println("4. Brisanje smjera");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
	}
	
	private void odabirIzbornika() {
		switch(Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 5)) {
		case 5:
			Start.glavniIzbornik();
		}
		
	}

	

	public Smjerovi(List<Smjer> smjerovi) {
		super();
		this.smjerovi = smjerovi;
	}

	public List<Smjer> getSmjerovi() {
		return smjerovi;
	}

	public void setSmjerovi(List<Smjer> smjerovi) {
		this.smjerovi = smjerovi;
	}
	
	

}
