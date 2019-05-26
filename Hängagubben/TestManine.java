import java.util.ArrayList;
import java.util.Scanner;

public class TestManine{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> gesstLetter = new ArrayList<String>();
		metoder metod = new metoder();
		String gameWord = metod.singelPlay18();
		gesstLetter.add("a");
		System.out.print(metod.lettererly(gesstLetter,("hall")));
		String[] word = { "pippa","kärlek","pocketpussy","jägermeister","rom","vodka","vin","cider","öl","shot","chug","fuckthedealer","jappa","djävulenstrekant","trekant","anal","bwd","bbc","milf","xxnx","xhamster","redtube","pornhub","glädjepojke","glädjeflicka","sex","sextinian", "bordell", "hora" };
		System.out.print(word.length);
	}
}