package com.kh.chap06.controller;

public class OverloadingTest {

	/*
	 * �޼��� �����ε�
	 * 
	 * - �� Ŭ���� �ȿ� ���� �޼�������� ���� �޼������ ������ �� �ִ� ���!!
	 * - �Ű������� �ڷ����� ����, ����, ������ �� �ٸ��� �ۼ��Ǿ�� �Ѵ�.
	 * - ��, �Ű�������, ����������, ��ȯ���� �޼��� �����ε��� ������ ���� �ʴ´�.
	 * 
	 * 
	 * 
	 */
	
	
	// �޼����̸��� test�� ����
	public void test() {
		System.out.println("�ȳ��ϼ���~~");
		System.out.println("���� ���� 12�� ���ҽ��ϴ�~~");
	}
	
	public void test(int a) {
		System.out.println("�̰� int a �ϳ��� �޾Ҿ��~");
	}
	public void test(int a, String s) {
		System.out.println("�̰� int a ���� String s �ι�°�� �޾Ҿ��~");
	}
	public void test(String s, int a) {
		System.out.println("�̰� String s ���� int a �ι�°�� �޾Ҿ��~");
	}
	public void test(int a, int b) {
		System.out.println("�̰� int a ���� int b �ι�°�� �޾Ҿ��~");
	}
	
	/*
	 * ������ �ΰ��� �޴�  test�� �ϳ� �� ����ٸ�?
	 * �Ű������� �̸��̶��� ������� �ڷ����� ���� ������ ���� ������ ������ �߻���!
	 * - ��! �Ű����� �ڷ����� ������ ������ �׻� �ٸ��� �ۼ��Ǿ�߸� �Ѵ�.
	 * 	public void test(int c, int d){
	 * 
	 * 
	 * }
	 */
	
	public void test(int a, int b,String s) {
		System.out.println("int a int b String s");
	}
	
	// ��ȯ���� �ٸ��ٰ� �����ε��� ������� �ʴ´�.
	// �޼��带 ȣ���ϴ� �������� �Ű������� �����ϸ� ������ ������ �߻�
	// ��ȯ���� ������� �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� �Ѵ�.
	// public int test (int a, int b, String s) { => ���� �̰� �ȉ�!!
	// }
	
	/*
	 * ���������ڰ� �ٸ��ٰ� �����ε��� ������� �ʴ´�.
	 * ���������ڿʹ� ������� �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ���Ѵ�.
	 * 
	 */
	/*
	private void test(int a, int b, String s) {
		
	}
	*/
	
	
	
	
	
	
	
	
	
}
