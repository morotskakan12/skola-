import static javax.swing.JOptionPane.*;
import java.util.Scanner;
import java.util.ArrayList;

	public class rovarsproket{
		
	
		public static void main( String [] arg){
			Scanner sc = new Scanner(System.in);
			letters(sc);

		}
	
			public static void letters(Scanner sc){
				System.out.println("Enter input char");
				String input = sc.next();
				System.out.println("Output : ");
				int inputLenght = input.length();
				String kons = "cdghjklmnpqrstvwxz";
				String svar = "";
				for(int i=0; i<inputLenght; i++){
					char oneLetter = input.charAt(i);
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
				
				System.out.print(svar);
			}
	}
				/*
				for(c = 0 ; c<i; c++){
					char[] c_arr = input.toCharArray();
					 if(input.toUpperCase().indexOf(i) < 0){
						 
				}
*/				
				
				
				
	
	