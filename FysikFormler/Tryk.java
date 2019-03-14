import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

	public class Tryk  extends JPanel {
		private JLabel L1 = new JLabel("Select formula and enter the number in the box");
		private JLabel L2 = new JLabel("3. fluidPressure from floid and deep");
		private JLabel L3 = new JLabel("4. fluidPressure in whater from deep");
		private JLabel L4 = new JLabel("9. volume To Mass Watter from deep ");
		private JLabel L5 = new JLabel("10. volume To Mass Air from volume");
		private JLabel L6 = new JLabel("15. work from force and distance");
		private JLabel L7 = new JLabel("16.power from work and time");
		private JLabel L8 = new JLabel("20.velocity To Height");
	public Tryk(){
		this.setBackground(Color.white);

		
		
		this.setPreferredSize(new Dimension(100,150));
		this.add(L1);this.add(L2);this.add(L3);this.add(L4);this.add(L5);this.add(L6);this.add(L7);this.add(L8);
		
	}
	
	
	}