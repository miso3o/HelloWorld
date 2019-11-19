package chapter03;

public class Goods {
	
	// 기본생성자
	public Goods() // 안써도 자동으로 생성됨
	{
		Goods.count += 1;
	}  
	
	private static int count;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;

		Goods.count += 1;
	}
	
	public static void showCount()
	{
		System.out.println(count);
	}
	
	public void test() {
		System.out.println(Goods.count);
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}	
	}
	
	public int getCountStock() {
		return countStock;
	}
	
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	// return 값이 있고 매개변수(parameter)가 없는 메소드
	public int getCountSold() {
		return countSold;
	}
	
	// return 값이 없고 매개변수(parameter)가 있는 메소드
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public int calcDiscountPrice(double discountRate) {
		int discountPrice = (int)(price * discountRate);
		return discountPrice;
	}
	
	// return 값과 매개변수(parameter)가 없는 메소드
	public void showInfo()
	{
		System.out.println("상품이름: “" + name 
		 				 + "”, 가격: " + price
		 				 + ", 재고개수: " + countStock
		 			     + ", 팔린개수: " + countSold
						 );
	}
	
	
}
