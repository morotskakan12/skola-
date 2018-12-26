import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
public class LiqudTablePage extends JFrame implements ActionListener{


String[] columnNames = {"Name","heatCapacity","density"};
	String[][] data = {
		{"Name","heatCapacity","density","meltPoint","boilPoint","steamEntalpy"},
		{"WATER",Double.toString(LibraryLiquds.WATER.heatCapacity),Double.toString(LibraryLiquds.WATER.density),Double.toString(LibraryLiquds.WATER.meltPoint),Double.toString(LibraryLiquds.WATER.boilPoint),Double.toString(LibraryLiquds.WATER.steamEntalpy)},
		{"Sulfuric",Double.toString(LibraryLiquds.H2SO4.heatCapacity), Double.toString(LibraryLiquds.H2SO4.density),Double.toString(LibraryLiquds.H2SO4.meltPoint),Double.toString(LibraryLiquds.H2SO4.boilPoint),Double.toString(LibraryLiquds.H2SO4.steamEntalpy)},
		{"BenzeCH3OH",Double.toString(LibraryLiquds.C6H6.heatCapacity), Double.toString(LibraryLiquds.C6H6.density),Double.toString(LibraryLiquds.C6H6.meltPoint),Double.toString(LibraryLiquds.C6H6.boilPoint),Double.toString(LibraryLiquds.C6H6.steamEntalpy)},
		{"Methanol",Double.toString(LibraryLiquds.CH3OH.heatCapacity),Double.toString(LibraryLiquds.CH3OH.density),Double.toString(LibraryLiquds.CH3OH.meltPoint),Double.toString(LibraryLiquds.CH3OH.boilPoint),Double.toString(LibraryLiquds.CH3OH.steamEntalpy)}
		
	};
	
	
	private JButton back = new JButton ();
	private JTable table = new JTable(data, columnNames);
	private JPanel blank = new JPane ();
	public static void liqudTable(){
		add(table);add(blank);add(back);
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
},