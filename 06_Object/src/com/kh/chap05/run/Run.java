package com.kh.chap05.run;

import com.kh.chap05.model.vo.User;

public class Run {

	public static void main(String[] args) {

		// User Ŭ���� Run
		
		// 1. �⺻�����ڸ� ����ؼ� ��ü�� ���� �� setter�� �̿��ؼ� �ʵ尪 �ʱ�ȭ
		User u = new User();
		
		u.setId("hi");
		u.setPw("pw");
		u.setName("�յ�ȯ");
		u.setAge(26);
		u.setGender('��');
		
		System.out.println("---------1.---------");
		System.out.println(u.information());
		
		// 2. ��ü ������ ���ÿ� �ʵ尪�� �ʱ�ȭ
		// ���̵�, ���, �̸�
		User u2 = new User("user0", "user0", "����2");
		
		System.out.println("--------2.--------");
		System.out.println(u2.information());
		
		// 3. �����ڷ� ��� �ʵ尪 �ʱ�ȭ!
		User u3 = new User("user03", "pass0", "����3" , 22, 'M');
		
		System.out.println("----------3.-------");
		System.out.println(u3.information());
		
		// ���� setter �� �ʿ��ұ�?
		// �߰��� ��й�ȣ�� �ٲ�� �Ǹ�?? ����������?? 
		

	}

}
