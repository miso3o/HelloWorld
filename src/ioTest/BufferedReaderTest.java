package ioTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			
			// 기반스트림
			FileReader fr = new FileReader("./src/ioTest/BufferedReaderTest.java");
			
			// 보조스트림
			br = new BufferedReader(fr);
			
			String line = null;
			int index = 0;
			while((line = br.readLine()) != null) {
				System.out.print(++index + "\t");
				System.out.println(line);
			}
					
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		
		
		
	}

}
