package chapter04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<>();
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("도우너");
		
		while(!q.isEmpty())
		{
			String s = q.poll();
			System.out.println(s);
		}
		
		// Queue는 비어있는 경우 null을 리턴한다.
		System.out.println(q.poll());
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("도우너");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());

	}
}
