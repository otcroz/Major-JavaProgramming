package ex8_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream fout;
		byte b[] = {1,2,3,4,5,6};
		
		try {
			fout = new FileOutputStream("c:/Temp/test.out");
			fout.write(b);
			fout.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("저장할 수 없네요! 경로명을 확인하셔요!");
		} catch(IOException e){
			System.err.println("파일 입출력을 하면서 문제가 발생했어요!");
		}
		System.out.println("파일에 저장을 완료했습니다.");
	}
}
