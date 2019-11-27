package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {

		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("바탕화면.jpg");
			os = new FileOutputStream("바탕화면-복사.jpg");

			int data = -1;
			while((data = is.read()) != -1)
				os.write(data);
		
		} catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch(IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if(is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
