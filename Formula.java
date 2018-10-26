
	public class Formula {
		
		public static double fahrenheitToCelsius(double fahrenheit){
		
		double Celsius = (fahrenheit-32)*5/9;
		
		return Celsius;
		}
		public static double kelvinToCelsius(double kelvin){
			
		double Celsius = (kelvin-273.15);
			return Celsius;
		}
		public static double fluidPressure(LibraryLiquids fluid, double deep){
			double p = 0; // Pascals
			double d = fluid.density; // densitet
			double h = deep; //hjupet
			double g = 9.82; // gravitation
			p = (d*h*g);
			
			return p;	
		}
		
	}
	