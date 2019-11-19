package chapter01;

public class BookApp2 {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.title = "A";

		Book b2 = b1;
		b2.price = 1000;
		
		b1 = null;
		// b1.price = 2000;
		
		b2 = null;
		// b2.price = 2000;

	}

}
