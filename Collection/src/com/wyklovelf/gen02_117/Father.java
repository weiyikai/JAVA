package com.wyklovelf.gen02_117;

/**
 * ���͸��� --> ����Ϊ������
 * 
 * 
 * �������У����Լ�������������λ�ö�����
 * 
 * ������д����ķ����������游�෽�������Ͷ���
 * 
 * �������������������������Լ�����
 * 
 * ������ʹ�ø���������游�������
 * 
 * �������������Ե������������Լ�����
 * @author weiyikai
 *
 */
public abstract class Father<T1,T2> {//���磺T1�������������ϣ�T2�������ڷ�����
	 T1 age;
	
	public abstract void test(T2 name);
}

//����  -->  ��������
//ȫ������
class C1<T2,T1,A,B> extends Father<T1,T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		this.age = null;  //-->���༯�ɸ���������ɸ�����������Ͷ�����T1
	}
	
	
	//�����Լ��ӵķ����������ⶨ����
	public void test1(T1 a,T2 b, A a1,B b1,Integer c) {
		
	}
	
	//�����Լ��ӵ����Կ������ⶨ����
	public T1 age1;
	public Integer age2;
}

//���ֱ���
class C2<Integerr,String,T2> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
//		this.age = null;-->Integer 
	}
	
}

//������  --> ����ʵ��
//��������
class C3<A,B> extends Father<Integer,String>{

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
//		this.age ->Integer
	}
	
}
//û��ָ��������Ϊ ����
class C4<A,B> extends Father {

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
//		this.age ->Object 
	}
	
}

