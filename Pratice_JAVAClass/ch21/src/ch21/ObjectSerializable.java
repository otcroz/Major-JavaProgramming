package ch21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializable {
	
	static void save() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("c:/Temp/text1.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new Circle(1,1,3)); //객체 데이터 작성
			oos.writeObject(new Circle(2,2,5));
			oos.writeObject(new String("안녕?!"));
			
			System.out.println("저장 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
				if(fos !=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	static void load() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			 fis = new FileInputStream("c:/Temp/text1.txt");
			 ois = new ObjectInputStream(fis);
			 
			 Circle c1 = (Circle)ois.readObject();
			 Circle c2 = (Circle)ois.readObject();
			 String s1 = (String)ois.readObject();
			 
			 c1.showInfo();
			 c2.showInfo();
			 System.out.println(s1);
			 
			 System.out.println("로드 완료!");
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ObjectSerializable file = new ObjectSerializable();
		file.save();
		file.load();
	}
}
