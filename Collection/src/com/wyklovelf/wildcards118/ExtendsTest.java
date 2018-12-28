package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符的上限 extends
 * @author weiyikai
 *
 */
public class ExtendsTest {
	public static void main(String[] args) {
		//extends为上限
		Test<Animal> t = new Test<Animal>();
		
		Test<Dog> t1 = new Test<Dog>();
		
		//调用test方法
		List<? extends Animal> list = new ArrayList<Animal>();
		
		test(list);
		
		List<Animal> list1 = new ArrayList<Animal>();
		
		test(list1);
		
		List<Dog> list2 = new ArrayList<Dog>();
		
		test(list2);
		
		
		//? extends Dog
		List<? extends Dog> list3 = new ArrayList<Dog>();
		List<TaidiDog> list4 = new ArrayList<TaidiDog>();
		
		
		
		//? 不能，因为? <==> ? extends Objec
		List<?> list5 = new ArrayList<Animal>();
		list5 = new ArrayList<Object>();
//		test(list5);
		
		
	}
	
	//? extends Animal
	public static void test(List<? extends Animal> a){
		/*
		 * 
		 * 不能添加数据
		 * *
		a.add(new Animal());
		
		a.add(new Dog());
		*/
		
		a.add(null);
	}
	
//	public static <? extends Animal> void test1() {
//		
//	}
	
	
	
	//泛型类
	static class Test<T extends Animal>{
		
	}
}
