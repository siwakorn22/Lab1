
public abstract class Shape {
	private String color;
	abstract public double getArea();
	public String toString(){
		color = "red";
		return "Color :"+color;
	}
}
