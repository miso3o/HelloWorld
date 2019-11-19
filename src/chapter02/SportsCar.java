package chapter02;

public class SportsCar extends Car {
	@Override
	public void run() 
	{
		System.out.println("Run.(4륜구동)");
	}
	
	@Override
	public void park() {
		System.out.println("SportsCar:주차됨");
	}
}
