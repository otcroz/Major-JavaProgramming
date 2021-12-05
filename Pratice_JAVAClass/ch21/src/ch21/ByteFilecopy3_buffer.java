package ch21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFilecopy3_buffer {
	
	String srcFileName;
	String destFileName;
	
	public ByteFilecopy3_buffer(String srcFileName, String destFileName){
		this.srcFileName = srcFileName;
		this.destFileName = destFileName;
	}
	
	public void copy() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(srcFileName);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(destFileName);
			bos = new BufferedOutputStream(fos);
			
			int bData = 0;
			while(true) {
				bData = bis.read();
				if(bData == -1) break;
				
				bos.write(bData);
			}
			System.out.println("복사를 완료하였습니다.");
			
			//bos.flush();
			
		} catch (FileNotFoundException e) {
			System.err.print(e.getMessage());
			System.out.println("복사를 취소하였습니다.");
		} catch (IOException e) {
			System.err.println(e.getStackTrace());
		} finally {
			try {
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
				
			} catch (IOException e) {
				System.err.println(e.getStackTrace());
			}
		}
	}
	
	public static void main(String[] args) {
		ByteFilecopy3_buffer bCopy = new ByteFilecopy3_buffer("c:/Temp/text1.txt", "c:/Temp/text2.txt");
		bCopy.copy();
	}
}
