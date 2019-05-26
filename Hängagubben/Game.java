import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class Game {
	public Game(boolean gameType) {
		Scanner sc = new Scanner(System.in);
		//skapar l�nk till mitod galleri
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
				//v�ljar on det ska var vanlig eller 18+
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
						System.out.println("l�ngden du har kvar p� dit orden �r:");
						System.out.println(blank);
						System.out.println("du har gissat p� f�ljande bokst�ver");
						System.out.println(gesstLetter);
						guess = metod.gess(sc,gesstLetter);
						if (metod.length(guess) == false) {
							//ifall det fin dubletter �r det en int iet�let f�r en boolen
							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;
								//l�gger till s� att anvendaren kan se vilaka hen har gissat p�
								gesstLetter.add(guess);
							} else {
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									//l�gger till charen til areyliseten. beh�vde glr aom datatyper f�r att den skulle kunnas l�ggas till
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
							// vinst sk�rm
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
						System.out.println("l�ngden du har kvar p� dit orden �r:");
						System.out.println(blank);
						System.out.println("du har gissat p� f�ljande bokst�ver");
						System.out.println(gesstLetter);
						guess = metod.gess(sc,gesstLetter);
						if (metod.length(guess) == false) {
							//ifall det fin dubletter �r det en int iet�let f�r en boolen
							if (metod.charGess(guess, gameWord).size() == 0) {
								hp = hp - 1;
								//l�gger till s� att anvendaren kan se vilaka hen har gissat p�
								gesstLetter.add(guess);	
									} else {
								index = metod.charGess(guess, gameWord);
								for (int i = 0; i < index.size(); i++) {
									//l�gger till charen til areyliseten. beh�vde glr aom datatyper f�r att den skulle kunnas l�ggas till
									
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
							// vinst sk�rm
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
				//om anvendaren skriver fel s� kommer hen att f� g�ra om.
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
			System.out.println("anlednigen till texten under �r att jag �r lat");	
			//anvendararen v�ljar ordet som ska spelas med
			gameWord = metod.gess(sc,gesstLetter);
				
				blank = metod.emty(gameWord);
				grafik.emty();
				//spelat startar
			while (hp > 0) {
				grafik.emty();
				grafik.gubenVanlig(hp);
				System.out.println("l�ngden du har kvar p� dit orden �r:");
				System.out.println(blank);
				System.out.println("gissa p� en bokstav eller ord");
				System.out.println(gesstLetter);
				guess = metod.gess(sc,gesstLetter);
				
				if (metod.length(guess) == false) {
					//ifall det fin dubletter �r det en int iet�let f�r en boolen
					if (metod.charGess(guess, gameWord).size() == 0) {
						hp = hp - 1;
						//l�gger till s� att anvendaren kan se vilaka hen har gissat p�
						
						gesstLetter.add(guess);
						grafik.emty();
						grafik.gubenVanlig(hp);
						
					} else {
						//l�gger till charen til areyliseten. beh�vde glr aom datatyper f�r att den skulle kunnas l�ggas till
						
						index = metod.charGess(guess, gameWord);
						for (int i = 0; i < index.size(); i++) {
							blank.set(index.get(i), guess.charAt(0));
						}
						char[] namn = new char[blank.size()];
						for (int i = 0; i < blank.size(); i++) {
							namn[i] = blank.get(i);
						}
						//vinst
						if (metod.word(namn, gameWord)) {
							System.out.println("ditt ord var");
							System.out.println(gameWord);
							grafik.vinst();
							break;
						}
						
						
					}
				} else {
					if (guess.equals(gameWord)) {
						// vinst sk�rm
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
		      System.out.println("*********** H�NGDE GUBBE ***********");
		      System.out.println("************************************");
		      System.out.println("************************************");
		}
	}
}
