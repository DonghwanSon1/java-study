package com.kh.operator;

import java.util.Scanner; // 1�ܰ�

public class F_Logical {


	/*
	 * �� ������ : �� ���� ������ �����ϴ� ������
	 * [ǥ����]
	 * ���� �������� ���� => ������� ����
	 * 
	 * ����
	 * 
	 * 1. AND ������ : ���� && ����
	 * 				-> ���װ� ������ ���� ��� true�̿��߸� ���� ����� true
	 * 2. OR ������ : ���� || ����
	 * 				-> ���� �Ǵ� ������ ���� �ϳ��� true �̸� ���� ����� true
	 * 
	 * 
	 */
	
	// AND
	public void mehtod1() {
		
		// ����ڰ� �Է��� �������� ��� "�̸鼭(�̰�)" ¦������ Ȯ���غ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		boolean result = (num > 0) && (num % 2 == 0);
		// &&�� �ǹ� : ~~~�̸鼭, ~~�̰�, �׸��� ���
		
		System.out.println("����ڰ� �Է��� ������ ����̸鼭 ¦�� �Դϱ�? : " + result);
		System.out.println("------------------------------");
		
		
	}
	
	public void method2() {
		
		// �ǽ�!
		// �Է��� �������� 1 �̻� 100�������� Ȯ���غ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		boolean result = ( num >= 1) && (num <= 100);

		System.out.println("����ڰ� �Է��� �������� 1 �̻� 100 �����ΰ���? : " + result);
		System.out.println("-------------------------------");
		
		
	}
	
	
	// OR
	public void mehtod3 () {
		
		// ����ڰ� �Է��� ���� A �Ǵ� a���� Ȯ���غ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѱ��ڸ� �Է����ּ��� : ");
		
		char ch = sc.next().charAt(0);
	
		// index : ���� **0���� ����
		
		// �񱳿������� ��� �ǿ����� == ���� 
		// ������ ��� �񱳿����� �����Ѱ�? = �����ϴ�!! -> ��?? int�� �ڵ�����ȯ�� �Ǳ� �����̴�.
		
		boolean result = (ch == 'A')|| (ch == 'a');
		// || : ~~�̰ų�, �Ǵ� ��
		
		System.out.println("����ڰ� �Է��� ���ĺ��� A�Ǵ� a�Դϱ�? : " + result);
		
	}
	
	
	/*
	 * && : �ΰ��� ������ ��� true�� �� ����� true
	 * 
	 * true && true => true
	 * true && false => false
	 * false && true => false
	 * false && false => false
	 * 
	 * || : �ΰ��� ���� �� �ϳ��� true �̸� ����� true
	 * 
	 * true || true => true
	 * true || false => true
	 * false || true => true
	 * false || false => false
	 * 
	 */
	
	
	public void method4() {
		
		int num = 10;
		
		boolean result = false && (num > 0);
		
		// Deadcode : �ڿ� �񱳿��� ������ ������� ����
		// ��������� ���� ������ ���� ������� false���ٵ� �� ����?? 
		
		System.out.println("result : " + result);
		
	}
	
	
	
	
	
	
	
	
}
