import java.util.Scanner;
	public class skaner{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			System.out.println("vad är din addres");
			String addres=input.nextLine();
			System.out.println("din addres är"+ addres);
			System.out.println("vad är din klss");
			String Klass=input.nextLine();
			System.out.println("din klass är"+Klass);
			System.out.println("vad är din nummer");
			String telnr=input.nextLine();
			System.out.println("din nummer är"+telnr);
		}
	}