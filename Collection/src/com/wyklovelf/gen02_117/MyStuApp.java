package com.wyklovelf.gen02_117;

/**
 * 泛型的擦除 指 使用|实现|继承 没有指定类型
 * 类似于Object类型s
 * @author weiyikai
 *
 */
public class MyStuApp {
	public static void main(String[] args) {
////		MyStudent<int> ms = new MyStudent<int>();//Syntax error, insert "Dimensions" to complete ReferenceType
//		
//		MyStudent<Integer> ms = new MyStudent<Integer>();
//		
//		//安全
////		ms.setJavase("1");//自动类型检查
//		ms.setJavase(1);
//		
//		//省心（自动类型转换(T-->Integer)，也不需要进行类型判断了）
//		Integer i = ms.getJavase();
		
		
		//泛型的擦除->么有指定泛型的具体类型默认为Object类型
		MyStudent student = new MyStudent();//擦除
		
		student.setJavase(100);//100-自动装箱->Integer-多态->Object
		
		Object obj = student.getJavase();
		
		test(student);//擦除，编译时不会进行类型检查
		
		//当指定泛型时
		MyStudent<Object> stu = new MyStudent<Object>();
		
//		test(stu);//指定类型为Object，不是擦除，进行类检查,报：The method test(MyStudent<Integer>) in the type MyStuApp is not applicable for the arguments (MyStudent<Object>)
	
		MyStudent<Integer> stu_integer = new MyStudent<Integer>();
		
		test(stu_integer);
	}
	
	public static void test(MyStudent<Integer> stu) {
		System.out.println("泛型的擦除");
	}
}
