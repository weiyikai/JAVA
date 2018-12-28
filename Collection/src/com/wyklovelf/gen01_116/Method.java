package com.wyklovelf.gen01_116;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * �Ƿ�������	���巺�ͷ���
 * @author weiyikai
 *
 */
public class Method {
	public static <T extends List> void test(T t) {
		System.out.println(t);
		t.add("123"); 
	}
	
	public static <T>void main(String[] args) throws IOException {
		test(new ArrayList());
		
		File file = new File("E:\\a.txt");
		
		InputStream input = new FileInputStream(file);
		
//		int len;
//		
//		while((len = input.read()) != -1){
//			System.out.println(len);//�������� ��ascii��
//		}
		
//		read() :  ���������ж�ȡ���ݵ���һ���ֽڣ�����0��255��Χ�ڵ�int�ֽ�ֵ�������Ϊ�Ѿ�������ĩβ��û�п��õ��ֽڣ��򷵻�-1�����������ݿ��á���⵽��ĩβ�����׳��쳣ǰ���˷���һֱ������
//
//		read(byte[] b) :  ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С���������ʽ����ʵ�ʶ�ȡ���ֽ��������������ݿ��á���⵽�ļ�ĩβ�����׳��쳣ǰ���˷���һֱ������
//
//		��� b �ĳ���Ϊ 0���򲻶�ȡ�κ��ֽڲ����� 0�����򣬳��Զ�ȡ����һ���ֽڡ������Ϊ��λ���ļ�ĩβ��û�п��õ��ֽڣ��򷵻�ֵ -1���������ٶ�ȡһ���ֽڲ�����洢�� b �С�
//
//		����ȡ�ĵ�һ���ֽڴ洢��Ԫ�� b[0] �У���һ���洢�� b[1] �У��������ơ���ȡ���ֽ���������b �ĳ��ȡ��� k Ϊʵ�ʶ�ȡ���ֽ�������Щ�ֽڽ��洢�� b[0] �� b[k-1] ��Ԫ���У���Ӱ�� b[k] ��b[b.length-1] ��Ԫ�ء�
//		
		int length;
		
		byte[] bytes = new byte[1024];
		
		System.out.println(input.read(bytes));
		
		while((length = input.read(bytes))!= -1) 
		{
			System.out.println(length);
			System.out.println(new String(bytes,0,length));
		}
		
		test1(input);
	}
	
	//�ͷ���Դ
	public static <T extends Closeable>void test1(T... a){//T... <=> T[]
		for(T temp:a) {//��T���͵Ķ���Ϊ������йر�
			if(null != temp) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
	}
}
