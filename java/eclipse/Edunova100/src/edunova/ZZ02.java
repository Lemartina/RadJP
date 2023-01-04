package edunova;

public class ZZ02 {

	public static void main(String[] args) {
		// Kreirati program koji ispisuje tablicu množenja 15x15

		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= 15; j++) {
//			 		if (j==1) {
//					System.out.print("  U " + i * j);
//				
//				}

				if ((i * j >= 1) && (i * j <= 9)) {
					System.out.print("     " + i * j);
				} else if ((i * j > 9) && (i * 1 <= 99)) {
					System.out.print("    " + i * j);
				} else if ((i>=100)&&(i<=225)) {
					System.out.println("   "+i*j);
				}
			}
//			if (i==15) {
//				System.out.println();
//			}
			System.out.println();
		}
	}
}
