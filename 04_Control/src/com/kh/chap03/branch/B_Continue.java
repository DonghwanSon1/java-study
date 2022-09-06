package com.kh.chap03.branch;

import java.util.Arrays;
import java.util.Scanner;

public class B_Continue {

	/*
	 * continue : �ݺ��� �ȿ��� ���̴� ����!
	 * 
	 * continue�� ������ �� �ڿ� � ������ �ֵ簣�� ���������ʰ� pass
	 * ���� ����� �ݺ������� �ö󰡶�� ���� �ǹ�
	 * 
	 * 
	 */
	
	public void method1() {
		
		// 1���� 10���� Ȧ���� ���
		// 1 3 5 7 9
		
		// ��� 1. �ݺ����� 1�� ������Ű�鼭 �����µ�, Ȧ���� ��츸 ����ϵ��� ���ǹ��� ����Ѵ�.
		// 				if(i % 2 == 1) 
		
		// ���2. �������� �Ź� 2�� �����ϸ� ��
		// 		for(int i = 0; i <= 10; i += 2)
		
		// ��� 3. continue; ���
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
	}
	
	
	public void mehtod2() {
		
		// 1���� 100������ �� �հ�
		// ��, 7�ǹ������ ���� ���غ���
		
		int result = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				continue;
			}
			result += i;
		}
		System.out.println("�հ� : " + result);
		
	}
	
	
	public void mehtod3() {
		
		// 5ĭ¥�� ���� �迭�� ����� ���� �Է¹ޱ�
		// int[] arr = new int[5];
		// 1 ~ 100������ ���ڸ� �Է¹ޱ�
		// ���࿡ ������ �Ѿ ���ڸ� �Է¹޴´ٸ� "�ٽ� �Է��ϼ��� !!" ��� ����� �� �ٽ� �Է¹���
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("1~100������ ���� �Է����ּ��� : ");
			int temp = sc.nextInt();
			
			if(0 >= temp || temp > 100) {
				System.out.println("������ �̻��Ѱ� ���ƿ�~ �ٽ� �Է����ּ���!\n");
				i--;
				continue;
			}
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
}
