package com.kh.chap02_beforeVSafter.model.vo;

public class Tv extends Product{

	// [�ʵ��]
	private int inch;
	
	
	// [�����ں�]
	public Tv() {}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}


	
	
	
	// [�޼����]
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	public String information() {
		return super.information() + ", ��ġ : " + inch;
	}
	
	
	// �ڽ� Ŭ������ �������̵�(�θ�Ŭ������ �޼��带 ������)�� ���� ���
	// �ڽ� Ŭ������ �������̵� �� �޼��尡 �켱���� ������ ȣ���!!
	
	/*
	 * ����� ����
	 * 
	 * - �ߺ��� �ڵ带 ���������� ����
	 * 	 => ���ο� �ڵ带 �ۼ��ϰų� ������ �� �����ϴ�.
	 * 	 => ���� �������� �ڵ�� ���ο� Ŭ������ ���� �� �ִ�.
	 * - ���α׷��� ���꼺�� �������� ���������� ũ�� �⿩!
	 * 
	 * 
	 * ����� Ư¡
	 * 
	 * - Ŭ�������� ���߻���� �Ұ����ϴ�. (���� ��Ӹ� ����)
	 * - ��õǾ� ������ ������ ��� Ŭ������ ObjectŬ������ �ļ��̴�.
	 * (��� Ŭ���� : ��������Ŭ����, �ڹٿ��� �̹� �����ϴ� Ŭ����)
	 *  => ObjectŬ������ �ִ� �޼��带 ȣ���ؼ� �� �� ����
	 *  => ObjectŬ������ �ִ� �޼��尡 ������ �ȵ��? �������̵��� ���� ������ ����!
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
