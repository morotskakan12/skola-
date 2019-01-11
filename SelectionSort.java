public class SelectionSort{
	public static int selectionSort(int [] randomNumbers){
		int counter =0;
		boolean swapped;
		
		for (int i = 0; i < randomNumbers.length - 1; i++) {  
            int index = i;  
            for (int j = i + 1; j < randomNumbers.length; j++){  
                if (randomNumbers[j] < randomNumbers[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = randomNumbers[index];   
            randomNumbers[index] = randomNumbers[i];  
            randomNumbers[i] = smallerNumber;  
			   // håller koll på antalet iterationer
			counter++;
			
			}  
    
				
             
            
     
		return counter;

	}
	
}
	
