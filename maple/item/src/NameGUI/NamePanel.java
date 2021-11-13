package NameGUI;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class NamePanel extends Panel {
	BufferedImage img= null;
	TextField tf;
	public NamePanel() {
		
		setLayout(null);
		setSize(1200,800);
		Font font1= new Font("Cooper",Font.BOLD, 50);
	
		//************Panel*************
		
		JLabel name_lb=new JLabel("이름");
		name_lb.setBounds(300, 325, 120, 80);
		name_lb.setFont(font1);
		name_lb.setOpaque(true);
		add(name_lb);
		
		//**************Label************
		
		tf=new TextField();
		tf.setFont(font1);
		tf.setBounds(420,325,250,80);
		add(tf);
		
		//*******************TextField*******
		JButton bt= new JButton("확인");
		bt.setBounds(670, 325, 140, 80);
		bt.setFont(font1);
		add(bt);
		
		//****************JButton*************
		try {
			img =ImageIO.read(new File("./background.jpg"));
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "이미지 불로오기 실패");
			System.exit(0);
		}
		MyPanel p= new MyPanel();
		p.setSize(1200,800);
		add(p);
		
		//**********배경화면******************
	
	}
	
	class MyPanel extends JPanel{
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
}
