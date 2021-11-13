package Item;

public class Item {
	String name="";//이름
	String enchance="";//강화
	String option="";//추옵
	String potential="";
	String edPotential="";
	
	public Item(String a, String b, String c, String d,String e){
		name=a;
		enchance=b;
		option =c;
		potential=d;
		edPotential=e;
	}
	
	public String getOption() {
		return option;
	}
	
	public void setOption(String n) {
		option=n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public String getEnchance() {
		return enchance;
	}
	
	public void setEnchance(String n) {
		enchance=n;
	}
	
	public String getPotential() {
		return potential;
	}
	
	public void setPotential(String n) {
		potential=n;
	}
	
	public String getEdPotential() {
		return edPotential;
	}
	
	public void setEdPotential(String n) {
		edPotential=n;
	}
}
