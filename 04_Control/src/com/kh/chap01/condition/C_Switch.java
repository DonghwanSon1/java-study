package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	/*
	 * switch문
	 * 
	 * [표현식]
	 * switch(아래에 기술할 값들과 동등비교를 할 대상자){
	 * 		case 정수, 문자, 문자열 : 실행할 코드1;
	 * }
	 * 
	 * switch(정수, 문자, 문자열){
	 * 		case 값1 : 실행할 코드 1;  // 대상자 == 값1이 true일 경우 실행할 코드
	 * 					break;    // switch 영역을 빠져나간다.
	 * 		case 값2 : 실행할 코드2;  // 대상자 == 값2가 true일 경우 실행할 코드
	 * 					break;
	 * 		case 값n : 실행할 코드 n; // 대상자 == 값n이 true일 경우 실행할 코드
	 * 
	 * 		default : 실행할코드;   // == else
	 * 							// break를 적지않는다.
	 * }
	 * 
	 */
	
	public void method1() {
		
		// 사용자한테 값 입력받아서 홀수 짝수 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 0 : 짝수, 1 : 홀수
		
		switch(oddEven) {
		
		case 0 : 
			System.out.println("짝수입니다.");
			break;
		case 1 : 
			System.out.println("홀수 입니다.");
			break;
		
		
		}
		
		
	}
	
	
	public void method2() {
		
		// 1. 사용자로부터 주민번호 입력받기 (String personId) => 000000 - 1234567
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력해 주세요 (-포함) : ");
		String personId = sc.nextLine();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자를 추출
		char gender = personId.charAt(7);
		
		// 3. 스위치문을 사용해서 조건문 작성
		switch(gender) {
		
		case '1' : case '3' : 
			System.out.println("남자입니다.");
			break;
		case '2' : case '4' :
			System.out.println("여성입니다.");
			break;
		default :
			System.out.println("외계인입니다.");
		// 뒤에 더이상 실행할 조건들이 없기 때문에 break를 쓰지 않는다.
		}
		
		
	}
	
	
	// switch => 과일가게
	public void fruitMarket() {
		
		// 사용자에게 구매할 과일의 이름을 입력받아
		// 각 과일마다의 가격을 출력해줄 것
		
		// 사과,   수박,    망고,   메론,   오렌지,  블루베리
		// 1000, 10000, 15000, 20000, 15000, 12000
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 안녕하세요 -----");
		System.out.println("구매할 과일을 입력해주세요 (사과, 수박, 망고, 메론, 오렌지, 블루베리)");
		
		String fruit = sc.nextLine();
		int price = 0;
		
		switch(fruit) {
		
		case "사과" :
			price = 1000;
			break;
		case "수박" :
			price = 10000;
			break;
		case "망고" : case "오렌지" :
			price = 15000;
			break;
		case "메론" :
			price = 20000;
			break;
		case "블루베리" :
			price = 12000;
			break;
		default : 
			System.out.println("그 과일은 없습니다!");
		return; // => 현재 실행되고 있는 메서드 영역을 아예 빠져나간다.
				// 메서드 호출 부분 (Run클래스에 호출한 매서드 다음부분으로)돌아간다.
		}
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		
		
	}
	
	
	public void method4() {
		
		// 로그인 기능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		String id = "user01";
		String pwd = "pass01";
		
		if(id.equals(userId) && pwd.equals(userPwd)) { // 로그인이 성공했을 경우
			System.out.println("로그인 성공!!");
		} else if(!id.equals(userId)) { // id가 일치하지 않을 경우
			System.out.println("아이디가 일치하지 않습니다!");
		} else { // pwd가 일치하지 않을 경우
			System.out.println("비밀번호가 일치하지 않습니다!");
		} 
		
		// 기본자료형 : byte, short, int, long, float, double, char, boolean
		// => 기본자료형 같은 경우에는 동등비교(==, !=) 비교가 잘됌
		
		// 참조자료형 : String
		// => 동등비교(==, !=)가 불가능함
		// 왜? 참조자료형의 경우 실제로 변수에 담기는 값이 '주소값'이기 때문에.
		// 문자열을 비교할때 : equals() 를 사용한다. 결과는 => true, false이다.
		// [표현법] 문자열.equals("비교할 문자열");
		
		
	}
	

	
	
	
	
}
