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
	}
}