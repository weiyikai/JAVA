package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * super -> 泛型的下限     “>=”的意思，代表着父类或者自身
 * @author weiyikai
 * 
 * 1、一般用于下限操作
 * 2、能够添加数据，不能添加父对象。因为其父对象是不定的，而其子对象可以确定。
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
		 * 而这里的a可以确定，一定是TaidiDog类的直接或间接父类
		a.add(new TaidiDog());
		*/
		/*
		 * 这里a可能是Dog类的子类，若是这样，则行不通
		a.add(new Dog());
		*/
	}
}
