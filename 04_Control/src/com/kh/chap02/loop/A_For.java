package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	
	/*
	 * for문
	 * for(){
	 * 
	 * }
	 * 괄호 안에 반복을 지정하는 부분이 있고, 
	 * 초기식; 조건식; 증감식  -> 세가지로 이루어진다.
	 * ;; 각각 세미콜론으로 구분한다.!
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식){ // 반복횟수를 지정하는 요소들
	 * 		반복적으로 실행시키고자 하는 코드
	 * }
	 * 
	 * - 초기식 : 반복문이 시작될 때 "초기에 단 한번만 실행"될 구문
	 * 			반복문에서 사용할 변수를 선언하고 초기화하는 구문 => int i = 0;
	 * 
	 * - 조건식 : "반목문이 실행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 반복문 실행
	 * 			조건식이 false일 경우 반복문을 멈추고 빠져나옴 => i < 10;
	 * 
	 * - 증감식 : "반복문을 제어하는 변수 값"을 증감시키는 구문
	 * 			보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			이때, 증감연산자 주로 쓰임 => i++
	 * 
	 * 
	 * 
	 */
	
	
	
	public void method1() {
		
		
		// "안녕하세요"를 5번 반복해서 출력하고싶다.
		
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
		
		// 적은횟수는 얼마든지 복붙이 가능!
		// 136, 7347번 반복하고 싶을때는 ?? => 현대인이 할 일이 아님!!
	
		for(int i = 0; i <= 4; i++) {
			System.out.println("안녕하세요.");
		}
		
		
		
	}
	
	public void method2() {
		
		// 고정된 문자열이 아닌 매번 달라지는 출력 결과를 확인해보자!!!
		// i : 1
		// i : 2
		// i : 3
		System.out.println("-----1씩 증가-----");
		for(int i = 0; i < 3; i++) {
			
			System.out.println("i : " + (i + 1));
		}
		
		// i 값이 1에서부터 5와 같아질때까지 1씩 증가
		System.out.println("-----5까지 반복-----");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번 반복");
		}
		
		// 감소하는 예시
		// i값이 10에서부터 6보다 크거나 같을때까지 1씩 감소하면서 반복 수행
		// 10 9 8 7 6
		// return;
		System.out.println("-----1씩 감소-----");
		for(int i = 10; i >= 6; i--) {
			System.out.println("i : " + i);
		}
		
		// 증감 1씩 => 2씩 증가!!
		// 1 3 5
		System.out.println("-----2씩 증가-----");
		for(int i = 1; i < 6; i += 2) {
			System.out.println("i : " + i);
		}
		
		
	}
	

	public void mehtod3() {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		System.out.println("중첩 for문 ");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
		System.out.println("-----for문 안에 if문 쓰기-----");
		// for문 안에 if문 쓰기
		System.out.println("for문 안에 if문 쓰기");
		
		for(int i = 0; i < 30; i++) {
			
			System.out.println((i + 1) + " 번째 반복중");
			
			// if문으로 10번째 반복마다 ☆출력주기.
			if((i + 1) % 10 == 0) {
				System.out.println("★");
			}
			
		}
		
		
		
	}
	
	
	// 실습
	// 구구단
	// 사용자한테 단을 입력받아서
	// 구구단을 출력해보자!
	// 메소드 이름 gugudan
	
	public void gugudan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇 단이 궁금하십니까 : ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}
		
		
	}
	
	
	
	
	
	
	
	
}
