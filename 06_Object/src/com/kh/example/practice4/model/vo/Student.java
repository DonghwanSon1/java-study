package com.kh.example.practice4.model.vo;

public class Student {

		private static int grade;
		private int classroom;
		private String name;
		private double height;
		private char gender;
		{
			grade = 2;
			classroom = 5;
			name = "손동환";
			height = 174.5;
			gender = '남';
		}
		
		public Student() {}
		

		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setClassroom(int classroom) {
			this.classroom = classroom;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		
		
		public int getGrade() {
			return this.grade;
		}
		public int getClassroom() {
			return this.classroom;
		}
		public String getName() {
			return this.name;
		}
		public double getHeight() {
			return this.height;
		}
		public char getGender() {
			return this.gender;
		}
		
		
		public void information() {
			System.out.println(this.height + "의 키를 가지고 있는 " + this.name + "은 " + this.gender + "자 이며, " + this.grade + "학년 " 
					+ this.classroom + "반이다!");
		}	
}
