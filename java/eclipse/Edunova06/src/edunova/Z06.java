package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z06 {

	// upute:
	// string ima char
	// znakovi se stavlja u niz
	// poziva istu metodu dok ne dođe do broja manjeg od 100
	// koristiti i petlju i uvjetno grananje

	

	public static void main(String[] args) {
		String ja = JOptionPane.showInputDialog("Kako se zoveš?");
		String ti = JOptionPane.showInputDialog("Kako se zove tvoja simpatija?");


//foreach petlja
		String broj = "";
		for (int i : racunamLjubav(brojimSlova(ja, ti))) {
			broj += i;

		}
//ispis
		System.out.print(ja + " i " + ti + " su kopatibilni " + broj + "%");

	}
	
	
	//metoda prima 2 parametra
	public static int[] brojimSlova(String ja, String ti) {

		String ljubav = ja + ti;

		int brojac;

		char a[] = (ljubav.toCharArray());

		System.out.println(Arrays.toString(a));

//niz
		int brojevi[] = new int[ljubav.length()];
//for petlja
		for (int i = 0; i <= (ljubav.length() - 1); i++) {
			brojac = 0;
			for (int j = 0; j <= (ljubav.length() - 1); j++) {
				if (a[i] == a[j]) {
					brojac++;
				}

			}
			brojevi[i] = brojac;
		}

		brojevi = dugiBroj(brojevi);

//ispis niza	
		System.out.println(Arrays.toString(brojevi));

		//uvjetno grananje

		if (ja.length() >= ti.length()) {
			int[] prviKorak = new int[ja.length()];
			for (int i = 0, index = 0; index < ja.length(); index++, i++) {
				if (index >= ti.length()) {
					prviKorak[index] = 0 + brojevi[brojevi.length - (1 + i)];
				} else {
					prviKorak[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];

				}

			}

			prviKorak = dugiBroj(prviKorak);

			return prviKorak;

		}

		else {
			int[] prviKorak = new int[ti.length()];
			for (int i = 0, index = 0; index < ti.length(); index++, i++) {
				if (index >= ja.length()) {
					prviKorak[index] = 0 + brojevi[brojevi.length - (1 + i)];
				} else {
					prviKorak[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}

			}

			prviKorak = dugiBroj(prviKorak);

			return prviKorak;

		}

	}

	public static int[] racunamLjubav(int[] zbrajanje) {


		System.out.println(Arrays.toString(zbrajanje));



		if (zbrajanje.length <= 2) {

			return zbrajanje;
		} else {
			if (zbrajanje.length % 2 == 0) {
				int[] korak = new int[zbrajanje.length / 2];
				for (int i = 0; i < korak.length; i++) {

					korak[i] = zbrajanje[i] + zbrajanje[zbrajanje.length - (1 + i)];

				}

				korak = dugiBroj(korak);
				if (korak.length > 2) {

					return racunamLjubav(korak);

				} else {

					return racunamLjubav(korak);

				}

			} else {
				int[] korak = new int[(zbrajanje.length / 2) + 1];
				for (int i = 0; i < korak.length; i++) {

					if (i == korak.length-1) {
						korak[i] = 0 + zbrajanje[zbrajanje.length - (1 + i)];
					} else {
						korak[i] = zbrajanje[i] + zbrajanje[zbrajanje.length - (1 + i)];
					}

				}

				if (korak.length > 2) {

					return racunamLjubav(dugiBroj(korak));

				} else {
					return racunamLjubav(dugiBroj(korak));

				}
			}
		}

	}

	public static int[] dugiBroj(int[] unos) {
		int brojac = 0;
		for (int i : unos) {
			if (i >= 10) {
				brojac++;
			}
		}
		int[] kratkiBroj = new int[unos.length + brojac];

		for (int i = 0, j = 0; i < unos.length; i++) {
			if (unos[i] < 10) {
				kratkiBroj[j++] = unos[i];
			} else {
				kratkiBroj[j++] = (unos[i] / 10);
				kratkiBroj[j++] = (unos[i] % 10);
			}
		}

		int[] a = kratkiBroj;

		return a;
	}

}