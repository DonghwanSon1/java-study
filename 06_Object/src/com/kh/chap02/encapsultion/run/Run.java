package com.kh.chap02.encapsultion.run;

import com.kh.chap02.encapsultion.model.vo.Student;

public class Run {
	
	/*
	 * ĸ��ȭ ������ ���� �Ϻ��� Ŭ���� ���¸� ���߰� ����!!
	 * 
	 * 
	 * ĸ��ȭ�� ���� ������ : �ܺηκ��� ���������� �����ϱ� ������
	 * 				  �Ժη� ���� �����ǰų� ��ȸ�� ���� ���ϴ� ������ �߻�
	 * 
	 * ���������� 3��� : ��м�, ���Ἲ, ���뼺
	 * => ĸ��ȭ �۾� : �������� ��� �� �ϳ�!
	 * 				�������� "��������"�� ��Ģ�����Ͽ� �ܺηκ��� ���������� ����!
	 * 				��, ��ſ� ���������γ��� ó��(�� ����, ��ȸ)�� �� �� �ְԲ� ���������!
	 * 
	 * => ĸ��ȭ �۾��� 2�ܰ�
	 * 1. ���� ����� : public ��� private���� ���������ڸ� �ٲ��ش�.
	 * 2. ���������� ���� ó���� �� �ִ� �޼ҵ带 �����.
	 * 
	 * 
	 */

	//���������� (�����) ��ȯ�� �޼����̸�(�Ű�����)
	public static void main(String[] args) {
		
		Student kim = new Student();
		/*
		kim.name = "���";
		kim.age = 20;
		kim.gender = "M";
		
		System.out.println(kim.name);
		System.out.println(kim.age);
		System.out.println(kim.gender);
		*/
		// �ʵ尡 ������ �ʾƼ� ���� �߻�!! => private���� �����߱� ������
		// ���� ���� ���� ������ �Ұ����Ѵ�.
		// ���������� �������� ���������γ��� ������ �� �ְԲ� ������!! => getter/ setter �޼��� �����!
		
		
		kim.setName("�յ�ȯ");
		kim.setAge(20);
		kim.setGender('��');
		
		/*
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		System.out.println(kim.getGender());
		*/
		System.out.println(kim.information());
		
		
		
		
		
		

	}

}
