package chapter01;

public class BookApp {

	public static void main(String[] args) {
		
		////////// 바코드로 스캔해서 입력 //////////  
		String title1 = "A"; 
		int price = 1000;
		/////////////////////////////////////
		
		Book book = new Book();
		
		book.title = title1;
		book.price = price;
		
		
		Book[] bookArray = new Book[3];     // 배열로 선언하면 Book객체를 저장할 공간을 정의한 것임. Book이라는 객체가 3개 들어갈 공간의 참조값을 저장함.(3개의 Book이 저장되는것임)
		bookArray[0] = new Book();
		bookArray[0].title = title1;
		bookArray[0].price = price;
	}

}
