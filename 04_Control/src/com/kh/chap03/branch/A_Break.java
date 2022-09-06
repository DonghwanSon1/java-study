package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break; : break문을 만나는 순간 "가장 가까운 반복문"을 빠져나간다.
	 * 			해당 break문이 속해있는 반복문 "한겹"만 빠져나감!!!!
	 * 
	 * ☆ 주의할 점 : switch문 안에 break;와 다른개념
	 * 				switch문 내부에 존재하는 break는 해당 switch문을 빠져나가는 용도일 뿐이다!!
	 * 
	 * 
	 */
	
	
	public void method1() {
		
		// 매번 반복적으로 새롭게 발생되는 랜덤값 출력(1~100) => 무한하게
		// 그 랜덤값이 홀수일 경우 반복문을 빠져나가게 할것이다.!
		
		// 1. for(;;)		=> 무한루프
		// 2. while(true)	=> 무한루프
		
		for(;;) {
			
			int random = (int)(Math.random() * 100) + 1;
			
			if(random % 2 == 1) {
				System.out.println("홀수가 나와서 종료하겠습니다.");
				break;
			}else {
			System.out.println(random);
			}
		}
		
		
	}
	
	public void method2() {
		
		// 매번 사용자에게 문자열을 입력 받은 후
		// 해당 문자열의 길이를 출력하자!
		// 단, 사용자가 "exit"를 입력할 경우 반복문을 빠져나가게 해주자
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력해 주세요 > ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println(str.length());
			
		}
		
	}
	
	
	
	public void method3() {
		
		// 매 번 사용자로부터 숫자 입력받고
		// 해당 숫자가 음수면 "프로그램을 종료합니다"라고 문구를 출력해보세요~
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력해 주세요 > ");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("프로그램을 종료합니다~");
				break;
			}
		}
		

		
	}
	
	
	/*
	 * 연산자(+,-,*,/,%)와 정수 두개를 입력받아 입력된 연산자에 따라 알맞은 결과를 출력하세요.
	 * 단, 해당 프로그램은 연산자 입력에 "exit"이라는 값이 들어올때까지 무한 반복하며
	 * "exit"이 들어오면 "프로그램을 종료합니다."라고 출력하고 종료합니다.
	 * 
	 * 또한, 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
	 * "0으로는 나눌 수 없습니다. 다시입력해주세요"를 출력하고,
	 * 없는 연산자를 입력시 "없는 연사자 입니다. 다시입력해주세요." 라고 출력하고
	 * 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	 * 
	 * 
	 */
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("연산자(+,-,*,/,%)를 입력해주세요 > ");
			String math = sc.next();
			
			if(math.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} 
			
			System.out.println("첫번째 숫자를 입력해주세요 > ");
			int num1 = sc.nextInt();
			
			System.out.println("두번째 숫자를 입력해주세요 > ");
			int num2 = sc.nextInt();
			
			int result = 0;
			boolean flag = true;
			
			switch(math) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				if(num2 == 0) {
					System.out.println("0으로는 나눌 수 없습니다. 다시입력해주세요");
					flag = false;
				} else {
					result = num1 / num2;
				}
				break;
			case "%" :
				result = num1 % num2;
				break;
			default :
				System.out.println("없는 연사자 입니다. 다시입력해주세요.");
				flag = false;
			}
			
			if(flag) {
			System.out.printf("%d %s %d = %d \n\n", num1, math, num2, result);
			}
			
		}
		
		// if, else, else if, for, while, do-while, switch, break
		// return, print, operator, String, primitiveVariable
		// method, array, scanner
	}
	
	
	
	
	
	
	
	
	
}
