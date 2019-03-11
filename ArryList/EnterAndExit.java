import java.util.ArrayList;

public class EnterAndExit{
	public static void main( String [] arg){
		arrylistPrint(enterExit(EmpolyList));
		
	}
	public static ArrayList EnterAndExit(String [] NamnList, ){
		ArrayList<String> enterExit = new ArrayList<>();	
		boolean writ;
		for (int i= 0; i< 40; i++){
			boolean writ = false;
			int index = (int)(Math.random() * 19 + 0);
			for (int e = 0; i<enterExit.size; i++){
				if (NameList(index)==enterExit.get(i)){
					enterExit.add(NameList(index)+"exit");
					writ = true; 
					break;
				}
			}
			if (writ == false){
				enterExit.add(NameList(index)+"enter");
			}
		}
		return enterExit;
	}
	public static void arrylistPrint(ArrayList arry){
		for (int i = 0; i < arry.size(); i++) {
			System.out.println(arry.get(i) + " ");
		}
		System.out.println("");
	}
}