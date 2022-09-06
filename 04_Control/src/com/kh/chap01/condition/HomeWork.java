package com.kh.chap01.condition;

import java.util.Scanner;

public class HomeWork {

	public void HomeWork1 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println("메뉴 번호를 입력하세요! : ");
		
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1 : 
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정 메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회 메뉴입니다.");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7 :
			System.out.println("종료 메뉴입니다.");
			break;
		default :
			System.out.println("없는 메뉴입니다.");
			return;
		
		}
		
		
	}
	
	
	
	public void HomeWork2() {
		
		
		System.out.println("-----2번 문제-----");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 입력해 주세요 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어점수 입력해 주세요 : ");
		int eg = sc.nextInt();
		
		System.out.println("수학점수 입력해 주세요 : ");
		int math = sc.nextInt();
		
	
		int sum = kor + eg + math;
		double ev = (kor + eg + math) / 3;
	
		if(kor >= 40 && eg >= 40 && math >= 40 && ev >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eg);
			System.out.println("합계 : " + sum + "\n평균 : " + ev + "\n축하합니다. 합격입니다.");
		} else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eg);
			System.out.println("불합격입니다.");
		}
	
	
	}
	
	public void HomeWork3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 확인하고자 하는 회원 등급  : ");
		
		String id = sc.nextLine();
	
		switch(id) {
		
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원" :
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원" :
			 System.out.println("게시글 조회");
			 break;
		default :
			System.out.println("잘못 입력했습니다.");
			return;
		}
		
	}
	
	
	public void HomeWork4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("연산자를 입력(+, -, *, /, %) : ");
		char math = sc.next().charAt(0);
		
		double result;
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("양수만 입력해주세요!");
		} else {
			switch(math) {
			
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = (double)num1 / (double)num2;
				break;
			case '%' :
				result = num1 % num2;
				break;
			default :
				System.out.println("잘못 입력하셧습니다. 프로그램을 종료합니다.");
				return;
			}
			System.out.printf("%d %c %d = %.2f", num1, math, num2, result);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
