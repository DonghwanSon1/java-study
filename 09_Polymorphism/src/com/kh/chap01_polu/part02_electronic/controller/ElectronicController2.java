package com.kh.chap01_polu.part02_electronic.controller;

import com.kh.chap01_polu.part02_electronic.model.vo.Electronic;

// ��� ���ڻ󰡿� ������������(��������) : ������ ����
public class ElectronicController2 {

	// [�ʵ��]
	private Electronic[] elec = new Electronic[3];
	
	
	// [�޼����]
					      // ��ü Ÿ��,  �ε��� ��ȣ
	public void insert(Electronic any, int i) {
		this.elec[i] = any;
	}

	// ����ϳ��� ��ȸ���ִ� �޼���
	public Electronic select(int i) {
		return elec[i];
	}
	
	
	// ��� ��ü�� ��ȸ���ִ� �޼���
	// ��� ��ü�� ��� ����? => elec
	
	public Electronic[] selectAll() {
		return elec;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
