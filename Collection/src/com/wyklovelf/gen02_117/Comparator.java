package com.wyklovelf.gen02_117;

/**
 * ���ͽӿںͷ��͸���ͬ��
 * @author weiyikai
 *
 */
public interface Comparator<T> {
	public static final int MAX_VALUE = 1;//���Ͳ�������static���ε�����
	
	public abstract void test(T t);
}


//ʵ��Comparator�ӿ�



//����
class F1<Integer> implements Comparator{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

class F2<Tnteger> implements Comparator<String>{

	@Override
	public void test(String t) {
		// TODO Auto-generated method stub
		
	}
	
}

class F3<T,A> implements Comparator<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
	
}
