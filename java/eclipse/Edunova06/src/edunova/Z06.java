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
		String broj = "";
		for (int i : racunamLjubav(brojimSlova(ja, ti))) {
			broj += i;
		}
		System.out.print(ja + " i " + ti + " su kopatibilni " + broj + "%");
	}
	
	public static int[] brojimSlova(String ja, String ti) {
		String ljubav = ja + ti;
		int brojac;
		char a[] = (ljubav.toCharArray());
		System.out.println(Arrays.toString(a)+"niz slova");
		int brojevi[] = new int[ljubav.length()];
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
		System.out.println(Arrays.toString(brojevi)+ "niz brojeva");
		if (ja.length() >= ti.length()) {
			int[] prvidrugo = new int[ja.length()];
			for (int i = 0, index = 0; index < ja.length(); index++, i++) {
				if (index >= ti.length()) {
					prvidrugo[index] = 0 + brojevi[brojevi.length - (1 + i)];
				} else {
					prvidrugo[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}
			}
			prvidrugo = dugiBroj(prvidrugo);
			return prvidrugo;
		}
		else {
			int[] prvidrugo = new int[ti.length()];
			for (int i = 0, index = 0; index < ti.length(); index++, i++) {
				if (index >= ja.length()) {
					prvidrugo[index] = 0 + brojevi[brojevi.length - (1 + i)];
				} else {
					prvidrugo[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}
			}
			prvidrugo = dugiBroj(prvidrugo);
			return prvidrugo;
		}
	}
	public static int[] racunamLjubav(int[] zbrajanje) {
		System.out.println(Arrays.toString(zbrajanje) + " još jedan niz brojeva");
		if (zbrajanje.length <= 2) {
			return zbrajanje;
		} else {
			if (zbrajanje.length % 2 == 0) {
				int[] drugo = new int[zbrajanje.length / 2];
				for (int i = 0; i < drugo.length; i++) {
					drugo[i] = zbrajanje[i] + zbrajanje[zbrajanje.length - (1 + i)];
				}
				drugo = dugiBroj(drugo);
				if (drugo.length > 2) {
					return racunamLjubav(drugo);
				} else {
					return racunamLjubav(drugo);
				}
			} else {
				int[] drugo = new int[(zbrajanje.length / 2) + 1];
				for (int i = 0; i < drugo.length; i++) {
					if (i == drugo.length-1) {
						drugo[i] = 0 + zbrajanje[zbrajanje.length - (1 + i)];
					} else {
						drugo[i] = zbrajanje[i] + zbrajanje[zbrajanje.length - (1 + i)];
					}
				}

				if (drugo.length > 2) {
					return racunamLjubav(dugiBroj(drugo));
				} else {
					return racunamLjubav(dugiBroj(drugo));
				}
			}
		}
	}

	public static int[] dugiBroj(int[] upisImena) {
		int brojac = 0;
		for (int i : upisImena) {
			if (i >= 10) {
				brojac++;
			}
		}
		int[] kratkiBroj = new int[upisImena.length + brojac];
		for (int i = 0, j = 0; i < upisImena.length; i++) {
			if (upisImena[i] < 10) {
				kratkiBroj[j++] = upisImena[i];
			} else {
				kratkiBroj[j++] = (upisImena[i] / 10);
				kratkiBroj[j++] = (upisImena[i] % 10);
			}
		}
		int[] a = kratkiBroj;
		return a;
	}
}