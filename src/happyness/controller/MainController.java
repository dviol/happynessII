package happyness.controller;

import java.util.Scanner;

import happyness.view.Console_Front;
import happyness.view.Interface_Front;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		System.out.println("Willkommen bei HappynessII!");
		System.out.println("===========================");
		getHelp();

		Scanner sc = new Scanner(System.in);
		String input = "";
		
		Interface_Front i_f = new Console_Front();
		
		while (running) {
			System.out.println("Was du wolle? (h für Hilfe)");
			input = sc.next().toLowerCase();
			switch (input) {
			case "z": //Zitat ausgeben
				
				i_f.showEntry();
				break;
			case "e": //Zitat eingeben
				i_f.addEntry();
				break;
			case "h": //Hilfe anzeigen
				getHelp();
				break;
			case "x": //Beenden
				running = false;
				break;
			default: //Falsche eingabe
				System.out.println("Leider habe ich dich nicht verstanden. Drücke h um die Optionen nochmal anzuzeigen");
				break;
			}
		}
		sc.close();
		System.out.println("Tschaui!");

	}

	public static void getHelp() {
		System.out.println("Drücke z für ein schönes Zitat");
		System.out.println("Drücke e um ein neues schönes Zitat einzugeben!");
		System.out.println("Drücke h für diese Hilfe");
		System.out.println("Drücke x um HappynessII zu beenden!");
	}

}
