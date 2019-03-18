import java.util.ArrayList;
import java.util.Scanner;
public class Word{
	public static void main( String [] arg){
		Word W = new Word();
		ArrayList<String> head = new ArrayList<>();
		head = userImpot();
		head = unomely(head);
		arrylistPrint(head);
	}
	
	public static ArrayList<String> userImpot(){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> userIm = new ArrayList<>();
		String namnIn = "";
		System.out.println("how many times your employees go in and out.");
		int index = sc.nextInt();
		String tom = sc.nextLine();
			for(int i = 0; i<index;i++){ 
				System.out.println("entry or exit"+" "+"name");
				System.out.println("");
				namnIn = sc.nextLine();
				userIm.add(namnIn);
			}
			arrylistPrint(userIm);
			userIm = systemOut(userIm);
			arrylistPrint(userIm);
			return userIm;
			
			
	}
	public static ArrayList<String> systemOut(ArrayList<String> namn){
		ArrayList<String> outpott = new ArrayList<>();
		Word W = new Word();
		String index = "entry";
		String namne= "";
		for (int i = 0; i<namn.size();i++){
			index = "entry";
			
			namne = W.sekendWord(namn.get(i));
			
			if(W.word(index,namn.get(i)).equals(index)){
				index = "entered";
			}
			else{
				index = "exited";
			}
			outpott.add(namne +" "+ index);
		}
		return outpott;
	}
	
	
	
	public String word (String keyword, String investigation){
		String result = "";
		int indexInvestigation = 0 ; 	
		int indexKeyWord = 0 ;
		
		do {
			char letterInvestigation = investigation.charAt(indexInvestigation);		
			char letterKeyword = keyword.charAt(indexKeyWord);
			indexInvestigation++;
			
			if (letterInvestigation == letterKeyword){
				indexKeyWord++; 
			}
			
		}while((indexKeyWord != keyword.length())&&(indexInvestigation != investigation.length()));
		
		if (indexKeyWord == keyword.length()){
			result = keyword ;
		}
		
		return result;
	}
	
	public String sekendWord (String oneWord){
		String name = "";
		for (int i = 0; i<oneWord.length(); i++){
			char letter = oneWord.charAt(i);
			if (letter == ' '){
				for(int e = i+1;e<oneWord.length();e++ ){
				letter = oneWord.charAt(e);
				name += letter;
				}
				break;
			}
			 
		}
		return name;
	}
	public String fursWord (String oneWord){
		String name = "";
		for (int i = 0; i<oneWord.length(); i++){
			char letter = oneWord.charAt(i);
			if (letter == ' '){
				break;	
			}
			name += letter;
			}
			 
		}
		return name;
	}
	public static void arrylistPrint(ArrayList<String> arry ){
		for (int i = 0; i < arry.size(); i++) {
			System.out.println(arry.get(i) + " ");
		}
		System.out.println("");
	}
	public static ArrayList<String> unomely(ArrayList<String> arrys ){
		ArrayList<Integer> index = new ArrayList<Integer>();
		String exited = "exited";
		String entered = "entered";
		for(int i = 0; i<arrys.size()-1; i++){
			if (arrys.get(i).equals(arrys.get(i+1))){
				index.add(i+1);
			}
		}
		for(int i = 0; i <arrys.size(); i++){ 
			bolen 
			if (word(exited,arrys.get(i)).equals(exited)){
				for(int e= i-1;e==0;e--){
					if(fursWord(arrys.get(i))+""+entered == arrys.get(e)){
						
					}
				}
			}
		}
		for(int i = 0; i<index.size();i++){
			arrys.set(index.get(i), "(ANOMALY)");
		}
		return arrys;
	}
	
	
}