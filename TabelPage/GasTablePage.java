	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
public class GasTablePage extends JFrame implements ActionListener{
	
	public static void main( String [] arg){
		GasTablePage t = new GasTablePage();
		
		t.gasTable();
		
	}
	String[] columnNames = {"Name","heatCapacity","density"};
	String[][] data = {
		{"Name","heatCapacity","density"},
		{"Air",Double.toString(LibraryGas.AIR.heatCapacity),Double.toString(LibraryGas.AIR.density)},
		{"OXYGEN",Double.toString(LibraryGas.OXYGEN.heatCapacity), Double.toString(LibraryGas.OXYGEN.density)},
		{"Nitrogen",Double.toString(LibraryGas.C6H6.heatCapacity), Double.toString(LibraryGas.C6H6.density)},
		{"Neon",Double.toString(LibraryGas.Ne.heatCapacity),Double.toString(LibraryGas.Ne.density)}
		
	};
	
	private JButton back = new JButton ();
	private JTable table = new JTable(data, columnNames);
	public static void gasTable(){
		add(table);add(back);
		back.setBorderPainted(false);back.addActionListener(this);
		setSize(350,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void actionPerformed (ActionEvent e){
	
		if (e.getSource() == back);
		VisaBild start = new VisaBild();
		setVisible(false);
		dispose();
		//System.exit();
	}
}