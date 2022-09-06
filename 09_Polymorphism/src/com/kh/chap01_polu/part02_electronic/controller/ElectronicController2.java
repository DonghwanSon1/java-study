package com.kh.chap01_polu.part02_electronic.controller;

import com.kh.chap01_polu.part02_electronic.model.vo.Electronic;

// 용산 전자상가에 새로차린가게(좋게차림) : 다형성 적용
public class ElectronicController2 {

	// [필드부]
	private Electronic[] elec = new Electronic[3];
	
	
	// [메서드부]
					      // 객체 타입,  인덱스 번호
	public void insert(Electronic any, int i) {
		this.elec[i] = any;
	}

	// 재고하나를 조회해주는 메서드
	public Electronic select(int i) {
		return elec[i];
	}
	
	
	// 재고 전체를 조회해주는 메서드
	// 재고 전체는 어디에 저장? => elec
	
	public Electronic[] selectAll() {
		return elec;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
