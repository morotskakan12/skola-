import java.util.Scanner;
	public class skaner{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			System.out.println("vad �r din addres");
			String addres=input.nextLine();
			System.out.println("din addres �r"+ addres);
			System.out.println("vad �r din klss");
			String Klass=input.nextLine();
			System.out.println("din klass �r"+Klass);
			System.out.println("vad �r din nummer");
			String telnr=input.nextLine();
			System.out.println("din nummer �r"+telnr);
		}
	}