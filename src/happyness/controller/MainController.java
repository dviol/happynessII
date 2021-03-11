package happyness.controller;

import java.util.Scanner;

import happyness.view.Console_Front;
import happyness.view.Interface_Front;

public class MainController {
	public static final boolean DEBUG = true;

	
	private final static String PROMPT = "Moin! Was möchtest du mir sagen?";
	private final static String THANKS = "Dankö!";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		System.out.println("Willkommen bei HappynessII!");
		System.out.println("===========================");
		getHelp();

		String input = "";

		Console_Front i_f = new Console_Front();
		Scanner sc = new Scanner(System.in);

		while (running) {
			System.out.println("Was du wolle? (h für Hilfe)");
			input = sc.nextLine().toLowerCase();

			switch (input) {
			case "z": // Zitat ausgeben
				i_f.showEntry();
				break;
			case "e": // Zitat eingeben
				System.out.println(PROMPT);
				i_f.addEntry(sc.nextLine());
				System.out.println(THANKS);
				break;
			case "h": // Hilfe anzeigen
				getHelp();
				break;
			case "x": // Beenden
				running = false;
				break;
			default: // Falsche eingabe
				System.out
						.println("Leider habe ich dich nicht verstanden. Drücke h um die Optionen nochmal anzuzeigen");
				break;
			}
		}
		System.out.println("Tschaui!");
		sc.close();
	}

	public static void getHelp() {
		System.out.println("Drücke z für ein schönes Zitat");
		System.out.println("Drücke e um ein neues schönes Zitat einzugeben!");
		System.out.println("Drücke h für diese Hilfe");
		System.out.println("Drücke x um HappynessII zu beenden!");
	}

}
