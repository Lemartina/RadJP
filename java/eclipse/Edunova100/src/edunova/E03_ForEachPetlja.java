package edunova;

public class E03_ForEachPetlja {

	public static void main(String[] args) {
		int[] niz = { 2, 2, 3, 4, 5, 3 };

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		for (int i : niz) {
			System.out.println(i);
		}
	}

}
