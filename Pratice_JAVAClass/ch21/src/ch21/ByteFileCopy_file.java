package ch21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileCopy_file {
	String srcFileName = null;

	public ByteFileCopy_file(String srcFileName) {
		this.srcFileName = srcFileName;
	}

	public void bufferedLoad() { // 읽어옴
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(srcFileName);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			int n = dis.readInt();
			double pi = dis.readDouble();
			
			System.out.println("> " + n);
			System.out.println("> " + pi);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				if (dis != null)
					dis.close();
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.getStackTrace();
			}
		}
	} 

	public void bufferedSave() { // 저장함
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream(srcFileName);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);

			dos.writeInt(123);
			dos.writeDouble(3.14);

			dos.flush();

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());

		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.getStackTrace();
			}

		}
	}
	
	public static void main(String[] args) {
		ByteFileCopy_file bFile = new ByteFileCopy_file("c:/Temp/text1.txt");
		bFile.bufferedSave();
		bFile.bufferedLoad();
	}
}
