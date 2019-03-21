import java.util.ArrayList;
import java.util.Scanner;
public class Word{
	public static void main( String [] arg){
		//skpar en huved lista f�r att kunna flyta info mellan mitoderna 
		ArrayList<String> head = new ArrayList<>();
	//b�rjar med att ta in en lista och g�rom entry och exit till enterd och exided 
		//flytar ovandlad avendar info till head
		head = userImpot();
		//skickar in omvandling f�r att fels�ka f�r till baka rasultat sparas i head
		head = unomely(head);
		//skriver ut head
		arrylistPrint(head);
	}
	
	/**
	 * tar in anvendar inpot
	 * @return anvendar arry 
	 */
	public static ArrayList<String> userImpot(){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> userIm = new ArrayList<>();
		String namnIn = "";
		//System.out.println("how many times your employees go in and out.");
		int index = sc.nextInt();
		String tom = sc.nextLine();
			for(int i = 0; i<index;i++){ 
				//System.out.println("entry or exit"+" "+"name");
				//System.out.println("");
				namnIn = sc.nextLine();
				userIm.add(namnIn);
			}
			userIm = systemOut(userIm);
			return userIm;
			
			
	}
	/**
	 * g�r om tv� bestemda ord till tv� andra. det bestemer du i arryn 
	 * @param namn listan som �r inpot
	 * @return omvandlad arryn till de andra nyckeorden. 
	 */
	public static ArrayList<String> systemOut(ArrayList<String> namn){
		ArrayList<String> outpott = new ArrayList<>();
		String index = "entry";
		String namne= "";
		for (int i = 0; i<namn.size();i++){
			index = "entry";
			
			namne = sekendWord(namn.get(i));
			
			if(word(index,namn.get(i)).equals(index)){
				index = "entered";
			}
			else{
				index = "exited";
			}
			outpott.add(namne +" "+ index);
		}
		return outpott;
	}
	
	
	
	/**
	 * mitoden s�ker efter ett givet ord i en string som ges<br>
	 * mitoden �r sopps enerell s� den kommer kunnas apliceras f�r andra problem ocks�
	 * 
	 * @param keyword nykel ord som s�ker i investigation
	 * @param investigation �r stringen som man letar efeter nyckel ord
	 * @return som nykelordet hittas retuneras de. alt en tom string
	 */
	public static String word (String keyword, String investigation){
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
			//stpar loppen som n��got av orden n�r sin fulla l�ngd 
		}while((indexKeyWord != keyword.length())&&(indexInvestigation != investigation.length()));
		
		if (indexKeyWord == keyword.length()){
			result = keyword ;
		}
		
		return result;
	}
	
	/**
	 * s�ka upp det fursta ordet i en str�ng som har flera ord
	 * @param oneWord str�ng som har mellanslag
	 * @return fursta ordet i den uppdelade strengen 
	 */
	public static String sekendWord (String oneWord){
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
	/**
	 * s�ker efter andra ordet i en menig
	 * @param oneWord string med flra ord
	 * @return
	 */
	public static String fursWord (String oneWord){
		String name = "";
		for (int i = 0; i<oneWord.length(); i++){
			char letter = oneWord.charAt(i);
			if (letter == ' '){
				break;	
			}
			name += letter;
			}
			 
		
		return name;
	}
	/**
	 * skriver ut en arry
	 * @param arry arryn som ska skrivas ut
	 */
	public static void arrylistPrint(ArrayList<String> arry ){
		for (int i = 0; i < arry.size(); i++) {
			System.out.println(arry.get(i) + " ");
		}
		System.out.println("");
	}
	
	/**
	 *  ska s�ka efter fel i inmatnigen av arryn 
	 * @param arrys  arryn som ska fel s�kas
	 * @return
	 */
	 public static ArrayList<String> unomely(ArrayList<String> arrys ){
		 //till f�r att spara indexen som felaktigheterna �r p�. ifall jag beh�ver kolla sama stereng igen utan en anumely. 
		ArrayList<Integer> index = new ArrayList<Integer>();
		String exited = "exited";
		String entered = "entered";
		boolean animaly= true;;
		for(int i = 0; i <arrys.size(); i++){ 
			
			if (((i!=0)&&(word(entered,arrys.get(i)).equals(entered)))){
				
				int e = i-1;
				while(e!=-1){
					animaly = false;
					
					
					if(fursWord(arrys.get(i)).equals(fursWord(arrys.get(e)))){
						
						
						if(word(entered,arrys.get(e)).equals(entered)){
						animaly = true;
						
						}
						//f�r att den inte ska titta efter n�gon annan en det fursta med samma namn
						break;
					}
					e--;
				}
				if (animaly == true){
					index.add(i);
				}
			}
		}
		
		for(int i = 0; i <arrys.size(); i++){ 
			if ((i==0)&&(word(exited,arrys.get(i)).equals(exited))){
				//ifal det �r en exited i b�rjan �r det attomatiskt fel. tar h�nstyn till det i n�sta if. 
				index.add(i);
			}  
			if (((i!=0)&&(word(exited,arrys.get(i)).equals(exited)))){
				
				int e = i-1;
				//till f�r att titta p� tidigare ord inte de som �r framf�r 
				while(e!=-1){
					animaly = true;
					
					
					if(fursWord(arrys.get(i)).equals(fursWord(arrys.get(e)))){
						
						
						if(word(entered,arrys.get(e)).equals(entered)){
						animaly = false;
						
						}
						//f�r att den inte ska titta efter n�gon annan en det fursta med samma namn
						break;
					}
					e--;
				}
				if (animaly == true){
					index.add(i);
				}
			}
		}
		//l�gger till (ANOMALY) till felaktigheterna samma index som felaktigheterna varit p�
		for(int i = 0; i<index.size();i++){
			arrys.set(index.get(i),arrys.get(index.get(i))+ " (ANOMALY)");
		}
		return arrys;
	}
	
	
}