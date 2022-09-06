package com.kh.variable;

import java.util.Scanner; // 1�ܰ� ��!

public class B_KeyboardInput {

	/*
	 * Ű������� ������� �Է� ���� ��������?
	 * System.out => ���
	 * �ڹٿ��� �̹� �����ϰ� �ִ� java.util.Scanner ��� Ŭ������ ����ϸ� ��!
	 * Scanner Ŭ�����ȿ� �ִ� �޼������ ȣ���ؼ� ����Ѵ�.
	 * 
	 */

	public void inputTest() {
	
		Scanner sc = new Scanner(System.in);
		// System.in : �Է¹��� ������ �޾Ƶ��̰ڵ�. (����Ʈ ������)
	
		// ������� ���������� �Է¹޾� ����غ���
		
		// �Է¹ް��� �ϴ� ������ ���� �����ؼ� �Է��� �����ؾ��Ѵ�.
		System.out.print("����� �̸��� �����Դϱ�? : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼���
		// nextLine() : ����ڰ� �Է��� �� �� ���鿡 �����ϰ� �� ������ �� �о��. ���๮��������
		// next() : ����ڰ� �Է��� �� �� ������ ������� ���� ���������� �Է� ����
		// sc.nextInt() => ������ �Է��Ҷ�!
		// sc.nextDouble() => �Ǽ��� �Է��Ҷ�!
		// sc.nextLine() => ���ۿ��� ���� ���������� ��� ���� �������� 
		//                  "����" 
		
		String name = sc.next();
		System.out.println("���̸��� " + name + "�Դϴ�!");
		
		System.out.print("����� ���̴� ����Դϱ�? : ");
		int age = sc.nextInt();
		System.out.println("�����̴� " + age + "�Դϴ�!");

		System.out.print("����� Ű�� �ġ �Դϱ�?(�Ҽ��� ù°�ڸ����� �Է����ּ���) : ");
		double height = sc.nextDouble();
		System.out.println("��Ű�� " + height + "�Դϴ�!");
		
		sc.nextLine();
		System.out.print("�ּҰ� ��� �Ǽ���? ");
		String address = sc.nextLine();
		System.out.println("�ּ� : " + address);
		
		
	
	}

}