package com.kh.chap_01file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 간단하게 파일을 만드는 과정
		// File 클래스를 가지고 작업
		// java.io 패키지에 존재
		
		// 파일 클래스 객체 생성
		// 1. 별도의 경로지정을 하지 않고
		// 파일명만 제시해서 생성 =>
		// 현재 이 포르젝트 폴더 내의 파일이 생성됌
		
		File file1 = new File("test.txt"); // File 객체 생성 
		try {
			file1.createNewFile();
			// createNewFile() : 파일을 생성해주는 메서드

			// 2. 경로지정을 한 파일명을 제시해서 만들고 싶다
			// => 실제 존재하는 경로를 제시해야함
			// C:\aa 여기다 만들고 싶음!
			File file2 = new File("C:\\aa\\test.txt");
			// file2 객체 생성
			file2.createNewFile(); // 경로에 파일 생성
			
			// 3. 폴더 생성하고 안에 파일도 생성
			
			File forder = new File("bbb");
			forder.mkdir();
			// mkdir() : 폴더를 생성해주는 메서드
			
			File file3 = new File("bbb\\test.txt");
			file3.createNewFile();
			
			// 4. 경로 지정 후 폴더 생성 후 파일 생성
			// C:\Users\SON\Desktop\\text\\test.txt
			File forder2 = new File("C:\\Users\\SON\\Desktop\\text");
			forder2.mkdir();
			File file4 = new File("C:\\Users\\SON\\Desktop\\text\\test.txt");
			file4.createNewFile();
			
			// File 클래스에서 제공하는 메서드들
			System.out.println("파일이세요 ? " + file4.isFile());
			// 파일이면 true / 폴더면 false를 반환
			System.out.println("폴더이세요 ? "+ forder2.isFile());
			// forder2는 폴더니깐 false
			
			System.out.println("파일 이름 : " + file4.getName()); // 파일명 추출
			
			System.out.println("상위폴더 : " + file4.getParent()); // 상위폴더명 추출
			
			System.out.println("파일용량 : " + file4.length()); // 파일 크기
			
			System.out.println("절대 경로 : "+ file4.getAbsolutePath()); // 절대 경로
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 입출력의 정의 :
	 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, "파일")로 출력하거나
	 * 입력장치(키보드, 마우스, 마이크, "파일")로 입력받는 과정
	 * => IO(Input & Output, 입출력)
	 * 
	 * 그런데! IO가 되는 원리는 무엇일까??
	 * IO를 진행하고 싶다면
	 * 우선적으로 "반드시" 프로그램과 외부매체와의 "톨로"를 만들어야한다.
	 * "통로" => "스트림"(Stream)
	 * 
	 * 스트림의 특징
	 * - 단방향 : 입력이면 입력, 출력이면 출력
	 * 			입력용 스트림 따로, 출력용 스트림이 따로 존재
	 * 			동시에 입출력을 하고자 한다면??
	 * 			-> 하나의 스트림으로는 불가능!
	 * 			-> 입력, 출력 스트림으로는 불가능!
	 * - 선입선출(FIFO) : 먼저 전달한 값이 먼저 나오게 된다. => 큐(Queue)
	 * 					(순서대로 들어가서 나온다.)
	 * 
	 * 시간지연 문제가 발생할 수 있따.
	 * 
	 * 스트림의 구분
	 * - 통로의 사이즈
	 * 
	 * 바이트 스트림 : 1Byte짜리가 이동할 수 있는 좁은 통로
	 * 									=> 입력(XXXInputStream) / 출력 (XXXOutputStream)
	 * 문자 스트림 : 2Byte짜리가 이동할 수 있는 넓은 통로
	 * 									=> 입력(XXXReader) / 출력(XXXWriter)
	 * 
	 * - 외부매체와의 직접적인 연결 여부
	 * 기반 스트림 : 외부매체하와 직접적으로 연결되는 통로
	 * 보조 스트림 : 기반 스트림만으로 부족한 성능을 향상시켜주는 요도의 스트림
	 * 			=> 단독 사용 불가(기반스트림을 만들고 추가해주는 용도)
	 * 			=> 속도향상, 자료형에 맞춰서 변환, 객체단위로 입출력하게 도움...
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
