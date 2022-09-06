package com.kh.operator;

import java.util.Scanner;

public class HomeWork {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째수를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요 :");
		int num2 = sc.nextInt();
		System.out.println("세번째 수를 입력해주세요 : ");
		int num3 = sc.nextInt();

		String result = ((num == num2) && (num2 == num3) && (num == num3) ? "TRUE" : "FALSE");
		
		System.out.println(result);
		
	}
	
	public void method2() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		
		String result = ((num > 0) && (num % 2 == 0)) ? "짝수다!" : ((num < 0) ? "양수만 입력해주세요!" : (num == 0) ? "0입니다!" : "홀수다!"); 
		
		System.out.println(result);
		
	}
	
	
	
	
}
