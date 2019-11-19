package chapter02;

public class CarTest {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		
		// 자식객체는 부모 타입으로 참조할 수 있다.
		// 객체지향 확장을 이해하기 위해서는 이것이 자연스러워야 한다.
		Car c = new Bus();
		c.run();
		
		// 오류
		// Bus b = new Car();
		
		Bus bus2 = new Bus();
		bus2.run();
		bus2.info();
		
		Car c2 = new Bus();
		c2.run();
		((Bus)c2).info();

	}

}
