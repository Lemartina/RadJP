package edunova;

import javax.swing.JOptionPane;

public class E01_ForPetlja_ {

	public static void main(String[] args) {
		
		//ispisati 10 puta Osijek jedno ispod drugog
		
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
		
		
		
//		
//		for (int i=0;i<10; i=i+1) {
//			System.out.println("Osijek");
//			
//		}
		
		
//		for (int i=0; i<=10; i++) {
//			System.out.println(i);
//		}
		
		
		//zbroji sve brojeve od 1 do 100
//		int ukupno = 0;
//		
//		for( int i=1; i<=100; i=i+1) {
//			zkupno=ukupno+i;
//			
//			if(i!=100) {
//				System.out.println(ukupno + "+"+ (i+1));
//				}else {
//					System.out.println(ukupno);
//				}
//		}
//		
//		
//		//ispisati sve parne brojeve od 12 do 35
//		
//		for(int i = 12; i<35; i++) {
//			if (i%2==0);
//			{
//				
//			System.out.println(i);
//		}
//	
//	}
		//ispisati svaki 5 broj od 5 do 100
		
		
//		for (int i=5;i<=100; i=i+5) {
//			System.out.println(i);
//		}
		
		
//		
//		for (int i=20; i<=500; i=i+20) {
//			if (i%2==0);
//			{
//				System.out.println(i);
//			}
//			
//		}
//		
//		
//		//deklarirajte niz od 2 cjelih brojeva
//		int niz[] = new int[2];
//		
//		// unijeli vrijdnosti za sve elemente niza
//		for(int i=0;i<niz.length;i++) {
//			niz[i] = Integer.parseInt(
//					JOptionPane.showInputDialog(
//							"Unesi " + (i+1) + ". broj")
//					);
//		}
//		
////		//zbrojite vrijednosti svih elemenata niza
////		
//		zbroj=0;
//		for(int i=0;i<niz.length;i++) {
//			zbroj+=niz[i];
//		}
////		
////		//ispišite zbroj
//		System.out.println(zbroj);
//		
//		String grad = "Osijek";
//		for(int i=0;i<grad.length();i++) {
//			System.out.println(grad.charAt(i));
//		}

		
		//ugnježđivanje petlji
		
		System.out.print(" - - - - - - - - \n");	
		for (int i =1; i<=10; i++) {
			for (int j=1;j<=10; j++) {
				
				System.out.print("   "+i * j+ " - ");
			}
			System.out.println();
		}
		
		
		// preskakanje petlje - nastavak
		
//		for (int i=0; i<10; i++) {
//			if(i==3) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
//		for (int i=0; i<10; i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		
		
//		vanjska:
//			for(int i=1; i<=10;i++) {
//				for (int j=1; j<=10;j++) {
//					if (j==5) {
//						break vanjska;
//								}
//				System.out.print(i*j + " ");
//			}
//	System.out.println();
//	}
	
		// beskonačna petlja
		
//		for(;; ) {
//			System.out.println(Math.random());
//		}
	
	}
}
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
