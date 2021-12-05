package ch21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileCopy2 {
	String srcFileName;
	String destFileName;

	public ByteFileCopy2(String srcFileName, String destFileName) {
		this.destFileName = destFileName;
		this.srcFileName = srcFileName;
	}

	public void copy() {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(srcFileName);
			fos = new FileOutputStream(destFileName);

			int readLen = 0;
			byte[] buff = new byte[1024];
			while (true) {
				readLen = fis.read(buff);
				if (readLen == -1)
					break;
				fos.write(buff, 0, readLen);
			}
			System.out.println("복사를 완료하였습니다.");

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			System.err.println("복사가 진행되지 않았습니다.");
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			}
			catch (IOException e) {
				e.getStackTrace();
			} 
		}

	}
	
	public static void main(String[] args) {
		ByteFileCopy2 bCopy = new ByteFileCopy2("c:/Temp/text1.txt","c:/Temp/text2.txt");
		bCopy.copy();
	}
}
