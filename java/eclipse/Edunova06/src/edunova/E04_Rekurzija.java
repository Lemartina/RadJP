package edunova;

public class E04_Rekurzija {
public static void main(String[] args) {
	
}
	public static void slovo() {
		slovo();
		}
	
	
	public static int zbroj (int broj) {
		if (broj==1) {
			return 1;
		}
		return broj + zbroj(broj-1);
		
	}
	}
	

