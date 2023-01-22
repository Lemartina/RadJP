package edunova;

import javax.swing.JOptionPane;

public class Pomocno {

	// metoda
	public static int ucitajCijeliBroj(String porukaKorisniku, String obavijestOGresci) {
		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(porukaKorisniku));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, obavijestOGresci);
			}
		}
	}

	public static int ucitajCijeliBroj() {
		return ucitajCijeliBroj("Unesi broj", "Greška kod unosa broj");
	}


	public static int ucitajCijeliBroj(String string) {
		return ucitajCijeliBroj(string, "Greška kod unosa broja");
	}

//metoda
	public static int ucitajCijeliPozitivniBroj(String poruka) {
		int i = ucitajCijeliBroj(poruka);
		while (true) {
			if (i > 0) {
				return i;
			} else {
				JOptionPane.showMessageDialog(null, "Broj mora biti veći od 0");
				i = ucitajCijeliBroj(poruka);
			}
		}
	}



//metoda
	public static int ucitajCijeliBrojURasponu(String poruka, int odBroj, int doBroja) {

		int i = ucitajCijeliBroj(poruka);
		while (true) {
			if (i >= odBroj && i <= doBroja) {
				return i;
			} else {
				JOptionPane.showMessageDialog(null, "Broj mora biti veći od 0 i manji od 6");
				i = ucitajCijeliBroj(poruka);
			}

		}

	}

//metoda
	public static String obavezanUnosStringa(String poruka) {
		String s = "";
		while (s.isEmpty()) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.length() > 0) {
				return s;
			}
		}
		return "";
	}

//metoda
	public static int slucajniBrojUrasponu(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	// metoda
	public static boolean obvezanUnosBoolean(String poruka) {
		while (true) {
			boolean b = Boolean.parseBoolean(JOptionPane.showInputDialog(poruka));
			if (b = true) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

		}

	}
	
	public static int ucitajDecimalniBroj(String porukaKorisniku, String obavijestOGresci) {
		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(porukaKorisniku));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, obavijestOGresci);
			}
		}
	}
	public static byte maliBroj(String poruka) {
		byte i = maliBroj(poruka);
		while (true) {
			if (i > 0) {
				return i;
			} else {
				JOptionPane.showMessageDialog(null, "Broj mora biti veći od 0");
				i = maliBroj(poruka);
			}
		}
	}

}
