package edunova;

public class Z06 {

	// upute:
	// string ima char
	// znakovi se stavlja u niz
	// poziva istu metodu dok ne dođe do broja manjeg od 100
	// koristiti i petlju i uvjetno grananje

//	spjiiti 2 stringa u 1
//
//	koristiti for petlju
//
//	vrti string broji a
//
//	vrti strin broji b
//
//	dobiješ niz
//
//	niz metoda rekurzivno novi = novi niz
//
//	ako je parni broj elenemana/2
//
//	/2 +1 neprarni
//
//	<100 vrati rezultat int

//	https://www.youtube.com/watch?v=mrXDivW-vP4
//	https://www.youtube.com/watch?v=iHCon5VmSyk

	public static void main(String[] args) {
		String ime1 = "Marta";
		String ime2 = "Manuel";
		String slovo;

		String ljubav = ime1 + ime2;
		System.out.print(ljubav);
		int i, j;
		slovo = "A";

		int zbroj = 0;
		for (i = 0; i <= ljubav.length(); i++) {
			for (j = 0; j <= ljubav.length(); j++) {
//		if (ljubav.charAt(i)== slovo) {
		

				zbroj = zbroj + 1;

			System.out.print( i * j);
		}
		}}}