public class ComputerSolv{
	public static int ComputerSolv(int index,int startMax){
		int max = startMax;
		int mine = 1;
		int ansor =0;
		if (index == 1){
			max = ansor+1;
		}
		else if (index == 2){
			mine = ansor-1;			
		}
		ansor = (int)(Math.random() * max + mine);
		System.out.println(ansor);
		return ansor;
		
	}
	
	
}