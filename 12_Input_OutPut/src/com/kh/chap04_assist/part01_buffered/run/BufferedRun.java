package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		// BufferedReader / BufferedWriter
		//  => 버퍼공간을 제공해서 한번에 모아뒀다가 한꺼번에 입출력 진행
		//  => 속도 향상 목적의 보조스트림(BufferedXXX)
		
		BufferedDao bd = new BufferedDao();
		bd.fileSave();
		bd.fileRead();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
