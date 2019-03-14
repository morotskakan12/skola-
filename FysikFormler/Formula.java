public class Formula {

		

		public static double fahrenheitToCelsius(double fahrenheit){//1

		

		double Celsius = (fahrenheit-32)*5/9;

		

		return Celsius;

		}

		public static double kelvinToCelsius(double kelvin){//2

			

			double Celsius = (kelvin-273.15);

			return Celsius;

		}

		public static double fluidPressure( double fluid, double deep){// inpot i pogramet välj en vätska.3

			double p = 0; // Pascals

			double d = fluid; // densitet

			double h = deep; //hjupet

			double g=Constants.TC.konstant ;

			p = (d*h*g);

			

			return p;	

		}

		public static double fluidPressureT(double deep){//4

			double p = 0; // Pascals

			double d = LibraryLiquds.WATER.density; // densitet

			double h = deep; //hjupet

			double g=Constants.TC.konstant ;

			p = (d*h*g);

			

			return p;	

		}

		public static double kineticEnergy( double mass, double velocity){//5

			

			double energy = ((mass* Math.pow(velocity,2))/2);

			return energy;

			

		}

		public static double potentialEnergy( double mass, double height){//6

			double g=Constants.TC.konstant ;

			double Energi =  mass*height*g;

			return Energi;

		}

		public static double fallSpeed( double height){//7

			double g=Constants.TC.konstant ;

			double Acseloreton = Math.sqrt(height*g*2);

			

			return Acseloreton;

			

		}

		public static double delta(double first, double last){//8

			double defrens = first-last;

			return defrens;

		}

		public static double volumeToMassW(double volume){//9 anvendare senar välj

			double mass = LibraryLiquds.WATER.density/volume;//anvendare senar får välja

			return mass;

		}

		public static double volumeToMassA( double volume){//10 anvendare senar välj

			double mass = LibraryGas.AIR.density*volume;

			return mass;

		}

		public static double volumeToMassI(double volume){//11 anvendare senar välj

			double mass= LibrarySolid.IRON.density*volume;

			return mass;

		}

		public static double svtVelocity(double distance, double time){//12

			double Velocity= distance/time;

			return Velocity;

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

		public static double heatI(double mass, double deltaT){//17

			double energe= LibrarySolid.IRON.heatCapacity*mass*deltaT;

			return energe;

		}

		public static double heatW(double volume, double deltaT){//18

			double energe= LibraryLiquds.WATER.heatCapacity*volume*deltaT;

			return energe;

		}

		public static double heatGas( double volume, double deltaT){//19

			double energe= LibraryGas.AIR.heatCapacity*volume*deltaT;

			return energe;

		}

		public static double velocityToHeight( double velocity){//20

			double time = velocity/Constants.TC.konstant;

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