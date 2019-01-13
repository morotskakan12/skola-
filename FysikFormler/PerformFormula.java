public class PerformFormula{
	public static double performFormula(Formula Formele,double impot, double ett, double två){
	
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