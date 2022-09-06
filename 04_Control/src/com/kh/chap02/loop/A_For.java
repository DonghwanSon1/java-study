package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	
	/*
	 * for��
	 * for(){
	 * 
	 * }
	 * ��ȣ �ȿ� �ݺ��� �����ϴ� �κ��� �ְ�, 
	 * �ʱ��; ���ǽ�; ������  -> �������� �̷������.
	 * ;; ���� �����ݷ����� �����Ѵ�.!
	 * 
	 * [ǥ����]
	 * for(�ʱ��; ���ǽ�; ������){ // �ݺ�Ƚ���� �����ϴ� ��ҵ�
	 * 		�ݺ������� �����Ű���� �ϴ� �ڵ�
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ���۵� �� "�ʱ⿡ �� �ѹ��� ����"�� ����
	 * 			�ݺ������� ����� ������ �����ϰ� �ʱ�ȭ�ϴ� ���� => int i = 0;
	 * 
	 * - ���ǽ� : "�ݸ��� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� true�� ��� �ݺ��� ����
	 * 			���ǽ��� false�� ��� �ݺ����� ���߰� �������� => i < 10;
	 * 
	 * - ������ : "�ݺ����� �����ϴ� ���� ��"�� ������Ű�� ����
	 * 			���� �ʱ�Ŀ��� ����� ������ ������ ������ �ۼ�
	 * 			�̶�, ���������� �ַ� ���� => i++
	 * 
	 * 
	 * 
	 */
	
	
	
	public void method1() {
		
		
		// "�ȳ��ϼ���"�� 5�� �ݺ��ؼ� ����ϰ�ʹ�.
		
//		System.out.println("�ȳ��ϼ���.");
//		System.out.println("�ȳ��ϼ���.");
//		System.out.println("�ȳ��ϼ���.");
//		System.out.println("�ȳ��ϼ���.");
//		System.out.println("�ȳ��ϼ���.");
		
		// ����Ƚ���� �󸶵��� ������ ����!
		// 136, 7347�� �ݺ��ϰ� �������� ?? => �������� �� ���� �ƴ�!!
	
		for(int i = 0; i <= 4; i++) {
			System.out.println("�ȳ��ϼ���.");
		}
		
		
		
	}
	
	public void method2() {
		
		// ������ ���ڿ��� �ƴ� �Ź� �޶����� ��� ����� Ȯ���غ���!!!
		// i : 1
		// i : 2
		// i : 3
		System.out.println("-----1�� ����-----");
		for(int i = 0; i < 3; i++) {
			
			System.out.println("i : " + (i + 1));
		}
		
		// i ���� 1�������� 5�� ������������ 1�� ����
		System.out.println("-----5���� �ݺ�-----");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "�� �ݺ�");
		}
		
		// �����ϴ� ����
		// i���� 10�������� 6���� ũ�ų� ���������� 1�� �����ϸ鼭 �ݺ� ����
		// 10 9 8 7 6
		// return;
		System.out.println("-----1�� ����-----");
		for(int i = 10; i >= 6; i--) {
			System.out.println("i : " + i);
		}
		
		// ���� 1�� => 2�� ����!!
		// 1 3 5
		System.out.println("-----2�� ����-----");
		for(int i = 1; i < 6; i += 2) {
			System.out.println("i : " + i);
		}
		
		
	}
	

	public void mehtod3() {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		System.out.println("��ø for�� ");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
		System.out.println("-----for�� �ȿ� if�� ����-----");
		// for�� �ȿ� if�� ����
		System.out.println("for�� �ȿ� if�� ����");
		
		for(int i = 0; i < 30; i++) {
			
			System.out.println((i + 1) + " ��° �ݺ���");
			
			// if������ 10��° �ݺ����� ������ֱ�.
			if((i + 1) % 10 == 0) {
				System.out.println("��");
			}
			
		}
		
		
		
	}
	
	
	// �ǽ�
	// ������
	// ��������� ���� �Է¹޾Ƽ�
	// �������� ����غ���!
	// �޼ҵ� �̸� gugudan
	
	public void gugudan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� ���� �ñ��Ͻʴϱ� : ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}
		
		
	}
	
	
	
	
	
	
	
	
}
