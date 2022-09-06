package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * ���� ������ : �� �����ڰ� 3�� => �� 3���� ������ 1���� �̷���� (���ǽ��������� ����)
	 * 
	 * ���ǽ� : ������� ���� ������ ó���ϴ� ���
	 * 		 ������� ���� ��� �� 1�� ó���ϰ�
	 * 		������� ������ ��� �� 2�� ó��.
	 * 
	 * [ǥ����]
	 * ���ǽ� ? ������ true�� ��� ����� : ������ false�� ��� �����
	 */
	
	
	public void method1() {
		
		//����ڰ� �Է��� ���� ��� ���� �ƴ��� �Ǻ� �� �׿� �´� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
//		String result = (num >= 0) ? "�����!" : "����� �ƴϴ�!"; // 15�� ����
		String result = (num > 0) ? "�����!" : ((num == 0) ? "0�̴�." : "����� �ƴϴ�!"); 
		
		System.out.println(num + "��(��) " + result);
	}
	
	
	public void method2() {
		
		// ¦�� , Ȧ�� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� > ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦�� �Դϴ�.!!" : "Ȧ�� �Դϴ�.!!";
		
		System.out.println(num +"��(��) " + result);
		
	}
	
	
	public void method3() {
		
		// �ǽ�
		// ������ �ϳ��� �Է¹޾Ƽ� �빮������ �ƴ��� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ϳ��� �Է����ּ��� : ");
		char word = sc.next().charAt(0);
		
//(�� �ڵ�)String result = (Character.isLowerCase(word)) ? "�ҹ��� �Դϴ�." : "�빮�� �Դϴ�.!!";
		String result = ('a' <= word && word <= 'z') ? "�ҹ��� �Դϴ�." : "�빮�� �Դϴ�.!!"; // ����� �ڵ�
		
		
		System.out.println(word +"��(��) " + result);
		
		
		
		
	}
	
	
	
	
	
}
