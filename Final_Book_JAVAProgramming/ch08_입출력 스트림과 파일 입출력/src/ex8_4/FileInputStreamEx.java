package ex8_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream fin;
		byte b[] = new byte[6];

		try {
			fin = new FileInputStream("c:/Temp/test.out");
			int n = 0, c = 0;
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}

			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]+" ");
			}
			fin.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾겠다요!");
		} catch(IOException e) {
			System.out.println("아 이거 입출력 뭔가가 잘못되었는덷 말이죠...");
		}
	}
}
