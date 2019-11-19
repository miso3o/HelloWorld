package chapter03;

public class VIPCustomer extends Customer {

	public void set()
	{
		// 부모의 public은 자식에서 접근 가능
		job = "student";
		
		// 부모의 protected는 자식에서 접근 가능
		address = "서울시";
		
		// default는 동일 패키지에서 접근 가능 
		// 이 클래스를 패키지 chapter03에서 이동하면 오류남. 
		age = 19;
		
		//부모의 private는 자식에서 접근할 수 없다.
//		name = "미소";  
	}
}
