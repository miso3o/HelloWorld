package chapter03;

public class Person {
	
	public String name;
	protected int height;
	int age;
	private int weight;
	
	public Person()
	{
		System.out.println("Person() 호출");
	}

	public void info()
	{
		weight = 70;
	}

}
