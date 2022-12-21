package edunova;

public class E05_UlazniParametri {

	public static void main(String[] args) {
		if (args.length!=2) {
			System.out.println("Obavezno unijeti 2 parametra");
			return;
		}
System.out.println("Izvodim program");

System.out.println(args[0]);
	}

}
