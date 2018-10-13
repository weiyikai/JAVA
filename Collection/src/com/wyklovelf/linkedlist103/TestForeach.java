

package com.wyklovelf.linkedlist103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestForeach {
	public static void main(String[] args) {
		TestForeach tf = new TestForeach();
		tf.initArray();
		tf.listToArray();
		tf.twoDimensionArray();
		tf.threeDimensionArray();
	}
	
	public void initArray() {
		//���岢�ҳ�ʼ��һ������
		int arr[] = {2,5,1};
		
		System.out.println("������������ǰ��һά���飺");
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//����ð������
		Arrays.sort(arr);
		
		//foreach�������֮���arr����Ԫ��
		System.out.println("��������������һά���飺");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	//����ת��������
	public void listToArray() {
		//����list�������Ԫ��
		List<String> list = new ArrayList<String>();
		
		list.add("123");
		
		list.add("456");
		
		list.add("789");
		
		//foreachѭ���������Ԫ��
		System.out.println("��������foreach�������Ԫ��");
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		//��ArrayListת��������
		Object []obj = list.toArray();
		
		System.out.println("��������foreach�������ת������������Ԫ��");
		
		for (Object object : obj) {
			System.out.print(object.toString()+ " ");
		}
		
		System.out.println();
	}
	
	//foreach�����ά����
	public void twoDimensionArray() {
		int arr[][] = {{1,2,3},{3,2,1}};
		
		System.out.println("��������foreach�����ά����");
		
		for (int[] is : arr) {
			for(int e: is) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	
	//foreach�����ά����
	public void threeDimensionArray() {
		int arr[][][] = {
				{{1,2},{3,4}},
				{{5,6},{7,8}}
		};
		
		System.out.println("��������foreach�����ά����");
		for (int[][] is : arr) {
			for(int [] is1 : is) {
				for(int e : is1) {
					System.out.print(e + " ");
				}
//				System.out.println();
			}
//			System.out.println();
		}
	}
}
