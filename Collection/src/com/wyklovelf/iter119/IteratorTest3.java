package com.wyklovelf.iter119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Ŀ�꣺ʹ�÷����������������
 * ;�������뷺��
 * �����Ϳ��Ա����������͵�����
 * 
 * @author weiyikai
 *
 */
public class IteratorTest3<E> implements java.lang.Iterable<E>{//���͵Ĳ���
	
	
//	private String[] arr_str = {"a","b","c"};
	
//	private E[] arr_str =new  E[5];//û�з�������
	
	private Object[] arr_str = new Object[5];
	
//	private int size = arr_str.length;
	
	//ʵ�ʴ�С
	private int size = 0;
	
	public void  add(E s) {//ĩβ���Ԫ��
		
		if(this.size == arr_str.length) {
			arr_str = Arrays.copyOf(arr_str, arr_str.length + 5);//�������� 
		}
		
		arr_str[size] = s;
		
		size++;
	}
	
	public Iterator<E> iterator() {
		return new Iterator<E>() {//����Iterator������ʵ���ࣨû�����ƣ��Ķ���
			private int cusor = -1;//-1����ʱ����������ʲô��û�У�0��ʾ��һ����1��ʾ2�����Դ����� 
			
			
			//ɾ��
			public void remove() {
				//�ƶ�����Ԫ��
				System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
				
				//ʵ�ʴ�С-1
				IteratorTest3.this.size--;
				
				//��Ϊnext��cursor����֮�����1������remove��ǰԪ��֮��cursor��-1
				this.cusor--;
			}
			
			//��ȡ��һ��
			public E next() {
				this.cusor++;
				return (E)arr_str[this.cusor];
//				return null;
			}
			
			//�ж��Ƿ������һ��
			public boolean hasNext() {
				return this.cusor+1 < IteratorTest3.this.size;
//				return false;
			}
		};
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		IteratorTest3 it = new IteratorTest3();
		
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
		
		
		IteratorTest3<String> it3 = new IteratorTest3<String>();
		
		it3.add("1");
		it3.add("2");
		it3.add("3");
		
		Iterator<String> iter3 = it3.iterator();
		
		for(String str:it3) {//��Ҫʵ��java.lang.Iterable�ӿ�
			System.out.println(str);
		}
		
		
		IteratorTest3<Integer> it4 = new IteratorTest3<Integer>();
		
		it4.add(1);//int->Integer�Զ�װ��
		it4.add(2);
		it4.add(3);
		
		Iterator<Integer> iter4 = it4.iterator();	
		
		while(iter4.hasNext()) {
			Integer i = iter4.next();
			System.out.println(i);
		}
	}
}
