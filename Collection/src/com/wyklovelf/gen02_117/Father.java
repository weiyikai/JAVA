package com.wyklovelf.gen02_117;

/**
 * 泛型父类 --> 子类为富二代
 * 
 * 
 * 泛型类中：属性即方法的类型随位置而定。
 * 
 * 子类重写父类的方法的类型随父类方法的类型而定
 * 
 * 子类新增方法的类型随子类自己而定
 * 
 * 子类中使用父类的属性随父类而定。
 * 
 * 子类新增的属性的类型随子类自己而定
 * @author weiyikai
 *
 */
public abstract class Father<T1,T2> {//例如：T1可以用在属性上，T2可以用在方法上
	 T1 age;
	
	public abstract void test(T2 name);
}

//保留  -->  泛型子类
//全部保留
class C1<T2,T1,A,B> extends Father<T1,T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		this.age = null;  //-->子类集成父类的属性由父类的属性类型而定：T1
	}
	
	
	//子类自己加的方法可以随意定类型
	public void test1(T1 a,T2 b, A a1,B b1,Integer c) {
		
	}
	
	//子类自己加的属性可以随意定类型
	public T1 age1;
	public Integer age2;
}

//部分保留
class C2<Integerr,String,T2> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
//		this.age = null;-->Integer 
	}
	
}

//不保留  --> 按需实现
//具体类型
class C3<A,B> extends Father<Integer,String>{

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
//		this.age ->Integer
	}
	
}
//没有指定类型则为 擦除
class C4<A,B> extends Father {

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
//		this.age ->Object 
	}
	
}

