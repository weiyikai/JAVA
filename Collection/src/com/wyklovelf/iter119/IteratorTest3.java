package com.wyklovelf.iter119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 目标：使用泛型来操作多个类型
 * 途径：加入泛型
 * 这样就可以遍历多种类型的容器
 * 
 * @author weiyikai
 *
 */
public class IteratorTest3<E> implements java.lang.Iterable<E>{//泛型的擦除
	
	
//	private String[] arr_str = {"a","b","c"};
	
//	private E[] arr_str =new  E[5];//没有泛型数组
	
	private Object[] arr_str = new Object[5];
	
//	private int size = arr_str.length;
	
	//实际大小
	private int size = 0;
	
	public void  add(E s) {//末尾添加元素
		
		if(this.size == arr_str.length) {
			arr_str = Arrays.copyOf(arr_str, arr_str.length + 5);//数组扩容 
		}
		
		arr_str[size] = s;
		
		size++;
	}
	
	public Iterator<E> iterator() {
		return new Iterator<E>() {//创建Iterator迭代器实现类（没有名称）的对象
			private int cusor = -1;//-1代此时的容器里面什么都没有，0表示有一个，1表示2个，以此类推 
			
			
			//删除
			public void remove() {
				//移动数组元素
				System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
				
				//实际大小-1
				IteratorTest3.this.size--;
				
				//因为next让cursor用完之后加了1，所以remove当前元素之后，cursor得-1
				this.cusor--;
			}
			
			//获取下一个
			public E next() {
				this.cusor++;
				return (E)arr_str[this.cusor];
//				return null;
			}
			
			//判断是否存在下一个
			public boolean hasNext() {
				return this.cusor+1 < IteratorTest3.this.size;
//				return false;
			}
		};
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		IteratorTest3 it = new IteratorTest3();
		
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
		
		
		IteratorTest3<String> it3 = new IteratorTest3<String>();
		
		it3.add("1");
		it3.add("2");
		it3.add("3");
		
		Iterator<String> iter3 = it3.iterator();
		
		for(String str:it3) {//需要实现java.lang.Iterable接口
			System.out.println(str);
		}
		
		
		IteratorTest3<Integer> it4 = new IteratorTest3<Integer>();
		
		it4.add(1);//int->Integer自动装箱
		it4.add(2);
		it4.add(3);
		
		Iterator<Integer> iter4 = it4.iterator();	
		
		while(iter4.hasNext()) {
			Integer i = iter4.next();
			System.out.println(i);
		}
	}
}
