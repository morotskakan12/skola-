import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class UserPage extends JFrame implements ActionListener{
	private JLabel l2 = new JLabel(new ImageIcon("bildtvo.jpg"));
	private JLabel l3 = new JLabel(new ImageIcon("bildtre.jpg"));
	private JScrollPane scroll = new JScrollPane();
	private JPanel p = new JPanel();
	private JTextField t1 = new JTextField();
	private JButton b1 = new JButton("Mekanik");
	private JButton b2 = new JButton("Tryk");
	private JButton b3 = new JButton("OKok");
	private JButton b4 = new JButton("Exit");
	private JButton b5 = new JButton("select");
	private JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p, scroll);
	
	public UserPage(){
		add(split);
		scroll.setMinimumSize(new Dimension(120,100));
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		t1.setSize(new Dimension(10, 5));
		p.add(b1);p.add(b2);p.add(b3); p.add(t1);p.add(b5);p.add(b4);
		b1.setBorderPainted(false);b1.addActionListener(this);
		b2.setBorderPainted(false);b2.addActionListener(this);
		b3.setBorderPainted(false);b3.addActionListener(this);
		b4.setBorderPainted(false);b4.addActionListener(this);
		b5.setBorderPainted(false);b5.addActionListener(this);
		t1.addActionListener(this);
		setSize(390,230);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed (ActionEvent e){
		if(e.getSource() == b1){
		Mekanik M =	new Mekanik();
		scroll.setViewportView(M);
		M.setVisible(true);
		
		}
		else if (e.getSource() == b2){
			Tryk T = new Tryk();
			scroll.setViewportView(T);
			T.setVisible(true);
		}
		else if (e.getSource() == b3){
			scroll.setViewportView(l3);
		}
		else if (e.getSource () == b5){
		
			String strV0TextBox = t1.getText();
			
			//double impot = Double.parseDouble(strV0TextBox);
			double impot = new Double(strV0TextBox);
			
			if (WhichFormal.whichFormal(impot)==0){
				
					
					FormelaImpotOne F = new FormelaImpotOne(impot);
				
					setVisible(false);

					dispose();
			}
			else if (WhichFormal.whichFormal(impot)==1){
					
					FormelaImpotTwo FIT = new FormelaImpotTwo(impot);
					
					setVisible(false);

					dispose();
			}
		
		}
		
		
		else if (e.getSource()==b4){
		VisaBild VB = new VisaBild();
		
		setVisible(false);

		dispose();
		}
	
	}




}