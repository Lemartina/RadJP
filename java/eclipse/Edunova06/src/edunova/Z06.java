package edunova;

public class Z06 {
	
	//upute:
		//string ima char
		//znakovi se stavlja u niz
		//poziva istu metodu dok ne dođe do broja manjeg od 100
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

public static void main(String[] args) {
	String ime1= "Marta";
	String ime2= "Manuel";
	
	String ljubav= ime1 + ime2;
	System.out.println(ljubav);
	
	int zbroj=0;
	for (char i =0; i<=ljubav.length(); i++)
	{
		zbroj += zbroj + i;
		char ch= ljubav.charAt(i);
	
	}
}
	
}
