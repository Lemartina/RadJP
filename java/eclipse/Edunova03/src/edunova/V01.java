package edunova;

public class V01 {

	public static void main(String[] args) {
		
		
		//ispis matrice
		//link: https://www.youtube.com/watch?v=8JF4WFltnpc

		int[][] a = { { 1, 2, 3 }, { 10, 5, 6 }, { 7, 45, 9 } };

		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
				System.out.printf("%d  ",a[i] [j]);
			System.out.println();
			
				
		}
		
	}
}
