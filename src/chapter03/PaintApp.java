package chapter03;

public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		drawPoint(p);
		
		Point p2 = new Point(50, 100);
		drawPoint(p2);
		
		// 메소드 오버로딩 테스트
		p2.show();
		p2.show(false);
		p2.show(true);
		
		// 메소드 오버라이딩 테스트
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		((ColorPoint)p3).setColor("red"); // 캐스팅 순서 확인 필요
		drawPoint(p3);
		
		ColorPoint p4 = new ColorPoint();
		p4.setX(200);
		p4.setY(300);
		p4.setColor("red");
		drawPoint(p4);
		drawColorPoint(p4);
		
		p3.show(false);
		p3.show(true); //색이 나옴. Override 때문에
	}

	public static void drawPoint(Point point) {
		point.show();
	}
	
	public static void drawColorPoint(ColorPoint colorPoint) // 부모로 레퍼런싱 하면 필요없음(p3를 Point로 받음)
	{
		colorPoint.show();
	}
	
}
