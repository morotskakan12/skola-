public class ComputerSolv{
	
	public static int solv(int svar, int startMax){
		int max = startMax;
		int mine = 1;
		int ansor =1000;
		int i =0;
		int index =0; 
		do{
			index = Correct.correct(svar, ansor);
		if (index == 2){
			max = ansor+1;
		}
		else if (index == 1){
				
			mine = ansor -1;			
		}
		ansor = (int)(Math.random() * max + mine);
		System.out.println(ansor);
		i++;
		}while (ansor != svar);
		
		
		return i++;
		
	}
	
	
}