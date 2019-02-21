import java.util.Scanner;
public class NummberGame{
	public static void nummberGame(int index){
	Scanner sc = new Scanner(System.in);
	int answer = NummberFormela.numberStart(index);
	int death = 0;
	if((answer <= 100)&&(answer>0)){
		System.out.println("Enter a number between 1 and 100");
	}
	else if(answer<=500){
		System.out.println("Enter a number between 1 and 500");
	}
	else{
		System.out.println("Enter a number between 1 and 1000");
	} 
		int inpot = sc.nextInt();
		int i = 1;
	while(answer != inpot){
		death = Correct.correct(inpot,answer);
		i++;
		inpot = sc.nextInt();
		}
	System.out.println("congratulations you won");
	System.out.println("it took :" + i);
	}
}