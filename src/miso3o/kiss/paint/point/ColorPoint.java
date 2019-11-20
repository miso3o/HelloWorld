package miso3o.kiss.paint.point;

public class ColorPoint extends Point {

	private String color;
	
	public ColorPoint() {}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color)
	{
		setX(x);
		setY(y);
		this.color = color;
	}
		
	@Override
	public void draw()
	{
		System.out.println("점[" + getX() + ", " + getY() + ", color = " + color + "]");
	}
	
}
