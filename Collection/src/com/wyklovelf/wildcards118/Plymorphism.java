package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * ����û�ж�̬
 * @author weiyikai
 *
 */
public class Plymorphism {
	public static void main(String[] args) {
		
		Dog d = new TaidiDog();
		
//		//������û�ж�̬
//		List<Dog> list = new ArrayList<TaidiDog>();
//		
//		List<? extends Dog> list1= new ArrayList<TaidiDog>();
		
		//û�з�������
		Dog[] dd = new Dog[10];
		
//		Dog<String> ddd =new Dog<String>();//û�з��������
		
		List<Dog> list1 = new ArrayList<>();//JDK1.7���Ͽ����������� ��List<Dog> list = new ArrayList<Dog>();  ->  List<Dog> list1 = new ArrayList<>();
	}
}
