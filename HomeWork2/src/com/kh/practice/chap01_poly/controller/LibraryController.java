package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {

	private Member mem = null;
	private Book[] bList = new Book[5];
	{	  bList[0] = new CookBook("�������� ����", "������", "tvN", true); 
		  bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19); 
		  bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12); 
		  bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false); 
		  bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true); 
		 }
	
		public void insertMember(Member mem) { 
		  //  ���޹���  mem  �ּ�  ����  �ش�  ȸ��  ���۷���(mem)��  ���� 
			this.mem = mem;
		} 
		 
		public Member myInfo() { 
		 //  ȸ��  ���۷���(mem)  �ּ�  ��  ���� 
			return mem;
		} 
		 
		public Book[] selectAll() { 
		 //  ����  ���  ���۷���(bList)  �ּ�  ��  ���� 
			return bList;
		} 
		 
		public Book[] searchBook(String keyword) { 
		 //  �˻�  �����  �����  ���ο�  Book  ��ü  �迭  ���� 
		 //  �˻�  ���  ����  �����  �ִ�  5����  ��  ������  ���Ƿ�  ũ��  5  �Ҵ� 
			Book[] b = new Book[5];
			int count = 0;
			for(int i = 0; i < bList.length; i++) {
				if(bList[i].toString().contains(keyword)) {
					b[count] = bList[i];
					count++;
				}
			}
		 // for����  �̿��Ͽ�  bList  ����  ��ϵ���  �������  ���޹���  keyword  �� 
		 //  ���޹���  keyword��  �����ϰ�  ������  �� HINT : String  Ŭ������  contains()  ���� 
		 //  �˻������  ������Ͽ�  ���               �� HINT : count  �̿� 
		 
		 //  �ش�  �˻������  �������  �ּ�  ��  ���� 
			return b;
		} 
		public int rentBook(int index) { 
			
			int result = 0;
		   
		    
		    boolean anibook = bList[index] instanceof AniBook;
		    if(anibook && ((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
		    	result = 1;
		    }else if(!anibook && ((CookBook)bList[index]).isCoupon() == true){
		    	mem.setCouponCount( mem.getCouponCount() + 1 );
		    	result = 2;
		    }
		    
		    return result;
		  //  ����  ����  index��  bList  ��ü��  ��ȭå��  �����ϰ�  �ְ� 
		  //  �ش�  ��ȭå��  ����  ���̿�  ȸ����  ���̸�  ���Ͽ�  ȸ��  ���̰�  ����  ��� 
		  // result��  1��  �ʱ�ȭ  ��  ������������  �뿩  �Ұ� 
		   
		 
		  //  ����  ����  index��  bList  ��ü��  �丮å��  �����ϰ�  �ְ� 
		  //  �ش�  �丮å��  ����������  ��������  ��� 
		  //  ȸ����  couponCount 1  ����  ó��  �� 
		  // result��  2��  �ʱ�ȭ    ��  ����������  �뿩  �Ϸ�,  �丮�п�  ����  �߱� 
		   
		  // result  ��  ���� 
		} 
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
