package com.wyklovelf.map120;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * �ּ�洢������
 * ͳ�Ƶ��ʳ��ֵĴ���
 * @author Administrator
 *
 *this is c cat and that is a mice and where is the food?
 *
 *˼·��
 *1.�ָ��ַ���
 *2.�ּ�洢
 *3.��Ҫ��鿴ÿ�����ʳ��ֵĴ���
 */
public class MapDemo01 {
	public static void main(String[] args) {
		//1.�ָ��ַ���
		String []str = "this is c cat and that is a mice and where is the food?".split(" ");
		
		//�ּ�洢
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String key:str) {
//			System.err.println(key);
			//�鿴�Ƿ���ڴ˵���
/*			if(!map.containsKey(key)) {//�������ڴ˵���
				map.put(key, 1);
			}else {
				map.put(key, map.get(key)+1);
			}*/
			
			//������
			Integer value = map.get(key);
			
			if(null == value) {
				map.put(key, 1);//��һ�ν���û���ҵ�key��Ӧ��value����˼ǳ�ʼֵΪ1
			}else {//���Ѿ������˶�Ӧ��keyֵ
				map.put(key, value + 1);//���value���м�1�������ɣ�����Ĳ�����ʱ�򲻽�����+�����пϿ��������������������һ���ַ���ʲô��
			}
		}
		//3.�鿴ÿ�����ʳ��ֵĴ���
		Set<String> keySet = map.keySet();//keySet��ȡmap���������е�keyֵŶ��ôô��
		
		Iterator<String> it = keySet.iterator();//�õ��������Ա������е�keyֵŶ���۹���
		
		while(it.hasNext()) {
			
			String key = it.next();
			
			Integer value = map.get(key);
			
			System.out.println(key+"--->"+value);
		}
	}
}
