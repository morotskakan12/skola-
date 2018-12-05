
import static javax.swing.JOptionPane.*;

public class test {
	public static void main (String[]arg) {
		String adres;
		String telnr;
		String klass;
		adres = showInputDialog("vad är din adres");
		telnr = showInputDialog("vad är din nummer");
		klass = showInputDialog("vad är din klass");
		String helsinig = adres+telnr+klass;
		showMessageDialog(null,helsinig);
		}
}		