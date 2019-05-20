import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class Game {
	public Game(boolean gameType) {
		Scanner sc = new Scanner(System.in);
		metoder metod = new metoder();
		ArrayList<String> gesstLetter = new ArrayList<String>();
		grafik garfik = new grafik();
		boolean lopp = true;
		int hp = 10;
		ArrayList<Character> blank;
		String gameWord;
		String guess = null;
		// singelplayer
		if (gameType == true) {
			//intro
			System.out.println("vill du spela 18+ eller vanligt");
			System.out.println("du kan bara skriva 18+ eller vanligt");
			while (lopp == true) {
				//väljar on det ska var vanlig eller 18+
				String vanligt = sc.nextLine();
				//singlplayer 18+ spel start
				if (vanligt.equals("18+")) {
					System.out.println("grattis du har valt 18+");
					gameWord = metod.singelPlay18();
					blank = metod.emty(gameWord);
					lopp = false;
					while (hp > 0) {
						grafik.emty();
						System.out.println(blank);
						System.out.println(gameWord);
						System.out.println(gesstLetter);
						System.out.println("gissa på en bokstav eller ord");
						guess = metod.gess(sc,gesstLetter);
						System.out.println(metod.charGess(guess, gameWord));
						System.out.println((gameWord.length() + 1));
						System.out.println(metod.length(guess));
						if (metod.length(guess) == false) {

							if (metod.charGess(guess, gameWord).size() == 0) {
								gesstLetter.add(guess);
								hp = hp - 1;

								// mitod flr att visa upp grafis guben.
							} else {
								gesstLetter.add(guess);
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
				//18+ singelplayer spel slut
				//valint singelplyer spel start
				else if (vanligt.equals("vanligt")) {
					System.out.println("grattis du har valt 18+");
					gameWord = metod.singelPlayVanlig();
					blank = metod.emty(gameWord);
					lopp = false;
					while (hp > 0) {
						System.out.println(blank);
						System.out.println(gameWord);
						System.out.println("gissa på en bokstav eller ord");
						guess = metod.gess(sc,gesstLetter);
						if (metod.Wrongimpot(guess) == false)
							do {

								System.out.println("gissa på en bokstav eller ord");
								guess = metod.gess(sc,gesstLetter);
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
				//vanligt slut
				//om anvendaren skriver fel så kommer hen att få göra om.
				else {
					System.out.println("du kan bara skriva 18+ eller vanligt");
					System.out.println("");

				}
			}
			//singelplayer slut
			// multiplyer 
		} else if (gameType == false) {
			System.out.println("skriv in dit ord");
			gameWord = sc.nextLine();
			blank = metod.emty(gameWord);
			grafik.emty();
			lopp = false;
			if (metod.Wrongimpot(gameWord) == false) {
				do {
					System.out.println("du måste anvenda bokstäver");
					gameWord = sc.nextLine();
					blank = metod.emty(gameWord);
					grafik.emty();
				} while (metod.Wrongimpot(gameWord) == false);
			}
			while (hp > 0) {
				grafik.emty();
				System.out.println(blank);
				System.out.println(gameWord);
				guess = metod.gess(sc,gesstLetter);
				if (metod.Wrongimpot(guess) == false)
					do {

						System.out.println("gissa på en bokstav eller ord");
						guess = metod.gess(sc,gesstLetter);
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
		//multiplayer slut
	}
}
