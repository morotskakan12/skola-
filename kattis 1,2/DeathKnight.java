import java.util.Scanner;
import java.util.Random;
	public class DeathKnight{
		
		public static void main( String [] arg){
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			int inpute = Input (sc);
			String spell = Spell(rand);
			for(int e=0;e<inpute();e++){Win(spell);}
			
		}public static int Input (Scanner sc){
			System.out.println("how meny battles");
			int Round = sc.nextInt();
			while(Round<100){
				System.out.println("not more then 100 ");
				System.out.println("how many battles");
				Round = sc.nextInt();
			}
			return Round;
		}public static String Spell (Random rand){
			int numberFoSpell = rand.nextInt(50)+1;
			String WinOrLose =;
			for(int i= 0 ;i<numberFoSpell; i++){
				int WhichSpell = rand.nextInt(3)+1;
				if(WhichSpell==1){String TheSpell = "o";}
				if(WhichSpell==2){String TheSpell = "d";}
				if(WhichSpell==3){String TheSpell = "c";}
				WinOrLose = TheSpell + WinOrLose ;
			}
		return WinOrLose;
		}	
			
			
		}
			
		
		
	