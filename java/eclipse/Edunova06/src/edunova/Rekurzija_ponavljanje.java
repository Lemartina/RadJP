package edunova;

public class Rekurzija_ponavljanje {

	
	public static void main(String[] args) {
	
		RacunamLjubav(2356);
		}
		static void RacunamLjubav( int brojevi) {
			if(brojevi>0) {
				System.out.println("RacunamLjubav" + brojevi);
				brojevi--;
				RacunamLjubav(brojevi);
			}
			
}
}