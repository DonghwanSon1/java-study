package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class Run {

	public static void main(String[] args) {
		
		
		// Person p = new Person();
		// Person�� �߻�Ŭ������ ��ü ���� �Ұ���!
		
		// ������ ���� �������̽� ���� ��
	/*	Person mom = new Mother("����", 160, 50, "���");
		Person baby = new Baby("����", 90, 2.3 );
		
		System.out.println(mom);
		System.out.println(baby);
		
		// ��԰�, ���ڱ�
		mom.eat(); // ���� : ������ + 10, Ű + 0.0001
		baby.eat(); // �ֱ� : ������ + 5, Ű + 0.5
		mom.sleep(); // ���� : Ű + 0.00001 
		baby.sleep(); // �ֱ� : Ű + 0.1
		System.out.println("========= �԰� �ڱ� ============");
		System.out.println(mom);
		System.out.println(baby);
		
		*/
		
		// 2. �������̽� ���� ��
		// Basic b = new Basic(); // ��ü ���� �Ұ���
		
		Basic mom = new Mother("����", 160, 50, "���");
		Basic baby = new Baby("����", 90, 2.3 );
		
		System.out.println(mom);
		System.out.println(baby);
		
		// ��԰�, ���ڱ�
		mom.eat(); // ���� : ������ + 10, Ű + 0.0001
		baby.eat(); // �ֱ� : ������ + 5, Ű + 0.5
		mom.sleep(); // ���� : Ű + 0.00001 
		baby.sleep(); // �ֱ� : Ű + 0.1
		System.out.println("========= �԰� �ڱ� ============");
		System.out.println(mom);
		System.out.println(baby);
		
		
		
		
		
		
		
		

	}

}
