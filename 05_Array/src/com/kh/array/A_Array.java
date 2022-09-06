package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	
	
	// ����(Variable) : �޸𸮿� �����Ͱ��� �����ϱ� ���� ����
	
	// ���� : �ϳ��� ������ �ϳ��� ���� ���� �� �ִ�.
	// 1. ���������� ũ�Ⱑ �������ִ�.
	// 2. �ڷ����� �����Ǿ� �ִ�.
	// 3. stack �޸�
	// 4. ���� �ٲ� �� �ִ�.
	// 5. ����ȯ�� �����ϴ�.
	// 6. �ĺ��ڸ� ���� �� �ִ�.
	// 7. ������ �����ϴ�.
	// 8. �ʱ�ȭ�� �ѹ� �ۿ� ���Ѵ�.
	// 9. �ڵ�� �ȿ��� ����ǰ� ���ȴ�.
	// 10. ������ �ϳ���. => ���� �ϳ��� �޴´�.
	// 11. �������� �ּҰ��� �����Ѵ�.
	
	// �迭(Array) : �ϳ��� ������ �������� ���� ���� �� �ִ�.
	//				��, ��"���� �ڷ����� ��"�̾�� �Ѵ�.��
	//				=> �迭�� �� �ε��� �ڸ��� ���� ���� ��� �ε����� "0"���� �����Ѵ�.
	
	
	public void method1() {
		
		// �迭�� �� ����ұ�??
		// ������ �̿��ؼ� ���α׷����� �ϸ� ..?
		// 0, 1, 2, 3, 4, 5 .. ���� �þ������ ������ ���� ����ϰ� �ʹ�.
		
		// ������ 100����.. ���ٴ�
		// ���� �ذ����� �迭!
		
		/*
		 * ������ ��쿣?
		 * �ڷ��� �����ĺ���;
		 * 
		 * �迩 �����!
		 * 1) �ڷ��� �迭�ĺ���[];
		 * 2) �ڷ���[] �迭�ĺ���; => ������ �ַ� ����� ��.
		 * 
		 */
		
		/*
		int a; // ���� ����
		
		int arr1[]; // 1�� ������� int�� �迭�� ����!
		
		int[] arr2; // 2�� ������� int�� �迭�� ����!
		
		*/		
		
		// 2. �迭 �Ҵ�
		
		/*
		 * �� �迭�� ��� ���� ���� �迭�� ũ�⸦ �����ִ� ����
		 * ������ ������ŭ ���� �� ������ �������
		 * 
		 * [ǥ����]
		 * arr = new int[���ϴ� ĭ ��];
		 * int[] arr = new int[5]; // ����� ���ÿ� �Ҵ�
		 * 
		 * �迭�� �������̴�!
		 * ������ : new
		 * 
		 * 
		 */
		
		int[] arr1;
		arr1 = new int[15];
		
		int[] arr2 = new int[15];
		
		// 3. �迭�� �� �ε����� �� ����
		
		/*
		 * [ǥ����]
		 * �迭�̸� [�ε���] = ��; // 0���� ����!!
		 * 
		 */
		
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		
		System.out.println("\n arr2 : ");
		
		// �迭�� ���� ū ���� : �ݺ����� ��밡��
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		
	}
	
	public void method2() {
		
		// String�� �뿭
		// 1. �迭�� ����� �Ҵ� names[30]
		
		String[] name = new String[30];
		
		// 2. �迭�� �ε����� ���� ����
		name [0] = "�յ�ȯ";
		//  ...
		//  ...
		//  ...
		//  ...
		name [29] = "�����";
		
		//name[100] = "�̽�ö"; // ���������� �°� �� ����. ������ Ʋ���ž���.
		// ArrayIndexOutOfBoundsException : <- ����
		// �迭�� �ε��� ������ �����.
		// at com.kh.array.A_Array.method2(A_Array:122) <- ���⼭ �����! ��ġ!
		// A_Array��� Ŭ������ method2()���� 122�࿡�� ������ ������̴�.
		
		System.out.println("name �迭�� ũ�� : " + name.length);
		
		System.out.println();
		
		for(int i = 0; i < name.length; i++) {
			System.out.printf("�⼮��ȣ %d�� %s \n", i+1, name[i]); // ���������δ� �°� ����~
		}
		// �ε����� �������?? => ������ 0������!!!!!!!!
	
	}
	
	public void method3() {
		
		// ������ �� 5��
		// int�� �迭�� �����ϰ�
		// �ݺ����� �̿��Ͽ� �հ� ����ϱ�
		
		int[] arr = new int[5]; // 0, 1, 2, 3, 4
			
		arr [0] = 5;
		arr [1] = 15;
		arr [2] = 556234;
		arr [3] = 5424;
		arr [4] = 543543;
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("�հ� : " + sum);
		
	}
	
	
	public void method4() {
		
		// �ǽ�
		// ����ڷκ��� �Է��� ���� �迭�� ���� ��Ƽ�
		// �ش� �迭���� ���� ���� ��, �� �ּҰ��� ���ϴ� �޼ҵ带 ������!
		// �迭�� �ټ�ĭ ¥����
	
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i <= arr.length-1; i++) {
			System.out.println("���ڸ� �����ּ��� : ");
			arr[i] = sc.nextInt();
		}
	
		int min = arr[0];
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		
		}
		
		System.out.println("�ּҰ� : " + min);
	}
	
	
	public void method5() {
		
		// 1. �迭���� + �Ҵ�
		int[] iArr = new int[3]; // 0��, 1��, 2��
		double[] dArr = new double[5]; // 0��, 1��, 2��, 3��, 4��
		
		// �迭�̸�.length : �迭�� ����(ũ��) => ����
		System.out.println("iArr�� ũ�� : " + iArr.length); // 3
		System.out.println("dArr�� ũ�� : " + dArr.length); // 5
		
//		int i;
//		double d;
//		System.out.println(i);
//		System.out.println(d);
		
		System.out.println(iArr[0]); // 0
		System.out.println(dArr[0]); // 0.0
		// �ʱ�ȭ�� ���������� �ʾƵ� �ڵ����� �ʱⰪ�� �������
		
		/*
		 * �⺻ �ڷ��� : boolean, char, byte, short, int, long, float, double
		 * => ���� ���� �ٷ� ���� �� �ִ� ���� : �Ϲ� ����
		 * 
		 * ���� �ڷ��� : int[], double[], short[]... String
		 * 
		 * 
		 */
		
		/*
		String[] KH���������������� = new String[3];
		
		KH����������������[0] = "A������";
		KH����������������[1] = "V������";
		KH����������������[2] = "C������";
		
		System.out.println(KH����������������[2]);
		
		*/
		
		// �����ڷ��������� == �񱳽� �ּҰ��� ���ϱ� ������ �츮�� ���ϴ� ���� ���� �� ����.
		// ���ڿ�.equals("���ҹ��ڿ�");
		
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("dArr�� �ؽ��ڵ� �� : " + dArr.hashCode());
		// �ؽ��ڵ� : �ּҰ��� �������� ���·� ��Ÿ�����̴�.
		
		int[] iArr2 = new int[3];
		System.out.println("iArr == iArr2 ? : " + (iArr == iArr2)); // false
		System.out.println("iArr2�� �ؽ��ڵ� �� : " + iArr2.hashCode());
		
		// �ݺ���
		// 0�� �ε������� ������ �ε������� 1�� �����ϸ鼭 ���������� ��� ����
		// ������ �ε��� == �迭�� ũ�� -1 (length -1)		
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i] + " ");
		}
		for(int i = 0; i <= iArr.length-1; i++) {
			System.out.println(iArr[i] + " ");
		}
	}
	
	
	/*
	 * �迭�� �ƽ����� ?
	 * 
	 * �ѹ� ������ �迭�� ũ��� ���� �Ұ�!!
	 * => �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� ?
	 * 		-> ��¿�� ���� �迭�� �ٽ� �������Ѵ�.
	 */
	 
	public void method6() {
		
		String[] sArr = new String[3];
		
		sArr[0] = "��";
		sArr[1] = "��";
		sArr[2] = "ȯ";
		
		System.out.println("sArr�� �ؽ��ڵ� : " + sArr.hashCode());
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]);
		}
		
		sArr = new String[5];
		
		System.out.println();
		System.out.println("---- sArr�� �׾��� ��Ƴ���?? ----");
		System.out.println("�׾��� ��� sArr�� �ؽ��ڵ� : " + sArr.hashCode());
		System.out.println();
		
		/*
		 * ������ ������ ������ �迭��??
		 * Heap������ �յ� ���ٴϴٰ� �����ð��� ������
		 * ������ �÷���(GC)�� ���������ش�!! : �ڵ� �޸� ����
		 * 
		 * �迭�� �׻� ������ �ּҰ��� �ο� �ȴ�.
		 * ���� �迭 �̸��� �Ҵ縸 �ٽ��ϸ�?
		 * => ������ �����ϰ� �ֶ� ������ ����� ���ο� �迭�� ����ȴ�.
		 * => ���ο� ���� �����Ѵ�. // ��ѱ��� ����
		 * 
		 * �ּҰ��� �ٸ��� �ٸ� �迭�̴� == O
		 * 
		 * 
		 * 
		 */
		
		
		// ���� ������� ���� �ʹٸ�?
		
		sArr = null; // nul : �ƹ��͵� �������� ������ �ǹ�
		
		//sArr[0] = "�����ϼ���";
		// NullPointerException (����)
		
		//System.out.println(sArr[0]);
		
		
		/*
		 * �⺻ �ڷ��� �⺻����
		 * 
		 * int a = 0;
		 * double d = 0.0;
		 * char c = ' ';
		 * 
		 * �����ڷ����� �⺻����  ?? => null(�ּҰ��� ����.)
		 * 
		 * int[] iArr = null;
		 * double[] dArr =null;
		 * scanner sc = null;
		 * 
		 * 
		 */
		
		// OO�� �迭 ���� Scanner ����
		
		String st = new String();
		
		System.out.println(st); // " "
		
		// String�� �������������� �ڵ����� null�� �ʱ�ȭ�� ���� �ʴ´�.
		String str = null;
		System.out.println(str);
		
		
		
	}
	
	public void method7() {
		
		
		// �ǽ�
		// 10���� ���� ������ �� �ִ� �������迭�� ���� �� �Ҵ��ϰ�
		// 1 ~ 10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� ��
		// �迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
		
		//ex)
		// 1 5 8  1 3 4 6 7 8 10
		// �ִ밪 : 10
		// �ּҰ� : 1
		
		int[] arr = new int[10];
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i <= arr.length-1; i++ ) {
			if(min > arr[i]) {
				min = arr[i];
			} else if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("\n�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);
		

	}
	
	
	
	public void rotto() {
		
		// �ζ� ��ȣ �ڵ� ���� ���α׷��� �ۼ��ϴµ� �ߺ� �� ���� ����ϼ���.
		
		// ex.
		// 10 31 2 5 8 28
		
		int[] arr = new int[6];
		
		int num = arr[0];
		
		for(int i = 0; i <= arr.length-1; i++) {
			
			arr[i] = (int)(Math.random() * 45) + 1;
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					} 
				}
			}
		}
		
		Arrays.sort(arr); // ������������ ����
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	// �޼ҵ�  == "�׻� Ư�� �ڷ������� ����� �� �ִ� ���"
	// �Լ�
	// println()
	// nextLine(), nextDouble()...
	// equals()
	// toString()
	// length()
	// charAt() 
	
	public void method8() {
		
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ(����)���� �ѹ��� ������ ���
		
		// ��� 1.
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 3;
		 * arr[2] = 8;
		 * arr[3] = 5;
		 * 
		 */
		int[] arr1 = new int[] {1, 3, 8, 5};
		
		
		// ��� 2.
		
		int[] arr2 = {1, 3, 8, 5};
		
		System.out.println("arr1 == arr2 ? " + (arr1 == arr2));
		
		String[] students = {"���ѿ�", "����", "�Ǽ���", "���"}; // =>�ϵ��ڵ��̶�� �Ѵ�.
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
