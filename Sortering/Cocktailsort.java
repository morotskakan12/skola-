public class Cocktailsort{
	public static int cocktailsort(int [] randomNumbers){
		int counter =0;
		boolean swapped = true; 
        int start = 0; 
        int end = randomNumbers.length; 
  
        while (swapped == true) { 
            
            swapped = false; 
            for (int i = start; i < end - 1; ++i) { 
                if (randomNumbers[i] > randomNumbers[i + 1]) { 
                    int temp = randomNumbers[i]; 
                    randomNumbers[i] = randomNumbers[i + 1]; 
                    randomNumbers[i + 1] = temp; 
                    swapped = true; 
					counter++;

                } 
            }  
            if (swapped == false) {
				break; 
			}
            swapped = false; 
            end = end - 1; 
            for (int i = end - 1; i >= start; i--) { 
                if (randomNumbers[i] > randomNumbers[i + 1]) { 
                    int temp = randomNumbers[i]; 
                    randomNumbers[i] = randomNumbers[i + 1]; 
                    randomNumbers[i + 1] = temp; 
                    swapped = true; 
					counter++;
                } 
            } 
            start = start + 1;  
		}
	return counter;
	}
}