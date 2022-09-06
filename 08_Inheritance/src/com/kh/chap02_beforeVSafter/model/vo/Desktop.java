package com.kh.chap02_beforeVSafter.model.vo;
// 			�θ� Ŭ���� 				�ڽ� Ŭ����
//			���� Ŭ����				�ļ� Ŭ����
//			���� Ŭ����				���� Ŭ����
//			���� Ŭ����				���� Ŭ����
//			Ȯ�� Ŭ����				�Ļ� Ŭ����
// ----------------- �� ���� ���̴� --------------------


// �ڽ�Ŭ���� extends �θ�Ŭ�����̸�  => ����ϴ� ���
public class Desktop extends Product {
	// �θ�κ��� ��ӹ��� �κ��� ������� �ʴ´�.
	// ��, �޼���� ����! ����� �޾Ƽ� �������ؼ� ����� ���!! => �������̵�!
	
	
	
	// [�ʵ��]
	// brand, pCode, pName, price => �̰͵��� �� ������
	private boolean allInOne;
	
	
	// [�����ں�]
	public Desktop() {}
	
	// brand, pCode, pName, price : �θ�Ŭ������ Product�� �ִ� �ʵ忡 �ʱ�ȭ�� �ȴ�.
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// super.brand = brand; <= private�̶� �ȉ�!
		
		// 1. �θ�Ŭ������ �ʵ���� ���������ڸ� private���� protected�� �ٲٴ� ���
		// 2. �θ�Ŭ������ setter�� �̿��ؼ� Product�� �ʵ带 �ʱ�ȭ ��Ű�� ���
		// 3. �θ�Ŭ������ �����ڸ� ȣ���ؼ� Product�� �ʵ带 �ʱ�ȭ ��Ű�� ��� => �ַ� �̹����
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}


	
	
	// [�޼����]
	// �������̵��̶�� ������ ���� ����
	// brand, pCode, pName, price�� ���� setter/getter�� �ۼ����� �ʾƵ� ȣ���� ���� => ��ӹ޾Ƽ�!
	
	public boolean getAllInOne() {
		return this.allInOne;
	}	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	// information�� ? 
	// �θ�Ŭ����(Product)�� information�� ���ݱ����� ��ȯ�� ���ֹǷ�
	// �츮�� �ʿ��� AllInOne�� ��ȯ�� ���ݽô�. => �������̵�
	public String information() {
		return /*"�귣��� : " + super.getBrand() + ", ��ǰ�ڵ� : " + super.getpCode() + ", ��ǰ�� : " + super.getpName() + ", ��ǰ ���� : "
				+ super.getPrice()*/
				super.information() + ", ��ü���� : " + this.allInOne;
	}
	
	
	
}