import java.util.Scanner;
public class MenuArrye{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // skapar en int array av storleken 20
        System.out.print("how meany numbers do you want");
		int input = sc.nextInt();
		int[] randomNumbers = new int[input];

        for (int i = 0; i < randomNumbers.length; i++) {

            // fyller arrayen med 20 slumpmässiga heltal mellan 0 och 20
            randomNumbers[i] = (int) (Math.random() * 20) + 1;
        }
		int impot=0;
			
		// skriver ut arrayen
        printIntArray(randomNumbers);
		switch (start(sc)) {
        // anroper bubblesort-metoden och skriver ut antal iterationer
        case 1: 
		impot = 0;
		System.out.println("It took " + BubbleSort.bubbleSort(randomNumbers) + " iterations to sort the int array using" +" bubbleSort algorithm.\n");
		System.out.println();
		printIntArray(randomNumbers);
		System.out.println();
		System.out.print("if you want to go back press 1 and enter");
		impot = sc.nextInt();
		if (impot == 1){
			start(sc);
		}
		else
		break;
		case 2:
		impot = 0;
		System.out.println("It took " + InsertionSort.insertionSort(randomNumbers) + " iterations to sort the int array using" +" insertionSort algorithm");
		printIntArray(randomNumbers);
		System.out.println();
		System.out.print("if you want to go back press 1 and enter");
		impot = sc.nextInt();
		if (impot == 1){
			start(sc);
		}
		else
		break;
		case 3:
		impot = 0;
		System.out.println("It took " + SelectionSort.selectionSort(randomNumbers) + " iterations to sort the int array using" +" selectionSort algorithm");
		System.out.println();
		printIntArray(randomNumbers);
		System.out.println();
		System.out.print("if you want to go back press 1. and enter");
		impot = sc.nextInt();
		if (impot == 1){
			start(sc);
		}
		else
		break;
		case 4:
		impot = 0;
		System.out.println("It took " + Cocktailsort.cocktailsort(randomNumbers) + " iterations to sort the int array using" +" cocktailsort algorithm");
		System.out.println();
		printIntArray(randomNumbers);
		System.out.println();
		System.out.print("if you want to go back press 1. enter ells and exit");
		impot = sc.nextInt();
		if (impot == 1){
			start(sc);
		}
		else
		break;
		}
        // skriver ut en sorterad array
        
    }
	public static int start (Scanner sc){
		System.out.print("what sorting method do you want to use");
			System.out.println("");
			System.out.print("BubbleSort prss Nr:1");
			System.out.println("");
			System.out.print("InsertionSort press Nr:2");
			System.out.println("");
			System.out.print("selectionSort prss Nr:3");
			System.out.println("");
			System.out.print("cocktailsort press Nr:4");
			System.out.println("");
			int which = sc.nextInt();
			return which;
			
	}
        
	public static void printIntArray(int []randomNumbers){
		for (int j : randomNumbers) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
    }
}