package Inheritance;

public class Mango extends Apple{
	
	private String mangoName;
	private String mangoColor;
	
	public Mango() {
		super();
		System.out.println("in mango");
	}
	
	public String Method() {
		return super.Method();
	}
	
	public String getMangoName() {
		return mangoName;
	}
	public void setMangoName(String mangoName) {
		this.mangoName = mangoName;
	}
	public String getMangoColor() {
		return mangoColor;
	}
	public void setMangoColor(String mangoColor) {
		this.mangoColor = mangoColor;
	}
	
	

}
