package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedReader / BufferedWriter
	//  => ���۰����� �����ؼ� �ѹ��� ��Ƶ״ٰ� �Ѳ����� ����� ����
	//  => �ӵ� ��� ������ ������Ʈ��(BufferedXXX)
	
	// [ǥ����]
	// ������Ʈ��Ŭ�����̸� ��ü�̸� = new ������Ʈ��Ŭ�����̸�(��ݽ�Ʈ����ü);
	// => ������Ʈ���� �ܵ����� ���� �Ҽ��� ����!!!
	
	// ���α׷� --> �ܺθ�ü(����)
	// ���
	public void fileSave() {
		
		// BufferedWriter : ���۰����� �����ؼ� �Ѳ����� ����� �����ϰڴ�.
		
		// ��ݽ�Ʈ���� Input/Output �迭�� ���
		// ������Ʈ���� Input/Output �迭�� ���
		// ��ݽ�Ʈ���� Reader/Writer �迭�� ���
		// ������Ʈ���� Reader/Writer �迭�� ���
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		// 1. ��ݽ�Ʈ�� ��ü ���� => ������θ� ����ڴ�.
		try {
			// 1. ��ݽ�Ʈ�� ��ü ���� => ������θ� ����ڴ�.
			fw = new FileWriter("c_buffer.txt");
			
			// 2. ������Ʈ�� ��ü ����
			bw = new BufferedWriter(fw);
			//bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// 3. ���Ͽ� ���� => write()
			bw.write("�ȳ��ϼ���");
			bw.write("\n�ݰ����ϴ�");
			bw.newLine();
			bw.write("�߰�����~");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. �ڿ��ݳ� => close()
			// �ڿ� �ݳ��ÿ��� �ݵ�� ������ �ڿ����� �������� �ݳ��Ѵ�.
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	
	// ���α׷� <------- ����
	// �Է�
	
	public void fileRead() {
		// FileReader ������� BufferedReader�� �߰��ؼ� ���ڴ�.
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// 1. ��� ��Ʈ�� ��ü����
			fr = new FileReader("c_buffer.txt");
			// 2. ���� ��Ʈ�� ��ü ����
			br = new BufferedReader(fr);
			
			
			// 3. �о���� -> read()
			// readLine() => �ٴ����� �о����
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. �ڿ��ݳ� => close() => �׻� �������� �ݱ�
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// �Ǽ��� �ڿ��ݳ��� ��Դ´ٸ�?
	// ���� ��� close�� ���ָ� �ȵǳ�?
	/*
	 * try ~ with ~ resource ����
	 * - JDK7 ���� �̻���� ����
	 * 
	 * [ǥ����]
	 * try(��Ʈ����ü����;){
	 * 
	 * 		���ܰ� �߻��ҹ��� ����
	 * 
	 * } catch{
	 * 
	 * 		�ش� ���ܰ� �߻����� �� ������ ����
	 * 
	 * } 
	 * 
	 * - ��Ʈ����ü�� try(����)�� �־������
	 * 	��Ʈ�� ��ü�� ���� �� �ش� ������ ������ ����Ϸ�Ǿ�����
	 * 	�˾Ƽ� �ڿ��ݳ��� �ȴ�.
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}