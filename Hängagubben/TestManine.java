import java.util.ArrayList;
import java.util.Scanner;

public class TestManine{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		metoder metod = new metoder();
		String gameWord = metod.singelPlay18();
		ArrayList<Character> blank = metod.emty(gameWord);
		String guess = metod.gess(sc); 
		System.out.println(metod.charGess(guess,gameWord));
		System.out.println((gameWord.length()+1));
	}
}