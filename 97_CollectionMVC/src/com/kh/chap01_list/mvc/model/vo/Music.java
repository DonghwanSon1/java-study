package com.kh.chap01_list.mvc.model.vo;

public class Music {

	// 필드부
	// 노래제목, 가수명
	private String title;
	private String artist;
	
	
	// 생성자부
	public Music() {}


	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}


	
	
	
	
	// 메서드부
	public String getTitle() {
		return title;
	}	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getartist() {
		return artist;
	}
	public void setartist(String artist) {
		this.artist = artist;
	}


	@Override
	public String toString() {
		return "Music [제목 : " + this.title + ", 가수명 : " + this.artist + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
