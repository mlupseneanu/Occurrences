package Curs_17;

import java.util.Scanner;

public class Exercitiu_1 {

	/* 1. Se citeste de la tastatura un sir de caractere, care poate contine spatii. Afiseaza numarul de
	 * aparitii ale fiecarui caracter din String. Precizari:

				ordinea afisarii literelor este arbitrara
				fiecare litera (impreuna cu numarul de aparitii) va fi afisata o singura data
				formatul concret de afisare este la alegerea ta. In exemplu este prezentat doar un model de afisare.
				Exemplu:

				Console
				INPUT: "This game was fun to play!"
				OUTPUT:
				Character:'T' appears:1 time(s).
				Character:'h' appears:1 time(s).
				Character:'i' appears:1 time(s).
				Character:'s' appears:2 time(s).
				Character:' ' appears:5 time(s).
				Character:'g' appears:1 time(s).
				Character:'a' appears:3 time(s).
				Character:'m' appears:1 time(s).
				Character:'e' appears:1 time(s).
				Character:'w' appears:1 time(s).
				Character:'f' appears:1 time(s).
				Character:'u' appears:1 time(s).
				Character:'n' appears:1 time(s).
				Character:'t' appears:1 time(s).
				Character:'o' appears:1 time(s).
				Character:'p' appears:1 time(s).
				Character:'l' appears:1 time(s).
				Character:'y' appears:1 time(s).
				Character:'!' appears:1 time(s).
	 */

	// Metoda numara numarul de aparii al unui caracter
	public static int countLetters(String str, char letter) {
		int counter = 0;
		int index = str.indexOf(letter);
		while (index >= 0) {
			counter++;
			index = str.indexOf(letter, index + 1);
		}
		return counter; // Returnam counter
	}

	public static void printLetters(String str) {
		for (int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) { // Daca suntem la prima aparitie a literei in sir
				System.out.println("Caracterul " + str.charAt(i) + " apare de " + countLetters(str, str.charAt(i)) + " ori.");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Creare si initializare string
		System.out.print("Introduceti fraza dorita: ");
		String game = sc.nextLine();

		// Afisare de cate ori apare un caracter

		printLetters(game);


	}

}
