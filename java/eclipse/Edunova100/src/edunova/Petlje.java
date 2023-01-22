package edunova;

public class Petlje {

	public static void main(String[] args) {
		// while petlja testira uvjet dok je točan
		// ako nije točno prekida izvođenje
		int broj=1;
		while(broj<6) {
			System.out.print(broj);
			broj=broj+1;
		}
System.out.println("gotovo");


//ispisati brojeve do 10 pomoću while petlje

int i=1;
while(i<=10) {
	System.out.print(i);
	i++;
}
System.out.println();



//for petlja - od kuda do kuda i korak
for(int brojac=1;brojac<=10; brojac++) {
	System.out.println(brojac);
}

// do while odradi tijelo petlje pa onda ispituje uvjet
//ako je petlja netočna neće znati dok kne dođe do kraja
//izvršava se minimalno jednom bez obzira što je uvjet netočan

int brojac=0;

do {
	System.out.println(brojac);
}while(brojac<=10);


//do while petlja
i=0;
do {
	System.out.println(i);
	i++;
}while(i<10);
	
System.out.println(i);

	}
}
