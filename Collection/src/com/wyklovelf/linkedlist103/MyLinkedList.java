package com.wyklovelf.linkedlist103;


/**
 * 
 * @author wake
 * ����������˫���б�
 *
 */
public class MyLinkedList{//����ֻ�Ǽ򵥵���дList�ӿ��е���Ҫ�����������淶Ŷ��
	
	private Node first;  
	
	private Node last;
	
	
	private int size;
	
	public int size() {
		return size;
	}
	
	/**
	 * add���������б�β���ϼӽڵ㣨��=���룩
	 * @param obj
	 */
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
			
			n.pervious = last;
			
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
	
	private void rangeCheck(int index) {
		if(index<0 || index>=this.size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * get����������ָ�����������ظ��������ڵ��obj����
	 */
	public Object get(int index) {
		
		rangeCheck(index);
		
		Node temp = new Node();
		
		if(null == first) {//ͷ�ڵ�Ϊ�գ���ʾ���б�Ϊ�գ�����null
			return null;
		}else {
			
			
			temp = first;
			
			for (int i = 0; i < index; i++) {//�����б�indexʱ�����ظô��ڵ��obj����
				temp = temp.next;
			}
		}
		return temp.obj;
	}
	
	/*
	 * removeɾ��ָ������λ�õĽڵ�
	 */
	public void remove(int index) {
		rangeCheck(index);
		
		if(null == first) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else {
			Node temp = new Node();
			temp = first;
			for (int i = 0; i < index; i++) {//�ҵ�Ҫɾ���Ľڵ��λ��
				temp = temp.next;
			}
			
			if(null == temp.next) {//���Ҫɾ���Ľڵ���β�ڵ�
				temp.pervious.next = null;
			}else {
				temp.pervious.next = temp.next;
				
				temp.next.pervious = temp.pervious;
			}
			
			size--;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.add("aaa");
		
		System.out.println(list.size());
		
		list.add("bbb");
		
		System.out.println(list.size());
		
		list.add("ccc");
		
		System.out.println(list.size());
		
		list.add("ddd");
		
		System.out.println(list.size());
		
		System.out.println(list.get(3));
		
		list.remove(3);
		
		System.out.println(list.size());
	}
}