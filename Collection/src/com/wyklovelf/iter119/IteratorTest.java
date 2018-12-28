package com.wyklovelf.iter119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 理解迭代器的原理
 * 
 * 1.一个容器可以创建多个迭代器对象，途径：使用内部类|匿名内部类
 * 深入：
 * 1.使用匿名内部类 实现迭代器
 * 2.使用Iterable实现foreach迭代
 * 3.加入末尾添加元素的方法
 * 
 * @author weiyikai
 *
 */
public class IteratorTest implements java.lang.Iterable{//泛型的擦除
	
	
//	private String[] arr_str = {"a","b","c"};
	
	private String[] arr_str =new  String[5];
	
//	private int size = arr_str.length;
	
	//实际大小
	private int size = 0;
	
	public void  add(String s) {//末尾添加元素
		
		if(this.size == arr_str.length) {
			arr_str = Arrays.copyOf(arr_str, arr_str.length + 5);//数组扩容 
		}
		
		arr_str[size] = s;
		
		size++;
	}
	
	public Iterator iterator() {
		return new Iterator() {//创建Iterator迭代器实现类（没有名称）的对象
			private int cusor = -1;//-1代此时的容器里面什么都没有，0表示有一个，1表示2个，以此类推 
			
			
			//删除
			public void remove() {
				//移动数组元素
				System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
				
				//实际大小-1
				IteratorTest.this.size--;
				
				//因为next让cursor用完之后加了1，所以remove当前元素之后，cursor得-1
				this.cusor--;
			}
			
			//获取下一个
			public String next() {
				this.cusor++;
				return arr_str[this.cusor];
//				return null;
			}
			
			//判断是否存在下一个
			public boolean hasNext() {
				return this.cusor+1 < IteratorTest.this.size;
//				return false;
			}
		};
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		IteratorTest it = new IteratorTest();
		
		it.add("a");
		
		it.add("b");
		
		it.add("c");
		
		Iterator iter = it.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
//			iter.remove();
		}
		
		System.out.println(it.size);
		
		Iterator iter1 = it.iterator();
		
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		for(Object str:it) {
			System.out.println(str);
		}
		
		
		
		
		
		
		ArrayList list2 = new ArrayList();
		
		list2.add("林林");
		list2.add("林林");
		list2.add("林林");
		
		for(Object obj:list2) {//foreach增强for循环
			System.out.println(obj);
		}
	}
}
