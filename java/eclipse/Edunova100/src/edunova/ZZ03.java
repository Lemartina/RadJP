package edunova;

import javax.swing.JOptionPane;

public class ZZ03 {

	public static void main(String[] args) {
		// Kreirati program koji za dva
		//unesena broja ispisuje sve prim (djeljivi sami sobom i s 1)
		//brojeve između njih.

		
		int jedan=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int dva=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		System.out.println(jedan);
		System.out.println(dva);
		
		int rezultat=0;
		for (int i=jedan; i<dva; i++) {
				
			
			if (i/1==1)  {
				rezultat = rezultat+i;}
				System.out.println(rezultat);
			}
			 else if (i/i==0) {
				 rezultat = rezultat+i;}
				System.out.println(rezultat);
				}else

	{
		System.out.println("Nema prim brojeva između dva unesena broja");
	}
}

}}

}
