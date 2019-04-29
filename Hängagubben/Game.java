import java.util.Scanner;

public class Game{
	public Game(boolean gameType){
		Scanner sc = new Scanner(System.in);
		metoder metod = new metoder();
		boolean lopp= true;
		int hp = 10;
		String gameWord;
		String guess= null;
		//singelplayer
		if (gameType == true) {
			System.out.println("vill du spela 18+ eller vanligt");
			System.out.println("du kan bara skriva 18+ eller vanligt");
			while(lopp == true) {
			String vanligt = sc.nextLine();
		
			if (vanligt.equals("18+")) {
				gameWord = metod.singelPlay18();
				lopp = false;
				while (hp<0) {
					guess = metod.gess(sc); 
					if (metod.length(guess)==false) {
						if (metod.charGess(guess,gameWord)==gameWord.length()){
							hp=hp+1;
							
						}
						else{
							
						}
					}else{
						if (guess.equals(gameWord)){
							//vinst skärm
							break;
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