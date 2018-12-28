package com.wyklovelf.wildcards118;

import java.util.ArrayList;
import java.util.List;

/**
 * ? -->通配符，表示类型不确定，用于声明变量|形参上
 * 1.不能用在泛型类，泛型方法，泛型接口和创建对象上。
 * @author weiyikai
 *
 */

public class WildcardsTest {
	public static void main(String[] args) {
		//声明看左边，运行看右边
//		List<?> list = new ArrayList<?>();//通配符，表示类型不确定，用于声明变量|形参上,此处右边若是用?，则会报  Cannot instantiate the type ArrayList<?>
		
		List<?> list = new ArrayList<String>();
		
		list = new ArrayList<Integer>();
		
		test(list);
		
		//编译错误
//		list = new ArrayList<?>();
	}
	
	
	public static void test(List<?> a) {
		
	}
	
	/*
	 * 不能用在泛型方法上
	public <?>void test1() {
		
	}
	*/
}

/*
 * ?不能用在泛型类上  
class Java<?>{
	
}
*/