package com.kh.chap03.model.vo;

public class Person {

	// ����� ���� ����
	// �ֹι�ȣ, �̸�, ����, ����, �޴�����ȣ, �̸����ּ�
	
	
	// [�ʵ��]
	// �ʵ� == ������� == Ŭ�������� == �ν��Ͻ� ����
	private String perSon_Num;
	private String perSon_Name;
	private int perSon_Age;
	private char perSon_Gender;
	private String perSon_PNum;
	private String perSon_Email;
	
	
	
	// [�����ں�]
	
	// [�޼ҵ��]
	//-------------setter---------------
	public void setNum(String perSon_Num) {
		this.perSon_Num = perSon_Num;
	}
	
	public void setName(String perSon_Name) {
		this.perSon_Name = perSon_Name;
	}
	
	public void setAge(int perSon_Age) {
		this.perSon_Age = perSon_Age;
	}
	
	public void setGender(char perSon_Gender) {
		this.perSon_Gender = perSon_Gender;
	}
	
	public void setPNum(String perSon_PNum) {
		this.perSon_PNum = perSon_PNum;
	}
	
	public void setEmail(String perSon_Email) {
		this.perSon_Email = perSon_Email;
	}
	
	// -----------------getter----------------
	public String getNum() {
		return this.perSon_Num;
	}
	
	public String getName() {
		return this.perSon_Name;
	}
	
	public int getAge() {
		return this.perSon_Age;
	}
	
	public char getGender() {
		return this.perSon_Gender;
	}
	
	public String getPNum() {
		return this.perSon_PNum;
	}
	
	public String getEmail() {
		return this.perSon_Email;
	}
	
	//-------------------info--------------------
	public String information() {
		return this.perSon_Num + "�� �ֹι�ȣ��, " + this.perSon_Name + "�� �̸��̰�, " 
							+ this.perSon_Age + "�� ���̰�, " + this.perSon_Gender + "�� �����̰�,"
							+ this.perSon_PNum + "�� �޴�����ȣ�̰�, " + this.perSon_Email + "�� �̸��� �ּҾ�!";
	}
	
	
	
	
	
	
	
	
	
}
