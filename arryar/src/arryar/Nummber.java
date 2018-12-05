package arryar;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Nummber {

	static int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};


	// 100 namn
	static String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(amunt());
		System.out.println(tom());
		System.out.println(itNumber());
		System.out.println(Drusilla());
		System.out.println(equol());
		System.out.println(letterL());
		System.out.println(letterFive());
		howMenny();
		System.out.println(unik());
	}
	// 100 tal i intervallet [0-9]
	public static int amunt () {
		 int tims = numbers.length;
		
			int ansor = 0;
			for(int i = 0 ; i < tims; i++ ) {
				
				if (numbers[i] == 7) {
					ansor++;
				}
			}
			return ansor;
		 }

	public static int tom () {
		int ansor = 0;
		int tims = names.length;
		for(int i = 0 ; i < tims; i++ ) {
			if (names[i].equals("Tom")||names[i].equals("tom")) {
				ansor++;
		}
		
	}
			return ansor;
	}

	public static int itNumber() {
		// skapar variabler 
		int ansor =0;
		int tims = numbers.length;
		int conter = 0;
		int getMinValue = numbers.length;
		boolean what = false;
		// skaper arrey
		int [] index = new int [10];
		// tästa nummer mellan 1-9
			for(int i = 0 ; i < 10; i++ ) {
				conter = 0;
				//ser om nummer är lika.
				for(int e = 0; e<tims; e++) {
					if (numbers[e] == i) {
						conter++;
					}
				//lägger till antal
					index[i]=conter;
				}
			}
		// hitta det minsta värdet
		for(int i=0;i<10;i++ ) {
			if (numbers[i]< getMinValue&&numbers[i]!=0) {
			
				getMinValue = numbers[i];
			}
		}
		int i = 0;
			while(what== false) { 
				
					
				if (numbers[i]==getMinValue) {
				ansor = i;
				what = true;			
				}
			i = i+1;
			}
		return ansor;
		
		}
	public static int Drusilla() {
		int ansor = 0;
		int tims = names.length;
		for(int i = 0 ; i < tims; i++ ) {
			if (names[i].equals("Drusilla")){
				ansor= i;
			}
		}
		return ansor;
	}
	public static int equol() {
		int ansor = 0;
		int tims = numbers.length;
		for(int i = 0 ; i < tims; i++ ) {
			if(numbers[i]==2||numbers[i]==4||numbers[i]==6||numbers[i]==8) {
				ansor= ansor+ numbers[i];
				
			}
		}
		
		return ansor;
	}
	public static int letterL() {
		int ansor = 0;
		int tims = names.length;
		char oneLetter;
		for(int i = 0 ; i < tims; i++ ) { 
			oneLetter = names[i].charAt(0);
			
			if(oneLetter=='L') {
				ansor++;
			}
			
		}
		return ansor;
	}
	public static int letterFive() {
		 String str;
		 int ansor =0;
		 int tims = names.length;
		for(int i = 0 ; i < tims; i++ ) { 
			str = names[i];
			
				if (str.length() == 5) {
					ansor++;
				}
		}
		return ansor;
	}
	public static void howMenny () {
		int tims = numbers.length;
		int conter = 0;
		int [] indexx = new int [10];
		for(int i = 0 ; i < 10; i++ ) {
			conter = 0;
			for(int e = 1; e<tims; e++) {
				if (numbers[e] == i) {
					conter++;
				}
				indexx[i]=conter;
			}
		}
		for (int i = 0; i<10; i++) {
			System.out.println(indexx[i]+"of nr"+i);
		}
	}
	public static int unik() {
		int ansor = 0 ;
		int tims = names.length;
		String bas;
		for(int i = 0 ; i < tims; i++ ) {
			bas = names[i];
			for (int e = 0; e<tims; e++) {
				if (i!=e) {
					if(bas.equals(names[e])) {
						break;	
					}
					if(e==tims-1) {
						ansor++;
				}	
					}

				
			}
		}
		return ansor;
		}
		
		
	}


