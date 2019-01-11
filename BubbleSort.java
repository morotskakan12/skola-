public class BubbleSort {
    public static int bubbleSort(int[] randomNumbers) {

        // initierar nödvändiga variabler
        boolean swapped = true;
        int counter = 0;

        // loopen körs tills hela arrayen kollas igenom utan att några tal byter plats med varandra
        do {

            swapped = false;

            //loopar igenom hela arrayen 1 gång
            for (int i = 0; i < randomNumbers.length - 1; i++) {

                // jämför två tal bredvid varandra och byter plats på dem om det högra talet är större än det vänstra
                if (randomNumbers[i] > randomNumbers[i + 1]) {
                    int temp = randomNumbers[i + 1];
                    randomNumbers[i + 1] = randomNumbers[i];
                    randomNumbers[i] = temp;
                    swapped = true; // har åtminstone ett byte skett under körningen så ändras swapped värde till true
                }
                // håller koll på antalet iterationer
                counter++;
            }

        } while (swapped); // do-while loopen körs alltid minst en gång

        return counter; // returnerar antalet iterationer
    }

}
