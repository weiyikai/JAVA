package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * ? -->ͨ�������ʾ���Ͳ�ȷ����������������|�β���
 * 1.�������ڷ����࣬���ͷ��������ͽӿںʹ��������ϡ�
 * @author weiyikai
 *
 */

public class WildcardsTest {
	public static void main(String[] args) {
		//��������ߣ����п��ұ�
//		List<?> list = new ArrayList<?>();//ͨ�������ʾ���Ͳ�ȷ����������������|�β���,�˴��ұ�������?����ᱨ  Cannot instantiate the type ArrayList<?>
		
		List<?> list = new ArrayList<String>();
		
		list = new ArrayList<Integer>();
		
		test(list);
		
		//�������
//		list = new ArrayList<?>();
	}
	
	
	public static void test(List<?> a) {
		
	}
	
	/*
	 * �������ڷ��ͷ�����
	public <?>void test1() {
		
	}
	*/
}

/*
 * ?�������ڷ�������  
class Java<?>{
	
}
*/