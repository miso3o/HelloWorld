package chapter01;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		////////// 무한루프, for문 사용 //////////   <- 잘 안씀
		int sum = 0;
		int i = 0;
		for(;;)
		{
			sum += i;
			if(sum >= 5000)
				break;
			i++;
		}
		System.out.println(sum);
		
	}

}
