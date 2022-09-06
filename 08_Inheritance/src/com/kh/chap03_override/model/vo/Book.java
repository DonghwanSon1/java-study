package com.kh.chap03_override.model.vo;

public class Book {

	// ��� Ŭ������ �ֻ��� �θ�Ŭ������ Object => ���� ����
	
	
	// [�ʵ��]
	// ����, ���ڸ�, ����
	private String title;
	private String author;
	private int price;
	
	
	
	public Book() {}
	
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	// toString�� �ڵ��ϼ��� ����
	// Alt + Shift + s => s => Alt + g
	@Override
	public String toString() {
		return "Book [ title = " + this.title + ", author = " + this.author + ", price = " + this.price + " ]";
	}
	
	/*
	 * �������̵�(Overriding)
	 * - ��ӹް� �ִ� �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� ������(���ۼ�) �ϴ°��̴�.
	 * - �θ�Ŭ������ �����ϰ��ִ� �޼��带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 * - �ڽ�Ŭ������ �������̵� �� �޼��尡 �켱���� ������ ȣ���Ѵ�.
	 * 
	 * �������̵��� �������� 
	 * 1. �θ�޼����� �޼����� �����ؾ��Ѵ�
	 * 2. �Ű������� �ڷ���, ����, ������ ����(�Ű���������� ����)�ؾ��Ѵ�.
	 * 3. ��ȯ���� �����ؾ��Ѵ�.
	 * => �Ծ��� ����
	 * 4. �θ�޼����� ���������ں��� ���ų� ���� ������ �о����
	 * 
	 * @Override
	 * ������̼� (annotation)
	 * ������ �ּ�
	 * - ���� ����
	 * 		=> ��ø� ���ص� �θ�޼���� ���°� ������ �������̵� �� ������ �Ǵ�.
	 * - ������̼��� ���̴� ����?
	 *  	=> �Ǽ��� ������
	 *  	=> �������� �������̵�
	 *  
	 * �����ڵ鳢���� ���
	 * ������ ���������� �ۼ��ϴ� ������ ������!
	 * 
	 */
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
