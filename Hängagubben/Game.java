import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class Game {
	public Game(boolean gameType) {
		Scanner sc = new Scanner(System.in);
		//skapar länk till mitod galleri
		metoder metod = new metoder();
		ArrayList<Integer> index = new ArrayList<Integer>();
		grafik garfik = new grafik();
		//arreyer for att kunna prata med mitoderna i samma dator typ. 
		ArrayList<String> gesstLetter = new ArrayList<String>();
		ArrayList<Character> blank;
		//variabler
		boolean lopp = true;
		int hp = 10;
		String gameWord= null;
		String guess = null;
		// singelplayer
		if (gameType == true) {
			//intro
			System.out.println("vill du spela 18+ eller vanligt");
			System.out.println("du kan bara skriva 18+(18) eller vanligt(v)");
			while (lopp == true) {
				//väljar on det ska var vanlig eller 18+
				String vanligt = sc.nextLine();
				//singlplayer 18+ spel start
				if (vanligt.equals("18+")||vanligt.equals("18")) {
					System.out.println("grattis du har valt 18+");
					gameWord = metod.singelPlay18();
					
					blank = metod.emty(gameWord);
					lopp = false;
					//spelet fin inom denna loppen 
					while (hp > 0) {
						grafik.emty();
						grafik.guben18(hp);
						System.out.println("längden du har kvar på dit orden är:");
						System.out.println(blank);
						System.out.println("du har gissat på följande bokstäver");
						System.out.println(gesstLetter);
						guess = metod.gess(sc,gesstLetter);
						if (metod.length(guess) == false) {
							//ifall det fin dubletter är det en int ietälet för en boolen
							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;
								//lägger till så att anvendaren kan se vilaka hen har gissat på
								gesstLetter.add(guess);
							} else {
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									//lägger till charen til areyliseten. behövde glr aom datatyper för att den skulle kunnas läggas till
									blank.set(index.get(i), guess.charAt(0));
								}
								char[] namn = new char[blank.size()];
								for (int i = 0; i < blank.size(); i++) {
									namn[i] = blank.get(i);
								}
								//om vinst
								if (metod.word(namn, gameWord)) {
									grafik.vinst18();
									System.out.println("ditt ord var");
									System.out.println(blank);
									grafik.vinst();
									break;
								}
							}
						} else {
							// vinst skärm
							if (guess.equals(gameWord)) {
								grafik.vinst18();
								System.out.println("ditt ord var");
								System.out.println(blank);
								grafik.vinst();
								
								break;
							//om fel
							} else  {
								
								hp = hp - 1;
							}

						}
					}
					
				}
				//18+ singelplayer spel slut
				//valint singelplyer spel start
				else if (vanligt.equals("vanligt")||vanligt.equals("v")) {
					System.out.println("grattis du har valt vanligt");
					gameWord = metod.singelPlayVanlig();
					blank = metod.emty(gameWord);
					lopp = false;
					//spelet fin inom denna loppen 
					while (hp > 0) {
						grafik.emty();
						grafik.gubenVanlig(hp);
						System.out.println("längden du har kvar på dit orden är:");
						System.out.println(blank);
						System.out.println("du har gissat på följande bokstäver");
						System.out.println(gesstLetter);
						guess = metod.gess(sc,gesstLetter);
						if (metod.length(guess) == false) {
							//ifall det fin dubletter är det en int ietälet för en boolen
							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;
								//lägger till så att anvendaren kan se vilaka hen har gissat på
								gesstLetter.add(guess);	
								// mitod flr att visa upp grafis guben.
							} else {
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									blank.set(index.get(i), guess.charAt(0));
								}
								char[] namn = new char[blank.size()];
								for (int i = 0; i < blank.size(); i++) {
									namn[i] = blank.get(i);
								}
								if (metod.word(namn, gameWord)) {
									System.out.println("ditt ord var");
									System.out.println(gameWord);
									grafik.vinst();
									break;
								}
							}
							// vinst skärm
						} else {
							if (guess.equals(gameWord)) {
								System.out.println("ditt ord var");
								System.out.println(gameWord);
								grafik.vinst();
								
								break;
								//om fel
							} else {
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
			lopp = false;
			System.out.println("siriv in det ordet ni vill spela med:");
			System.out.println("anlednigen till texten under är att jag är lat");	
			gameWord = metod.gess(sc,gesstLetter);
				
				blank = metod.emty(gameWord);
				grafik.emty();

			while (hp > 0) {
				grafik.emty();
				grafik.gubenVanlig(hp);
				System.out.println("längden du har kvar på dit orden är:");
				System.out.println(blank);
				System.out.println("gissa på en bokstav eller ord");
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

						index = metod.charGess(guess, gameWord);
						for (int i = 0; i < index.size(); i++) {
							blank.set(index.get(i), guess.charAt(0));
						}
						char[] namn = new char[blank.size()];
						for (int i = 0; i < blank.size(); i++) {
							namn[i] = blank.get(i);
						}
						if (metod.word(namn, gameWord)) {
							System.out.println("ditt ord var");
							System.out.println(gameWord);
							grafik.vinst();
							break;
						}
						
						// blank.replace(oldChar, newChar)
					}
				} else {
					if (guess.equals(gameWord)) {
						// vinst skärm
						System.out.println("ditt ord var");
						System.out.println(gameWord);
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
				System.out.println("ditt ord var");
				System.out.println(gameWord);
				System.out.println("************************************");
		      System.out.println("***** GAME OVER - YOU LOOSE!!! *****");
		      System.out.println("*********** HÄNGDE GUBBE ***********");
		      System.out.println("************************************");
		      System.out.println("************************************");
		}
	}
}
