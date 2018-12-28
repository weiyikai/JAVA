package com.wyklovelf.iter119;

import java.util.Iterator;

/**
 * 
 * @author weiyikai
 *
 *修复刚才进行二次遍历时候需要再创建一个容器的问题：将迭代器归为内部类，实现Iterator接口。
 */
public class SimpleList {
	
	//数组 存储值
	private String[] arr_str = {"a","b","c"};
	
	//大小
	private int size = arr_str.length;
	
	public int size() {
		return this.size;
	}
	
	private class MyIter implements Iterator{
		private int cusor = -1;//-1代此时的容器里面什么都没有，0表示有一个，1表示2个，以此类推 
		
		
		//删除
		public void remove() {
			//移动数组元素
			System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
			
			//实际大小-1
			SimpleList.this.size--;
			
			//因为next让cursor用完之后加了1，所以remove当前元素之后，cursor得-1
			this.cusor--;
		}
		
		//获取下一个
		public String next() {
			this.cusor++;
			return arr_str[this.cusor];
//			return null;
		}
		
		//判断是否存在下一个
		public boolean hasNext() {
			return this.cusor+1 < SimpleList.this.size;
//			return false;
		}

	}
	
	public Iterator iterator() {//向外提供使用MyIter内部类的接口。 
		return new MyIter();
	}
	
	public Iterator iterator1() {//向外提供使用MyIter内部类的接口。 
		
		class MyIter implements Iterator{
			private int cusor = -1;//-1代此时的容器里面什么都没有，0表示有一个，1表示2个，以此类推 
			
			
			//删除
			public void remove() {
				//移动数组元素
				System.arraycopy(arr_str, cusor+1, arr_str, cusor, /*SimpleList.this.*/size - (cusor+1));
				
				//实际大小-1
				SimpleList.this.size--;
				
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
				return this.cusor+1 < SimpleList.this.size;
//				return false;
			}

		}
		
		return new MyIter();
	}
	
	public static void main(String[] args) {
		SimpleList sl = new SimpleList();
	
		Iterator iter = sl.iterator();
		
		while(iter.hasNext()) {//先判断
			System.out.println(iter.next());//后获取
//			iter.remove();
		}
		
		System.out.println(sl.size());
		
		
		//第二次遍历，只需要使用iterator创建一个MyIter内部类对象，即可再次遍历(相当于游标置为-1,可以重新开始遍历了。)
		
		for(Iterator iter1 = sl.iterator1();iter1.hasNext();) {
			System.out.println(iter1.next());
		}
	}
}
