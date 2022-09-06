package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// �߻� Ŭ����
// [ǥ����]
// ���������� abstract class Ŭ�����̸� {
// abstract : ����� -> �߻�Ŭ����, �߻�޼��� ������ �� ����!

/*
 * �߻�޼��尡 �����ϴ� ���� �߻�Ŭ������ ���ǉ�
 * abstract��� ���� ����ؼ� �����ؾ���!
 * ��ü ������ �Ұ����ϴ�.
 * �θ�Ŭ���� ������ ����(�������� ���� ����)
 * 
 * �߻�Ŭ���� == �Ϲ��ʵ� + �Ϲݸ޼��� + �߻�޼���(��������)
 *  => �߻�޼��尡 ��� �߻�Ŭ������ ���ǰ���!
 *  ���� ? -> ������ �����̴�!
 *  
 *  => ��������� �����ڰ� �Ǵ����� �� �� Ŭ������ ��ü ������ �Ұ����ؾ��Ѵ� ��� ������ ��� �߻�Ŭ������ ����
 *  => ���������� �����ڰ� �Ǵ����� �� �ش� Ŭ������ ���� ��ü������ �� ������ �����ΰ� ���� �Ҷ� abstract�ٿ��ٰ� �ϼ��Ǹ� �ٽ� �����.
 * 
 */

public abstract class Sports {

	// ���
	private int people;

	public Sports() {}
	
	
	public Sports(int people) {
		this.people = people;
	}


	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}

	// �߻�޼���
	// [ǥ����]
	// ���������� abstract ��ȯ�� �޼����̸�(){
	
	

	public abstract void rule();
	
	/*
	 * method body�� �������� �ʴ� �̿ϼ��޼���
	 * abstract ���� �Ἥ �����ؾ� ��!
	 * 
	 * �̿ϼ� �޼��尡 �ϳ��� ���ԵǴ� ���� �ش� Ŭ������ �̿ϼ�Ŭ����(�߻�Ŭ����)�� �ȴ�.
	 * �ش� Ŭ���� �տ��� abstract��� ���� ����Ѵ�.
	 * 
	 */
	
	
	
	@Override
	public String toString() {
		return " people : " + people;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
