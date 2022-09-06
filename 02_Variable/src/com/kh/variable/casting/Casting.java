package com.kh.variable.casting;

public class Casting {
	
	/*
	 * �� ��ȯ(Type Casting) : ���� ����, �ڷ����� �ٲٴ� ����
	 * 
	 * ��ǻ�� �ȿ��� ���� ó���ϴ� ��Ģ
	 * 
	 * 1. =(���Կ�����)�� �������� ����, �������� ���� �ڷ����̿��� �Ѵ�.
	 *   => ���� �ڷ����� �ش�Ǵ� ���ͷ� ���� ������ �����ϴ�.
	 *   => �ڷ����� �ٸ� ��� ? ==> ���� �ٲ㼭 �����ؾ߉�
	 *   
	 * 2. ���� �ڷ����鳢���� ������ �����ϴ�.
	 * => �ٸ� �ڷ����鳢�� ������ �ϰ� �ʹ�? => �� �߿� �ϳ��� "����ȯ"�� �ؼ� ������ �ϳ��� �����ϰ� �������� ��
	 * 
	 * 3. ������ ������� ���� �ڷ����̿��� �Ѵ�.
	 * ex) 1 + 1 = 2(����), 1.1 + 1.1 = 2.2(�Ǽ�)
	 * 
	 * 
	 * [ǥ����]
	 * (�ٲ��ڷ��� )�� 
	 * ����ȯ ������, cast ������
	 * 
	 * ����ȯ�� ����
	 * 
	 * 1. �ڵ�����ȯ(promotion) : �ڵ����� ����ȯ�� ����ȴ�.
	 * => ���� ũ���� �ڷ��� -> ū ũ���� �ڷ������� ��ȯ�Ҷ�
	 * => ���� ����ȯ�� �� �ʿ䰡 ����
	 * 
	 * 2. ��������ȯ(Type Casting) : �ڵ�����ȯ�� ���� ���� ��쿡 ����ȴ�.
	 * => ���� ���� ����ȯ�� �ؾ��� �� -> ()�� ���ؼ� ����!!
	 * => ū ũ���� �ڷ��� -> ���� ũ���� �ڷ����϶�
	 * => ���� �ս��� �߻��� �� ����, �����ϰ� �ؾ��Ѵ�.
	 * 	
	 */
	
	
	// �ڵ� ����ȯ : ���� ����Ʈ -> ū ����Ʈ
	public void autoCasting() {
		
		// 1. int(4byte, ����) -> double(8byte, �Ǽ�)
		
		int i1 = 10;
		System.out.println(i1);
		
		double d1 = (double)i1;
		System.out.println(d1);
		
		
		
		
		// Ư�����̽� 3. long (8byte, ����) -> float(4byte, �Ǽ�)
		// ������ �Ǽ��� ��� �� ū �������� ������ ���� �������� �Ǽ��� ������ ����!!
		// ��?? 4byte�� float���� logn������ ������ �ִ� ���� ������ �� ũ�� �����̴�.
		
		// ���� -> 1, 2, 3
		// �Ǽ� -> 1, 1.000000, 1.0000001 ~~
		
		
		long l4 = 1000000L;
		float f5 = l4;
		System.out.println(f5);

		
		// Ư�� ���̽� 4. char(2byte) <-> int(4byte) : char�� int�� ����� ����ȯ�� ����
		// �ƽ�Ű�ڵ�ǥ
		
		char ch = 98; // => �ƽ�Ű�ڵ�ǥ�� ���� 98�� 'b'�̱� ������ 'b'�� ���´�.
		char ch2 = 'b';
		System.out.println(ch + "��" + ch2 + "?");
		
		int num = ch;
		System.out.println(num);
		
		// ctrl + art + ȭ��ǥ ���Ʒ�  => �ູ��
		// ctrl + d => �� ����
		// ctrl + / => �ּ�ó��
		// ctrl +  +,- => ȭ�� Ȯ��, ���
		// ctrl + shift + o  // import ����Ű
		
//		System.out.println("\n\n");
//		System.out.println('b');
//		System.out.println((int)'b');
//		System.out.println('b' + 2);
//		System.out.println('b' + (char)2);
//		System.out.println((char)2 + (char)'2'); // �ƽ�Ű�ڵ�ǥ������ '2'�� 50�̱� ������ 52�� ���´�.
//		System.out.println((char)2 + (char)2);
		
		int a = 2; // ���� 2
//		System.out.println(a);
//		System.out.println((char)a);
		
		char c = '2';
//		System.out.println(c);
		
		// �� ������ : ����� ������ ���� ���ؼ� ������� ��ȯ
		// ����  : true , false
		// ==
//		System.out.println(2 == '2'); // false
//		System.out.println(2 == a); // true
//		System.out.println('2' == c); //true
//		System.out.println(a == c); // false
		
//		System.out.println(2 == (int)'2'); // 2�� 50 -> false
//		System.out.println((char)2 == '2'); //  �� '2' -> false
//		System.out.println((int)a == int(c)); // 2�� 50 -> false
		
		
		// Ư�����̽� 5. byte, short���� ����
		
		byte b1 = 126;
		byte b2 = 2;
		
		System.out.println(b1 + b2);
		// ������� int�� => CPU�� ���� ó���ϴ� �⺻ ũ�� int���� ũ�� (4byte)
		
		byte b3 = (byte)128;
		System.out.println(b3);
		
	}
	
	// ��������ȯ : ū ����Ʈ -> ���� ����Ʈ
	
	public void forceCasting() {
		
		// ����� ����ȯ�̶�� ��.
		// (�ٲ��ڷ���) ��
		
		// 1. double(8byte) -> float(4byte)
		
		float f1 = 4.0f;
		double d2 = 8.0;
		
		float f2 = (float)d2;
		
		// 2. double(8byte) -> int(4byte)
		
		double d3 = 10.89;
		int i3 = (int)d3;
		
		
		System.out.println(i3);
		// 0.89 �Ҽ��� �� �κ��� ���� �Ǿ���. => �����Ͱ� �ս�
		
		int iNum = 10;
		double dNum = 8.99;
		
		System.out.println(iNum + dNum); // 18.99
		// BigDecimal -> Ŭ����
		
		int result = iNum + (int)dNum;
		System.out.println(result);
		
		result = (int)(iNum + dNum);
		System.out.println(result);
		
		
		
		
	}

	
	
	
	
	
	
	
}
