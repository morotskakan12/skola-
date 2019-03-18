public class Word{
	
	public String word (String keyword, String investigation){
		String result = "";
		int indexInvestigation = 0 ; 	
		int indexKeyWord = 0 ;
		
		do {
			char letterInvestigation = investigation.charAt(indexInvestigation);		
			char letterKeyword = keyword.charAt(indexKeyWord);
			indexKeyWord++; 
			indexInvestigation++;
			if (letterInvestigation != letterKeyword){
				indexKeyWord= 0; 
			}
		}while(indexInvestigation != investigation.length());
		
		if (indexKeyWord == keyword.length()){
			result = keyword ;
		}
		
		return result;
	}
	
}