package com.kh.chap03.branch;

import java.util.Scanner;

public class HomeWork {

	public void homework1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else {
			
			for(int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	public void homework2() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int start = sc.nextInt();
		
		System.out.println("���� : ");
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
