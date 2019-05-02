import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class Game{
	public Game(boolean gameType){
		Scanner sc = new Scanner(System.in);
		metoder metod = new metoder();
		boolean lopp= true;
		int hp = 10;
		ArrayList<Character> blank;
		String gameWord;
		String guess= null;
		//singelplayer
		if (gameType == true) {
			System.out.println("vill du spela 18+ eller vanligt");
			System.out.println("du kan bara skriva 18+ eller vanligt");
			while(lopp == true) {
			String vanligt = sc.nextLine();
		
			if (vanligt.equals("18+")) {
				System.out.println("grattis du har valt 18+");
				gameWord = metod.singelPlay18();
				blank = metod.emty(gameWord);
				lopp = false;
				while (hp>0) {
					System.out.println(blank);
					System.out.println(gameWord);
					System.out.println("gissa på en bokstav eller ord");
					guess = metod.gess(sc); 
					System.out.println(metod.charGess(guess,gameWord));
					System.out.println((gameWord.length()+1));
					System.out.println(metod.length(guess));
					if (metod.length(guess)==false) {
						if (metod.charGess(guess,gameWord)==(gameWord.length()+1)){
							hp=hp-1;
							//mitod flr att visa upp grafis guben.
						}
						else{
							
							blank.set(metod.charGess(guess, gameWord), guess.charAt(0));
							//blank.replace(oldChar, newChar)
						}
					}else{
						if (guess.equals(gameWord)){
							//vinst skärm
							break;
						}else {
							//visa upp att med gubben att spelan hadde fel 
							hp= hp-1;
						}
						
					}
				}
			}else if (vanligt.equals("Vanlig")){
				gameWord = metod.singelPlayVanlig();
				while (hp<0) {
					guess = metod.gess(sc); 
					if (metod.length(guess)==false) {
						
					}else{
						if (guess.equals(gameWord)){
							//vinst skärm
							break;
					}
				}
				lopp = false;
			}
			}else {
				System.out.println("du kan bara skriva 18+ eller vanligt");
				System.out.println("");
			
			}
		}
		//multiplyer
		if (gameType == false) {
			gameWord = sc.nextLine();
			while(metod.Wrongimpot(gameWord)==false) {
				System.out.println("du måste anvenda bokstäver");
				gameWord = sc.nextLine();
				while (hp<0) {
					guess = metod.gess(sc); 
					if (metod.length(guess)==false) {
						
					}else{
						if (guess.equals(gameWord)){
							//vinst skärm
							break;
						}
					}	
				}
		
			}
		}
		}
	}
}