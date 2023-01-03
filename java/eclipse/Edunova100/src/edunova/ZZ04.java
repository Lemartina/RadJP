package edunova;

import javax.swing.JOptionPane;

public class ZZ04 {

	public static void main(String[] args) {
		//Keirati program koji unosi dvije 
		//matrice 4x4 te ispisuje njihov zbroj
		
		//1. matrica 4*4
		
		System.out.println("1. matrica");
		System.out.println("\t");
		//unos podataka
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka za 1. matricu:"));
		int j= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca za 1. matricu:"));
		
		
		// foriranje martice i ispis
		for(i=1; i<=4;i++) {
			for (j=1;j<=4;j++) {
			System.out.print(" "+ i*j);
			} 					
			System.out.println();
		}
		System.out.println("\t");
		//2. matrica 4*4
		
		// unos podataka
		
		int a= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka za 2. matricu:"));
		int b= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sutupaca za 2. marticu"));
		
		
		
		System.out.println("2. matrica");
		System.out.println("\t");
		for(a=1; a<=4;a++) {
			for(b=1;b<=4;b++) {
					System.out.print(" "+ a*b);
			}
						
			System.out.println();

}
		System.out.println("\t");
		
		
		//zbroj matrica
		
	
		
		// unos podataka
		
				int c= (i*j) ;
				int d= (a*b);
				
				
				
				System.out.println(" Zbrajanje matrica");
				System.out.println("\t");
				for(a=c; c<=32;c++) {
					for(d=1;d<=32;d++) {
							System.out.print(" "+ c+d);
					}
								
					System.out.println();

		}
				System.out.println("\t");
				
		
		
		
		
		
		
		
		
		
		
		
		
}}