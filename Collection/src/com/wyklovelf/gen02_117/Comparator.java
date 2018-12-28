package com.wyklovelf.gen02_117;

/**
 * 泛型接口和泛型父类同理
 * @author weiyikai
 *
 */
public interface Comparator<T> {
	public static final int MAX_VALUE = 1;//泛型不能用于static修饰的属性
	
	public abstract void test(T t);
}


//实现Comparator接口



//擦除
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
