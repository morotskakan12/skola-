public class InsertionSort {

    public static void main(String[] args) {

        // skapar en int array av storleken 20
        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {

            // fyller arrayen med 20 slumpmässiga heltal mellan 0 och 20
            randomNumbers[i] = (int) (Math.random() * 20) + 1;
        }

        // skriver ut arrayen
        printIntArray(randomNumbers);

        // anroper bubblesort-metoden och skriver ut antal iterationer
        System.out.println("It took " + insertionSort(randomNumbers) + " iterations to sort the int array using" +" bubble sort algorithm.\n");

        // skriver ut en sorterad array
        printIntArray(randomNumbers);
    }
	
	static int insertionSort(int[] randomNumbers) {

        // initierar nödvändiga variabler
       
        int counter = 0;
		//skapar lopp som bestemer index för gämförande sifra
        for(int i =0; i<randomNumbers.length -1; i++){
			//skaper variabler som ska kolla sifran efter index
			int j=i-1;
			//gämförande mellan sifrona
			if (randomNumbers[i] > randomNumbers[i+1]) {
					//byter plats på siforna 
					int temp = randomNumbers[i+1];
					randomNumbers[i+1] = randomNumbers[i];
					randomNumbers[i] = temp;
					//skapar index plats för sifran som flytas 
					int k = i;
					//räkna ett gämförande 
					counter++;
					//skaper lopp som ska gämföra med sifran som är bakom index
					while(j>-1){
						//gör gämföraande mellan index och sifran bakom 
						if(randomNumbers[j]>randomNumbers[k]){
							//byt plats för siforna 
							temp = randomNumbers[j];
							randomNumbers[j] = randomNumbers[k];
							randomNumbers[k] = temp;
							//uppdatera index
							k=j;
							j--;
							//räkna ett gämförande
							counter++;
							
						}
						//bryt om gämföraande inte ger posetivt ut fall
						else{
							break;
						}
					}
			}
			
		}
		System.out.println("counter: " + counter);
		return counter; // returnerar antalet iterationer
	}
    

        

        
		
	
	 static void printIntArray(int[] randomNumbers) {

        for (int j :
                randomNumbers) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
    }
}