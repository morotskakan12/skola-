	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	public class VisaBild extends JFrame implements ActionListener {
		private JButton b1 = new JButton ("Liquids List");
		private JButton b2 = new JButton ("Soled List");
		private	JButton b3 = new JButton ("Gas List");
		private	JButton b4 = new JButton ("Formula");
		private JButton b5 = new JButton ("exit");
		private JPanel p5 = new JPanel();

		public VisaBild(){
			p5.setBackground(Color.white);
			p5.setPreferredSize(new Dimension(70,20));
			setLayout(new FlowLayout());
			add(b1);add(b2);add(b3);add(b4);add(b5);add(p5);
			b1.setBorderPainted(false);b1.addActionListener(this);
			b2.setBorderPainted(false);b2.addActionListener(this);
			b3.setBorderPainted(false);b3.addActionListener(this);
			b4.setBorderPainted(false);b4.addActionListener(this);
			b5.setBorderPainted(false);b5.addActionListener(this);
			setSize(350,250);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}		
		public void actionPreformed(ActionEvent e){
			if (e.getSource() == b1);
				
			else if(e.getSource() == b2);
				
			else if(e.getSource() == b3);
			
			else if(e.getSource() == b4);
			
			else if(e.getSource() == b5)
			;
		}
		
		
	}