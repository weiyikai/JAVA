package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * ͨ��������� extends
 * @author weiyikai
 *
 */
public class ExtendsTest {
	public static void main(String[] args) {
		//extendsΪ����
		Test<Animal> t = new Test<Animal>();
		
		Test<Dog> t1 = new Test<Dog>();
		
		//����test����
		List<? extends Animal> list = new ArrayList<Animal>();
		
		test(list);
		
		List<Animal> list1 = new ArrayList<Animal>();
		
		test(list1);
		
		List<Dog> list2 = new ArrayList<Dog>();
		
		test(list2);
		
		
		//? extends Dog
		List<? extends Dog> list3 = new ArrayList<Dog>();
		List<TaidiDog> list4 = new ArrayList<TaidiDog>();
		
		
		
		//? ���ܣ���Ϊ? <==> ? extends Objec
		List<?> list5 = new ArrayList<Animal>();
		list5 = new ArrayList<Object>();
//		test(list5);
		
		
	}
	
	//? extends Animal
	public static void test(List<? extends Animal> a){
		/*
		 * 
		 * �����������
		 * *
		a.add(new Animal());
		
		a.add(new Dog());
		*/
		
		a.add(null);
	}
	
//	public static <? extends Animal> void test1() {
//		
//	}
	
	
	
	//������
	static class Test<T extends Animal>{
		
	}
}
