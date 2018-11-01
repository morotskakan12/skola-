
	public class Formula {
		
		public static double fahrenheitToCelsius(double fahrenheit){//1
		
		double Celsius = (fahrenheit-32)*5/9;
		
		return Celsius;
		}
		public static double kelvinToCelsius(double kelvin){//2
			
			double Celsius = (kelvin-273.15);
			return Celsius;
		}
		public static double fluidPressure(Constants gravety, double fluid, double deep){// inpot i pogramet välj en vätska.3
			double p = 0; // Pascals
			double d = fluid; // densitet
			double h = deep; //hjupet
			double g=gravety.TC.konstant ;
			p = (d*h*g);
			
			return p;	
		}
		public static double fluidPressure(Constants gravety, LibraryLiquids fluid, double deep){//4
			double p = 0; // Pascals
			double d = fluid.WATER.density; // densitet
			double h = deep; //hjupet
			double g=gravety.TC.konstant ;
			p = (d*h*g);
			
			return p;	
		}
		public static double kineticEnergy( double mass, double velocity){//5
			
			double energy = ((mass* Math.pow(velocity,2))/2);
			return energy;
			
		}
		public static double potentialEnergy(Constants gravety, double mass, double height){//6
			double g=gravety.TC.konstant ;
			double Energi =  mass*height*g;
			return Energi;
		}
		public static double fallSpeed(Constants gravety, double height){//7
			double g=gravety.TC.konstant ;
			double time = Math.sqrt(height*g*2);
			double Acseloreton = (time*g);
			return Acseloreton;
			
		}
		public static double delta(double first, double last){//8
			double defrens = first-last;
			return defrens;
		}
		public static double volumeToMass(LibraryLiquids fluid, double volume){//9 anvendare senar välj
			double mass = fluid.WATER.density/volume;//anvendare senar får välja
			return mass;
		}
		public static double volumeToMass(LibraryGas gas, double volume){//10 anvendare senar välj
			double mass = gas.AIR.density*volume;
			return mass;
		}
		public static double volumeToMass(LibrarySolid solid, double volume){//11 anvendare senar välj
			double mass= solid.IRON.density*volume;
			return mass;
		}
		public static double svtVelocity(double distance, double time){//12
			double Speed= distance/time;
			return Speed;
		}
		public static double svtDistance(double velocity, double time){//13
			double distance = velocity*time;
			return distance;
		}
		public static double svtTime(double distance, double velocity){//14
			double time = distance/velocity;
			return time;
		}
		public static double work(double force, double distance){//15
			double work = force*distance;
			return work;
		}
		public static double power(double work, double time){//16
			double powoer = work/time;
			return powoer;
		}
		public static double heat(LibrarySolid solid, double mass, double deltaT){//17
			double energe= solid.IRON.heatCapacity*mass*deltaT;
			return energe;
		}
		public static double heat(LibraryLiquids fluld, double volume, double deltaT){//18
			double energe= fluld.WATER.heatCapacity*volume*deltaT;
			return energe;
		}
		public static double heat(LibraryGas gas, double volume, double deltaT){//19
			double energe= gas.AIR.heatCapacity*volume*deltaT;
			return energe;
		}
		public static double velocityToHeight(Constants gravety, double velocity){//20
			double time = velocity/gravety.TC.konstant;
			double ansor = velocity*time;
			return ansor;
		}
		/*egna formler.
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}
		public static{
			return;
		}*/
	
	}
	