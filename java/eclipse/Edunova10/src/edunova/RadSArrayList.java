package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RadSArrayList {

	//array list ili 
	public RadSArrayList() {
	List<Mjesto>lm=new ArrayList<>();
	lm.add(new Mjesto());
	
	//vektor - legasi -staro
	lm=new Vector<>();
	lm.add(new Mjesto());
	
	}
	
	public static void main(String[] args) {
		new RadSArrayList();
	}
}
