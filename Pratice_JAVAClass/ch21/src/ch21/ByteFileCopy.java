package ch21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileCopy {
	String srcFileName;
	String destFileName;

	public ByteFileCopy(String srcFileName, String destFileName) {
		this.srcFileName = srcFileName;
		this.destFileName = destFileName;
	}

	void copy() {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(srcFileName); // 읽어올 파일
			fos = new FileOutputStream(destFileName); // 복사하려는 목적지 파일

			int bData;
			while (true) {
				bData = fis.read(); // 파일을 읽어옴
				if (bData == -1)
					break;
				fos.write(bData); // 목적지 파일에 읽어온 파일을 씀
			}
			System.out.println("복사를 완료했습니다.");
		} catch (FileNotFoundException e) {
			System.err.print(e.getMessage());
			System.err.println(">>복사를 취소합니다");
		} catch (IOException e) {
			e.printStackTrace(); //에러 메시지의 발생 근원지를 찾아서 단계별로 에러 출력
		} finally {
			try {
				if (fos != null) fos.close();
				if (fis != null) fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		ByteFileCopy bcopy = new ByteFileCopy("c:/Temp/text1.txt","c:/Temp/text2.txt");
		bcopy.copy();
	}
}
