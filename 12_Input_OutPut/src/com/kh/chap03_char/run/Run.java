package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class Run {

	public static void main(String[] args) {
		// FileCharDao Ŭ���� Run
		
		FileCharDao fcd = new FileCharDao();
		//fcd.fileSave();
		fcd.fileRead();
		
		
		
	}

}
