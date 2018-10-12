package com.wyklovelf.collection102;

import java.util.ArrayList;
import java.util.List;

/**
 * �Լ�ʵ��һ��ArrayList(��������)
 * @author wyk
 *
 */
public class MyArrayList /*implements List*/{//���Լ�"implements List"�Եø�Ϊ�淶��ȫ��һ�㣬������ֻ��һ�����飬Ŀ���Ǵﵽһ����ש�����Ŀ��
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(3);
//		StringBuilder
		
		list.add("aaa");

		list.add("bbb");
		
		list.add("ccc");
		
		
		System.out.println(list.size());
		
		list.add(3, "ddd");
		
		System.out.println(list.size());
		
		
		ArrayList list1 = new ArrayList();
		
	}
	
	private Object[] elementData;//��Ŷ���Ķ�������
	
	private int size;//������Ԫ�صĸ���

	public MyArrayList(int initialCapacity) {
		
		if(initialCapacity < 0) {//���С��0�����׳��쳣����Ϊ����Ĵ�С��ΪС��0��
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.elementData = new  Object[initialCapacity];//��initialCapacity����ΪObject�ĳ�ʼ��С
		
	}
	
	public MyArrayList() {//�չ�����
		this(3);
	}
	
	public void add(Object obj) {
		
		//�������ݺ����ݵĿ���
		if(size == elementData.length) {
			Object[] newArray = new Object[size*2 + 1];
		
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);//��һ���������������ĳ��ȣ���ԭ����ӵ�һ��λ�ÿ�ʼ���������������е�Ԫ��ȡ�������������һ��λ�ÿ�ʼ���η���
		
//			for (int i = 0; i < elementData.length; i++) {
//				newArray[i] = elementData[i];
//			}//����
			
			elementData = newArray;
		}
		
		elementData[size] = obj;//�ȸ�ֵ
		size++;//������		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public Object get(int index) {
		
		if(index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return elementData[index];
	}
	
	public void remove(int index) {
		//ɾ��ָ��λ�õĶ���
		//a b c d e -----> a b d e
		if(index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int numMoved = size - index - 1;//Ҫǰ��Ԫ�صĸ�����ʵ��Ϊindex - (index+1),������ȥ�Ƴ�Ԫ���±�+1
		
		if(numMoved > 0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
		
		size = size - 1;
		
		elementData[size] = null;
	}
	
	public void remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if(get(i).equals(obj)) {//�ײ���õ���equals�Ƚϵ����Ƿ�ָ��ͬһ�����󣬶���==���Ƚ�ֵ��
				this.remove(i);
			}
		}
	}
	
	public Object set(int index,Object obj) {
		this.rangeCheck(index);
		
		Object old = this.elementData[index];
		
		elementData[index] = obj;
		
		return old;//����һ���ϵĶ���(Ҳ���Ǳ��滻���Ǹ�����)
	}
	
	public void add(int index,Object obj) {
//		this.rangeCheck(index);
		//����rangeCheck������index == size�����Ҫ�ų��������޷�����Ŷ,��Ϊ��ʱ��size == length����Ҫ���ݶ�����Ҫ�׳��쳣
//		if(index < 0 || index > size) {
//			try {
//				throw new Exception();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		//��ȻҲ����ֱ���������С��length���бȽϿ��Ƿ���Ҫ����Ŷ��
		if(index < 0 || index > elementData.length) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ensureCapacity();//��������
		
		elementData[size] = obj;
		
		size++;
	}
	
	private void ensureCapacity() {//����
		if(size == elementData.length) {
			Object[] newArray = new Object[size*2 + 1];
			
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			
			elementData = newArray;
		}
	}
	
	private void rangeCheck(int index) {
		if(index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
