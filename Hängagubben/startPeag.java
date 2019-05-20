
import java.util.Scanner;
public class startPeag{
	
	/**
	 * i main kommer anvendra infon och förusänigaran för spelet bestämas. 	  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean lopp= true;
		boolean innerLopp= true;
		boolean singelMulti = true;
		// två funktoner om man vill starra om spelet och om men skriver in fel ska pogramet inte stängas ner 
		System.out.println("hej och v�lkomen.");
		// initcierar pogram lopp som bryt när lopp en endras till fals 
		while(lopp){
			innerLopp= true;
			System.out.println("svara Singelplayer or Multiplyer  ");
			System.out.println("vill du spela Singelplayer or Multiplyer");
			String hiddenWord = sc.nextLine();
			System.out.println("");
		// val av händelse 
		if ((hiddenWord.equals("Singelplayer"))||(hiddenWord.equals("singelplayer"))){
			// mitoden för att köra pogramet igen eller inte
			singelMulti = true;
			while(innerLopp){
				Game Game = new Game(singelMulti);
					System.out.println("vill du spela igen");
					System.out.println("svara Ja eller Nej");
					System.out.println("");
					String playagen = sc.nextLine();
				if (playagen.toLowerCase().equals("nej")){
					lopp= false;
					innerLopp= false;
				}else if(playagen.toLowerCase().equals("Ja")){
					innerLopp= false;
				}else{
				// ifal anvenaren skriver fel
					System.out.println("fel g�r om");
					System.out.println("svaera ja eller nej");
					System.out.println("");
				}
			}
		}else if ((hiddenWord.equals("Multiplyer"))||(hiddenWord.equals("multiplyer"))){
			// mitoden för att köra pogramet igen eller inte
			singelMulti = false;
			while(innerLopp){
				Game Game = new Game(singelMulti);
				System.out.println("vill du spela igen");
				System.out.println("svara Ja eller Nej");
				System.out.println("");
				String playagen = sc.nextLine();
				if (playagen.toLowerCase().equals("nej")){
					lopp= false;
					innerLopp= false;
				}else if(playagen.toLowerCase().equals("Ja")){
					innerLopp= false;
					}
			}
		}
		// ifal anvenaren skriver fel
		else{
			System.out.println("You can only enter Multiplyer or Singelplayer. please try again");
			System.out.println("");
		}
		
	}
	//avslut
		System.out.println("");
		System.out.println("basi basi");
		
	}

}
	