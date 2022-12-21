package edunova;

public class E02_InrementDekrement {

	public static void main(String[] args) {
		int t=2, k=1, z;
		z = k + t++; // t=3, k=1, z=3;
		k += z+1; // t=3, k=5, z=3
		System.out.println(t+z+k);

	}

}
