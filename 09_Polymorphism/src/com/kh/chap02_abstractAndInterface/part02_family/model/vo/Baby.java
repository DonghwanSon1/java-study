package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic{

	// [�ʵ��]
	// ����
	
	
	// �����ں�
	// �⺻, �Ű�����
	public Baby() {}
	
	public Baby(String name, double height, double weight) {
		super(name, height,weight);
	}
	
	
	// �޼����
	// toString
	
	@Override
	public String toString() {
		return "�Ʊ� => " + super.toString();
	}

	@Override
	public void eat() { // �ֱⰡ ����� ��
		// ������ 5 ����
		// weight == �θ��� �ʵ� + 5
		super.setWeight(super.getWeight() + 5);
		// Ű 0.5 ����
		super.setHeight(super.getHeight() + 0.5);
	}
	
	@Override
	public void sleep() {
		// Ű 0.1 ����
		super.setHeight(super.getHeight() + 0.1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
