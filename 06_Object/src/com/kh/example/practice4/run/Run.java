package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Book;
import com.kh.example.practice4.model.vo.Employee;
import com.kh.example.practice4.model.vo.HomeWork;
import com.kh.example.practice4.model.vo.HomeWork2;
import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		
		s.information();
		System.out.println(" ");
		
		Book b = new Book("�ڹ�", "kh", "�յ�ȯ", 15000, 0.5);
		b.inform();
		System.out.println(" ");
		
		Employee e = new Employee();
		e.setEmpNo(100);
		e.setEmpName("ȫ�浿");
		e.setDept("������");
		e.setJob("����");
		e.setAge(25);
		e.setGender('��');
		e.setSalary(2500000);
		e.setBonusPoint(0.05);
		e.setPhone("010-1234-5678");
		e.setAddress("����� ������");
		
		System.out.println("empNo : " + e.getEmpNo() + ", empName : " + e.getEmpName() + ", dept : " + e.getDept()
							+ ", job : " + e.getJob() + ", age : " + e.getAge() + ", gender : " + e.getGender()
							+ ", salary : " + e.getSalary() + ", bonusPonint : " + e.getBonusPoint()
							+ ", phone : " + e.getPhone() + ", address : " + e.getAddress());
		 
	
		HomeWork h = new HomeWork();
		System.out.println(" ");
		h.homework();
		
		HomeWork2 h2 = new HomeWork2();
		h2.homework2();
		
		
		
		
		
		
		
		
		
		
	}

}
