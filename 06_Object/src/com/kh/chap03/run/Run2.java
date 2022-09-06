package com.kh.chap03.run;

import com.kh.chap03.model.vo.Product;

public class Run2 {

	public static void main(String[] args) {

		Product product = new Product();
		
		product.setPrice(15000);
		product.setName("µþ±â");
		product.setB_Name("ÀÌ¸¶Æ®");
		
		System.out.println(product.information());
		

	}

}
