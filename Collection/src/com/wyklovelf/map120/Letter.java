package com.wyklovelf.map120;
/**
 * javabean ���ڴ洢����Ҳ��po��
 * 
 * ��ʵ���ǰ���setter��getter����������
 * @author Administrator
 *
 */
public class Letter {
	private String name;//����
	
	private int count;//���ʳ��ֵĴ���
	
	public Letter() {
		
	}
	
	public Letter(String name) {
		this.name = name;
	}

	//alt+shift+s+o ���ι���Ŀ�ݷ�ʽ
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
