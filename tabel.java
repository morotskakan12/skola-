	import java.arw.*;
	import javax.swing.*;
	public class tabel extends JFframe {
		private JButton b1 =new JButton("1");
		private JButton b2=new JButton("2");
		private JButton b3=new JButton("3");
		private JButton b4=new JButton();
		private JLabel L5=new JLabel("hej");
		private JTextArea = new JTextArea("en arbetsyta");
		
		public tabel (){
			JTabbedPane tp = new JTabbedPane();
			add(tp);
			
			JPanel kort1 = new JPanel();
			tp.addTab("spel",kort1);
			kort1.setLayout(new GridLayout(2,2));
			kort1.add(b1);kort1.add(b2);kort1.add(b3);kort1.add(b4);
			
			Jpanel kort2 = new JPanel();
			tp.addTab ("arbete", kort2);
			
			JPanel kort3 = new JPanel();
			tp.addTab("blomma"null, kort3,);
			
			setSize(250,250);
			setVisible(true);
				setDefaultColseOperation(EXIT_ON_CLOSE)
			
		}

	}
	