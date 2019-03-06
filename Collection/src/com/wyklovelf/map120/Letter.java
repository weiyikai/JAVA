package com.wyklovelf.map120;
/**
 * javabean 用于存储数据也成po类
 * 
 * 其实就是包含setter和getter访问器的类
 * @author Administrator
 *
 */
public class Letter {
	private String name;//单词
	
	private int count;//单词出现的次数
	
	public Letter() {
		
	}
	
	public Letter(String name) {
		this.name = name;
	}

	//alt+shift+s+o 带参构造的快捷方式
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
