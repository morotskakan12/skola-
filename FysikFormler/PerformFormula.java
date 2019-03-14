public class PerformFormula{
	public static double performFormula(double impot, double ett, double två){
	
			double svar=0;

			if(impot == 1){

				svar = Formula.fahrenheitToCelsius(ett);
				
			} 

			else if(impot == 2 ){

				svar = Formula.kelvinToCelsius(ett);

			}

			else if (impot == 3){

				svar= Formula.fluidPressure(ett, två);

			}

			else if (impot== 4){

				svar= Formula.fluidPressureT(ett);

			}

			else if(impot == 5 ){

			svar =Formula.kineticEnergy(ett,två);

			}

			else if(impot == 6 ){

			svar =Formula.potentialEnergy(ett,två);

			}

			else if(impot == 7 ){

			svar =Formula.fallSpeed(ett);

			}

			else if(impot == 8 ){

			svar =Formula.delta(ett,två);

			}

			else if(impot == 9 ){

			svar =Formula.volumeToMassW(ett);

			}

			else if(impot == 10 ){

			svar =Formula.volumeToMassA(ett);

			}

			else if(impot == 11 ){

			svar =Formula.volumeToMassI(ett);

			}

			else if(impot == 12 ){

			svar =Formula.svtVelocity(ett,två);

			return svar;

			}

			else if(impot == 13 ){

			svar =Formula.svtDistance(ett,två);

			}

			else if(impot == 14 ){

			svar =Formula.svtTime(ett,två);

			}

			else if(impot == 15 ){

			svar =Formula.work(ett,två);

			}

			else if(impot == 16 ){

			svar =Formula.power(ett,två);

			}

			else if(impot == 17 ){

			svar =Formula.heatI(ett,två);

			}

			else if(impot == 18 ){

			svar =Formula.heatW(ett,två);

			}

			else if(impot == 19 ){

			svar =Formula.heatGas(ett,två);

			}

			else if(impot == 20 ){

			svar =Formula.velocityToHeight(ett);

			}

			return svar;

	}
	
}