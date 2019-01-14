import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class FormelaImpotOne extends JFrame implements ActionListener{
		private JTextField t1 = new JTextField ("number");
		private JButton b1 = new JButton ("ok"); 
		private JButton b2 = new JButton ("back");
		JLabel l1;
		private	JLabel l2 = new JLabel();
		double send = 0;
			public FormelaImpotOne(double impot){
				double send = impot;
				l1 = new JLabel ("svar");
				setSize(150,150);
				setLayout(new FlowLayout());
				add(t1);add(l1);add(b1);add(l2);add(b2);
				b1.setBorderPainted(false);b1.addActionListener(this);
				b2.setBorderPainted(false);b2.addActionListener(this);
				t1.addActionListener(this);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
		 
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == b1){
			double nul = 0; 
			String strV0TextBox = t1.getText();
			double value = Double.parseDouble(strV0TextBox);
			strV0TextBox = Double.toString(PerformFormula.performFormula(send, value, nul));
			System.out.print(Formula.fahrenheitToCelsius(value));
			this.l1.setText(strV0TextBox);
		}
		else if (e.getSource() == b2){
			UserPage UP = new UserPage();
			
			setVisible(false);

			dispose();
			
		}



}
}