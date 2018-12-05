import static javax.swing.JOptionPane.*;
public class övnig2 {
	public static void main(string[] arg) {
		int staticDataPerMonth = 100;
		int i = 0;
		int inDataUsedDataInMonth = 0;
		int inDataMonthsInPlan = 0;
		int dynamicDataToNextMonth = 0;
		int dynamicDataMaxDataInMonths = 0;
		int outDataDataToUseInNextMonth = 0;
		
		inDataMonthsInPlan = showInputDialog("Hur många månder har du haft ditt abonnemang?");
		inDataMonthsInPlan = Integer.Parelnt(inDataMonthsInPlan);
		
		dynamicDataMaxDataInMonths = (staticDataPerMonth*inDataMonthsInPlan);
		
		while(i <= inDataMonthsInPlan) {
			inDataUsedDataInMonth = showInputDialog ("Hur många GB använde du i Månad ".i."?");
			inDataUsedDataInMonth += Integer.Parelnt(inDataUsedDataInMonth);
			i++;
		}
		
		outDataDataToUseInNextMonth = dynamicDataMaxDataInMonths - inDataUsedDataInMonth;
		
		JOptionPane.showmessgeDialog("Du kan använda ".outDataDataToUseInNextMonth." i nästa månad");
	}
			
			