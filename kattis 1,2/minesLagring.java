import static javax.swing.JOptionPane.*;
public class minesLagring {
	public static void main(String[] arg) {
		String s;
		int staticDataPerMonth = 100;
		int i = 0;
		int inDataUsedDataInMonth = 0;
		int inDataMonthsInPlan = 0;
		int dynamicDataToNextMonth = 0;
		int dynamicDataMaxDataInMonths = 0;
		int outDataDataToUseInNextMonth = 0;
		
		s = showInputDialog("Hur m�nga m�nder har du haft ditt abonnemang?");
		inDataMonthsInPlan = Integer.parseInt(s);
		
		dynamicDataMaxDataInMonths = staticDataPerMonth*inDataMonthsInPlan;
		
		while(i < inDataMonthsInPlan) {
			i++;
			s = showInputDialog ("Hur m�nga GB anv�nde du i m�nad " + i +"?");
			inDataUsedDataInMonth += Integer.parseInt(s);
			
		}
		
		outDataDataToUseInNextMonth = dynamicDataMaxDataInMonths - inDataUsedDataInMonth;
		outDataDataToUseInNextMonth = staticDataPerMonth + outDataDataToUseInNextMonth;
		showMessageDialog(null,"Du kan anv�nda " + outDataDataToUseInNextMonth + "GB i månad " + (i+1) +".");
	}
}
			
			