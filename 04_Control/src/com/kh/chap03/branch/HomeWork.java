package com.kh.chap03.branch;

import java.util.Scanner;

public class HomeWork {

	public void homework1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			
			for(int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	public void homework2() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.println("공차 : ");
		int gong = sc.nextInt();
		
		int result = start;
		int i = 0;
		while(i < 10) {
			System.out.print(result + " ");
			result += gong;
			i++;
		}
		
	
	}

	
}
