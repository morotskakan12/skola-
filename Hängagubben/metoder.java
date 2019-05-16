import java.util.ArrayList;
import java.util.Scanner;

public class metoder{
	/**
	 * till f�r att se till s� att pogramet inte krachar n�r anvendaren skriver in en data typ som pograment inte kan hantera. 
	 * @param impot n�got anvendaren har skirvigt in som inte �r i en fel lopp
	 * @return sant eller falst 
	 */
	public static boolean Wrongimpot(String impot){
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		//impot.equals("abcdefghijklmnopqrstuvwxyz");
		int i = 0;
		int e=0;
		for(i= 0;i<impot.length();i++) {
			char myChar = impot.charAt(i);
			for (e = 0; e<alphabet.length;e++) {
				if ( alphabet[e]==myChar) {
					break;
				}

				if (e == alphabet.length-1) {
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * denna mitoden �r till f�r att darton ska v�lja ett ord som spelarne ska gissa p�. ifall man vill splela sj�lv.<br>(en tr�kig lista med vardagliga ord )
	 * @return ett slumpesigt valt ord 
	 */
	
	public static String singelPlayVanlig() {
		String[] word = {"hej","apa","hoppa"};
		int random = (int)(Math.random() * 2 + 1);
		return word[random];
	}

	/**
	 * denna mitoden �r till f�r att darton ska v�lja ett ord som spelarne ska gissa p�. ifall man vill splela sj�lv.<br>(en lista med referenser till sex, drycks spel, savart humor m.m)
	 * @return ett slumpesigt valt ord 
	 */
	public static String singelPlay18() {
		String[] word = {"hej","apa","hoppa"};
		int random = (int)(Math.random() * 2 + 1);
		return word[random];
	}
	/**
	 * en mitod som anvends f�r att ta in informaton fr�n anvendaren. (borde anvenda den oftare).
	 * @param sc importerar scanner 
	 * @return retunerar gisnigen f�rn splearen 
	 */
	public static String gess(Scanner sc ) {
		String word = null;
		boolean lopp = false;
		while(lopp == false) {
			System.out.println("gissa p� en bokstav eller ord");
			word = sc.nextLine();
			lopp = Wrongimpot(word);
		}
		return word; 
	}
	/**
	 * bestem om man ska k�ra mitoden f�r ett ord eller en char.
	 * @param impot tar in gissnigen f�rn gess.
	 * @return snat eller falst 
	 */
	public static boolean length (String impot) {
		if (impot.length()==1) {
			return false;
		}
		else {
			return true;
		}
	}
	/**
	 *  dena mitoden avends f�r att j�mf�ra gissnigen mot det g�rmda ordet f�r att den om den hittar en matching ska de sparas. 
	 * @param gess tar in gissnigen om den �r en char. en arry omgord till string 
	 * @param hiddenWord ordet som �r valt i singelplayer.. 
	 * @return index p� bokstaven om den hittar en matchnig.
	 */
	public static ArrayList<Integer> charGess(String gess, String hiddenWord) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int i = 0;
		char newGess = gess.charAt(0);
		for(i = 0;i<hiddenWord.length();i++) {
			char myChar = hiddenWord.charAt(i);	
			if (newGess == (myChar)) {
				index.add(i);
			}
		}																																				
		return index;
	}
	/**
	 * mitoden �r till f�r att skapa en arry list som �r lika l�ng som ordet fyld med -.<br> f�r att grafiskt kunna visa hur m�nga bokst�ver som ordet inneholler. 
	 * @param balnk en tomm arry list(eventuelt on�digt )
	 * @return en arrylist med lika m�nga - som l�ngeden p� ordet 
	 */
	public static ArrayList<Character> emty(String balnk) {
		ArrayList<Character> em= new ArrayList<Character>();
		for (int i= 0;i<balnk.length();i++) {
			em.add('-');
		}
		return em;
	}
	/**
	 * mitoden �r till f�r att kunna avg�r om arrnlisten baln �r �r samma som det g�mda ordet. f�r att kunna avg�ra om spelar har vunit eller inte. 
	 * @param keyword  �r ordet som valdes i singelPlayer eller som anvendaren skrev in.
	 * @param investigation �r blank en kombenaton av bokst�verna som anvendaren har gisst p� och -. 
	 * @return sant eller falst 
	 */
	public static boolean word (char[] keyword, String investigation){
		String result = "";
		int indexInvestigation = 0 ; 	
		int indexKeyWord = 0 ;
		
		do {
			char letterInvestigation = investigation.charAt(indexInvestigation);		
			indexInvestigation++;
			
			if (letterInvestigation == keyword[indexKeyWord]){
				indexKeyWord++; 
			}
			//stpar loppen som n��got av orden n�r sin fulla l�ngd 
		}while((indexKeyWord != keyword.length)&&(indexInvestigation != investigation.length()));
		
		if (indexKeyWord == keyword.length){
			return true;
		}
		
		return false;
	}
}