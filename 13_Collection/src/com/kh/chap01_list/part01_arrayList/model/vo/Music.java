package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music {

	// [필드부]
	// 노래제목, 가수명
	public String title;
	public String artist;
	
	// [생성자부]
	public Music() {}

	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	
	// [메서드부]
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "곡 => [title=" + title + ", artist=" + artist + "]";
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
