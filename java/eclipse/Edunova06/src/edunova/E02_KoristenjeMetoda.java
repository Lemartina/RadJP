package edunova;

public class E02_KoristenjeMetoda {

	public static void main(String[] args) {

		E01_VrsteMetoda.m1_pozdravi();

		int i = E01_VrsteMetoda.m2_slucajniBroj();
		System.out.println(i + " %");

		System.out.println(E01_VrsteMetoda.m2_slucajniBroj());

		
		int b=0;
		while (b++<10) {
			System.out.println(
					E01_VrsteMetoda.m2_slucajniBroj());
		}
		E01_VrsteMetoda.m3_alg42(1, b, 6);
		
	System.out.println(E01_VrsteMetoda.m4_prim(2));
	
	
	System.out.println(Z01.najveci(1, 3, 5));
	
	System.out.println(Z01.najveci(Z02.broj(), Z02.broj(), Z02.broj()));
	
	int z= Z03.imePrezime("Martina", "Novoeselac");
	
	System.out.println(z);
	
	System.out.println(E04_Rekurzija.zbroj(100));
	
	System.out.println(Z05.decimalni(3.14, 1.12));
	
//	System.out.println(Z05.decimalni(2.78, 0.30));
//
//	System.out.println(Z06.zbroji(3.14, 1.12));
	}

}
