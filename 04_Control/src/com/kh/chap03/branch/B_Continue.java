package com.kh.chap03.branch;

import java.util.Arrays;
import java.util.Scanner;

public class B_Continue {

	/*
	 * continue : 반복문 안에서 쓰이는 구문!
	 * 
	 * continue를 만나면 그 뒤에 어떤 구문이 있든간에 실행하지않고 pass
	 * 가장 가까운 반복문으로 올라가라는 것을 의미
	 * 
	 * 
	 */
	
	public void method1() {
		
		// 1부터 10까지 홀수만 출력
		// 1 3 5 7 9
		
		// 방법 1. 반복문을 1씩 증가시키면서 돌리는데, 홀수일 경우만 출력하도록 조건문을 사용한다.
		// 				if(i % 2 == 1) 
		
		// 방법2. 증감식을 매번 2씩 증가하면 됌
		// 		for(int i = 0; i <= 10; i += 2)
		
		// 방법 3. continue; 사용
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
	}
	
	
	public void mehtod2() {
		
		// 1부터 100까지의 총 합계
		// 단, 7의배수값만 빼고 더해보자
		
		int result = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				continue;
			}
			result += i;
		}
		System.out.println("합계 : " + result);
		
	}
	
	
	public void mehtod3() {
		
		// 5칸짜리 정수 배열을 만들고 숫자 입력받기
		// int[] arr = new int[5];
		// 1 ~ 100까지의 숫자만 입력받기
		// 만약에 범위를 넘어선 숫자를 입력받는다면 "다시 입력하세요 !!" 라고 출력한 뒤 다시 입력받자
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("1~100까지의 숫자 입력해주세요 : ");
			int temp = sc.nextInt();
			
			if(0 >= temp || temp > 100) {
				System.out.println("범위가 이상한거 같아요~ 다시 입력해주세요!\n");
				i--;
				continue;
			}
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
}
