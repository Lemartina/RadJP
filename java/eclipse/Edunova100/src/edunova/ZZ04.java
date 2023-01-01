package edunova;

public class ZZ04 {

	public static void main(String[] args) {
		//Keirati program koji unosi dvije 
		//matrice 4x4 te ispisuje njihov zbroj
		
		//1. matrica 4*4
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=4;j++) {
					System.out.print(" "+ i*j);
			}
						
			System.out.println();

	}
		System.out.println("\t");
		
		//2. matrica 4*4
		for(int a=1; a<=4;a++) {
			for(int b=1;b<=4;b++) {
					System.out.print(" "+ a*b);
			}
						
			System.out.println();

}
		
		
		//zbroj matrica
		
		System.out.println((i*j)* (a*b));

	}
	}