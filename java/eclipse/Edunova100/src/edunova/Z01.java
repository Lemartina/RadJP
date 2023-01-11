package edunova;

public class Z01 {

	public static void main(String[] args) {
		// while petljom ispisati 
		// zbroj prvih 100 brojeva
		
//		int zbroj=0;
//		for (int i =1; i<=100; i++) {
//			zbroj= zbroj +i;
//			System.out.println(zbroj);
//		}

		
		int zbroj =0;
		int i=1;
		while (i<=100) {
			zbroj = zbroj + i++;
			System.out.println(zbroj);
		}
		
	}

}
