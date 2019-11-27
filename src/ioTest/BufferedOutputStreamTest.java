package ioTest;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

		public static void main(String[] args) {
			
			BufferedOutputStream bos = null;
			
			try {
				FileOutputStream fos = new FileOutputStream("test.txt");
				bos = new BufferedOutputStream(fos);
				
				for (int i = 'a' ; i <= 'z' ; i++)  // a:97 z:122
				{
					bos.write(i);
				}
			} catch (FileNotFoundException e) {
				System.out.println("파일이 없습니다.");
			} catch (IOException e) {    // IOException은 FileNotFoundException의 부모이다.
				System.out.println("error : " + e);
			} finally {
				if(bos != null)
					try {
						bos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
			
		
	}

}
