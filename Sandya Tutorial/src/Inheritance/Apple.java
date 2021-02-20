package Inheritance;

public class Apple extends Fruits {

	private boolean isSeasonal;
	private String taste;
	Fruits fruit;
	
	public Apple() {
		super();
		System.out.println("in apple constructor");
	}
	
	public Apple(String a,String b) {
		super();
	}
	
	public String Method() {
		return super.Method();
	}
	
	public boolean isSeasonal() {
		return isSeasonal;
	}
	public void setSeasonal(boolean isSeasonal) {
		this.isSeasonal = isSeasonal;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	
}
