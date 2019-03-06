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
 *4�������������
 */
public class MapDemo02 {    
	public static void main(String[] args) {
		//1.�ָ��ַ���
		String []str = "this is c cat and that is a mice and where is the food?".split(" ");
		
		//�ּ�洢
		Map<String,Letter> map = new HashMap<String,Letter>();
		
		for(String key:str) {
//			System.err.println(key);
			//�鿴�Ƿ���ڴ˵���
/*			if(!map.containsKey(key)) {//�������ڴ˵���
				map.put(key, 1);
			}else {
				map.put(key, map.get(key)+1);
			}*/
			
			//������
/*			Integer value = map.get(key);
			
			if(null == value) {
				map.put(key, 1);//��һ�ν���û���ҵ�key��Ӧ��value����˼ǳ�ʼֵΪ1
			}else {//���Ѿ������˶�Ӧ��keyֵ
				map.put(key, value + 1);//���value���м�1�������ɣ�����Ĳ�����ʱ�򲻽�����+�����пϿ��������������������һ���ַ���ʲô��
			}*/
			
			//����
			Letter letter = map.get(key); 
			
			if(null == letter) {//��û�С����ӡ�
				letter = new Letter();
				
				letter.setName(key);
				
				map.put(key, letter);//����һ�������ӡ�
			}
			letter.setCount(letter.getCount() + 1);
			
			
			
			
			
			
			//����
/*			if(!map.containsKey(key)) {//��һ�ν������Ƿ���ڴ��ӣ�����ĸ������������ɵ�javabean��
				map.put(key, new Letter(key));
			}
			
			//��ȡ����Ĵ���
			Letter value = map.get(key);
			
			value.setCount(value.getCount() + 1);//countĬ��Ϊ0(int)
*/		}
		//3.�鿴ÿ�����ʳ��ֵĴ���
		Set<String> keySet = map.keySet();//keySet��ȡmap���������е�keyֵŶ��ôô��
		
		Iterator<String> it = keySet.iterator();//�õ��������Ա������е�keyֵŶ���۹���
		
		while(it.hasNext()) {
			
			String key = it.next();
			
			Letter letter = map.get(key);
			
			System.out.println(letter.getName()+"--->"+letter.getCount());
		}
	}
}
