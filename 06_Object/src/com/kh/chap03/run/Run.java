package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		// == ���� ���� ������ �ڷ���(1. �����ڷ���, 2. �ּҰ��� ����, 3. �������� �ڷ����� ������ ���� ���� + ���)
		// == ����� ���� �ڷ���
		// person �̶�� Ŭ������ ���� ��ü ����
		
		
		Person person = new Person(); // �ν��Ͻ�ȭ
		
		
		// �⺻���� ������� => �⺻���� 0, 0.0, ����  // �������� null
		System.out.println(person.information());
		
		
		// �� ���� => setter
		person.setPNum("010-9698-0336");
		person.setAge(24);
		person.setEmail("sdh549@naver.com");
		person.setGender('��');
		person.setName("������");
		person.setNum("970514-111111");
		
		System.out.println(person.information());
	}

}
