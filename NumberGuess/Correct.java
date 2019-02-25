public class Correct{
	 public static int correct(int inpot,int answer){
		 int inxdex = 0;
		 if(answer<inpot){
			System.out.println("number is smaller");
			inxdex = 1;
		}
		else if ((answer>inpot)&&(answer!=1000)){
			System.out.println("number is biger");
			inxdex = 2;
		}
		return inxdex;
	 }
	
}