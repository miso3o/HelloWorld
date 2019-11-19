package chapter03;

public class Student extends Person {
	
	public void test()
	{
		name = "학생";  // public은 외부에서 접근 가능함(Person 클래스에 public으로 정의되어 있음)
		height = 160; // protected는 자식에서 접근 가능함
		age = 19; // default는 자식에서 접근 불가능(동일패키여서 됨)
	}
	
	
	
	// 자식생성자에서 부모생성자를 명시적으로 호출하지 않으면 
	// 컴파일러가 부모의 기본생성자를 *맨앞*에 넣어준다.
	
	public Student()
	{
		System.out.println("Student() 호출");
	}

}
