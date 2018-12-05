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
		
		s = showInputDialog("Hur många månder har du haft ditt abonnemang?");
		inDataMonthsInPlan = Integer.parseInt(s);
		
		dynamicDataMaxDataInMonths = staticDataPerMonth*inDataMonthsInPlan;
		
		while(i < inDataMonthsInPlan) {
			i++;
			s = showInputDialog ("Hur många GB använde du i månad " + i +"?");
			inDataUsedDataInMonth += Integer.parseInt(s);
			
		}
		
		outDataDataToUseInNextMonth = dynamicDataMaxDataInMonths - inDataUsedDataInMonth;
		outDataDataToUseInNextMonth = staticDataPerMonth + outDataDataToUseInNextMonth;
		showMessageDialog(null,"Du kan använda " + outDataDataToUseInNextMonth + "GB i månad " + (i+1) +".");
	}
}
			
			