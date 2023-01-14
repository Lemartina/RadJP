package edunova;

public class E03_PreopterecenjeMetode {

	public static int zbroji (int a, int b) {
		return a+b;
	}
	public static int zbroji (float a, float b) {
		return (int	)(a+b);
	}
	
	public static int zbroji(int a, int b, int c) {
		return (a+b)+c;
		}
		
		
		public static int zbroji(int[] brojevi) {
			int zbroj=0;
			for(int i:brojevi) {
				zbroj+=i;
			}
			return zbroj;
		
		
	}
	
}

//Za jedan razred moguće je definirati više konstruktora koji se razlikuju
//po broju i/ili tipovima argumenata. Za takav konstruktor kaže se da je
//preopterećen (engl. overloaded)