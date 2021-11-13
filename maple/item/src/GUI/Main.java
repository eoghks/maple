package GUI;

import javax.swing.JFrame;

import EquipmentGUI.EquipmentGUI;
import Item.Item;
import ItemGUI.ItemPanel;
import NameGUI.NamePanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame();
		f.setSize(1200,800);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		Item i= new Item("a","a","c","d","e");
		ItemPanel p= new ItemPanel(i);
		//NamePanel p= new NamePanel();
		//EquipmentGUI p= new EquipmentGUI();
		f.add(p);
		f.setVisible(true);
		
	}

}
