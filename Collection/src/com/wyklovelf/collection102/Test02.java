package com.wyklovelf.collection102;

public class Test02 {
	public static void main(String[] args) {
		int n = 3,m = 3;
		System.out.println(m == n);
		
		String str = new String("hello");
		
		String str1 = new String("hello");
		
		String str2 = new String("hello");
		
		System.out.println("str1��str2ָ��ͬ�Ķ���");
		System.out.println(str1 == str2);
		
		str1 = str;
		
		str2 = str;
		
		System.out.println("str1��str2ָ����ͬ�Ķ���");
		System.out.println(str1 == str2);
		
		System.out.println("String���equals����������д��ԭ���Ƚ��������������Ƿ�ָ��ͬһ��������д��Ƚϵ���������������ָ��������value�ַ������Ƿ���ͬ");
		System.out.println(str1.equals(str2));//String�����equals������������д���Ƚϵ���ָ��������ˡ���
		
		
	}
}
