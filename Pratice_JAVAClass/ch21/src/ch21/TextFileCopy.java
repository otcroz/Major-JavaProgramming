package ch21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
	
	String srcFileName;
	
	public TextFileCopy(String srcFileName){
		this.srcFileName = srcFileName;
	}
	
	public void read() { //읽기
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(srcFileName);
			br = new BufferedReader(fr);
			
			String msg;
			
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void write() { //쓰기
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(srcFileName);
			bw = new BufferedWriter(fw);
			
			String str1 = "BufferedWriter 테스트입니다.";
			
			bw.write(str1);
			bw.newLine();
			
			bw.write("안녕하세요" + System.getProperty("line.seperator"));
			
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("오류 발생!");
		} finally {
			try {
				if(bw !=null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TextFileCopy t = new TextFileCopy("c:/Temp/text1.txt");
		t.write(); //파일에 작성
		t.read(); //파일 읽기
	}
	
}
