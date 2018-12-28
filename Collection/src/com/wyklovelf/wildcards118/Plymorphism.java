package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型没有多态
 * @author weiyikai
 *
 */
public class Plymorphism {
	public static void main(String[] args) {
		
		Dog d = new TaidiDog();
		
//		//泛型了没有多态
//		List<Dog> list = new ArrayList<TaidiDog>();
//		
//		List<? extends Dog> list1= new ArrayList<TaidiDog>();
		
		//没有泛型数组
		Dog[] dd = new Dog[10];
		
//		Dog<String> ddd =new Dog<String>();//没有泛型数组的
		
		List<Dog> list1 = new ArrayList<>();//JDK1.7以上可以做这样的 简化List<Dog> list = new ArrayList<Dog>();  ->  List<Dog> list1 = new ArrayList<>();
	}
}
