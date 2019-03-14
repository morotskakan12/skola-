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
	 

		// hur många jag var lopen körs innan den är klar
        int counter = 0;
			//skapar huvdes lopen för att tästa alla sifror.
            for (int i = 0; i < randomNumbers.length - 1; i++) {
			//sparar sifran som eventuelst ska byta plats
            int key = randomNumbers[i];  
			//skapar variabel för platsen bakom i;
            int j = i-1;  
			//skaper loppen för att gämföra och sätter stop för negativa tal
            while ( (j > -1) && ( randomNumbers [j] > key ) ) {  
                //flytar fram sifranom den går in i loppen
				randomNumbers [j+1] = randomNumbers [j];  
				//ändrar så att nästa vara så ska sifran bakom gämföras med ursprungliga värdre
                j--;
				//lägger till ett varv på varv räknan 
				conte++;
            }  
			//sätter ursprungliga värdet på rätt plats i arryan
            randomNumbers[i+1] = key;  
        }
		return randomNumbers;
			  
			  }
		
				   // håller koll på antalet iterationer
					
				}
			}
        // do-while loopen körs alltid minst en gång
        return counter; // returnerar antalet iterationer
		
	}
	 static void printIntArray(int[] randomNumbers) {
        for (int j :randomNumbers) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
    }
}