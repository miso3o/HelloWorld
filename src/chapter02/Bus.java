package chapter02;

public class Bus extends Car{

	void info() 
	{
		System.out.println("안내방송");
	}
	
	@Override
	public void park() {
		System.out.println("Bus:주차됨");
	}
}
