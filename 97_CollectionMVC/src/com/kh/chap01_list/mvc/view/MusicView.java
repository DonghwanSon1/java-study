package com.kh.chap01_list.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.mvc.controller.MusicController;
import com.kh.chap01_list.mvc.model.vo.Music;

// View : �ð����� ���, ��/���
public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// ����ȭ��
	public void mainMenu() {

		while(true) { // ArrayList
			System.out.println("*** ������ ���� �Ҹ��ٴ� ***");
			System.out.println("1. ���ο� �� �߰� "); // add()
			System.out.println("2. ��ü �� ��ȸ "); // �ݺ��� or toString
			System.out.println("3. Ư�� �� �˻� "); // �ݺ��� + get()
			System.out.println("4. Ư�� �� ����  "); // remove()
			System.out.println("5. Ư�� �� ����  "); // set()
			System.out.println("0. ���α׷� ���� "); // return;
			
			System.out.println("�� ����? > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				insertMusic();
				break;
			case 2 :
				selectMusic();
				break;
			case 3 :
				searchMusic();
				break;
			case 4 :
				deleteMusic();
				break;
			case 5 :
				updateMusic();
				break;
			case 0 :
				System.out.println("���α׷� �����ϰڽ��ϴ�!!!");
				return;
			default :
				System.out.println("�̻��Ѱ� ��������!!");
			}
		}
	}
	
	// 1. ���ο� ���� �߰���ų �� �ִ� ȭ��
	public void insertMusic() {
		
		System.out.println("---- �� �߰� ----");
		System.out.println("��� �Է� > ");
		String title = sc.nextLine();
		System.out.println("������ �Է� > ");
		String artist = sc.nextLine();
		
		// ��û => Controller�� �޼��带 ȣ��
		mc.insertMusic(title, artist);
		System.out.println("���� : " + title + ", ������ : " + artist + "�� �߰��Ǿ����ϴ�!!");
		System.out.println();
	}
	
	// 2. ��ü �� ��ȸ�� �� �� �ִ� ȭ��
	public void selectMusic() {
		
		System.out.println("----- ��ü �� ��ȸ -----");
		
		// ��û => Controller�� �޼��带 ȣ��
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("�뷡�� �����ϴ�!!");
		} else {
			for(Music m : list) {
			System.out.println(m);
			}
		}
		
		System.out.println();
	}
	
	
	// 3. Ư�� ���� �˻��� �� �ִ� ȭ��
	public void searchMusic() {
		
		System.out.println("----- Ư�� �� �˻� -----");
		System.out.println("�Է��� ��� �˻� > ");
		String keyword = sc.nextLine();
		
		// ��û
		ArrayList<Music> list = mc.searchMusic(keyword);
		
		System.out.println("*** �˻� ��� ***");
		if(list.isEmpty()) {
			System.out.println("�˻��� '" + keyword + "'�� �����ϴ�!!");
		} else {
			for(Music m : list) {
				System.out.println(m);
			}
		}
		
		System.out.println();
	}
	
	
	// 4. Ư�� ���� ������ �� �ִ� ȭ��
	public void deleteMusic() {
		
		System.out.println("----- Ư�� �� ���� -----");
		System.out.println("������ ��� > ");
		String title = sc.nextLine();
		
		// ��û
		int result = mc.deleteMusic(title);
		
		if(result > 0) {
			System.out.println("��� '" + title + "'�� �����߽��ϴ�.!");
		} else {
			System.out.println("������ ��� '" + title + "'�� ã�� ���߽��ϴ�.");
		}	
	}
	
	// ���� ����� �Է¹޾Ƽ�
	// ������ ���, ������ ���������� �����ϱ�
	public void updateMusic() {
		
		System.out.println("----- Ư�� �� ���� -----");
		System.out.println("�����ϰ� ���� ��� > ");
		String title = sc.nextLine();
		
		System.out.println("������ ��� �����ּ��� > ");
		String updateTitle = sc.nextLine();
		System.out.println("������ ������ �����ּ��� > ");
		String updateArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, updateTitle, updateArtist);
		if(result > 0) {
			System.out.println("��� '" + title + "'�� '" + updateTitle + "'���� �����߽��ϴ�.!");
		} else {
			System.out.println("������ ��� '" + title + "'�� ã�� ���߽��ϴ�.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
