

public enum LibrarySolid {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	Guld(19.3, 0.13, 1064, 66),
	Koppar(8.96, 0.39, 1085, 205),
	Silver(10.5, 0.24, 962, 105),
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	LibrarySolid(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}

	
}
