package com.kh.variable;

import java.util.Scanner; // 1단계 끝!

public class B_KeyboardInput {

	/*
	 * 키보드부터 사용자의 입력 값을 받으려면?
	 * System.out => 출력
	 * 자바에서 이미 제공하고 있는 java.util.Scanner 라는 클래스를 사용하면 됌!
	 * Scanner 클래스안에 있는 메서드들을 호출해서 사용한다.
	 * 
	 */

	public void inputTest() {
	
		Scanner sc = new Scanner(System.in);
		// System.in : 입력받은 값들을 받아들이겠따. (바이트 단위로)
	
		// 사용자의 인적사항을 입력받아 출력해보자
		
		// 입력받고자 하는 내용을 먼저 질문해서 입력을 유도해야한다.
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메서드
		// nextLine() : 사용자가 입력한 값 중 공백에 무관하게 한 문장을 다 읽어옴. 개행문자전까지
		// next() : 사용자가 입력한 값 중 공백이 있을경우 공백 이전까지만 입력 받음
		// sc.nextInt() => 정수형 입력할때!
		// sc.nextDouble() => 실수형 입력할때!
		// sc.nextLine() => 버퍼에서 엔터 이전까지의 모든 값을 가져온후 
		//                  "엔터" 
		
		String name = sc.next();
		System.out.println("제이름은 " + name + "입니다!");
		
		System.out.print("당신의 나이는 몇살입니까? : ");
		int age = sc.nextInt();
		System.out.println("제나이는 " + age + "입니다!");

		System.out.print("당신의 키는 몇센치 입니까?(소수점 첫째자리까지 입력해주세요) : ");
		double height = sc.nextDouble();
		System.out.println("제키는 " + height + "입니다!");
		
		sc.nextLine();
		System.out.print("주소가 어떻게 되세요? ");
		String address = sc.nextLine();
		System.out.println("주소 : " + address);
		
		
	
	}

}