package com.wyklovelf.linkedlist103;

/**
 * �ڵ���
 * @author wyk
 *
 */
public class Node {
		Node pervious;//���ǰһ���ڵ�
		
		Object obj;//��ű��ڵ��ֵ
		
		Node next;//�����һ���ڵ�

		public Node(Node pervious, Object obj, Node next) {
			super();
			this.pervious = pervious;
			this.obj = obj;
			this.next = next;
		}

		public Node() {
			
		}
}