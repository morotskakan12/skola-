	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
public class  Tabel extends JFrame implements ActionListener{
		private JButton b1 = new JButton ("SolidTable");
		private	JButton b2 = new JButton ("LiqudTable");
		private JButton b3 = new JButton ("GasTable");
		private JButton b4 = new JButton ("Exit");
		private JPanel p3 = new JPanel();
		private JPanel p1 = new JPanel();
		private JPanel p2 = new JPanel();
		
		public Tabel(){
			p1.setBackground(Color.white);
			p2.setBackground(Color.white);
			p3.setBackground(Color.white);
			p1.setPreferredSize(new Dimension(350,20));
			p2.setPreferredSize(new Dimension(350,20));
			p3.setPreferredSize(new Dimension(350,20));
			setLayout(new FlowLayout());
			add(b1);add(p3);add(b2);add(p1);add(b3);add(p2);add(b4);
			b1.setBorderPainted(false);b1.addActionListener(this);
			b2.setBorderPainted(false);b2.addActionListener(this);
			b3.setBorderPainted(false);b3.addActionListener(this);
			b4.setBorderPainted(false);b4.addActionListener(this);
			setSize(350,250);
			setVisible(true);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}		
			public void actionPerformed (ActionEvent e){

			if (e.getSource() == b1){

				 SolidTablePage STP = new SolidTablePage();
				
				setVisible(false);

				dispose();}
			
			else if(e.getSource() == b2){

				LiqudTablePage LTP = new LiqudTablePage();
			
				setVisible(false);

				dispose();}
			
					
			else if(e.getSource() == b3){

				GasTablePage GTP = new GasTablePage();
			
				setVisible(false);

				dispose();}
			
			else if(e.getSource() == b4){
				
				VisaBild VB = new VisaBild();
				
				setVisible(false);

				dispose();
				}
			
			
		}
		}