package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {

	// 프로그램 --> 외부매체(파일)
	// 출력
	
	// ObjectOutputStream :
	// => 객체단위를 파일에 출력하고자 할 때 필요한 보조스트림
	
	public void fileSave(String fileName) { // 파일 이름을 입력받아서 파일 생성하기
		
		Phone ph = new Phone("아이폰", "13pro", "apple", 5000000);
		
		// 1단계. 기반스트림 => FileOutputSteam
		// 2단계. 보조스트림 => ObjectOutputStream
		// 4단계. 자원반납 => close()
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			// 3단계. 객체데이터를 파일에 출력 => writeObject()
			oos.writeObject(ph);
			
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	// 객체를 파일로 출력했더니 이상한게 막 깨져서 Exception이 뜬다.
	// 파일을 출력!! 뭔가 괴상망측한 데이터가 나옴
	// 잘 담겼나 확인해보려면?? 다시 입력받아서 콘솔에 찍어보면 되지 않을까?
	
	// 프로그램 <-- 외부매체
	// 입력
	public void fileRead(String fileName) {
		
		// FileInputStream : 기반 스트림
		// ObjectInputStream : 객체 단위로 파일로부터 읽어올때 사용하는 보조스트림
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		// 1. 기반스트림 생성
		// 2. 보조스트림 생성
		// 3. 읽어오기 => readObject()
		// 4. 자원반납
		
		try {// 내가 뭔가 실행할 코드 애는 이제 예외가 발생할 수도 있고 안발생할 수도 있다.
			// 1. 기반스트림 생성
			fin = new FileInputStream(fileName);
			// 2. 보조스트림 생성
			ois = new ObjectInputStream(fin);
			
			// 3. 읽어오기 readObject()
			// 	역직렬화는 readObject()가 알아서 해줌
			
			// Object 클래스가 Phone클래스의 부모 클래스
			Phone ph = (Phone)ois.readObject(); // 다형성
			System.out.println(ph);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				
				// 4. 자원반납
				ois.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
