package com.kh.chap06.run;

import com.kh.chap06.controller.OverloadingTest;

public class Run3 {

	public static void main(String[] args) {
		
		// OverloadingTest Å¬·¡½º Run
		OverloadingTest ot = new OverloadingTest();
		
		ot.test();
		ot.test(1);
		ot.test(1, "a");
		ot.test("a", 1);
		ot.test(1, 2);
		
		
		

	}

}
