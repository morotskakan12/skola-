import static javax.swing.JOptionPane.*;
	public class kordenatsystem {
		public static void main (String[] arg){
			int x = 0;  
			int y = 0;
			String indata;
			
			indata = showInputDialog("vad e ditt x");
			x = Integer.parseInt (indata);
			
			indata = showInputDialog("vad e ditt y");
			y=Integer.parseInt(indata);
			
		if (x>0&&y>0){
			showMessageDialog(null,"kvadrant 1");
		}
		else if (x<0&&y>0){
			showMessageDialog(null,"kvadrant 2");
		}
		else if (x<0&&y<0){
			showMessageDialog(null,"kvadrant 3");
		}
		else if (x>0&&y<0){
			showMessageDialog(null,"kvadrant 4");
		}
		else if (x==0||y==0){
				showMessageDialog(null,"error");
		}
	}
	}	
		
