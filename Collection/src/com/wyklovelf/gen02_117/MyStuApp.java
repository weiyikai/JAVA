package com.wyklovelf.gen02_117;

/**
 * ���͵Ĳ��� ָ ʹ��|ʵ��|�̳� û��ָ������
 * ������Object����s
 * @author weiyikai
 *
 */
public class MyStuApp {
	public static void main(String[] args) {
////		MyStudent<int> ms = new MyStudent<int>();//Syntax error, insert "Dimensions" to complete ReferenceType
//		
//		MyStudent<Integer> ms = new MyStudent<Integer>();
//		
//		//��ȫ
////		ms.setJavase("1");//�Զ����ͼ��
//		ms.setJavase(1);
//		
//		//ʡ�ģ��Զ�����ת��(T-->Integer)��Ҳ����Ҫ���������ж��ˣ�
//		Integer i = ms.getJavase();
		
		
		//���͵Ĳ���->ô��ָ�����͵ľ�������Ĭ��ΪObject����
		MyStudent student = new MyStudent();//����
		
		student.setJavase(100);//100-�Զ�װ��->Integer-��̬->Object
		
		Object obj = student.getJavase();
		
		test(student);//����������ʱ����������ͼ��
		
		//��ָ������ʱ
		MyStudent<Object> stu = new MyStudent<Object>();
		
//		test(stu);//ָ������ΪObject�����ǲ�������������,����The method test(MyStudent<Integer>) in the type MyStuApp is not applicable for the arguments (MyStudent<Object>)
	
		MyStudent<Integer> stu_integer = new MyStudent<Integer>();
		
		test(stu_integer);
	}
	
	public static void test(MyStudent<Integer> stu) {
		System.out.println("���͵Ĳ���");
	}
}
