package com.kh.chap02_set.mode.vo;

public class Student {
	
	// 이름, 나이, 점수
	private String name;
	private int age;
	private int score;
	
	
	public Student() {}

	
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	/*
	// hashCode()
	@Override
	public int hashCode() {
		
		return (name + age + score).hashCode();
		// 객체들의 주소 16진수 어쩌고저쩌고 뭐시기뭐시기 10진수로 변환
		// (이름 + 나이 + 점수).해싱
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student)obj;
		
		// 이름, 나이, 점수
		if(!this.name.equals(other.name) || this.age != other.age || this.score != other.score) {
			return false;
		}
		return true;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
