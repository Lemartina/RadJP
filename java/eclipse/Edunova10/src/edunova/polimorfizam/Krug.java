package edunova.polimorfizam;

public class Krug extends Oblik{

	private int polumjer;
	
	public Krug() {
		super();
	}

	public Krug(int polumjer) {
		super();
		this.polumjer = polumjer;
	}

	public int getPolumjer() {
		return polumjer;
	}

	public void setPolumjer(int polumjer) {
		this.polumjer = polumjer;
	}

	@Override
	public double povrsina() {
		// TODO Auto-generated method stub
		return polumjer*polumjer*Math.PI;
	}

}
