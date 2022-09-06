package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * RuntimeException
	 * 프로그램 실행시 발생되는 예외들
	 * 
	 * RuntimeException의 자식 클래스들
	 * - ArrayIndexOutOfBoundsExecption : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
	 * - NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * - NullPointerException : 주소값 객체를 참조했더니 null이 들어있을 경우 발생하는 예외
	 * - ArithmeticExceprtion : 나누기 연산을 0으로 나누면 발생하는 예외
	 * ......
	 * 
	 * 이러한 RuntimeException과 관련된 예외들은 공통점이 있다.!
	 *  - 개발자가 예측이 가능함 => 조건문으로 해결 가능함!
	 *  => 굳이 예외처리를 할 필요가 없다.
	 * 
	 */
	
	
	// ArithmeticException
	public void method1() {
		
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈 결과 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수값을 입력받아서 나눗셈");
		System.out.println("정수값 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수값 입력 : ");
		int num2 = sc.nextInt();
		
		/*
		// 방법 1. 조건문으로 처기(예외발생을 막음)
		// if문으로 조건검사 후에 계산 진행 => 예외나오지마!
		if(num2 != 0) {
			System.out.println("결과 : " + (num1 / num2));
		} else {
			System.out.println("0을 입력하시면 안됍니다.");			
		}
	System.out.println("종료합니다~~");
	*/
	
	// 방법 2. 예외처리 구문으로 해결~~
	//		예외가 발생했을 경우 실행할 내용을 정의해두는것~!
		
		/*
		 * try ~ catch 문
		 * 
		 * [표현법]
		 * 
		 * try {
		 * 			// 예외가 발생할법한 구문
		 * 			(num1 / num2)
		 * 
		 * 		   (ArithmeticException e)
		 * } catch(발생할예외클래스이름 변수명(일종의 매겨변수)){
		 * 
		 *  // 해당 예외가 발생했을 때 실행할 구문
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
		try {
			System.out.println("나눗셈 결과  : " +(num1 / num2));
		} catch(ArithmeticException e) {
			System.out.println("0은 아니야~~ 딴거넣어~~");
			// e.printStackTrace(); // 오류를 추적할 수 있는 메서드
			// 현재 오류가 발생한 정보를 볼 수 있고, 어디서 에러가 났는지 나열해준다.
			// 개발단계하고 테스트단계에서만 써야한다.! 반드시!
			// 에러문구를 사용자가 보면 안된다!!!!
		}
	
	System.out.println("프로그램 끝났어~");
	}
	
	
	// 다중 catch블록
	public void method2() {
		
		/*
		 * 다중 catch블록
		 * catch할 예외가 여러개일 경우 주로 사용
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력(0제외) : ");
		
		try {
			int num = sc.nextInt(); // 정수입력했더니 이상한거 입력.
			System.out.println("나눗셈 결과 : " + (100 / num)); // 0하지 말랬는데 0넣음
				
		} catch (InputMismatchException e) { // 1. 우선적으로 입력받은게 정수인지 판단
			System.out.println("정수넣으라고!!");
		} catch(ArithmeticException e) { // 2. 정수라면 0인지 아닌지 판단
			System.out.println("0 넣지 말라고!");
		}
		System.out.println("프로그램 종료!");
		
	}
	
	public void method3() {
		
		// 배열 활용
		// ArrayIndexOutoofBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
		// NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외
		
		// 사용자로부터 배열의 크기를 입력받아서 배열 만들기
		// 100번째 인덱스의 값을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기 : ");
		
		try {
			int index = sc.nextInt(); // 1. InputMismatchException
			int[] arr = new int[index]; // 2. NegativeArraySizeException
			System.out.println(arr[100]); // 3. ArrayIndexOfBoundsExcption
			
			// 다중 catch문 작성시 범위가 작은 자식타입의 예외클래스부터 먼저 기술해야함!!
		} catch(InputMismatchException e) {
			System.out.println("정수 넣으세요!");
		} catch(NegativeArraySizeException e) {
			System.out.println("양수 넣으세요!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("100칸이 안됌");
		} catch(RuntimeException e) {
			System.out.println("배열이 이상해~");
			
			// 몽뚱그려서 포괄적인 오류 처리만 가능하다 ==> 단점
			// System.out.println("어.. 야 그러니깐 일단 예외가 발생하긴 했는데
			// 배열의 크기가 잘못됬거나.. 부적절한 인덱스가 들어왔거나.. 니가 정수가 아닌걸 넣었어..
			// 근데 난 뭔지 잘 모르겠어.. 뭐지 ?? ")
			
			/*
			if(e instanceof InputMismatchException) {
				System.out.println("정수 넣으세요!");
			} else if(e instanceof NegativeArraySizeException) {
				System.out.println("양수 넣으세요!");
			} else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("100칸이 안됌");
			}
		*/
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
