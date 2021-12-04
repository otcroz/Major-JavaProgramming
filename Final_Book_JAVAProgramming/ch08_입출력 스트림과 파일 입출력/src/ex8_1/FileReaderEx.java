package ex8_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;

		try {
			fin = new FileReader("c:/Temp/test.txt");
			int c = 0;
			while (true) {
				if(c == -1)
					break;
				c = fin.read();
				System.out.print((char)c);
			}
			fin.close();
		}catch(FileNotFoundException e) {
			System.out.println("경로명이 잘못되었다!");

		} catch (IOException e) {
			System.out.println("입출력 오류!");
		}
	}
}
