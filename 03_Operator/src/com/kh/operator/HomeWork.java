package com.kh.operator;

import java.util.Scanner;

public class HomeWork {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��°���� �Է����ּ��� : ");
		int num = sc.nextInt();
		System.out.println("�ι�° ���� �Է����ּ��� :");
		int num2 = sc.nextInt();
		System.out.println("����° ���� �Է����ּ��� : ");
		int num3 = sc.nextInt();

		String result = ((num == num2) && (num2 == num3) && (num == num3) ? "TRUE" : "FALSE");
		
		System.out.println(result);
		
	}
	
	public void method2() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		
		String result = ((num > 0) && (num % 2 == 0)) ? "¦����!" : ((num < 0) ? "����� �Է����ּ���!" : (num == 0) ? "0�Դϴ�!" : "Ȧ����!"); 
		
		System.out.println(result);
		
	}
	
	
	
	
}
