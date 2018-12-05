	import java.awt.*;
	import javax.swing.*;
	public class ImpotTo extends JFrame {
		JTextField t1;
		JTextField t2;
		JPanel p5;
			public ImpotTo (String ett, String två) {
			
				t1 = new JTextField(ett);
				t2 = new JTextField(två);
				add(t1, BorderLayout.NORTH);add(p5);add(t2, BorderLayout.SOUTH);
				pack();
				setSize(250,250);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
	}