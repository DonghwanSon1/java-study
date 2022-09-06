package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * 삼향 연산자 : 피 연산자가 3개 => 값 3개와 연산자 1개로 이루어짐 (조건식형식으로 쓰임)
	 * 
	 * 조건식 : 결과값에 따라서 연산을 처리하는 방식
	 * 		 결과값이 참일 경우 식 1을 처리하고
	 * 		결과값이 거짓일 경우 식 2를 처리.
	 * 
	 * [표현식]
	 * 조건식 ? 조건이 true일 경우 결과값 : 조건이 false일 경우 결과값
	 */
	
	
	public void method1() {
		
		//사용자가 입력한 값이 양수 인지 아닌지 판별 후 그에 맞는 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
//		String result = (num >= 0) ? "양수다!" : "양수가 아니다!"; // 15행 참고
		String result = (num > 0) ? "양수다!" : ((num == 0) ? "0이다." : "양수가 아니다!"); 
		
		System.out.println(num + "은(는) " + result);
	}
	
	
	public void method2() {
		
		// 짝수 , 홀수 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수 입니다.!!" : "홀수 입니다.!!";
		
		System.out.println(num +"은(는) " + result);
		
	}
	
	
	public void method3() {
		
		// 실습
		// 영문자 하나를 입력받아서 대문자인지 아닌지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문자 하나를 입력해주세요 : ");
		char word = sc.next().charAt(0);
		
//(내 코딩)String result = (Character.isLowerCase(word)) ? "소문자 입니다." : "대문자 입니다.!!";
		String result = ('a' <= word && word <= 'z') ? "소문자 입니다." : "대문자 입니다.!!"; // 강사님 코딩
		
		
		System.out.println(word +"은(는) " + result);
		
		
		
		
	}
	
	
	
	
	
}
