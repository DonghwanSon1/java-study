package com.kh.chap01_list.mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.mvc.model.vo.Music;

// Controller : ������� ��û�� �޾Ƽ� ó�����ִ� Ŭ���� ó������� View�� ��ȯ�Ѵ�.
public class MusicController {
	
	// ���� ����Ʈ ����
	private ArrayList<Music> list = new ArrayList<>();
	{ // �ʱ�ȭ ��� : ��ü ���� �� ������ ����Ǵ� ���
		list.add(new Music("������","�̽�ö"));
		list.add(new Music("����ī����̵�","�ڿ츲"));
	}
	
	// ����ڰ� ���ο� �� �߰� ��û�� �Ҷ� ���� ����Ǵ� �޼���
	public void insertMusic(String title, String artist){
		list.add(new Music(title, artist));
	}
	
	// �� ��ü ��ȸ ��û �� ����Ǵ� �޼���
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	// Ư�� �� �˻� ��û�� ������ ���� ����Ǵ� �޼���
	public ArrayList<Music> searchMusic(String keyword) {
		
		// �˻��� ����� ��� ArrayList<Music> ��ü ����
		ArrayList<Music> searched = new ArrayList<>(); // [] �� list
		
		// ��ȸ => �´� keyword�� searched�� �߰�
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searched.add(list.get(i));
			}
		}
		return searched;
	}
	
	// Ư�� �� ���� ��û �� ������ �޼���
	public int deleteMusic(String title) {
		
		// ����� ���� ���� ���� ����
		int result = 0; // ������ ����� Ƚ��
		
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result++;
			}
		}
		return result; // result�� 0�̶�� ������ �̷������ �ʾҴ�.
	}
	
	// Ư�� �� ���� ��û�� ������ �޼���
	public int updateMusic(String title, String updateTitle, String updateArtist) {
		
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.set(i, new Music(updateTitle,updateArtist));
				result++;
			}
		
	}
		return result; // 0�̶�� ������ �̷������ ����!
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
