package ItemGUI;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import Item.Item;
public class ItemPanel extends JPanel {
	
	BufferedImage img= null;
	JTextField name;
	JTextField Enchance;
	JTextField Option;
	JTextField Potential;
 	JTextField EdPotential;
	
	public ItemPanel(Item i) {
		setLayout(null);
		setSize(1200,800);
		
		name= new JTextField(i.getName());
		name.setOpaque(false);
		name.setEditable(false);
		
		Enchance = new JTextField(i.getEnchance());
		Enchance.setOpaque(false);
		Enchance.setEditable(false);
		
		Option = new JTextField(i.getOption());
		Option.setOpaque(false);
		Option.setEditable(false);
		
		Potential = new JTextField(i.getPotential());
		Potential.setOpaque(false);
		Potential.setEditable(false);;
		
		EdPotential= new JTextField(i.getEdPotential());
		EdPotential.setOpaque(false);
		EdPotential.setEditable(false);
		
		Font nFont= new Font("Cooper",Font.BOLD, 30);
		Font font1= new Font("Consolas",Font.PLAIN, 30);
		
		name.setHorizontalAlignment(SwingConstants.CENTER);
		Enchance.setHorizontalAlignment(SwingConstants.CENTER);
		Potential.setHorizontalAlignment(SwingConstants.CENTER);
		EdPotential.setHorizontalAlignment(SwingConstants.CENTER);
		Option.setHorizontalAlignment(SwingConstants.CENTER);
		
		name.setFont(nFont);
		Enchance.setFont(font1);
		Potential.setFont(font1);
		EdPotential.setFont(font1);
		Option.setFont(font1);
		
		Enchance.setForeground(Color.red);
		Option.setForeground(Color.green);
		Potential.setForeground(Color.DARK_GRAY);
		EdPotential.setForeground(Color.DARK_GRAY);
		
		name.setBounds(200,100,800,100);
		Enchance.setBounds(200,220,800,100);
		Option.setBounds(200,340,800,100);
		Potential.setBounds(200,460,800,100);
		EdPotential.setBounds(200,580,800,100);
		
		add(name);
		add(Enchance);
		add(Option);
		add(Potential);
		add(EdPotential);
		
		//********Label******************************************
		
		JButton back = new JButton("뒤로가기");
		back.setBounds(50,670,100,50);
		add(back);
		
		JButton save= new JButton("저장");
		save.setBounds(50,600,100,50);
		save.setEnabled(false);
		add(save);
		
		JButton revise = new JButton("수정");
		revise.setBounds(50,530,100,50);
		add(revise);
	
		ButtonAction.saveAction(save, revise, this, i);
		ButtonAction.reviseAction(save, revise, this);
	
		//*******Button*******************************************
		
		JButton end = new JButton("종료");
		end.setBounds(1050,670,100,50);
		add(end);
		ButtonAction.endAction(end);
		
		JButton	FileSave= new JButton("파일에 저장");
		FileSave.setBounds(1050,600,100,50);
		add(FileSave);
		
		
		//*********Button2*****************
		try {
			img =ImageIO.read(new File("./background.jpg"));
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "이미지 불로오기 실패");
			System.exit(0);
		}
		MyPanel p= new MyPanel();
		p.setSize(1200,800);
		add(p);
		
		//********배경화면*****************************************
		
	}
	
	class MyPanel extends JPanel{
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
	

}
