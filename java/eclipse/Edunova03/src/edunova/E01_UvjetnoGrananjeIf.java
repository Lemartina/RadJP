package edunova;

public class E01_UvjetnoGrananjeIf {

	public static void main(String[] args) {

		boolean uvjet = true;

		if (uvjet) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}

		int i = 7;
		if (i < 10) {
			System.out.println("3");
		}

		uvjet = i < 5;
		if (uvjet) {
			System.out.println("4");
		} else {
			System.out.println("5");
		}

		if (i == 7) {
			System.out.println("6");
		}

		if (i != 7)
			System.out.println("7");
		System.out.println("8");

		i = 0;

		if (i > 1 & i < 5) {
			System.out.println("9");
		} else {
			System.out.println("10");
		}

		if (i > 1 && i < 5) {
			System.out.println("11");
		} else {
			System.out.println("12");
		}

		if (i == 0 | i > 1) {
			System.out.println("13");
		}

		if (i == 0 || i > 1) {
			System.out.println("14");
		}

		int t = 12, k = 10;

		if ((t > 5 && t <= 10) || k == 10) {
			System.out.println("15");

			if (k >= 10) {
				if (i < 100) {
					System.out.println("16");
				}

				if (i == 0) {
					System.out.println("17");
				} else if (i == 7) {
					System.out.println("18");

				} else {
					System.out.println("19");
				}

				
				i =5 ;
				if (i>3) {
					System.out.println("Pozitivna");
				} else {
					System.out.println("Negativna");
				}
				
				System.out.println("ocjena");
			}
			
			
			System.out.println((i>1? "Pozitivna " : "Negativna ") + "ocjena");
		}

	}

}
