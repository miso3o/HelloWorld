package miso3o.kiss.paint.shape;

public class Triangle extends Shape {

	private int x1;
	private int x2;
	private int x3;
	private int y1;
	private int y2;
	private int y3;
	
//	private String fillColor;  Shape로 올림
//	private String lineColor;
	
	
	@Override
	public void draw()
	{
		System.out.println("삼각형을 그렸다.");
	}
	
}
