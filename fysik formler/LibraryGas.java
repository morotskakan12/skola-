
		public enum LibraryGas{

			AIR(1.29, 1.01), 
			O2(1.43, 0.92), 
			OXYGEN(1.43, 0.92),
			N2(1.25, 1.03),
			Ne(0.90, 1.03);		


			double density;
			double heatCapacity;

			LibraryGas(double d, double hc) {
				density = d;
				heatCapacity = hc * 1E3; // 1E3 = 1*10^3
			}

		}
	