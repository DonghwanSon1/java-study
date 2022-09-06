package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {

	
	/*
	 * ��� ������ => ���⿬���� ���� ���, �켱������ �Ϲ� ���� ����� ����
	 * 
	 * 
	 */
	
	// + : ����
	// - : ����
	// * : ����
	// / : ������
	// % : ��ⷯ(Modular) => ������������ �������� ����
	
	public void method1() {
	
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num 1 : " + num1 + "\nnum 2 : " + num2);
		
		System.out.println("num1 + num2 : " + num1 + num2);
		// (num1 + num2) ��ȣ�� ������� 13�̶�� ������� ����!
		// ���࿡ ���� �ʰ� ����ϸ� String(���ڿ�)�� �ν��� �ϱ� ������ "10" + "3" ����� 103���� ����!
		
		System.out.println("num1 - num2 : " + (num1 - num2));
		// ������ ��� ��ȣ�� ���� ������ ���ڿ��� num1�� �ϳ��� ��� ���ο� ���ڿ��� ����� ������ ���� �߻�!
		
		System.out.println("num1 x num2 : "  + (num1 * num2));
		System.out.println("num1 �� num2 : "  + (num1 / num2));
		System.out.println("num1 % num2 : "  + (num1 % num2));
		
		// *, /, % �켱������ +, -���� ���� ������ ���� �ʾƵ� ���� ������ ��
		// ��, �������� ���� ��ȣ�� ����Ұ��� ����
		
		// Ư�����̽�!!
		// System.out.println(5/0);
		// ������ 0���� ������ ����
		// ArithmeticException : /by zero
		
	
	
	}

	/*
	 * �ǽ�
	 * 
	 * �޼ҵ�� : methodCandy()
	 * �Է¹��� �� : 1. ����ο���
	 * 			2. ĵ�� ����
	 * 
	 * 1�δ� ������ �ִ� ������ ���� : �������� / �ο���
	 * ���� ������ ���� : �������� % �ο���
	 * 
	 * ��� ����
	 * 1�δ� ������  �ִ� ������ ���� : X ��
	 * ���� ������ ���� : X ��
	 * 
	 */

	public void methodCandy() {
		
		Scanner sc = new Scanner(System.in);
		int human = 0;
		int candy = 0;
		
		System.out.println("��� ���� �����ּ��� : " );
		human = sc.nextInt();
		
		System.out.println("ĵ�� ������ �����ּ��� : ");
		candy = sc.nextInt();
		
		int oneGet_candy = candy / human;
		int remain_candy = candy % human;
		System.out.println("1�δ� ���� �� �ִ� ������ ���� : " + oneGet_candy + "��");
		System.out.println("���� ������ ���� : " + remain_candy + "��");
		
	}
	
	
	
	
	
	
}
