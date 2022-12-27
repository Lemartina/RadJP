package edunova;

public class DZ001 {

	public static void main(String[] args) {
		
		System.out.print(" --------------------------\n");	
		System.out.println(": : :TABLICA MNOZENJA : : :");
		System.out.print(" --------------------------\n");	
		// ispis zaglavlja
		System.out.print("*|");
		for (int f=1; f<=9; f++) {
			System.out.print(" "+f+" ");}	
		System.out.print("\n");	
		
		System.out.print(" --------------------------\n");	
		
		//ispis tablice
		for (int i =1; i<=9; i++) {
		for (int j=1;j<=9; j++){
				if ((i*j)<=9) {
					System.out.print("  "+ i*j);
					}else {
						System.out.print(" "+ i*j);
				}
				
			}
			System.out.println();
					}
		 
		// ispis prvog stupca
//		for (int v=1; v<=9; v++){
//		System.out.println(v + "|");}	
		System.out.print(" --------------------------\n");	
		System.out.print(" :  :  :  :  :  :by Martina\n");	
		System.out.print(" --------------------------\n");	

	}

}
