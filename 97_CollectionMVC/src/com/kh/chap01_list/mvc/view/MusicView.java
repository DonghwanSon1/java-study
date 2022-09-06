package com.kh.chap01_list.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.mvc.controller.MusicController;
import com.kh.chap01_list.mvc.model.vo.Music;

// View : 시각적인 요소, 입/출력
public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메인화면
	public void mainMenu() {

		while(true) { // ArrayList
			System.out.println("*** 음악은 역시 소리바다 ***");
			System.out.println("1. 새로운 곡 추가 "); // add()
			System.out.println("2. 전체 곡 조회 "); // 반복문 or toString
			System.out.println("3. 특정 곡 검색 "); // 반복문 + get()
			System.out.println("4. 특정 곡 삭제  "); // remove()
			System.out.println("5. 특정 곡 수정  "); // set()
			System.out.println("0. 프로그램 종료 "); // return;
			
			System.out.println("뭐 고를래? > ");
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
				System.out.println("프로그램 종료하겠습니다!!!");
				return;
			default :
				System.out.println("이상한거 누르지마!!");
			}
		}
	}
	
	// 1. 새로운 곡을 추가시킬 수 있는 화면
	public void insertMusic() {
		
		System.out.println("---- 곡 추가 ----");
		System.out.println("곡명 입력 > ");
		String title = sc.nextLine();
		System.out.println("가수명 입력 > ");
		String artist = sc.nextLine();
		
		// 요청 => Controller에 메서드를 호출
		mc.insertMusic(title, artist);
		System.out.println("제목 : " + title + ", 가수명 : " + artist + "가 추가되었습니다!!");
		System.out.println();
	}
	
	// 2. 전체 곡 조회를 할 수 있는 화면
	public void selectMusic() {
		
		System.out.println("----- 전체 곡 조회 -----");
		
		// 요청 => Controller에 메서드를 호출
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("노래가 없습니다!!");
		} else {
			for(Music m : list) {
			System.out.println(m);
			}
		}
		
		System.out.println();
	}
	
	
	// 3. 특정 곡을 검색할 수 있는 화면
	public void searchMusic() {
		
		System.out.println("----- 특정 곡 검색 -----");
		System.out.println("입력할 곡명 검색 > ");
		String keyword = sc.nextLine();
		
		// 요청
		ArrayList<Music> list = mc.searchMusic(keyword);
		
		System.out.println("*** 검색 결과 ***");
		if(list.isEmpty()) {
			System.out.println("검색한 '" + keyword + "'는 없습니다!!");
		} else {
			for(Music m : list) {
				System.out.println(m);
			}
		}
		
		System.out.println();
	}
	
	
	// 4. 특정 곡을 사제할 수 있는 화면
	public void deleteMusic() {
		
		System.out.println("----- 특정 곡 삭제 -----");
		System.out.println("삭제할 곡명 > ");
		String title = sc.nextLine();
		
		// 요청
		int result = mc.deleteMusic(title);
		
		if(result > 0) {
			System.out.println("곡명 '" + title + "'을 삭제했습니다.!");
		} else {
			System.out.println("삭제할 곡명 '" + title + "'을 찾지 못했습니다.");
		}	
	}
	
	// 기존 곡명을 입력받아서
	// 수정할 곡명, 수정할 가수명으로 수정하기
	public void updateMusic() {
		
		System.out.println("----- 특정 곡 수정 -----");
		System.out.println("수정하고 싶은 곡명 > ");
		String title = sc.nextLine();
		
		System.out.println("수정할 곡명 적어주세요 > ");
		String updateTitle = sc.nextLine();
		System.out.println("수정할 가수명 적어주세요 > ");
		String updateArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, updateTitle, updateArtist);
		if(result > 0) {
			System.out.println("곡명 '" + title + "'을 '" + updateTitle + "'으로 수정했습니다.!");
		} else {
			System.out.println("수정할 곡명 '" + title + "'을 찾지 못했습니다.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
