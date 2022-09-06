package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("====== 학생 정보 출력 ======");
		Student[] sArr = ssm.printStudent();
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		
		System.out.println("====== 학생 성적 출력 ======");
		double[] avgScore = ssm.avgScore();
			System.out.println("학생 점수 합계 : " + avgScore[0]);
			System.out.println("학생 점수 평균 : " + avgScore[1]);
		
		System.out.println("====== 성적 결과 출력 ======");
		for(int i = 0; i < 5; i++) {
			if(sArr[i].getScore() < ssm.CUT_LINE) {
				System.out.println(sArr[i].getName() + " 넌 재평가!");
			}else {
				System.out.println(sArr[i].getName() + " 넌 통과!");
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
