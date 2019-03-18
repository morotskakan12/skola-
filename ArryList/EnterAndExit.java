import java.util.ArrayList;
import java.util.Scanner;
public class EnterAndExit{
		public static void main( String [] arg){
		String[] nameList  = {"Sara","Hannes","Mohamed","Adam","Julia","Karin","Gustav","Lena","Larson","carl","Erik","Isak","Emil","Johan","Frase","Bloman","Lasse","Sussan","Emma","Nina"};
		
		EnterAndExit(nameList);
		
	}
	public static void EnterAndExit(String [] name){
		ArrayList<String> enterExit = new ArrayList<>();
		ArrayList<String> printList = new ArrayList<>();		
		boolean writ;
		for (int i= 0; i< 40; i++){
			writ = false;
			int index = (int)(Math.random() * 19 + 0);
			for (int e = 0; e<enterExit.size(); e++){
				// System.out.println("DEBUG: index: " + e + " name: " + name[index] + " size: " + enterExit.size());
				if (name[index]==enterExit.get(e)){
					
					enterExit.remove(name[index]);
					printList.add(name[index]+" "+"exited");
					writ = true; 
					break;
				}
			}
			if (writ == false){
				enterExit.add(name[index]);
				printList.add(name[index]+" "+"entered");
			}
		}
		arrylistPrint(printList);
	}
	
	public static void arrylistPrint(ArrayList arry){
		for (int i = 0; i < arry.size(); i++) {
			System.out.println(arry.get(i) + " ");
		}
		System.out.println("");
	}
}