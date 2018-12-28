package com.wyklovelf.iter119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * ����������ԭ��
 * 
 * 1.һ���������Դ����������������;����ʹ���ڲ���|�����ڲ���
 * ���룺
 * 1.ʹ�������ڲ��� ʵ�ֵ�����
 * 2.ʹ��Iterableʵ��foreach����
 * 3.����ĩβ���Ԫ�صķ���
 * 
 * @author weiyikai
 *
 */
public class IteratorTest implements java.lang.Iterable{//���͵Ĳ���
	
	
//	private String[] arr_str = {"a","b","c"};
	
	private String[] arr_str =new  String[5];
	
//	private int size = arr_str.length;
	
	//ʵ�ʴ�С
	private int size = 0;
	
	public void  add(String s) {//ĩβ���Ԫ��
		
		if(this.size == arr_str.length) {
			arr_str = Arrays.copyOf(arr_str, arr_str.length + 5);//�������� 
		}
		
		arr_str[size] = s;
		
		size++;
	}
	
	public Iterator iterator() {
		return new Iterator() {//����Iterator������ʵ���ࣨû�����ƣ��Ķ���
			private int cusor = -1;//-1����ʱ����������ʲô��û�У�0��ʾ��һ����1��ʾ2�����Դ����� 
			
			
			//ɾ��
			public void remove() {
				//�ƶ�����Ԫ��
				System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
				
				//ʵ�ʴ�С-1
				IteratorTest.this.size--;
				
				//��Ϊnext��cursor����֮�����1������remove��ǰԪ��֮��cursor��-1
				this.cusor--;
			}
			
			//��ȡ��һ��
			public String next() {
				this.cusor++;
				return arr_str[this.cusor];
//				return null;
			}
			
			//�ж��Ƿ������һ��
			public boolean hasNext() {
				return this.cusor+1 < IteratorTest.this.size;
//				return false;
			}
		};
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		IteratorTest it = new IteratorTest();
		
		it.add("a");
		
		it.add("b");
		
		it.add("c");
		
		Iterator iter = it.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
//			iter.remove();
		}
		
		System.out.println(it.size);
		
		Iterator iter1 = it.iterator();
		
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		for(Object str:it) {
			System.out.println(str);
		}
		
		
		
		
		
		
		ArrayList list2 = new ArrayList();
		
		list2.add("����");
		list2.add("����");
		list2.add("����");
		
		for(Object obj:list2) {//foreach��ǿforѭ��
			System.out.println(obj);
		}
	}
}
