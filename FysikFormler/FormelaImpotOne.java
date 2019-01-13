import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class FormelaImpotOne extends JFrame implements ActionListener{
		private JPanel p = new JPanel();
		private JTextField t1 = new JTextField ("number");
		private JButton b1 = new JButton (); 
		private JButton b2 = new JButton ();
		private	JLabel l1 = new JLabel("svar");
		private	JLabel l2 = new JLabel();
		double send = 0;
			public FormelaImpotOne(double impot){
			double send = impot;
			p.setBackground(Color.white);
			p.setPreferredSize(new Dimension(150,100));
			setLayout(new FlowLayout());
			p.add(t1);p.add(b1);p.add(l1);p.add(l2);p.add(b2);
			b1.setBorderPainted(false);b1.addActionListener(this);
			b2.setBorderPainted(false);b2.addActionListener(this);
			t1.addActionListener(this);
			}
		 
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == b1){
			double nul = 0; 
			String strV0TextBox = t1.getText();
			double value = Double.parseDouble(strV0TextBox);
			System.out.print(PerformFormula.performFormula(send, value, nul));
		}
		else if (e.getSource() == b2){
			UserPage UP = new UserPage();
			
			setVisible(false);

			dispose();
			
		}



}
}