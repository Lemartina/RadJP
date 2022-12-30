package edunova;

public class E02_UvjetnoGrananjeIf {

	public static void main(String[] args) {
	
		int ocjena =2;
		
//		if (ocjena == 1) {
//			System.out.println("Nedovoljan");
//		} else if (ocjena == 2) {
//			System.out.println("Dovoljan");
//		}
//		
//		else {
//			System.out.println("Ocjena nije broj");
//		}

		switch (ocjena) {
		case 1: System.out.println("Nedovoljan");
		break;
		case 2: System.out.println("Dovoljan");
		break;
		case 3: System.out.println("Dobar");
		break;
		case 4: System.out.println("Vrlo dobar");
		break;
		case 5: System.out.println("Odličan");
		break;
		default: System.out.println("Broj je veći od 5 ne odnosi se na školske ocjene");
		}
		
	}

}
