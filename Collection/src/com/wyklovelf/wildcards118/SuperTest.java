package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * super -> ���͵�����     ��>=������˼�������Ÿ����������
 * @author weiyikai
 * 
 * 1��һ���������޲���
 * 2���ܹ�������ݣ�������Ӹ�������Ϊ�丸�����ǲ����ģ������Ӷ������ȷ����
 *
 */
public class SuperTest {
	public static void main(String[] args) {
		
		List<Dog> list = new ArrayList<Dog>();
		
		test(list);
		
		List<TaidiDog> list1 = new ArrayList<TaidiDog>();
		
		test(list1);
		
//		List<?> list2 = new ArrayList<Integer>();
//		
//		test(list2);
	}
	
	public static void test(List<? super TaidiDog> a) {
		
		/*
		 * 
		 * �������a����ȷ����һ����TaidiDog���ֱ�ӻ��Ӹ���
		a.add(new TaidiDog());
		*/
		/*
		 * ����a������Dog������࣬�������������в�ͨ
		a.add(new Dog());
		*/
	}
}
