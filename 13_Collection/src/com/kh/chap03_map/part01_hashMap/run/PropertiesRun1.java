package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		// Properties : Map�迭 => key + value ��Ʈ�� �����
		//				��, Ư¡�̶�� �Ѵٸ� key�� value ��� String���� �ٷ��.
		
		// [ǥ����]
		// Properties �̸� = new Properties();
		
		Properties prop = new Properties();
		
		/*
		prop.put("���", new Burger("������", 2500));
		System.out.println(prop);
		System.out.println(prop.get("���"));
		*/
		
		/*
		 * Map �迭�̱� ������
		 * key + value��Ʈ�� ������ �Ǿ���
		 * ���� String �ƴϿ��� put �޼��带 ���� �� �����
		 * 
		 */
		
		/*
		 * Properties�� �뵵 = ���� ������ϱ⶧ �����
		 * key + value ��Ʈ�� ���Ϸ� ����Ѵٴ���,
		 * ���Ϸκ��� �о���� �뵵�� ���� ����
		 * => .properties ���� Ȯ����
		 * 
		 * ���� ������� �ʴ� ���� �����̳�
		 * �ش� ���α׷��� �⺻������ �������� �������� ��� ����
		 * 
		 */
		
		// String, String������ ��ƺ���
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashMap");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		Properties inputProp = new Properties();
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			// store(OutputStream os, String Comments)
			// ���� ����Ҷ� ���� �޼���
			// key = value ���·� ������ ���
		
			// �Է�
			System.out.println("\n���⼭���ʹ� �Է�");
			inputProp.load(new FileInputStream("test.properties"));
			// load(InputStream is) : ���Ϸκ��� �о�ö� ���̴� �޼���
		
			System.out.println(inputProp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}