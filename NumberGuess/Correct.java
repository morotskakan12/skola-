public class Correct{
	 public static int correct(int inpot,int answer){
		 int inxdex = 0;
		 if((answer<inpot)&&(answer!=0)){
			System.out.println("number is smaller");
			inxdex = 1;
		}
		else if (answer>inpot){
			System.out.println("number is bigger");
			inxdex = 2;
		}
		return inxdex;
	 }
	
}