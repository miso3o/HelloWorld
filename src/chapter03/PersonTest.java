package chapter03;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.name =""; // public은 외부에서 접근 가능함.
		p.height = 170; // 같은패키지 안에 있어서 가능함. Protected로 정의된 다른 패키지가 있을 경우 접근 불가
		p.age = 10; // default는 같은 패키지 안에 있으면 가능함. 다른 패키지에 있을 경우 접근 불가
		//p.weight = 50; // private는 내부에서만 가능하므로 안됨.
		
		
		Student s = new Student();
	}

}
