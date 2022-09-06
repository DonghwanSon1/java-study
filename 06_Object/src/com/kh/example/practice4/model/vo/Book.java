package com.kh.example.practice4.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	public void inform() {
		System.out.println("책 제목은 " + this.title + "이며, 출판사는 " + this.publisher + "이고, 작가는 "
							+ this.author + "이고, 가격은 " + this.price + "원 이며, " + this.discountRate + "%의 할인률을 가지고있다.");
	
	}
}
