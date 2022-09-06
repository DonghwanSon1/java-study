package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * �迭 ����
	 * 1. ���� ���� : �迭�� �ּҰ����� ����
	 * 2. ���� ���� : ������ ���ο� �迭�� �ϳ� �����ؼ� ���� ���ΰ����� ����
	 * 
	 */
	
	
	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("-- ���� �迭 ��� --");
		
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		int[] copy = origin;
		
		System.out.println("\n-- ���� �迭 ��� --");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		origin[2] = 99;
		
		System.out.println("\n-- ���� �迭 ��� --");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n-- ���� �迭 ��� --");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// �и��� ���� �迭�� ������ �ߴµ�
		// ������ �迭�� ������??
		// => �ΰ� �Ȱ���??
		
		System.out.println();
		System.out.println("--�ؽ��ڵ�--");
		System.out.println("origin : " + origin.hashCode());
		System.out.println("copy : " + copy.hashCode());
		// �ؽ��ڵ尡 �����ϴٰ��ؼ� �ΰ��� ������ ���ٰ� 100% ����� �� �� ������ �ؽ��ڵ尡 �ٸ��� �ΰ��� ������ �ٸ���.
		// ���� ���� => �迭�� �ּҰ��� ����Ǿ� ������ ���纻�� ����.

		
	}
	
	// 2. ���� ���� 
	public void method2() {
		
		
		int[] origin = {1, 2, 3, 4, 5};
		// 1�ܰ� : ������ ������ ũ���� �� �迭 ���� �� �Ҵ�
		int[] copy = new int[origin.length];
		
		// 2�ܰ� : ���� �ִ´�.
		//
		// copy[0] = origin[0]
		// copy[1] = origin[1]
		// copy[2] = origin[2]
		
		// copy[���� �ְ����ϴ� �ε��� ] = origin[���� �����ϰ����ϴ� �ε���]
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		System.out.println("\n-- ���� �迭 ��� --");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n-- ���� �迭 ��� --");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		System.out.println();
		System.out.println("--�ؽ��ڵ�--");
		System.out.println("origin : " + origin.hashCode());
		System.out.println("copy : " + copy.hashCode());
		// ���� �츮�� ���ϴ� �迭 ���� ������ ����Ȱ��� Ȯ�� ����!!
		// �ּҰ� ���� X
		
		
	}
	
	// ���� ���� 2. arraycopy() �޼ҵ� �̿�
	public void method3() {
		
		// ���ο� �迭�� ������ ��
		// System Ŭ���������� arraycopy() ȣ��
		// �� �� �ε������� �� ���� ��� ��ġ���� �������� ���� ���� ����!! ()�ȿ� �ۼ�!!
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10];
		
		/*
		 * [ǥ����]
		 * System.arraycopy(�����迭�̸�, �����迭���� ���縦 ������ �ε���, 
		 * 					���纻�迭�̸�, ���纻�迭���� ���簡 ���۵� �ε���, ������ ����)
		 * 
		 */
		
		System.arraycopy(origin, 0, copy, 0, 5);
		System.arraycopy(origin, 0, copy, 3, 5);
		// System.arraycopy(origin, 2, copy, 9, 2); // (10�� �ε��� ���� ����) ArrayIndexOutOfBoundsException
		
		System.out.println("---���� ���---");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin : " + origin.hashCode());
		System.out.println("copy : " + copy.hashCode());
		
	}
	
	// ���� ���� 3. copyOf() ���
	public void method4() {
		
		// ArraysŬ�������� �����ϴ� copyOf() 
		int[] origin = {1, 2, 3, 4, 5};
		
		// [ǥ����]
		// ���纻 �迭 = Arrays.copyOf(�����迭�̸�, ������ ����)
		int[] copy = Arrays.copyOf(origin, 10);
		
		// ���� �迭���� ū ���� �����ϸ� ���纻 �迭�� ��������
		
		System.out.println("---���� ���---");
			for(int i = 0; i < copy.length; i++) {
				System.out.print(copy[i] + " ");
			}
				
		/*
		 * System.arraycopy()
		 * ��� �ε������� ��� ��� ��ġ�� �ε����� ������ ������ ��� ���� ����
		 * 
		 * Arrays.copyOf()
		 * ������ �����迭�� 0�� �ε������� ���簡 ����(���� ������ ������ŭ)
		 * 		
		 */
				

	}
	
	
	// ���� ���� 4. clone()
	public void method5() {
		
		// [ǥ����]
		// ���纻�迭�̸� = �����迭�̸�.clone();
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���� ����
		// int[] copy = origin;
		
		// ���� ����
		int[] copy = origin.clone();
		// �ε����� ���� ����X, ������ ���� ����X => �����迭�� ������ �Ȱ���.
		
		// toString => �̻Ѱ� �� ����~~
		// Arrays.toString(������ ����ϰ� ���� �迭�� �ĺ��ڸ� �Է�);
		// �迭�� ��Ҹ� �������
		// ex) [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(copy));
		
		System.out.println("---���� ���---");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin : " + origin.hashCode());
		System.out.println("copy : " + copy.hashCode());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
