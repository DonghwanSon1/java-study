package com.kh.chap06.run;

import com.kh.chap06.controller.MethodTest2;

public class Run2 {

	public static void main(String[] args) {
			//MethodTest2 Ŭ���� Run
		
			//MethodTest2 mt2 = new MethodTest2();
			// static : ��ü�� �������� �ʾƵ� ȣ�� ����!!
			// [ǥ����] Ŭ�����̸�.�޼����̸�(); ex) Math.random()
			
			MethodTest2.method1();
			System.out.println(MethodTest2.method2());
			MethodTest2.method3("�յ�ȯ", 26);
			System.out.println(MethodTest2.method4("�յ�ȯ", 26));
			

	}

}
