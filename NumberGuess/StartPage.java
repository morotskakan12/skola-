import java.util.Scanner;
public class StartPage{
	public StartPage() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome!");
			System.out.println("this is a number game enter the difficulty");
			System.out.println("1. between 1-100 ");
			System.out.println("2. between 1-500 ");
			System.out.println("3. between 1-1000");
			System.out.println("4. computer solve");
			int i = 0;
			int answer = 999;
			
			int index = sc.nextInt();
			if(index>=5){
				do{
				System.out.println("you cannot choose a higher level of difficulty a 3");
				System.out.println("please select again");
				index = sc.nextInt();
				}while (index>=5);
			}
			if (index ==1){
				index = 100;
				NummberGame.nummberGame(index);
			}
			if (index == 2){
				index=500;
				NummberGame.nummberGame(index);
			}
			if (index==3){
				index=1000;
				NummberGame.nummberGame(index);
			}
			if(index == 4){
				int number=1000;
				number = NummberFormela.numberStart(number);
				answer = ComputerSolv.solv(number,answer );
					
				System.out.println(answer);
			}
	}
}