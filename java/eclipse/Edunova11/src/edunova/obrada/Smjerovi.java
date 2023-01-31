package edunova.obrada;

import java.util.ArrayList;
import java.util.List;



import edunova.model.Smjer;

public class Smjerovi {
	
	
	private List<Smjer> smjerovi;

	
	
	public Smjerovi() {
		super();
		smjerovi = new ArrayList<>();
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
