
public class NummberFormela{
	// veljer ett slumpenäsigt nummer 
	public static int numberStart(int index){
		int hidNumber = (int)(Math.random() * index + 1);
		return hidNumber;
	}
}