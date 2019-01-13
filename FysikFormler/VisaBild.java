	import java.awt.*;

	import java.awt.event.*;

	import javax.swing.*;

	public class  VisaBild extends JFrame implements ActionListener{
			
			
		private JButton b1 = new JButton (" List");

		private	JButton b2 = new JButton ("Formula");

		private JButton b3 = new JButton ("exit");

		private JPanel p5 = new JPanel();



		public VisaBild(){

		
			
			p5.setBackground(Color.white);

			p5.setPreferredSize(new Dimension(70,20));

			setLayout(new FlowLayout());

			add(b1);add(b2);add(b3);add(p5);

			b1.setBorderPainted(false);b1.addActionListener(this);

			b2.setBorderPainted(false);b2.addActionListener(this);

			b3.setBorderPainted(false);b3.addActionListener(this);
				
			pack();
			
			setSize(350,250);

			setVisible(true);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);

		}		

			public void actionPerformed (ActionEvent e){

			

			if (e.getSource() == b1){

				 UserPage U = new UserPage();

				 setVisible(false);

				dispose();

				}

			

			else if(e.getSource() == b2){
				
				Tabel t = new Tabel();
				
				setVisible(false);

				dispose();

				

			}

				

			else if(e.getSource() == b3){

			
				setVisible(false);

				dispose();

				

			}



		}

		

		

	}