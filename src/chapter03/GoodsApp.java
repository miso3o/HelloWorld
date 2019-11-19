package chapter03;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setCountSold(50);
		camera.setCountStock(30);
		camera.setPrice(400000);
		camera.showInfo();
		
		//객체를 생성하는 데 사용한 클래스 정보를 얻어온다.(클래스 이름, 메소드정보, 필드정보): reflection
		//Class cls = camera.getClass();
		//System.out.println(cls.getName());
				
		//Goods camera = new Goods("nikon", 400000, 30, 50);
				
		int price = camera.getPrice();
		System.out.println(price);
		camera.showInfo();

		int dicountPrice = camera.calcDiscountPrice(0.5);
		System.out.println(dicountPrice);
		
//		Goods camera2 = new Goods();
//		Goods camera3 = new Goods();
//		Goods camera4 = new Goods();
		
		Goods.showCount();

	}

}
