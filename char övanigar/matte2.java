
import java.util.Scanner;

public class matte2 {
	
	public static void main (String[] arg) {
	
	Scanner input = new Scanner(System.in);
		System.out.print("Skriv radie: ");
		String radius = input.nextLine();
		
	System.out.print(volume());
}
	
	
	public static double volume(double radius){
		
		radius = (4*(Math.pow(radius,3))*Math.PI)/3;
		return radius;
		
}
	

	
}
	
	

