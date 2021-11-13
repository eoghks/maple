package EquipmentGUI;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import Item.Item;
import ItemGUI.ButtonAction;
public class EquipmentGUI extends JPanel {
	
	BufferedImage img= null;
	
	public EquipmentGUI(/*Item[] i*/) {
		
		setLayout(null);
		setSize(1200,800);
		
		//**************************************
		try {
			img =ImageIO.read(new File("./background.jpg"));
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "이미지 불로오기 실패");
			System.exit(0);
		}
		MyPanel p= new MyPanel();
		p.setSize(1200,800);
		add(p);
		
		//********Background*****************
		
		JButton end = new JButton("종료");
		end.setBounds(1050,670,100,50);
		add(end);
		ButtonAction.endAction(end);
		
		
		JButton	FileSave= new JButton("파일에 저장");
		FileSave.setBounds(1050,600,100,50);
		add(FileSave);
		
		
	}
	
	class MyPanel extends JPanel{
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
	
}
