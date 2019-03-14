import java.util.Scanner;
	public class charovnig{
		
		public static void main( String [] arg){
			Scanner sc = new Scanner(System.in);
			System.out.println("skriv ett ord");
			String input = sc.next();
			System.out.println("skriv din radie");
			double radius = sc.nextDouble();
			System.out.println(Reverse(input));
			System.out.println(Valuc(input, sc));
			System.out.println(rovarsproket(input));
			System.out.println(volume(radius));
			
		}
		public static String Reverse(String inputTest){
			String reverse = "";
			
			for(int i = inputTest.length() - 1; i >= 0; i--){
			reverse = reverse + inputTest.charAt(i);
			} 
			
			return reverse; 
		}
		public static int Valuc (String inputMain, Scanner sc){
			int numbreFoC =0;
			for(int i=0; i<inputMain.length(); i++){
					char oneLetter = inputMain.charAt(i);
					if(oneLetter=='c'){
						numbreFoC= numbreFoC +1;
					}
			}
			return numbreFoC;
			
		}
		public static String rovarsproket(String inputRe){
			int inputLenght = inputRe.length();
				String kons = "cdghjklmnpqrstvwxz";
				String svar = "";
				for(int i=0; i<inputLenght; i++){
					char oneLetter = inputRe.charAt(i);
					int stop = 0;
				
						for(int r=0;r<18;r++){
							stop = 0;
							char konns = kons.charAt(r);
							if(oneLetter=='b'){
								svar+= oneLetter+"ob";
								r=21;
								
							} else if(oneLetter=='f'){
								svar+=oneLetter+"of";
								r=21;
							} else if (oneLetter==konns){
								svar+=oneLetter+"o";
								r=21;
							} else {
								stop=1;
							}
						}
						
						if(stop==1){
							svar+=oneLetter;
						}
						
				}
			return svar;	
		}		
		public static double volume(double redius){
		
		redius = (4*(Math.pow(redius,3))*Math.PI)/3;
		return redius;
		
}
	
	}
	
	