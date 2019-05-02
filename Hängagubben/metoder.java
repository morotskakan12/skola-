import java.util.ArrayList;
import java.util.Scanner;

public class metoder{
	public static boolean Wrongimpot(String impot){
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		//impot.equals("abcdefghijklmnopqrstuvwxyz");
		int i = 0;
		int e=0;
		for(i= 0;i<impot.length();i++) {
			char myChar = impot.charAt(i);
			for (e = 0; e<alphabet.length-1;e++) {
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
	public static String singelPlayVanlig() {
		String[] word = {"hej","apa","hoppa"};
		int random = (int)(Math.random() * 2 + 1);
		return word[random];
	}
	public static String singelPlay18() {
		String[] word = {"hej","apa","hoppa"};
		int random = (int)(Math.random() * 2 + 1);
		return word[random];
	}
	public static String gess(Scanner sc ) {
		String word = null;
		boolean lopp = false;
		while(lopp == false) {
			word = sc.nextLine();
			lopp = Wrongimpot(word);
		}
		return word; 
	}
	public static boolean length (String impot) {
		if (impot.length()==1) {
			return false;
		}
		else {
			return true;
		}
	}
	public static int charGess(String gess, String hiddenWord) {
		int i = 0;
		char newGess = gess.charAt(0);
		for(i = 0;i<hiddenWord.length();i++) {
			char myChar = hiddenWord.charAt(i);	
			if (newGess == (myChar)) {
				return i;
			}
		}																																				
		return i+1;
	}
	public static ArrayList<Character> emty(String balnk) {
		ArrayList<Character> em= new ArrayList<Character>();
		for (int i= 0;i<balnk.length();i++) {
			em.add('-');
		}
		return em;
	}
}