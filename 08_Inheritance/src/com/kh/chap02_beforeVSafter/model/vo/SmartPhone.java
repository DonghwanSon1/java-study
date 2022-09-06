package com.kh.chap02_beforeVSafter.model.vo;

public class SmartPhone extends Product{
	
	
	// [�ʵ��]
	private String mobileAgency;
	// + brand, pCode, pName, price <= productŬ�������� ����� �޴´�.
	
	
	
	
	// [�����ں�]
	// �����ڴ� ����� ���� �� ����.
	public SmartPhone() {
		super();
	}

	// �ʱ�ȭ�� ��� ������ ������
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		// super : �ش� �θ��� �ּҸ� ����ֵ�. (��, super. �θ� ���ٰ���)
		// super.brand = brand; => ���������ڰ� private�̱� ������ ������ ����
		// ��, �����ϰ����ϴ� �� ����� private�� ��� �ܺο����� ������ �Ұ����ϴ�.(�ƹ��� �ڽ��̿���!!)
		// �ذ����� 3���� ����
		
		// �ذ��� 1. �θ�Ŭ������ �ʵ带 �ڽı����� ���� �����ϵ��� ���� => �θ�Ŭ�������� (protected)�� ����.
		// �ذ��� 2. �θ�Ŭ������ �ִ� public ������������ setter�޼��带 ȣ���Ѵ�.
		/*
		 * super.setBrand(brand);
		 * super.setPCode(pCode);
		 * .
		 * .
		 * 
		 */
		// �ذ��� 3. �θ������ ȣ���ϱ�
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
		
	}


	
	
	
	
	
	// [�޼����]
	public String getMobileAgency() {
		return this.mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	
	public String information() {
		return super.information() + ", ��Ż� : " + this.mobileAgency;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
