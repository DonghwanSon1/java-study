package com.kh.chap02_beforeVSafter.run;

import com.kh.chap02_beforeVSafter.model.vo.*; // * => �� ��Ű�� �ȿ� �ִ°� ��δ� ��� ��

public class AfterRun {

	public static void main(String[] args) {
		
		
		SmartPhone sp = new SmartPhone();
		
		
		SmartPhone s = new SmartPhone("LG", "����", "v-01", 1000000, "LG");
		System.out.println(s.information());
		// ���� ȣ���ϰ����ϴ� �޼��尡 �ش� Ŭ������ �������� �ʴ´ٸ�
		// �ڵ����� �ش� Ŭ������ �θ�Ŭ������ �ִ� �޼���� ȣ�� ��!
		
		Desktop d = new Desktop("Apple", "d01", "¯¯����ũž", 5000000, true);
		System.out.println(d.information());
		
		Tv t = new Tv("LG", "n-tv", "���뼿TV", 8000000, 100);
		System.out.println(t.information());
		
		
		
	}

}
