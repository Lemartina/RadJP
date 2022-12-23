package edunova;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {

		// program unosi broj između 
		// 1 i 999
		// U slučaju da je izvan tog raspona
		// ispisati grešku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 greška
		// 1067 greška
		// 456 4
		// 6 6
		// 89 8
		
		
//		
		//for(od kuda;do kuda;korak)
				for(int i=0;i<10;i=i+1) {
					System.out.println("Osijek");
				}
				
				for(int i=0;i<10;i=i+1) {
					System.out.println(i);
				}
				
				int zbroj=0;
				for(int i=1;i<=100;i=i+1) {
					zbroj = zbroj + i;
					
					//ovi ispisi i ne trebaju
					if(i!=100) {
						System.out.println(zbroj + "+" + (i+1));	
					}else {
						System.out.println(zbroj);
					}
					
				}
				
				
				//ispisati sve parne brojeve od 12 do 35
				for(int i=12;i<=35;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
				}
				
				//ispisati svaki 5 broj od 5 do 100
				for(int i=5;i<=100;i+=5) {
					System.out.println(i);
				}
				
				//isisati brojeve od 10 do 1
				// jedno ispod drugog
				for(int i = 10;i>0;i--) {
					System.out.println(i);
				}

				//deklarirajte niz od 2 cjelih brojeva
				int niz[] = new int[2];
				
				// unijeli vrijdnosti za sve elemente niza
				for(int i=0;i<niz.length;i++) {
					niz[i] = Integer.parseInt(
							JOptionPane.showInputDialog(
									"Unesi " + (i+1) + ". broj")
							);
				}
				
				//zbrojite vrijednosti svih elemenata niza
				
				zbroj=0;
				for(int i=0;i<niz.length;i++) {
					zbroj+=niz[i];
				}
				
				//ispišite zbroj
				System.out.println(zbroj);
				
				String grad = "Osijek";
				for(int i=0;i<grad.length();i++) {
					System.out.println(grad.charAt(i));
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}