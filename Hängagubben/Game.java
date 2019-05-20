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
						
						System.out.println(blank);
						System.out.println(gameWord);
						System.out.println("du har gissat på följande bokstäver");
						System.out.println(gesstLetter);
						guess = metod.gess(sc,gesstLetter);
						if (metod.length(guess) == false) {

							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;
								gesstLetter.add(guess);	
								grafik.emty();
								grafik.gubenVanlig(hp);
								// mitod flr att visa upp grafis guben.
							} else {
								gesstLetter.add(guess);
								ArrayList<Integer> index = new ArrayList<Integer>();
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									blank.set(index.get(i), guess.charAt(0));
								}
								char[] namn = new char[blank.size()];
								for (int i = 0; i < blank.size(); i++) {
									namn[i] = blank.get(i);
								}
								if (metod.word(namn, gameWord)) {
									break;
								}
								grafik.emty();
								grafik.gubenVanlig(hp);
								// blank.replace(oldChar, newChar)
							}
						} else {
							if (guess.equals(gameWord)) {
								grafik.vinst();
								// vinst skärm
								break;
							} else {
								// visa upp att med gubben att spelan hadde fel
								hp = hp - 1;
								grafik.emty();
								grafik.gubenVanlig(hp);
							}

						}
					}
					
				}
				//18+ singelplayer spel slut
				//valint singelplyer spel start
				else if (vanligt.equals("vanligt")) {
					System.out.println("grattis du har valt vanligt");
					gameWord = metod.singelPlayVanlig();
					blank = metod.emty(gameWord);
					lopp = false;
					while (hp > 0) {
						System.out.println(blank);
						System.out.println(gameWord);
						System.out.println("du har gissat på följande bokstäver");
						System.out.println(gesstLetter);
						guess = metod.gess(sc,gesstLetter);
						if (metod.length(guess) == false) {

							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;
								gesstLetter.add(guess);	
								grafik.emty();
								grafik.gubenVanlig(hp);
								// mitod flr att visa upp grafis guben.
							} else {
								ArrayList<Integer> index = new ArrayList<Integer>();
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									blank.set(index.get(i), guess.charAt(0));
								}
								char[] namn = new char[blank.size()];
								for (int i = 0; i < blank.size(); i++) {
									namn[i] = blank.get(i);
								}
								if (metod.word(namn, gameWord)) {
									break;
								}
								grafik.emty();
								grafik.gubenVanlig(hp);
								// blank.replace(oldChar, newChar)
							}
						} else {
							if (guess.equals(gameWord)) {
								grafik.vinst();
								// vinst skärm
								break;
							} else {
								// visa upp att med gubben att spelan hadde fel
								hp = hp - 1;
								grafik.emty();
								grafik.gubenVanlig(hp);
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
			lopp = false;
				gameWord = metod.gess(sc,gesstLetter);
				blank = metod.emty(gameWord);
				grafik.emty();

			while (hp > 0) {
				System.out.println(blank);
				System.out.println(gameWord);
				System.out.println(gesstLetter);
				guess = metod.gess(sc,gesstLetter);
				gesstLetter.add(guess);
				if (metod.length(guess) == false) {

					if (metod.charGess(guess, gameWord).size() == 0) {
						hp = hp - 1;
						grafik.emty();
						grafik.gubenVanlig(hp);
						// mitod flr att visa upp grafis guben.
					} else {
						ArrayList<Integer> index = new ArrayList<Integer>();
						index = metod.charGess(guess, gameWord);
						for (int i = 0; i < index.size(); i++) {
							blank.set(index.get(i), guess.charAt(0));
						}
						char[] namn = new char[blank.size()];
						for (int i = 0; i < blank.size(); i++) {
							namn[i] = blank.get(i);
						}
						if (metod.word(namn, gameWord)) {
							break;
						}
						grafik.emty();
						grafik.gubenVanlig(hp);
						// blank.replace(oldChar, newChar)
					}
				} else {
					if (guess.equals(gameWord)) {
						// vinst skärm
						grafik.vinst();
						break;
					} else {
						// visa upp att med gubben att spelan hadde fel
						hp = hp - 1;
						grafik.emty();
						grafik.gubenVanlig(hp);
					}

				}
			}
		}
		//multiplayer slut
		if (hp== 0) {
		      System.out.println("************************************");
		      System.out.println("***** GAME OVER - YOU LOOSE!!! *****");
		      System.out.println("*********** HÄNGDE GUBBE ***********");
		      System.out.println("************************************");
		      System.out.println("************************************");
		}
	}
}
