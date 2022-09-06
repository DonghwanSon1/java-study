package com.kh.operator;

public class C_Compound {

	/*
	 * ���� ���� ������ : "=" ���Կ�����
	 * �ٸ� ��� �����ڶ� ���Կ����� �����Ѱ�
	 * => �ڱ� �ڽŰ� �ش� ������� �Ŀ� �� ����� �ڱ��ڽ����� �����°�
	 *  
	 */
	
	// +=
	// -=
	// *=
	// /=
	// %=
	
	// ex) int a = 1;
	// a = a + 3;
	// => ������ a��� ���� 3�� ���ϰ� �� ��� ���� a�� �ٽ� �����ϰڴ�.
	// ==> a += 3;
	
	public void method1() {
		
		int num = 12;
		
		System.out.println("���� num : " + num); // 12
		
		// num�� 3 ���� ��Ű��
		num = num + 3;
		System.out.println("3�� ������Ų num : " + num); // 15
		
		// num�� 3 ������Ű��
		num += 3;
		System.out.println("3�� ������Ų num : " + num); // 18
		
		// num�� 3 ���ҽ�Ű��
		num -= 3;
		System.out.println("3�� ���ҽ�Ų num : " + num); // 15
		
		// num�� 3�� ������Ű��
		num *= 3;
		System.out.println("3�� ������Ų num : " + num); // 45
		
		// num�� 2�� ���ҽ�Ű��
		num /= 2;
		System.out.println("2�� ���ҽ�Ų num : " + num); // 22
		
		// num�� 2�� ���� �������� num�� ����
		num %= 2;
		System.out.println("num�� 2�� ���� �������� ������ �� : " + num); // 0
		
	}
	
	
}
