	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
public class SolidTablePage extends JFrame implements ActionListener{
	
	
	
	String[] columnNames = {"Solid Name", "Density", "Heat Capacity", "Melt Point", "Melt Entalpy"};
	String[][] data = {
		{"Solid Name", "Density", "Heat Capacity", "Melt Point", "Melt Entalpy"},
		{"Ice", Double.toString(LibrarySolid.ICE.density), Double.toString(LibrarySolid.ICE.heatCapacity),Double.toString(LibrarySolid.ICE.meltPoint),Double.toString(LibrarySolid.ICE.meltEntalpy)},
		{"Iron",Double.toString(LibrarySolid.IRON.density),Double.toString(LibrarySolid.IRON.heatCapacity),Double.toString(LibrarySolid.IRON.meltPoint),Double.toString(LibrarySolid.IRON.meltEntalpy)},
		{"Guld",Double.toString(LibrarySolid.Guld.density),Double.toString(LibrarySolid.Guld.heatCapacity),Double.toString(LibrarySolid.Guld.meltPoint),Double.toString(LibrarySolid.Guld.meltEntalpy)},
		{"Koppar",Double.toString(LibrarySolid.Koppar.density),Double.toString(LibrarySolid.Koppar.heatCapacity),Double.toString(LibrarySolid.Koppar.meltPoint),Double.toString(LibrarySolid.Koppar.meltEntalpy)},
		{"Silver",Double.toString(LibrarySolid.Silver.density),Double.toString(LibrarySolid.Silver.heatCapacity),Double.toString(LibrarySolid.Silver.meltPoint),Double.toString(LibrarySolid.Silver.meltEntalpy)}
	};
	
	private JTable table = new JTable(data, columnNames);
	private JButton back = new JButton("back");
	
	public SolidTablePage(){
		setLayout(new FlowLayout());
		add(table);add(back);
		setSize(550,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public void actionPerformed (ActionEvent e){
	
		if (e.getSource() == back);
		VisaBild start = new VisaBild();
		setVisible(false);
		dispose();
	}
	
}