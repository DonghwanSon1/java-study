package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break; : break���� ������ ���� "���� ����� �ݺ���"�� ����������.
	 * 			�ش� break���� �����ִ� �ݺ��� "�Ѱ�"�� ��������!!!!
	 * 
	 * �� ������ �� : switch�� �ȿ� break;�� �ٸ�����
	 * 				switch�� ���ο� �����ϴ� break�� �ش� switch���� ���������� �뵵�� ���̴�!!
	 * 
	 * 
	 */
	
	
	public void method1() {
		
		// �Ź� �ݺ������� ���Ӱ� �߻��Ǵ� ������ ���(1~100) => �����ϰ�
		// �� �������� Ȧ���� ��� �ݺ����� ���������� �Ұ��̴�.!
		
		// 1. for(;;)		=> ���ѷ���
		// 2. while(true)	=> ���ѷ���
		
		for(;;) {
			
			int random = (int)(Math.random() * 100) + 1;
			
			if(random % 2 == 1) {
				System.out.println("Ȧ���� ���ͼ� �����ϰڽ��ϴ�.");
				break;
			}else {
			System.out.println(random);
			}
		}
		
		
	}
	
	public void method2() {
		
		// �Ź� ����ڿ��� ���ڿ��� �Է� ���� ��
		// �ش� ���ڿ��� ���̸� �������!
		// ��, ����ڰ� "exit"�� �Է��� ��� �ݺ����� ���������� ������
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڿ��� �Է��� �ּ��� > ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println(str.length());
			
		}
		
	}
	
	
	
	public void method3() {
		
		// �� �� ����ڷκ��� ���� �Է¹ް�
		// �ش� ���ڰ� ������ "���α׷��� �����մϴ�"��� ������ ����غ�����~
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڸ� �Է��� �ּ��� > ");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("���α׷��� �����մϴ�~");
				break;
			}
		}
		

		
	}
	
	
	/*
	 * ������(+,-,*,/,%)�� ���� �ΰ��� �Է¹޾� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.
	 * ��, �ش� ���α׷��� ������ �Է¿� "exit"�̶�� ���� ���ö����� ���� �ݺ��ϸ�
	 * "exit"�� ������ "���α׷��� �����մϴ�."��� ����ϰ� �����մϴ�.
	 * 
	 * ����, �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
	 * "0���δ� ���� �� �����ϴ�. �ٽ��Է����ּ���"�� ����ϰ�,
	 * ���� �����ڸ� �Է½� "���� ������ �Դϴ�. �ٽ��Է����ּ���." ��� ����ϰ�
	 * �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
	 * 
	 * 
	 */
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������(+,-,*,/,%)�� �Է����ּ��� > ");
			String math = sc.next();
			
			if(math.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			} 
			
			System.out.println("ù��° ���ڸ� �Է����ּ��� > ");
			int num1 = sc.nextInt();
			
			System.out.println("�ι�° ���ڸ� �Է����ּ��� > ");
			int num2 = sc.nextInt();
			
			int result = 0;
			boolean flag = true;
			
			switch(math) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				if(num2 == 0) {
					System.out.println("0���δ� ���� �� �����ϴ�. �ٽ��Է����ּ���");
					flag = false;
				} else {
					result = num1 / num2;
				}
				break;
			case "%" :
				result = num1 % num2;
				break;
			default :
				System.out.println("���� ������ �Դϴ�. �ٽ��Է����ּ���.");
				flag = false;
			}
			
			if(flag) {
			System.out.printf("%d %s %d = %d \n\n", num1, math, num2, result);
			}
			
		}
		
		// if, else, else if, for, while, do-while, switch, break
		// return, print, operator, String, primitiveVariable
		// method, array, scanner
	}
	
	
	
	
	
	
	
	
	
}
