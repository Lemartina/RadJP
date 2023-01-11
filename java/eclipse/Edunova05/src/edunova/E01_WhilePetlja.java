package edunova;

import javax.swing.JOptionPane;

public class E01_WhilePetlja {

	public static void main(String[] args) {
//		while (true) {
//			break;
//		}
//		boolean uvjet = false;
//		while (uvjet) {
//			System.out.println("Osijek");
//		}
//
//		for (int i = 0; i > 0;) {
//			System.out.println(i);
//		}
//
//		int broj = 0;
//		while (broj < 10) {
//			System.out.println(broj++);
//		}
//		int a = 0;
//		while (a < 5) {
//			if (a == 3)
//				break;
//			System.out.println(a++);
//		}
//		int x = 0;
//		while (x < 10) {
//			if (x == 4)
//				continue;
//			System.out.println(x++);
//
//		}

//		int b=0;
//		while(true) {
//			b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
//			if(b>=1 && b<10) {
//				break;
//			}
//			
//					}
//		System.out.println(b);
//	}
//		int a = 0;
//		while (a < 10) {
//			if (a == 3)
//				break;
//			System.out.println(a++);
//		}

		System.out.println("ovo je for petlja");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}
		
//		System.out.println("ovo je while petlja");
//		int i=0;
//		while(i<10) {
//			System.out.println(i++);
//		}
		
		System.out.println("ovo je dowhile petlja");
		int i=0;
		do {
			System.out.println(i++);
		} while (i<10);
	}
}
