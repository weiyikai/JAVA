package com.wyklovelf.linkedlist103;


/**
 * 
 * @author wyk
 *
 */
public class LinkedList /*implements List*/{//����ֻ�Ǽ򵥵���дList�ӿ��е���Ҫ�����������淶Ŷ��
	
	private Node first;  
	
	private Node last;
	
	
	private int size;
	
	public int size() {
		return size;
	}
	
	public void add(Object obj) {
		Node n = new Node();//�½�һ���ڵ�	
		if(null == first) {//�����һ���ڵ�Ϊ�գ���ʾ���б�����ʱһ���ڵ�Ҳû��
//			Node n = new Node();//�½�һ���ڵ�
			
			n.pervious = null;//������pervious����Ϊ�գ���ʾ�˽ڵ�Ϊͷ���
			
			n.obj = obj;//������obj����
			
			n.next = null;//��һ���ڵ���ʱ����֪������������Ϊ��
			
			first = n;//��ʱ�б���ֻ��һ���ڵ㣬����ͷ������n
			
			last = n;//ͬ��β�ڵ�Ҳ��n
		
		}else {
			//first�ڵ㲻Ϊ��ʱ��ֱ����last�ڵ���һ���µĽڵ�
//			Node n = new Node();
			
			n.pervious = null;
			
			n.obj = obj;
			
			n.next = null;
			
			last.next = n;
			
			last = n;//��β�����¼�һ���ڵ㣬�˽ڵ��Ϊ�����һ���ڵ㡣
		}
		
		size++;
	}
	
//	public void delete(Object obj) {
//		if(null == first) {//��ͷ���Ϊ��,֤��������Ϊ��
//			System.out.println("List is empty!");
//		}else {
//			while()
//		}
//	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("aaa");
		
		System.out.println(list.size());
		
		list.add("bbb");
		
		System.out.println(list.size());
		
		list.add("ccc");
		
		System.out.println(list.size());
		
		list.add("ddd");
		
		System.out.println(list.size());
	}
}