package chapter03;

public class ColorPoint extends Point {

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String color;
	
	@Override
	public void show()
	{
		System.out.println("점[" + getX() + ", " + getY() + ", color = " + color + "]");
	}
	
}
