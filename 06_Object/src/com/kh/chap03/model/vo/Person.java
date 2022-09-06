package com.kh.chap03.model.vo;

public class Person {

	// 사람의 인적 정보
	// 주민번호, 이름, 나이, 성별, 휴대폰번호, 이메일주소
	
	
	// [필드부]
	// 필드 == 멤버변수 == 클래스변수 == 인스턴스 변수
	private String perSon_Num;
	private String perSon_Name;
	private int perSon_Age;
	private char perSon_Gender;
	private String perSon_PNum;
	private String perSon_Email;
	
	
	
	// [생성자부]
	
	// [메소드부]
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
		return this.perSon_Num + "은 주민번호고, " + this.perSon_Name + "은 이름이고, " 
							+ this.perSon_Age + "는 나이고, " + this.perSon_Gender + "은 성별이고,"
							+ this.perSon_PNum + "은 휴대폰번호이고, " + this.perSon_Email + "은 이메일 주소야!";
	}
	
	
	
	
	
	
	
	
	
}
