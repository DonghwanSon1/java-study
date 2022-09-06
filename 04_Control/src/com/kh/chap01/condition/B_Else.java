package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	
	/*
	 * if-else
	 * 
	 * => �� �ƴϸ� ��
	 * 
	 * [ǥ����]
	 * if(���ǽ�){
	 * 		���ǽ��� true�϶� ������ �ڵ� -1��
 	 * } else {
	 * 		���ǽ��� false�϶� ������ �ڵ� -2��
	 * }
	 * 
	 * => ���ǽ��� ����� true�� ��� 1�� ����
	 * => ���ǽ��� ����� false�� ��� 2�� ����
	 * 
	 */
	
	
	public void method1() {
		
		// ������ ����
		// ���� �Է¹ް� ��� / 0 / ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num > 0) { // ����� ��� ����
			System.out.println("�����.");
			// ���ǽ��� ����� true�� ��� => else ���� �ǳ� �ڴ�.
			
		} else { // ����� �ƴ� ��� ����
			if(num == 0) { // 0�� ���
				System.out.println("0�̴�!");
			} else { // 0�� �ƴ� ���
				System.out.println("������");
			}
		}
		
	}
	
	public void method2() {
		
		// �ֹι�ȣ �Է� �� ���� �Ǻ��ϱ�
		// 1. ����ڷκ��� �ֹι�ȣ �Է¹ޱ� (String personId => xxxxxx-0xxxxxx
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է����ּ��� (- ����) : ");
		String personId = sc.nextLine();
		
		// 2. �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� ���ڸ� ���� charAt(index) => �ε��� 7��
		char gender = personId.charAt(7);
		
		
		// ��ȿ�� �ֹε�Ϲ�ȣ
		// ��ȿ���� �ʴ� �ֹε�Ϲ�ȣ
		if(gender >='1' && gender <= '4') {
			if(gender =='1' || gender == '3') {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("���� �Դϴ�.");
			} 
		}else {
			System.out.println("��ȿ���� �ʴ� �ֹι�ȣ�Դϴ�.");
			}
	
	}

	/*
	 * if-else if��
	 * 
	 * [ǥ����]
	 * if(���ǽ�1){
	 * 		���ǽ�1�� true�� ��� ������ �ڵ�1
	 * } else if(���ǽ�2){
	 * 		���ǽ�2�� true�� ��� ������ �ڵ�2
	 * } else if(���ǽ�3) {
	 * 		���ǽ�3�� true�� ��� ������ �ڵ�3
	 * } else if(���ǽ�4) {
	 * 		���ǽ�4�� true�� ��� ������ �ڵ�4
	 * } else {
	 * 		�տ��� ����ߴ� ���ǵ��� ��� false�� ��� ������ �ڵ�
	 * }
	 * 
	 * 
	 */
	
	
	public void method3() {
		
		// ���� �Է¹޾Ƽ� ���/ 0 / ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("��� �Դϴ�!");
		}else if(num < 0) {
			System.out.println("�����Դϴ�!");
		}else {
			System.out.println("0 �Դϴ�!");
		}
		
		
	}
	
	
	public void method4() {
		 
		// �ǽ�
		// ���̸� �Է¹ް� ���, û�ҳ�, ���� �Ǵ��ϱ�
		// 0 ~ 13 : ���
		// 14 ~ 19 : û�ҳ�
		// 20 ~ : ����
		// - : �������� �ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("�����Դϴ�!");
		} else if(age > 13) {
			System.out.println("û�ҳ��Դϴ�!");
		} else if(age >= 0) {
			System.out.println("��� �Դϴ�!");
		} else {
			System.out.println("�������� �ƴմϴ�.");
		}
		
		
		
	}
	
	public void method5() {
		
		String season = "";
		int temperature = 30;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����ü �� ���ΰ���? : ");
		int month = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			season = "�ܿ�";
			
			if(temperature <= -15) {
				season += " ���� �溸";
			} else if(temperature <= -12) {
				season += " ���� ���Ǻ�";
			}
		} else if(3 <= month && month <= 5) {
			season = "��";
		} else if(6 <= month && month <= 9) {
			season = "����";
			
			if(temperature >= 35) {
				season += "�����溸";
			} else if(temperature >= 30) {
				season += " �������Ǻ�";
			}
		} else if(10 <= month && month <= 11) {
			season = "����";
		} else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
		
		System.out.println("���� : " + season);
		
	}
	
	
	
	
	
	
	
	

}
