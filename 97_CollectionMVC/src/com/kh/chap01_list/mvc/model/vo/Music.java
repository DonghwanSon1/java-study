package com.kh.chap01_list.mvc.model.vo;

public class Music {

	// �ʵ��
	// �뷡����, ������
	private String title;
	private String artist;
	
	
	// �����ں�
	public Music() {}


	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}


	
	
	
	
	// �޼����
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
		return "Music [���� : " + this.title + ", ������ : " + this.artist + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
