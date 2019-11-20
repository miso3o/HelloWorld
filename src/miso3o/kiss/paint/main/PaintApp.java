package miso3o.kiss.paint.main;

import java.util.List;

import miso3o.kiss.paint.i.Drawable;
import miso3o.kiss.paint.point.ColorPoint;
import miso3o.kiss.paint.point.Point;
import miso3o.kiss.paint.shape.Rect;
import miso3o.kiss.paint.shape.Shape;
import miso3o.kiss.paint.shape.Triangle;
import miso3o.kiss.paint.text.GraphicText;

public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
//		drawPoint(p);
		draw(p);

		
		Point p2 = new Point(50, 100);
//		drawPoint(p2);
		draw(p2);

		
		// 1. 메소드 오버로딩 테스트
		p2.show();
		p2.show(false);
		p2.show(true);
		
		// 2. 메소드 오버라이딩 테스트
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		((ColorPoint)p3).setColor("red"); // 캐스팅 순서 확인 필요
//		drawPoint(p3);
		draw(p3);

		
		ColorPoint p4 = new ColorPoint();
		p4.setX(200);
		p4.setY(300);
		p4.setColor("red");
//		drawPoint(p4);
//		drawColorPoint(p4);
		draw(p4);
		
		p3.show(false);
		p3.show(true); //색이 나옴. Override 때문에
		
		// 3. 상속관게에서의 생성자 호출 테스트
		Point p5 = new ColorPoint(500, 1000, "yellow");
//		drawPoint(p5);
		draw(p5);
				
		// 4. Shape Test
//		drawTriangle(new Triangle());
//		drawRect(new Rect());
//		drawShape(new Triangle());
//		drawShape(new Rect());
		
		draw(new Triangle());
		draw(new Rect());
		draw(new GraphicText("Hello World"));

		// 5. instanceof 연산자
		//    상속관계에 있는 클래스들만 가능하다(부모거나 자식)
		Shape s = new Rect();   // 누구의 자식이냐!!!
		System.out.println(s instanceof Object);  // Object의 자식이냐?
		System.out.println(s instanceof Shape);  // Shape의 자식이냐?
		System.out.println(s instanceof Rect);  // Rect의 자식이냐?
		System.out.println(s instanceof Triangle);  // Triangle의 자식이냐?
		
		Rect r = new Rect();
		System.out.println(r instanceof Object);  // Object의 자식이냐?
		System.out.println(r instanceof Shape);  // Shape의 자식이냐?
		System.out.println(r instanceof Rect);  // Rect의 자식이냐?
		//System.out.println(r instanceof Triangle);  // Triangle의 자식이냐? 안됌
		
		// 인터페이스의 경우(구현관계)는 부모자식 상관없이 연산가능
		System.out.println(r instanceof Drawable); 
		//System.out.println(r instanceof String);  
		System.out.println(r instanceof List);  
	}
	
	
	
	////////////////////////////////////////////////////////////

	public static void draw(Drawable drawable)
	{
		drawable.draw();
	}
	
	
//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	
//	public static void drawColorPoint(ColorPoint colorPoint) // 부모로 레퍼런싱 하면 필요없음(p3를 Point로 받음)
//	{
//		colorPoint.show();
//	}
//		
//	public static void drawTriangle(Triangle triangle)
//	{
//		triangle.draw();
//	}
//	
//	public static void drawRect(Rect rect)
//	{
//		rect.draw();
//	}
//	
//	public static void drawShape(Shape shape)
//	{
//		shape.draw();
//	}
//	
	
}
