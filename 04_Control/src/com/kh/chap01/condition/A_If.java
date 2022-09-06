package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * �ܵ� if��
	 * 
	 * [ǥ����]
	 * if(���ǽ�){
	 * 		���ǽ��� true�� ��� ������ �ڵ�
	 * }
	 * 
	 * => ���ǽ��� ����� true�� ��� : {} ���� �ڵ���� ���� �ȴ�.
	 * => ���ǽ��� ����� false�� ��� : {} ���� �ڵ���� �ǳ� �ڴ�.
	 * 
	 */
	
	// ���׿��� �ǽ� ����
	public void method1() {
		
		// ������ �Է¹ް� ��� / 0 / ���� ���
		
		// ctrl + shift + o  // import ����Ű
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		// ���࿡ ����� �Է��� ���� 0���� ũ��
		if(num > 0) {System.out.println("��� �Դϴ�.");}
		
		// ���࿡ ����ڰ� �Է��� ���� 0�̸�
		if(num == 0) {System.out.println("0�Դϴ�!");}
		
		// ���࿡ ����ڰ� �Է��� ���� 0���� ������
		if(num < 0) {System.out.println("���� �Դϴ�.");}
		
	}
	
	
	public void mehtod2() {
		
		// if���� ����ؼ� Ȧ�� ¦�� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		// ����� ��츸 ���ǹ��� �����Ͻÿ�
		// &&�� �̿�
		
		// ���࿡ ����ڰ� �Է��� ���� 2�� �������� �������� 0�̸� = ¦�� , �׸��� ����̸�
		if((num % 2 == 0) && (num > 0)) {System.out.println("¦�� �Դϴ�!");}
		
		// ���࿡ ����ڰ� �Է��� ���� 2�� �������� �������� 0�� �ƴϸ� = Ȧ��, �׸��� ����̸�
		if((num % 2 != 0) && (num > 0)) {System.out.println("Ȧ�� �Դϴ�!");}
		
		
		// ��ø if��
//		if(num > 0) {
//			if(num % 2 == 0) {System.out.println("¦�� �Դϴ�!");}
//			if(num % 2 != 0) {System.out.println("Ȧ�� �Դϴ�!");}
//		}
		// ���� �ִ� ��øif���� ���� if���̶� ��� ����
		
	}
	
	
	
	// �ֹι�ȣ üũ
	// �ֹι�ȣ�� �Է¹޾Ƽ� ����(1,3) / ����(2,4) �Ǻ��ϱ�
	public void method3() {
		
		// ����ڷκ��� �ֹι�ȣ �Է¹ޱ� xxxxxx-1(2)xxxxxx
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է����ּ��� (- ����) : ");
		String personId = sc.nextLine();
		
		
		// "������ �ִ� ���ڵ��� ����"
		// "a b c d e f g " => ���ڿ�
		// 0 1 2 3 4 5 6
		// "������ index��� ��" -> 0���� ����
		
		// �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� '����'�� ����
		// charAt(7) => �ֹι�ȣ�� 8��°�� �ִ� 7�� �ε����� �����ؾߵȴ�.
		
		char gender = personId.charAt(7);
		
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ� 1 �Ǵ� 3�̸�
		if(gender == '1' || gender == '3') {System.out.println("�����Դϴ�.");}
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ� 2 �Ǵ� 4�̸�
		if(gender == '2' || gender == '4') {System.out.println("�����Դϴ�.");}
		// ���࿡ ����ڰ� �Է��� ���ڰ� 1�� �ƴϰ� 2�� �ƴϰ� 3�� �ƴϰ� 4�� �ƴϸ�
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("�߸��� �ֹι�ȣ�� �Է��ϼ̽��ϴ�.");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
