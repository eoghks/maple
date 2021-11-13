package ItemGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Item.Item;
public class ButtonAction {
	public static void saveAction(JButton save, JButton revise, ItemPanel p, Item i) {
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				revise.setEnabled(true);
				save.setEnabled(false);

				//**********Button***********************
				
				p.name.setEditable(false);
				p.Enchance.setEditable(false);
				p.EdPotential.setEditable(false);
				p.Option.setEditable(false);
				p.Potential.setEditable(false);
				
				
				
				//**********텍스트 필드 활성화****************
		}});

		
	}
	
	public static void reviseAction(JButton save, JButton revise, ItemPanel p) {
		revise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				revise.setEnabled(false);
				save.setEnabled(true);
				//********버튼**************************
				
				p.name.setEditable(true);
				p.Enchance.setEditable(true);
				p.EdPotential.setEditable(true);
				p.Option.setEditable(true);
				p.Potential.setEditable(true);
				
				
				//********텍스트필드 비활성화****************
				
		}});
	}
	
	public static void endAction(JButton end) {
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
	}
}
