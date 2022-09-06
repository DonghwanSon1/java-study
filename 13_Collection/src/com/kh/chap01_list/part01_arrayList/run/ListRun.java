package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		
		/*
		 * �÷���(collection)
		 * 
		 * �ڷᱸ���� ����Ǿ��ִ� Ŭ����
		 * �ڹٿ��� �����ϴ� "�ڷᱸ��"�� ����ϴ� "�����ӿ�ũ"�̴�.
		 * 
		 * - �ڷᱸ�� : �����͵��� ȿ�������� �ٷ� ��
		 * 			(��ȸ, ����, �߰�, ����, ����)�ʿ��� ����
		 * - ������ ��ũ : ȿ������ ��ɵ��� �̹� ���ǵǾ��ִ� ��
		 * 
		 * �����غ���!!
		 * �����͵��� ���Ӱ� �߰��ǰų�, �����ǰų�, �����Ǵ� ���(�˰���)����
		 * �̹� ���ǵǾ� �ִ� Ʋ == �÷���
		 * => �ٷ��� �����͵��� �����ϰ��� �Ҷ� ??
		 * �迭�� ������ ����� Ȱ���� �����ϱ��ߴ�. �ٵ� �迭�� ������.;;
		 * 
		 * �迭�� �÷����� ������
		 * - �迭�� ����
		 * 1. �� Ÿ���� �����͵鸸 ���� ����
		 * 2. �迭�� ������ �� �� ���� ũ�⸦ �����ؾ���
		 * 	  => �ѹ� ������ ũ��� ������ �Ұ���
		 * ���ο� ���� �߰��ϰ��� �Ҷ� ũ�Ⱑ ���ĳ� ��� ���ο� ũ���� �迭�� �����,
		 * ������ ������� �����ϴ� �ڵ带 ���� ¥�߉�
		 * 3. �迭 �߰� ��ġ�� ���ο� �����͸� �߰��ϰų� �����ϴ� ���
		 * 	  ������ ������ �����ְų�, �о��ִ� �ڵ带 ���� ¥����
		 * 
		 * - �÷����� ����
		 * 1. �⺻������ ���� Ÿ���� �����͵��� ���� ����
		 * => ���� Ÿ���� �����͵鸸 ����� ���� ����
		 * (���׸� ������ ���� �� Ÿ���� �����͵鸸 ���� �� �ְԲ��� ����)
		 * 2. ũ���� ����� ����.
		 * => ���� ũ�� ������ ���� �ʾƵ� �ȴ�.
		 * => ���� ���� ũ�������� �߰�, ũ�⸦ �Ѿ�� ���� �� �߰��ϰ��� �Ҷ�
		 * 	  �˾Ƽ� ũ�Ⱑ �þ��.
		 * 3. �߰��� ���� �߰��ϰų� �����ϴ� ��� ���� �����ְų� �о��ִ� �ڵ尡
		 * 	  �̹� �޼���� ���ǵǾ� �ִ�.
		 * => �׶��׶� �ʿ��� �޼������ ȣ���ؼ� ���� �ȴ�.
		 * 
		 * 
		 * ����� �����͵��� ��Ƹ� �ΰ� "��ȸ"�� �� ���� => �迭
		 * ����� �����͵��� �߰�, ����, ������ ��� => �÷���
		 * 
		 * 3���� ������ �÷���
		 * 
		 * - List �迭 : ������ϴ� ��(Value)�� ���� / ���� �� ���� �����Ѵ�!(Index�� �ִ�)
		 * 								�ߺ��� ���
		 * 								��) ArrayList, LinkedList, Vector
		 * 								ArrayList�� ���� ���� ���δ�.
		 * 
		 * - Set �迭 : ������ϴ� ��(Value)�� ���� / ���� �� ���� ���� X
		 * 							���ߺ��� ��� X
		 * 							��) HashSet, TreeSet => HashSet�� ���ؼ� ����
		 * 
		 * - Map �迭  : Ű(Key) + ��(Value) ��Ʈ�� ����/ ���� �� ���� ���� X
		 * 							�ߺ� Ű(Key)�� ��� X / �ߺ� �� (Value) ���
		 * 							��) HahMap, HashTable, TreeMap, Properties
		 * 							=> HashMap, Properties�� ���ؼ� ����
		 * 
		 */
		
		
		// ArrayList�� ���� ���
		// [ǥ����]
		// 1. ũ�⸦ ���� ���� ���ϴ� ���
		// ArrayList ��ü�̸� = new ArrayList();
		
		// 2. ũ�⸸ŭ ����ڵ�. ũ���� ������ ��� ��� �ڵ����� ũ�Ⱑ �þ
		// ArrayList ��ü�̸� = new ArrayList(ũ��);
		
		ArrayList list = new ArrayList(3);
		// ���������� ũ�Ⱑ 3¥�� ArrayList�� ����ڵ�.!
		// List list = new ArrayList(3); => �̷��� �����ϴ°� �� ����
		
		System.out.println(list);
		
		// 1. ����ִ� list�� �߰����� !! => Music ��ü�� ���� �߰��غ���!!
		// add(E e) : �ش� ����Ʈ�� ���� ���ڷ� ���޵� ��Ҹ� �߰������ִ� �޼���
		// E ----> element : ���׸�
		list.add(new Music("�Ϸ���", "���̺�"));
		list.add(new Music("�ڿ���", "������"));
		list.add(new Music("One Love", "MC THE MAX"));
		list.add("��"); // ũ�Ⱑ �þ��. ���� ������ ���� ���� �� �ֵ�.
		// ������ �����Ǹ鼭 ����ȴ�.(index ������ �ֵ�.)
		
		System.out.println(list);
		
		// add �޼��� ��� �� �����ε��� ���¸� ����غ���!
		// add(int index, E e) : ����Ʈ�� index �ڸ��� ���޵� e�� �߰������ִ� �޼���
		list.add(0, "1");
		list.add(3, new Music("�����ϴ�", "�̽�ö"));
		// �߰��� �� �߰� �� �˾Ƽ� ������ ������ �ڷ� ��ĭ�� �о��ִ� �۾��� ���������� ����ȴ�.
		
		
		System.out.println(list);
		System.out.println();
		
		// 2. ���� �߰��غ����ϱ� �����غ���!!
		// set(int index, E e) : ����Ʈ�� index�ڸ��� ���� ���޵� e�� �������ִ� �޼ҵ�
		list.set(0, "����");
		list.set(3, new Music("������", "����Ŭ�轼"));
		
		System.out.println(list);
		
		
		// 3. ���� �����غ���!!
		// remove(int index) : ����Ʈ�� index�ڸ��� ��䰪�� �������ִ� �޼���
		list.remove(0); // ���� �� ���ο� 0��° �ε����� ��
		//list.remove(5); // IndexOutOfBoundsExcption : Index 5, �߻�
						// �ε����� ���� �� ����ؼ� �����ؾ߉�!
		
		System.out.println(list);
		Music tIndex = (Music)list.remove(1);
		System.out.println("������ �ε����� ��ü : " + tIndex);
		
		// 4. ����Ʈ�� ũ�⸦ ��ȯ�غ���
		// size() : ����Ʈ�� ũ�⸦ ��ȯ���ִ� �޼��� == ����ִ� ����� ����
		System.out.println("����Ʈ�� ��� ����� ���� : " + list.size());
		System.out.println("����Ʈ�� ������ �ε��� ��ȣ : " + (list.size() -1));
		
		list.remove(list.size() -1);
		
		System.out.println(list);
		
		
		// 5. ����Ʈ�� �ش� �ε����� ��� ��Ҹ� ��ȯ���ִ� �޼���
		// get(int index) : E
		Music m = (Music)list.get(0);
		System.out.println(m);
		System.out.println(list.get(0));
		// 1�� �ε����� �� ������ �˰� �ʹ�.
		Music m1 = (Music)list.get(1);
		System.out.println("1�� �ε����� �� ���� : " + m1.getTitle());
		
		// index ���� + get �޼��� => �ݺ���
		// ��Ҹ� �̾ƺ���
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list�� ����� �뷡 ������� : " + ((Music)list.get(i)).getTitle());
		}
		
		// ���� for�� => ���� ��ȸ�ϴ� �������� ����� ����
		// for(���� �޾��� ���� : ���������� ������ �迭 �Ǵ� �÷���)
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 6. ����Ʈ�� �κи� ����
		// subList(int index1, int index2) : List
		// index1 ���� index2������ �����Ͱ����� �����ؼ� ���ο� ����Ʈ�� ��ȯ�����ش�.
		
		List sub = list.subList(1, 2);
		System.out.println(sub);
		
		// 7. ����Ʈ + ����Ʈ 
		// addAll(Collection c) : �ش� ����Ʈ�� �ٸ� �÷��ǿ� �ִ� �����͵��� ��°�� �߰����ִ� �޼���
		list.addAll(sub);
		System.out.println(list); // ������(Value)�� �ߺ� ���� ����
		
		
		// 8. ����Ʈ�� ����ִ��� Ȯ���ϴ� �޼���
		// isEmpty() : ��������� true / ä���� ������ false ��ȯ
		System.out.println(list.isEmpty());
		
		
		// 9. �ش� ����Ʈ�� ��°�� ����ִ� �޼���
		// clear()
		list.clear();
		System.out.println(list.isEmpty());	
	}

}
