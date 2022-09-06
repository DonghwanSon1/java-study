package com.kh.chap05.run;

import com.kh.chap05.model.vo.User;

public class Run {

	public static void main(String[] args) {

		// User 클래스 Run
		
		// 1. 기본생성자를 사용해서 객체를 생성 후 setter를 이용해서 필드값 초기화
		User u = new User();
		
		u.setId("hi");
		u.setPw("pw");
		u.setName("손동환");
		u.setAge(26);
		u.setGender('남');
		
		System.out.println("---------1.---------");
		System.out.println(u.information());
		
		// 2. 객체 생성과 동시에 필드값을 초기화
		// 아이디, 비번, 이름
		User u2 = new User("user0", "user0", "유저2");
		
		System.out.println("--------2.--------");
		System.out.println(u2.information());
		
		// 3. 생성자로 모든 필드값 초기화!
		User u3 = new User("user03", "pass0", "유저3" , 22, 'M');
		
		System.out.println("----------3.-------");
		System.out.println(u3.information());
		
		// 굳이 setter 왜 필요할까?
		// 중간에 비밀번호를 바꿔야 되면?? 개명했으면?? 
		

	}

}
