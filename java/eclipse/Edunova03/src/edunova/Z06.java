package edunova;

import java.util.Arrays;

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
		
		
		int b ;
		for(;;) {
			b= Integer.parseInt(
					JOptionPane.showInputDialog(
							"Unesi broj između 1 i 5")
					);
			
			if(b<=0 && b>=6) 
			{break;}
			else if (b>=1 && b<=5)
			{break;} 
			System.out.println(b +" greška");
		}
		
		System.out.println(b);
		
		
		
	
int temp[] = {564};
		

		System.out.println(temp[temp.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}