package com.kh.operator.run;

public class Quiz {

	public static void main(String[] args) {


		int a = 5;											// 7
		int b = 10;											// 9
		int c = (++a) + b;									// 15
		int d = c / a;										// 1
		int e = c % a;										// 6
		int f = e++;										// 4
		int g = (--b) + d--;								// 10
		int h = 2; 											// 2
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); // 12
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i);

		
	}

}
