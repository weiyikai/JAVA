package com.wyklovelf.wildcards118;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Ƕ��    ��������:���⵽�ڵĲ��
 * @author weiyikai
 *
 */
public class StudentApp {
	public static void main(String[] args) {
		Student<String> stu = new Student<String>();
		
		stu.setScore("OK");
		stu.setScore("No");
		
		System.out.println(stu.getScore());
		
		//����Ƕ��
		Class<Student<String>> class1 = new Class<Student<String>>();
		
		class1.setStu(stu);
		
		stu = class1.getStu();
		
		String score = stu.getScore();
		
		System.out.println(score);
		
		//HashMap ���͵�Ƕ��
		Map<String,String> map = new HashMap<String,String>();
		
		
		map.put("a", "1");
		map.put("b", "2");
		
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for(Entry<String, String> entry:entrySet) {
			String key = entry.getKey();
			
			String value = entry.getValue();
			
			System.out.println(key+"-->"+value);
		}
	}
}
