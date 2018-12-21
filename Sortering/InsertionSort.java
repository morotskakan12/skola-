public class InsertionSort {
	public static int insertionSort(int[] randomNumbers) {

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
}