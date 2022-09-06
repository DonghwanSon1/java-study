package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] personCount = new int[2];
		int stuCount = 0;
		int empCount = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				stuCount++;
			}
		}
		personCount[0] = stuCount;
		
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				empCount++;
			}
		}
		personCount[1] = empCount;

		return personCount;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		this.s[personCount()[0]] = new Student(name,age,height,weight,grade,major);
	}
	
	public Student[] printStudent() {
		return this.s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		this.e[personCount()[1]] = new Employee(name, age,height,weight,salary,dept);
	}
	
	public Employee[] printEmployee() {
		return this.e;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
