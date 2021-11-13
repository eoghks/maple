package pratcie;
import java.io.*;
import Item.Item;
import ItemGUI.ItemPanel;

import javax.swing.JOptionPane;
public class Write {
	public static void Write(String a, Item i, ItemPanel p) {
		
		File f= new File(a+".txt");
		try {
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			String str= ItemToString(i);
			System.out.println(str);
			bw.write(str);
			bw.close();
			fw.close();
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불로오기 실패");
			System.exit(0);
		}
		
	}
	

	public static String ItemToString(Item i) {
		String [] strarr= new String[5];
		strarr[0]=i.getName();
		strarr[1]=i.getEnchance();
		strarr[2]=i.getOption();
		strarr[3]=i.getPotential();
		strarr[4]=i.getEdPotential();
		
		String str =String.join("/", strarr);
		return str;
	}
}
