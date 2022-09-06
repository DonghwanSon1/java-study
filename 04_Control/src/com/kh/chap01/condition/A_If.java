package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * 단독 if문
	 * 
	 * [표현법]
	 * if(조건식){
	 * 		조건식이 true일 경우 실행할 코드
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 : {} 안의 코드들이 실행 된다.
	 * => 조건식의 결과가 false일 경우 : {} 안의 코드들을 건너 뛴다.
	 * 
	 */
	
	// 삼항연산 실습 문제
	public void method1() {
		
		// 정수를 입력받고 양수 / 0 / 음수 출력
		
		// ctrl + shift + o  // import 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		// 만약에 사용자 입력한 값이 0보다 크면
		if(num > 0) {System.out.println("양수 입니다.");}
		
		// 만약에 사용자가 입력한 값이 0이면
		if(num == 0) {System.out.println("0입니다!");}
		
		// 만약에 사용자가 입력한 값이 0보다 작으면
		if(num < 0) {System.out.println("음수 입니다.");}
		
	}
	
	
	public void mehtod2() {
		
		// if문을 사용해서 홀수 짝수 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		// 양수일 경우만 조건문을 실행하시오
		// &&을 이용
		
		// 만약에 사용자가 입력한 값이 2로 나눴을때 나머지가 0이면 = 짝수 , 그리고 양수이면
		if((num % 2 == 0) && (num > 0)) {System.out.println("짝수 입니다!");}
		
		// 만약에 사용자가 입력한 값이 2로 나눴을때 나머지가 0이 아니면 = 홀수, 그리고 양수이면
		if((num % 2 != 0) && (num > 0)) {System.out.println("홀수 입니다!");}
		
		
		// 중첩 if문
//		if(num > 0) {
//			if(num % 2 == 0) {System.out.println("짝수 입니다!");}
//			if(num % 2 != 0) {System.out.println("홀수 입니다!");}
//		}
		// 위에 있는 중첩if문은 위에 if문이랑 결과 같음
		
	}
	
	
	
	// 주민번호 체크
	// 주민번호를 입력받아서 남자(1,3) / 여자(2,4) 판별하기
	public void method3() {
		
		// 사용자로부터 주민번호 입력받기 xxxxxx-1(2)xxxxxx
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력해주세요 (- 포함) : ");
		String personId = sc.nextLine();
		
		
		// "순서가 있는 문자들의 나열"
		// "a b c d e f g " => 문자열
		// 0 1 2 3 4 5 6
		// "순서를 index라고 함" -> 0부터 시작
		
		// 입력받은 주민번호로부터 성별에 해당하는 '문자'를 추출
		// charAt(7) => 주민번호상 8번째에 있는 7번 인덱스를 추출해야된다.
		
		char gender = personId.charAt(7);
		
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가 1 또는 3이면
		if(gender == '1' || gender == '3') {System.out.println("남자입니다.");}
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가 2 또는 4이면
		if(gender == '2' || gender == '4') {System.out.println("여자입니다.");}
		// 만약에 사용자가 입력한 문자가 1도 아니고 2도 아니고 3도 아니고 4도 아니면
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("잘못된 주민번호를 입력하셨습니다.");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
