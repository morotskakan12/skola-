import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

	public class Mekanik  extends JPanel {
		private JLabel L1 = new JLabel("Select formula and enter the number in the box");
		private JLabel L2 = new JLabel("5. PotentialEnergy from mass and velocity"); 
		private JLabel L3 = new JLabel("6. KineticEnergy from mass and velocity");
		private JLabel L4 = new JLabel("7. FallSpeed from higt");
		private JLabel L5 = new JLabel("12. Velocity from distance and time");
		private JLabel L6 = new JLabel("13. Distance from velocity and time");
		private JLabel L7 = new JLabel("14. Pime from distance and velocity");
		private JLabel L8 = new JLabel("15. Pork from force and distance");
		private JLabel L9 = new JLabel("16. Power from work and time"); 
		private JLabel L10 = new JLabel("20. Velocity To Height");
	public Mekanik(){
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(100,150));
		this.add(L1);this.add(L2);this.add(L3);this.add(L4);this.add(L5);this.add(L6);this.add(L7);this.add(L8);this.add(L9);this.add(L10);
		
	}
	
	
	}