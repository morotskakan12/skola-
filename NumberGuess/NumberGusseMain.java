import java.util.Scanner;
public class NumberGusseMain{
	// maine mitod + omstart
	
	public static void main( String [] arg){
		Scanner sc = new Scanner(System.in);
		int playAgen =0;
		// skapar en möjlighet att spela igen  
		do{
			StartPage SP = new StartPage();
			System.out.println("want to play again");
			System.out.println("if (yes == enter an even number 1-10)");
			System.out.println("else (no == something uneven now between 1-10)");
			playAgen = sc.nextInt();
			// if((playAgen==2)||(playAgen==4)||(playAgen==6)||(playAgen==8)||(playAgen==10)){
			// NummberGame Ng = new NummberGame(NF.numberStart(SP.startPage()));	
			// }
		}while((playAgen==2)||(playAgen==4)||(playAgen==6)||(playAgen==8)||(playAgen==10)); 
	}	
}