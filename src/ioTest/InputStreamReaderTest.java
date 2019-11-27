package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		
		try {
			FileInputStream fos = new FileInputStream("ms949.txt");
			isr = new InputStreamReader(fos, "MS949");

			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {    // IOException은 FileNotFoundException의 부모이다.
			System.out.println("error : " + e);
		} finally {
			if(isr != null)
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
