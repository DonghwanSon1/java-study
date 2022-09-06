package com.kh.chap02.loop;

import java.util.Arrays;

public class B_While {

	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 초기식; // 필수는 아님
	 * while(조건식){
	 * 		반복적으로 실행할 코드;
	 * 		증감식; // 필수는 아님
	 * }
	 * 
	 * 괄호안에 조건식이 true일 경우 해당 구문(반복적으로 실행할 코드)를 반복적으로 실행
	 * while(true) => 반복을 무조건 시킨다 : 무한반복
	 * 
	 */
	
	public void method1() {
		
		// for문 무한반복식
//		for(;;) {
//			System.out.println("hi");
//		}
		
		System.out.println("-----1씩 증가-----");
		int i = 0;
		while(i < 5) {
			System.out.println("안녕하세요!");
			i++;
		}
		
		System.out.println("-----1씩 감소-----");
		int b = 10;
		while(b >= 6) {
			System.out.println(b + "(으)로 줄어든다...");
			b--;
		}
		
		System.out.println("-----2씩 증가-----");
		int c = 1;
		while(c < 10) {
			System.out.println("다섯번만 나올거야~ ");
			c +=2 ;
		}
		
		
		
	}
	
	
	public void method2() {
		
		// 실습
		// 1 ~ 100까지의 짝수만 더하기
		
		// 일단 1부터 100까지 더한 합계 출력
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("짝수만 더했을때 : " + sum);

	}
	
	
	public void method3() {
		
		
		// 1 ~ 100까지의 홀수
		
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			if(i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println("홀수만 더했을때 : " + sum);
		
	}
	
	
	public void method4() {
		
		// 1부터 랜덤한 수 (1 ~ 10)까지 모두 더하는 총 합계
		// random : 무작위
		// Math 라는 클래스의 random()를 활용!
		// random() 결과 값 : 0.0 ~ 0.99999999999...까지나옴
		
		// [표현법] Math.random();
		// Math m = new Math();
		// m.random(); // => Math클래스는 따로 작성할 필요가 없다!!
		
		// 1단계 : random()가 잘 작동되나 호출해보기!
		
		double random = Math.random();
		System.out.println("random : " + random);
		
		// 2단계 : 결과값에 10을 곱한다.
		//			0.0 ~ 9.99999...까지나옴
		// 2_2단계 : int형으로 강제형변환을 하면?
		//			0 ~ 9
		// 2_3단계 : 범위를 맞추기 위해 +1을 해주면
		//			1 ~ 10
		// => (int)(Math.random * 몇개의 랜덤값) + 시작 수;
		
		int random2 = (int)(Math.random() * 10) + 1;
		System.out.println("random2 : " + random2);
		
		// 3단계 : 누적합 구하기 
		// -> 1부터 랜덤한 수 (1 ~ 10)까지 모두 더하는 총 합계
		// 예) 1부터 시작을해서 랜덤한 수 (5)가 나오면
		//		1 + 2 + 3 + 4 + 5
		//		랜덤한 수 까지의 더한 결과를 출력 : 15
		
		int i = 1;
		int sum = 0;
		while(i <= random2)	{
			sum += i;
			i++;
		}
		System.out.println("랜덤 수 : " + random2);
		System.out.println("랜덤한 수 까지의 더한 결과를 출력 : " + sum);
		
	}
	
	
	public void method5() {
		
		// 로또규칙 Ver_1
		// 번호 범위 : 1 ~ 45
		// 6개 선택
		
		int[] rotto = new int[6];
		
		// (int)(Math.random() * 몇개의 랜덤값) + 시작수
		// random 1 ~ 45
		
		// rotto[0] = (int)(Math.random() * 45) + 1
		// rotto[1] = (int)(Math.random() * 45) + 1
		// rotto[2] = (int)(Math.random() * 45) + 1
		// rotto[3] = (int)(Math.random() * 45) + 1
		//
		// rotto[5]...
		
		int i = 0;
		while(i < 6) {
			rotto[i] = (int)(Math.random() * 45) + 1;
			i++;
		}
		// Arrays.toString(배열이름);
		System.out.println(Arrays.toString(rotto));
		
		
		
		
	}
	
	
	
	
	
	
	
}
