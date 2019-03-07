import java.util.ArrayList;
public class ArryListMaine {
	
	
	public static void main( String [] arg){
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("hoppa");
		nameList.add("pålaken");
		nameList.add("hoppsan");
		arrylistPrint(nameList);
		nameList.add(1, "Anna"); 
		arrylistPrint(nameList);
		nameList.set(2, "Britta"); 
		arrylistPrint(nameList);
		nameList.remove(0); 
		arrylistPrint(nameList);
		nameList.remove("Britta"); 
		arrylistPrint(nameList);
	}
	public static void arrylistPrint(ArrayList arry){
		for (int i = 0; i < arry.size(); i++) {
			System.out.println(arry.get(i) + " ");
		
		
		}
		System.out.println("");
	}
}