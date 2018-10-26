package enums;

	
		

		
	public enum LibraryLiquids {

		H20(0.998, 4.19, 0, 100, 2260), 
		WATER(0.998, 4.19, 0, 100, 2260),
		H2SO4(1.84, 1.38, 10, 336, 511),
		C6H6(0.879, 1.71, 6, 80, 396),
		CH3OH(0.791, 2.50, -98, 65, 1100);

		double density;
		double heatCapacity;
		double meltPoint;
		double boilPoint;
		double steamEntalpy;
	
		FluidTable(double d, double hc, double sp, double bp, double se) {
			density = d * 1E3;
			heatCapacity = hc * 1E3;
			meltPoint = sp;
			boilPoint = bp;
			steamEntalpy = se * 1E3;
		}

	}

		
		
		
	}