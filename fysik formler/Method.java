	//git add fil nammn.java
	//git commit -m"" komenter 15 st relevanta.
	// push när allt är klart.
	import java.util.Scanner;
	public class Method{
		
		public static void main( String [] arg){
			Scanner sc = new Scanner(System.in);
			Formula Formele = new Formula();
			
			System.out.println("fahrenheitToCelsius=1");
			System.out.println("kelvinToCelsius=2");
			System.out.println("fluidPressure=3");
			System.out.println("fluidPressureWatter =4");
			System.out.println("kineticEnergy=5");
			System.out.println("potentialEnergy=6");
			System.out.println("fallSpeed=7");
			System.out.println("delta=8");
			System.out.println("volumeToMassWatter =9");
			System.out.println("volumeToMassGas=10");
			System.out.println("volumeToMassSolid=11");
			System.out.println("svtVelocity=12");
			System.out.println("svtDistance=13");
			System.out.println("svtTime=14");
			System.out.println("work=15");
			System.out.println("power=16");
			System.out.println("heatSolid=17");
			System.out.println("heatLiqids=18");
			System.out.println("heatGas=19");
			System.out.println("velocityToHeight=20");
			int impot = sc.nextInt();
			double ett = 0;
			double två = 0;
			if((impot == 3)||(impot == 5)||(impot == 6)||(impot == 8)||(impot == 12)||(impot == 13)||(impot == 14)||(impot == 15)||(impot == 16)||(impot == 17)||(impot == 18)||(impot == 19)){
				ett = sc.nextDouble();
				 två = sc.nextDouble();
			
			}
			else 
				 ett = sc.nextDouble();
			
			System.out.println(What(Formele, impot, ett, två));
		
		}
	
		public static double What(Formula Formele,int impot, double ett, double två){
			double svar=0;
			if(impot == 1){
				svar = Formele.fahrenheitToCelsius(ett);
			} 
			else if(impot == 2 ){
				svar = Formele.kelvinToCelsius(ett);
			}
			else if (impot == 3){
				svar= Formele.fluidPressure(ett, två);
			}
			else if (impot== 4){
				svar= Formele.fluidPressureT(ett);
			}
			else if(impot == 5 ){
			svar =Formele.kineticEnergy(ett,två);
			}
			else if(impot == 6 ){
			svar =Formele.potentialEnergy(ett,två);
			}
			else if(impot == 7 ){
			svar =Formele.fallSpeed(ett);
			}
			else if(impot == 8 ){
			svar =Formele.delta(ett,två);
			}
			else if(impot == 9 ){
			svar =Formele.volumeToMassW(ett);
			}
			else if(impot == 10 ){
			svar =Formele.volumeToMassA(ett);
			}
			else if(impot == 11 ){
			svar =Formele.volumeToMassI(ett);
			}
			else if(impot == 12 ){
			svar =Formele.svtVelocity(ett,två);
			return svar;
			}
			else if(impot == 13 ){
			svar =Formele.svtDistance(ett,två);
			}
			else if(impot == 14 ){
			svar =Formele.svtTime(ett,två);
			}
			else if(impot == 15 ){
			svar =Formele.work(ett,två);
			}
			else if(impot == 16 ){
			svar =Formele.power(ett,två);
			}
			else if(impot == 17 ){
			svar =Formele.heatI(ett,två);
			}
			else if(impot == 18 ){
			svar =Formele.heatW(ett,två);
			}
			else if(impot == 19 ){
			svar =Formele.heatGas(ett,två);
			}
			else if(impot == 20 ){
			svar =Formele.velocityToHeight(ett);
			}
			return svar;
		}
	}