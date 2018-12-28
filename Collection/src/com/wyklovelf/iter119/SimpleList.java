package com.wyklovelf.iter119;

import java.util.Iterator;

/**
 * 
 * @author weiyikai
 *
 *�޸��ղŽ��ж��α���ʱ����Ҫ�ٴ���һ�����������⣺����������Ϊ�ڲ��࣬ʵ��Iterator�ӿڡ�
 */
public class SimpleList {
	
	//���� �洢ֵ
	private String[] arr_str = {"a","b","c"};
	
	//��С
	private int size = arr_str.length;
	
	public int size() {
		return this.size;
	}
	
	private class MyIter implements Iterator{
		private int cusor = -1;//-1����ʱ����������ʲô��û�У�0��ʾ��һ����1��ʾ2�����Դ����� 
		
		
		//ɾ��
		public void remove() {
			//�ƶ�����Ԫ��
			System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
			
			//ʵ�ʴ�С-1
			SimpleList.this.size--;
			
			//��Ϊnext��cursor����֮�����1������remove��ǰԪ��֮��cursor��-1
			this.cusor--;
		}
		
		//��ȡ��һ��
		public String next() {
			this.cusor++;
			return arr_str[this.cusor];
//			return null;
		}
		
		//�ж��Ƿ������һ��
		public boolean hasNext() {
			return this.cusor+1 < SimpleList.this.size;
//			return false;
		}

	}
	
	public Iterator iterator() {//�����ṩʹ��MyIter�ڲ���Ľӿڡ� 
		return new MyIter();
	}
	
	public Iterator iterator1() {//�����ṩʹ��MyIter�ڲ���Ľӿڡ� 
		
		class MyIter implements Iterator{
			private int cusor = -1;//-1����ʱ����������ʲô��û�У�0��ʾ��һ����1��ʾ2�����Դ����� 
			
			
			//ɾ��
			public void remove() {
				//�ƶ�����Ԫ��
				System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
				
				//ʵ�ʴ�С-1
				SimpleList.this.size--;
				
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
				return this.cusor+1 < SimpleList.this.size;
//				return false;
			}

		}
		
		return new MyIter();
	}
	
	public static void main(String[] args) {
		SimpleList sl = new SimpleList();
	
		Iterator iter = sl.iterator();
		
		while(iter.hasNext()) {//���ж�
			System.out.println(iter.next());//���ȡ
//			iter.remove();
		}
		
		System.out.println(sl.size());
		
		
		//�ڶ��α�����ֻ��Ҫʹ��iterator����һ��MyIter�ڲ�����󣬼����ٴα���(�൱���α���Ϊ-1,�������¿�ʼ�����ˡ�)
		
		for(Iterator iter1 = sl.iterator1();iter1.hasNext();) {
			System.out.println(iter1.next());
		}
	}
}
