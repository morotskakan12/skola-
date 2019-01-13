public enum Constants {

		GRAV(Math.pow(10,-11)*6.67408),// Gravitationskonstanten.

		GAS(8.3144621),// Almänna gaskonstanten.

		ARE(1000),// lufttrycket vid havsytan.

		LIGT(299792458),//Ljusets hastighet i vakum.

		TC(9.82);// Tyngdaccelerationen för Sverige.

		double konstant;

		/*double R;

		double p_0;

		double c;

		double g_swe;*/

		Constants(double kon){

			konstant = kon;

			

		}
}