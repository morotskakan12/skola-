import java.util.ArrayList;
import java.util.Scanner;

public class metoder {
	/**
	 * till för att se till så att pogramet inte krachar när anvendaren skriver in
	 * en data typ som pograment inte kan hantera.
	 * 
	 * @param impot något anvendaren har skirvigt in som inte är i en fel lopp
	 * @return sant eller falst
	 */
	public static boolean Wrongimpot(String impot) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		// impot.equals("abcdefghijklmnopqrstuvwxyz");
		int i = 0;
		int e = 0;
		for (i = 0; i < impot.length(); i++) {
			char myChar = impot.charAt(i);
			for (e = 0; e < alphabet.length; e++) {
				if (alphabet[e] == myChar) {
					break;
				}

				if (e == alphabet.length - 1) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * denna mitoden är till för att darton ska välja ett ord som spelarne ska gissa
	 * på. ifall man vill splela själv.<br>
	 * (en tråkig lista med vardagliga ord )
	 * 
	 * @return ett slumpesigt valt ord
	 */

	public static String singelPlayVanlig() {
		String[] word = { "hej", "apa", "hoppa" };
		int random = (int) (Math.random() * 2 + 1);
		return word[random];
	}

	/**
	 * denna mitoden är till för att darton ska välja ett ord som spelarne ska gissa
	 * på. ifall man vill splela själv.<br>
	 * (en lista med referenser till sex, drycks spel, savart humor m.m)
	 * 
	 * @return ett slumpesigt valt ord
	 */
	public static String singelPlay18() {
		String[] word = { "hej", "apa", "hoppa" };
		int random = (int) (Math.random() * 2 + 1);
		return word[random];
	}

	
	/**
	 * så att du inte ska kunna gissa på samma bokstav två gånger.
	 * 	 * @param arry borstäver som har gissats på.
	 * @param word gisnigen för denna rundan.
	 * @return
	 */
	
	public static boolean lettererly(ArrayList<String> arry,String word) {
		
		for (int i = 0; i< arry.size(); i++) {
			if (arry.get(i).equals(word)) {
				return false;
			}
		}
		return true;
	}
	/**
	 * en mitod som anvends för att ta in informaton från anvendaren. (borde anvenda
	 * den oftare).
	 * 
	 * @param sc importerar scanner
	 * @return retunerar gisnigen fårn splearen
	 */
	public static String gess(Scanner sc, ArrayList<String> arry) {
		String word = null;
		boolean lopp = false;
		while (lopp == false) {
			System.out.println("gissa på en ny bokstav eller ord");
			word = sc.nextLine();
			if ((Wrongimpot(word))||(lettererly(arry,word)) == true) {
				lopp = true;
			}
		}
		return word;
	}

	/**
	 * bestem om man ska köra mitoden för ett ord eller en char.
	 * 
	 * @param impot tar in gissnigen fårn gess.
	 * @return snat eller falst
	 */
	public static boolean length(String impot) {
		if (impot.length() == 1) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * dena mitoden avends för att jämföra gissnigen mot det görmda ordet för att
	 * den om den hittar en matching ska de sparas.
	 * 
	 * @param gess       tar in gissnigen om den är en char. en arry omgord till
	 *                   string
	 * @param hiddenWord ordet som är valt i singelplayer..
	 * @return index på bokstaven om den hittar en matchnig.
	 */
	public static ArrayList<Integer> charGess(String gess, String hiddenWord) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int i = 0;
		char newGess = gess.charAt(0);
		for (i = 0; i < hiddenWord.length(); i++) {
			char myChar = hiddenWord.charAt(i);
			if (newGess == (myChar)) {
				index.add(i);
			}
		}
		return index;
	}

	/**
	 * mitoden är till för att skapa en arry list som är lika lång som ordet fyld
	 * med -.<br>
	 * för att grafiskt kunna visa hur många bokstäver som ordet inneholler.
	 * 
	 * @param balnk en tomm arry list(eventuelt onödigt )
	 * @return en arrylist med lika många - som längeden på ordet
	 */
	public static ArrayList<Character> emty(String balnk) {
		ArrayList<Character> em = new ArrayList<Character>();
		for (int i = 0; i < balnk.length(); i++) {
			em.add('-');
		}
		return em;
	}

	/**
	 * mitoden är till för att kunna avgär om arrnlisten baln är är samma som det
	 * gömda ordet. för att kunna avgöra om spelar har vunit eller inte.
	 * 
	 * @param keyword       är ordet som valdes i singelPlayer eller som anvendaren
	 *                      skrev in.
	 * @param investigation är blank en kombenaton av bokstäverna som anvendaren har
	 *                      gisst på och -.
	 * @return sant eller falst
	 */
	public static boolean word(char[] keyword, String investigation) {
		String result = "";
		int indexInvestigation = 0;
		int indexKeyWord = 0;

		do {
			char letterInvestigation = investigation.charAt(indexInvestigation);
			indexInvestigation++;

			if (letterInvestigation == keyword[indexKeyWord]) {
				indexKeyWord++;
			}
			// stpar loppen som nåågot av orden når sin fulla längd
		} while ((indexKeyWord != keyword.length) && (indexInvestigation != investigation.length()));

		if (indexKeyWord == keyword.length) {
			return true;
		}

		return false;
	}
}