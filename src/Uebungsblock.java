public class Uebungsblock {

	// Achtung: Zur Ausfuehrung des Programms muss das Uebungstools.jar
	// eingebundenwerden. Die Anleitung finden Sie in den Folien zu dieser
	// Uebung:
	// https://github.com/nordakademie-einfuehrung-java/vorlesungsskript/blob/master/folien/Semester_03_Termin_05_Uebungsblock_01-04.ppt

	/**
	 * Die Mainmethode ermoeglicht den Aufruf der einzelnen Uebungen ueber einen
	 * Abfragedialog
	 */
	public static void main(String[] args) {

		boolean ende = false;
		while (!ende) {

			int nr = Eingabe.frageNachIntUeberDialog("Bitte Uebungsnr eingeben (1-7, 0 zum Beenden):");

			Zeichenfenster.zeigeZeichenfenster();
			Zeichenfenster.clearZeichenfenster();
			Zeichenfenster.setzeFarbeSchwarz();

			if (nr == 1) {
				uebung1();
			}
			if (nr == 2) {
				uebung2();
			}
			if (nr == 3) {
				uebung3();
			}
			if (nr == 4) {
				uebung4();
			}
			if (nr == 5) {
				uebung5();
			}
			if (nr == 6) {
				uebung6();
			}
			if (nr == 7) {
				uebung7();
			}
			if (nr == 0) {
				System.exit(0);
			}
		}

	}

	public static void uebung1() {
		int x = 40;
		int y = 40;

		while (x <= 120) {
			Zeichenfenster.zeichnePunkt(x, y);
			x = x + 40;
			y = y + 40;
		}

		Zeichenfenster.zeichneLinie(500, 500, 750, 500);
		Zeichenfenster.zeichneLinie(750, 500, 750, 300);
		Zeichenfenster.zeichneLinie(750, 300, 500, 300);
		Zeichenfenster.zeichneLinie(500, 300, 500, 500);

		Zeichenfenster.zeichneEllipse(625, 400, 250, 200);
	}

	public static void uebung2() {
		int xStart = 0;
		int yStart = 800;
		int xEnde = 800;
		int yEnde = 0;
		int zaehler = 1;

		while (zaehler <= 80) {
			Zeichenfenster.zeichneLinie(xStart, yStart, xEnde, yEnde);
			yStart = yStart - 10;
			xEnde = xEnde - 10;
			zaehler++;
		}

	}

	public static void uebung3() {
		int mittelpunktX = 200;
		int mittelpunktY = 400;
		int durchmesser = 100;
		int zaehler = 1;

		while (zaehler <= 60) {
			Zeichenfenster.zeichneEllipse(mittelpunktX, mittelpunktY, durchmesser, durchmesser);
			mittelpunktX = mittelpunktX + 5;
			durchmesser = durchmesser + 5;
			zaehler++;
		}

	}

	public static void uebung4() {
		int zaehler = 0;
		int width = 800;
		int height = 200;

		while (zaehler < 60) {
			Zeichenfenster.zeichneEllipse(400, 400, width, height);
			width = width - 10;
			height = height + 10;
			zaehler++;
		}
	}

	public static void uebung5() {
		int xStart = 0;
		int yStart = 0;
		int xEnde = 800;
		int yEnde = 0;
		int zaehler = 1;

		while (zaehler < 100) {
			Zeichenfenster.zeichneLinie(xStart, yStart, xEnde, yEnde);
			xStart = xStart + 8;
			yEnde = yEnde + 8;
			zaehler++;

		}
		while (zaehler < 200) {
			Zeichenfenster.zeichneLinie(xStart, yStart, xEnde, yEnde);
			yStart = yStart + 8;
			xEnde = xEnde - 8;
			zaehler++;

		}
		while (zaehler < 300) {
			Zeichenfenster.zeichneLinie(xStart, yStart, xEnde, yEnde);
			xStart = xStart - 8;
			yEnde = yEnde - 8;
			zaehler++;
		}
		while (zaehler < 400) {
			Zeichenfenster.zeichneLinie(xStart, yStart, xEnde, yEnde);
			yStart = yStart - 8;
			xEnde = xEnde + 8;
			zaehler++;

		}

	}

	public static void uebung6() {
		double rot = 0;
		double gruen = 0;
		double blau = 0;
		int x = 0;
		int y = 0;

		while (y <= 800) {
			while (x <= 800) {
				rot = farbeRot(x, y);
				gruen = farbeGruen(x, y);
				blau = farbeBlau(x, y);
				Zeichenfenster.setzeFarbe(rot, gruen, blau);
				Zeichenfenster.zeichnePunkt(x, y);
				x++;
			}
			y = y + 1;
			x = 0;

		}
	}

	public static double farbeRot(int x, int y) {

		double x1 = x;
		double y1 = y;
		double xRot = 250;
		double yRot = 270;
		double abstand = 0;
		double prozent = 0;

		abstand = Math.sqrt((xRot - x1) * (xRot - x1) + (yRot - y1) * (yRot - y1));

		prozent = 1 - (abstand / 800);

		return prozent;
	}

	public static double farbeGruen(int x, int y) {

		double x1 = x;
		double y1 = y;
		double xGruen = 550;
		double yGruen = 270;
		double abstand = 0;
		double prozent = 0;

		abstand = Math.sqrt((xGruen - x1) * (xGruen - x1) + (yGruen - y1) * (yGruen - y1));

		prozent = 1 - (abstand / 800);

		return prozent;
	}

	public static double farbeBlau(int x, int y) {

		double x1 = x;
		double y1 = y;
		double xBlau = 400;
		double yBlau = 530;
		double abstand = 0;

		double prozent = 0;

		abstand = Math.sqrt((xBlau - x1) * (xBlau - x1) + (yBlau - y1) * (yBlau - y1));

		prozent = 1 - (abstand / 800);

		return prozent;
	}

	public static void uebung7() {
		double rot = 0;
		double gruen = 0;
		double blau = 0;
		int x = 0;
		int y = 0;

		while (y <= 800) {
			while (x <= 800) {
				rot = farbeRot1(x, y);
				gruen = farbeGruen1(x, y);
				blau = farbeBlau1(x, y);
				Zeichenfenster.setzeFarbe(rot, gruen, blau);
				Zeichenfenster.zeichnePunkt(x, y);
				x++;
			}
			y = y + 1;
			x = 0;

		}
	}

	public static double farbeRot1(int x, int y) {

		double x1 = x;
		double y1 = y;
		double xRot = 250;
		double yRot = 270;
		double abstand = 0;
		double prozent = 0;

		abstand = Math.sqrt((xRot - x1) * (xRot - x1) + (yRot - y1) * (yRot - y1));

		if (abstand < 200) {
			prozent = 1;
		} else if (abstand > 400) {
			prozent = 0;
		} else {

			prozent = 1 - (abstand - 200) / 200;
		}

		return prozent;
	}

	public static double farbeGruen1(int x, int y) {

		double x1 = x;
		double y1 = y;
		double xGruen = 550;
		double yGruen = 270;
		double abstand = 0;
		double prozent = 0;

		abstand = Math.sqrt((xGruen - x1) * (xGruen - x1) + (yGruen - y1) * (yGruen - y1));

		if (abstand < 200) {
			prozent = 1;
		} else if (abstand > 400) {
			prozent = 0;
		} else {

			prozent = 1 - (abstand - 200) / 200;
		}
		return prozent;
	}

	public static double farbeBlau1(int x, int y) {

		double x1 = x;
		double y1 = y;
		double xBlau = 400;
		double yBlau = 530;
		double abstand = 0;

		double prozent = 0;

		abstand = Math.sqrt((xBlau - x1) * (xBlau - x1) + (yBlau - y1) * (yBlau - y1));

		if (abstand < 200) {
			prozent = 1;
		} else if (abstand > 400) {
			prozent = 0;
		} else {

			prozent = 1 - (abstand - 200) / 200;
		}

		return prozent;
	}

}
