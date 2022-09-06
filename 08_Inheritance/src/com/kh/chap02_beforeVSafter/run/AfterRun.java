package com.kh.chap02_beforeVSafter.run;

import com.kh.chap02_beforeVSafter.model.vo.*; // * => 그 패키지 안에 있는거 모두다 라는 뜻

public class AfterRun {

	public static void main(String[] args) {
		
		
		SmartPhone sp = new SmartPhone();
		
		
		SmartPhone s = new SmartPhone("LG", "베가", "v-01", 1000000, "LG");
		System.out.println(s.information());
		// 내가 호출하고자하는 메서드가 해당 클래스에 존재하지 않는다면
		// 자동으로 해당 클래스의 부모클래스에 있는 메서드로 호출 됌!
		
		Desktop d = new Desktop("Apple", "d01", "짱짱데스크탑", 5000000, true);
		System.out.println(d.information());
		
		Tv t = new Tv("LG", "n-tv", "나노셀TV", 8000000, 100);
		System.out.println(t.information());
		
		
		
	}

}
