public class ComputerSolv{
	// dator lösnig 
	public static int solv(int svar, int startMax){
		// initsierar variabler 
		int max = startMax;
		int ansor =999;
		int mine=1;
		int i =0;
		int index =0; 
		// initsierar lopp
		do{
			// mitod för att brätta om det är större eller mindre
			index = Correct.correct(svar, ansor);
		// formel för att skapa ett minder gap mellan värdena saton kan gissa på 
		if (index == 2){
			max = ansor+1;
		}
		else if (index == 1){
				
			mine = ansor -1;			
		}
		// gissar på ett värde mellan angicna värden random vardet blir nåbon stans mellan mine värdet + max värde därför (max-mine)
		ansor = (int)(Math.random() * (max-mine) + mine);
		System.out.println(ansor);
		// räknar intrektoner 
		i++;
		}while (ansor != svar);
		
		// retunerar värde
		return i++;
		
	}
	
	
}