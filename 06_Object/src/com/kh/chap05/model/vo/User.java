package com.kh.chap05.model.vo;

public class User {
	
	
	// User u = new User();
	
	// [�ʵ��]
	// ȸ�����̵�, ��й�ȣ, �̸�, ����, ����
	private String id;
	private String pw;
	private String name;
	private int age;
	private char gender;
	
	
	
	
	
	// [�����ں�]
	/*
	 * ������ : �޼ҵ��̸��� Ŭ�����̸��� �����ϰ� �����ڷ����� ���� �޼���(��ȯ���� ����.)
	 * 
	 * [ǥ����]
	 * public Ŭ�����̸� (�Ű�����(��������)){
	 * 				�ش� �����ڸ� ���ؼ� ��ü ���� �� �����ϰ����ϴ� �ڵ�.
	 * }
	 * 
	 * ����) �޼����� ǥ����
	 * ���������� ��ȯ�� �޼����̸� (�Ű�����(��������)){
	 * 		�����Ϸ����ϴ� �ڵ�
	 * }
	 * 
	 * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. ��ü�� ���� �Ӹ� �ƴ϶� �Ű������� ���޵� ������ �ٷ� �ʵ忡 �ʱ�ȭ�� ����
	 * 
	 * �������� ����
	 * 1. �Ű������� ���� ������ => �⺻������
	 * 2. �Ű������� �ִ� ������ 
	 * -> ������ : �ʵ忡 ���� �ʱ�ȭ �� �� �ֳ� ������ ����
	 * 
	 * ������ �ۼ��� ���ǻ���
	 * 1. �ݵ��!!!!! �������� �̸��� Ŭ������ �̸��� �����ؾ���!!(��/�ҹ���!!)
	 * 2. ��ȯ���� �������� �ʴ´�. (�޼���� �����ϰ� ���ܼ� �򰥸� �� �ִ�.)
	 * 3. �����ڰ� ������ ������ ���������� �Ű������� �ߺ��� �Ǹ� �ȵȴ�. -> �����ε�
	 * 4. �Ű����� �����ڸ� ��������� �ۼ��ϰԵǸ� �⺻�����ڸ� JVM�� �ȸ������!
	 * 
	 * => �⺻�����ڸ� �ݵ�� ����� ������ ���̴°� ����!!
	 */
	
	/*public User() {
		// �⺻������(�Ű������� ����!)
		
		/*
		 * ���� ��ü�� ������ �������� ���!! => �޸� ������ �Ҵ� �ɶ�, ������ Ȯ���� ��!
		 * �⺻�����ڴ� ������ �ص� ������ ���� ����!
		 * �����ڸ� �ϳ��� �ȸ���� JVM�� �⺻�����ڸ� �ڵ����� �������!
		 * => �⺻�����ڴ� "�׻�" �ۼ�����!!
		 * 
		 */
		/*
		System.out.println("������ ȣ�� �� �ƴ�~~?");
	}*/
	
	public User() {}      // �̰� ������ �� �����!!
	
	// �Ű����� �ִ� ������!!!
	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public User(String id, String pw, String name, int age, char gender) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// [�޼����]
	//--------------setter------------
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//-----------getter--------------
	
	public String getId() {
		return this.id;
	}
	
	public String getPw() {
		return this.pw;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	//--------------info------------
	public String information() {
		return this.id + " => id \n" + this.pw + " => pw \n" + this.name + " => �̸� \n"
						+ this.age + " => ���� \n" + this.gender + " => ����";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
