package com.kh.chap02.encapsultion.model.vo;

// �ʵ��, �����ں�, �޼����

public class Student {

	// �ʵ��
	
	/*
	 * ������ ��� �κ�
	 * 
	 * �ʵ� == ������� == Ŭ���� ���� 
	 * 
	 * ���������� �ڷ��� �ʵ��̸�;
	 */
	
	private String name;
	private int age;
	private char gender;
	
	
	
	
	
	
	
	// �����ں�
	
	
	// �޼����
	
	/*
	 * ����� �����ϴ� �κ�
	 * 
	 * ����������  ��ȯ�� �޼���ĺ���(�Ű�����) {
	 * 			�޼��� ȣ�� �� ������ �ڵ�;
	 * 
	 * }
	 * 
	 * ���� ������ : ȣ���� �� �ִ� ������ �������ش�.
	 * ��ȯ�� : �޼����� ������� �ڷ����� �������ش�. || void -> �����ٰ��� ����. 
	 * �Ű����� : �޼��� ȣ�� �� �Է°����� �־��ִ� ����. �ش� �޼��� �����߿��� ��� ������ ����. ������ ����
	 * 
	 */
	
	// �����͸� ��� �� �����ϴ� ����� �޼��� : setter �޼���
	
	/*
	 *  ��Ģ
	 *  
	 *  1. setter �޼���� ���� �����ϵ��� ������ �ϱ� ������ public ���� �����ڸ� �̿�
	 *  2. set�ʵ������ �̸����� ��Ÿ��ǥ���(camelCase)�� ��Ű���� �Ѵ�.
	 *  					ex) setName, setAge, seGender
	 *  3. ��� �ʵ忡 ���ؼ� ���� �� �ۼ��� ����� �Ѵ�. �ݵ��!!!
	 */
	
	// �̸��� ��� �� ������ �� �ִ� �޼���
	public void setName(String name) {
		
		this.name = name;
		// Ư�� ���� �ȿ����� �ش� ���� �ȿ� �ִ� ���� ���� �켱���� �ֵ�.
		// this.�� ������ ������ �Ű����� name = �Ű����� name �̷��� �ν��̵ȴ�.

	}
	
	// ���̸� ��� �� ������ �� �ִ� �޼���
	public void setAge(int age) {
		
		this.age = age;
	}

	// ������ ��� �� ������ �� �ִ� �޼���
	public void setGender(char gender) {
		
		this.gender = gender;
	}
	
	
	// �����͸� ��ȯ���ִ� ����� �޼��� : getter �޼���
	
	/*
	 * 1. getter �޼���� ���������� public�� ����Ѵ�.
	 * 2. get �ʵ������ ����, ��Ÿ�� ǥ���(camelCase)�� ����Ѵ�.
	 * 						ex) getName, getAge, getGender
	 * 3. ��� �ʵ忡 ���ؼ� �� �ۼ������ �Ѵ�.!! �ݵ�� !!
	 */
	
	// �̸��� ��ȯ���ִ� �޼���
	public String getName() {
		return this.name;
		// return ����� => ������� �����ְڴ�.!
		// �޼����� ��ȯ���ϰ� ����� ��ȯ���� ��������  Ȯ���غ��ߵȴ�.!
	}
	
	// ���̸� ��ȯ���ִ� �޼���
	public int getAge() {
		return this.age;
	}
	
	// ������ ��ȯ���ִ� �޼���
	public char getGender() {
		return this.gender;
		
	}
	
	// setter�� getter �޼��� �� ����������� ĸ��ȭ ��!
	
	
	
	// ���ڰ� �޼ҵ�!
	
	public String information() {
		
		// return this.name, this.age, this.gender;
		// ������� return�� �Ѱ��̿����Ѵ�.
		//String info = this.name + "���� ���̴� " + age + "���̰� ������ " + gender + "�Դϴ�.";
		//return info;
		return this.name + "���� ���̴� " + age + "���̰� ������ " + gender + "�Դϴ�.";
	
	}
	
	
	
	
	
	
	
	
	
	
}
