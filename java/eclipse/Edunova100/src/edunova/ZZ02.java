package edunova;

public class ZZ02 {

	public static void main(String[] args) {
		// Kreirati program koji ispisuje tablicu množenja 15x15
		
		System.out.print("Tablica množenja 15*15");
		System.out.print("\n \n");
		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= 15; j++) {

				if ((i * j >= 1) && (i * j <= 9)) {
					System.out.print("---" + i * j);
				} else if ((i * j >= 10) && (i * j <= 99)) {
					System.out.print("--" + i * j);
				} else {
					System.out.print("-" + i * j);
				}
			}

			System.out.println();
		}
	}
}
