package com.kh.chap01.condition;

import java.util.Scanner;

public class HomeWork {

	public void HomeWork1 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ���! : ");
		
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1 : 
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2 :
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3 :
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4 :
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7 :
			System.out.println("���� �޴��Դϴ�.");
			break;
		default :
			System.out.println("���� �޴��Դϴ�.");
			return;
		
		}
		
		
	}
	
	
	
	public void HomeWork2() {
		
		
		System.out.println("-----2�� ����-----");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �Է��� �ּ��� : ");
		int kor = sc.nextInt();
		
		System.out.println("�������� �Է��� �ּ��� : ");
		int eg = sc.nextInt();
		
		System.out.println("�������� �Է��� �ּ��� : ");
		int math = sc.nextInt();
		
	
		int sum = kor + eg + math;
		double ev = (kor + eg + math) / 3;
	
		if(kor >= 40 && eg >= 40 && math >= 40 && ev >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eg);
			System.out.println("�հ� : " + sum + "\n��� : " + ev + "\n�����մϴ�. �հ��Դϴ�.");
		} else {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eg);
			System.out.println("���հ��Դϴ�.");
		}
	
	
	}
	
	public void HomeWork3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ���  : ");
		
		String id = sc.nextLine();
	
		switch(id) {
		
		case "������" :
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "ȸ��" :
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "��ȸ��" :
			 System.out.println("�Խñ� ��ȸ");
			 break;
		default :
			System.out.println("�߸� �Է��߽��ϴ�.");
			return;
		}
		
	}
	
	
	public void HomeWork4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ǿ����� 1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println("�����ڸ� �Է�(+, -, *, /, %) : ");
		char math = sc.next().charAt(0);
		
		double result;
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("����� �Է����ּ���!");
		} else {
			switch(math) {
			
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = (double)num1 / (double)num2;
				break;
			case '%' :
				result = num1 % num2;
				break;
			default :
				System.out.println("�߸� �Է��ϼ˽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			System.out.printf("%d %c %d = %.2f", num1, math, num2, result);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
