import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class Game {
	public Game(boolean gameType) {
		Scanner sc = new Scanner(System.in);
		metoder metod = new metoder();
		boolean lopp = true;
		int hp = 10;
		ArrayList<Character> blank;
		String gameWord;
		String guess = null;
		// singelplayer
		if (gameType == true) {
			System.out.println("vill du spela 18+ eller vanligt");
			System.out.println("du kan bara skriva 18+ eller vanligt");
			while (lopp == true) {
				String vanligt = sc.nextLine();

				if (vanligt.equals("18+")) {
					System.out.println("grattis du har valt 18+");
					gameWord = metod.singelPlay18();
					blank = metod.emty(gameWord);
					lopp = false;
					while (hp > 0) {
						System.out.println(blank);
						System.out.println(gameWord);
						System.out.println("gissa på en bokstav eller ord");
						guess = metod.gess(sc);
						
						System.out.println(metod.charGess(guess, gameWord));
						System.out.println((gameWord.length() + 1));
						System.out.println(metod.length(guess));
						if (metod.length(guess) == false) {

							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;

								// mitod flr att visa upp grafis guben.
							} else {
								ArrayList<Integer> index = new ArrayList<Integer>();
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									System.out.println(index.get(i));
									blank.set(index.get(i), guess.charAt(0));
								}
								char[] namn = new char[blank.size()];
								for (int i = 0; i < blank.size(); i++) {
									namn[i] = blank.get(i);
								}
								if (metod.word(namn, gameWord)) {
									break;
								}

								// blank.replace(oldChar, newChar)
							}
						} else {
							if (guess.equals(gameWord)) {
								// vinst skärm
								break;
							} else {
								// visa upp att med gubben att spelan hadde fel
								hp = hp - 1;
							}

						}
					}
				} else if (vanligt.equals("vanligt")) {
					System.out.println("grattis du har valt 18+");
					gameWord = metod.singelPlayVanlig();
					blank = metod.emty(gameWord);
					lopp = false;
					while (hp > 0) {
						System.out.println(blank);
						System.out.println(gameWord);
						System.out.println("gissa på en bokstav eller ord");
						guess = metod.gess(sc);
						if (metod.Wrongimpot(guess) == false)
							do {

								System.out.println("gissa på en bokstav eller ord");
								guess = metod.gess(sc);
							} while (metod.Wrongimpot(guess) == false);
						System.out.println(metod.charGess(guess, gameWord));
						System.out.println((gameWord.length() + 1));
						System.out.println(metod.length(guess));
						if (metod.length(guess) == false) {

							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;

								// mitod flr att visa upp grafis guben.
							} else {
								ArrayList<Integer> index = new ArrayList<Integer>();
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									System.out.println(index.get(i));
									blank.set(index.get(i), guess.charAt(0));
								}
								char[] namn = new char[blank.size()];
								for (int i = 0; i < blank.size(); i++) {
									namn[i] = blank.get(i);
								}
								if (metod.word(namn, gameWord)) {
									break;
								}

								// blank.replace(oldChar, newChar)
							}
						} else {
							if (guess.equals(gameWord)) {
								// vinst skärm
								break;
							} else {
								// visa upp att med gubben att spelan hadde fel
								hp = hp - 1;
							}

						}
					}
				} else {
					System.out.println("du kan bara skriva 18+ eller vanligt");
					System.out.println("");

				}
			}
			// multiplyer
		} else if (gameType == false) {
			System.out.println("skriv in dit ord");
			gameWord = sc.nextLine();
			blank = metod.emty(gameWord);
			lopp = false;
			if (metod.Wrongimpot(gameWord) == false) {
				do {
					System.out.println("du måste anvenda bokstäver");
					gameWord = sc.nextLine();
					blank = metod.emty(gameWord);
				} while (metod.Wrongimpot(gameWord) == false);
			}
			while (hp > 0) {
				System.out.println(blank);
				System.out.println(gameWord);
				System.out.println("gissa på en bokstav eller ord");
				guess = metod.gess(sc);
				if (metod.Wrongimpot(guess) == false)
					do {

						System.out.println("gissa på en bokstav eller ord");
						guess = metod.gess(sc);
					} while (metod.Wrongimpot(guess) == false);
				System.out.println(metod.charGess(guess, gameWord));
				System.out.println((gameWord.length() + 1));
				System.out.println(metod.length(guess));
				if (metod.length(guess) == false) {

					if (metod.charGess(guess, gameWord).size() == 0) {
						hp = hp - 1;

						// mitod flr att visa upp grafis guben.
					} else {
						ArrayList<Integer> index = new ArrayList<Integer>();
						index = metod.charGess(guess, gameWord);
						for (int i = 0; i < index.size(); i++) {
							System.out.println(index.get(i));
							blank.set(index.get(i), guess.charAt(0));
						}
						char[] namn = new char[blank.size()];
						for (int i = 0; i < blank.size(); i++) {
							namn[i] = blank.get(i);
						}
						if (metod.word(namn, gameWord)) {
							break;
						}

						// blank.replace(oldChar, newChar)
					}
				} else {
					if (guess.equals(gameWord)) {
						// vinst skärm
						break;
					} else {
						// visa upp att med gubben att spelan hadde fel
						hp = hp - 1;
					}

				}
			}
		}
	}
}
