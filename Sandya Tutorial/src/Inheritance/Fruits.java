package Inheritance;

public class Fruits {

	private String fruitName;
	private String fruitType;
	private String fruitColor;
	
	public Fruits() {
		System.out.println("From fruits constructor");
	}
	
	public Fruits(String a) {
		System.out.println("a is "+a);
	}
	
	public Fruits(String a,String b ) {
		System.out.println("a is "+a);
	}
	
	
	public String Method() {
		return "from fruit class";
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitType() {
		return fruitType;
	}
	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}
	public String getFruitColor() {
		return fruitColor;
	}
	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	
	
	
}
