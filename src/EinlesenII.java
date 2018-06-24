import java.util.Scanner;

public class EinlesenII {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		 * Aufgabe
		 * 
		 * 		Erstelle erneut ein Object der Klasse Scanner
		 * 		und lese 2 Werte mithilfe der Klasse ein
		 * 
		 * 		1. ist eine Ganzzahl, die Zahl soll dein Alter sein
		 * 		2. ist eine Zeichenkette(String), dein Name
		 * 
		 * 		Am Ende soll dein Alter und dein Name in der Konsole ausgegeben werden
		 * 		System.out.println("Name: " + ... + " Alter " + ...);
		 */
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihr Alter an:");
		int alter = scan1.nextInt();
		System.out.println("Bitte geben Sie Ihren Namen an:");
		String name = scan1.next();
		
		System.out.println("Name: " + name + " Alter " + alter);
		
	}

}
