package edunova;

public class E01_VrsteMetoda {

	
//1. METODA
	// ne prima parametre ne vraća parametre
	
	
	public static void m1_pozdravi() {
	for ( int i =0; i<10; i++) {
		System.out.print("Hello ");
	}	
	System.out.println();
	}
	
	
//2. METODA
	//ne prima parametre vraća parametre
	
	public static int m2_slucajniBroj (){
	int sb=(int)(Math.random()*100);
	return sb;
	}
	
//3. METODA
	// prima parametre ne vraća prametre
	
	public static void m3_alg42(int a, int b, int c) {
		int r=a+b;	
		float f= r/c;
		System.out.println(f*10);
	}
	
	
//4. METODA
	// prima parametre vraća parametre
	
	public static boolean m4_prim(int broj) {
		for (int i=2; i<broj;i++) {
			if (broj%i==0) {
				

	return false;
	}
	
}
return true;
}
}