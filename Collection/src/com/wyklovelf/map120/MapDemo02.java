package com.wyklovelf.map120;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 分拣存储方法：
 * 统计单词出现的次数
 * @author Administrator
 *
 *this is c cat and that is a mice and where is the food?
 *
 *思路：
 *1.分割字符串
 *2.分拣存储
 *3.按要求查看每个单词出现的次数
 *4、加入面向对象
 */
public class MapDemo02 {    
	public static void main(String[] args) {
		//1.分割字符串
		String []str = "this is c cat and that is a mice and where is the food?".split(" ");
		
		//分拣存储
		Map<String,Letter> map = new HashMap<String,Letter>();
		
		for(String key:str) {
//			System.err.println(key);
			//查看是否存在此单词
/*			if(!map.containsKey(key)) {//若不存在此单词
				map.put(key, 1);
			}else {
				map.put(key, map.get(key)+1);
			}*/
			
			//法二：
/*			Integer value = map.get(key);
			
			if(null == value) {
				map.put(key, 1);//第一次进来没有找到key对应的value，因此记初始值为1
			}else {//若已经存在了对应的key值
				map.put(key, value + 1);//则对value进行加1操作即可，这里的操作有时候不仅限于+，还有肯可能有其他处理比如连接一个字符串什么的
			}*/
			
			//法三
			Letter letter = map.get(key); 
			
			if(null == letter) {//若没有“袋子”
				letter = new Letter();
				
				letter.setName(key);
				
				map.put(key, letter);//增加一个“袋子”
			}
			letter.setCount(letter.getCount() + 1);
			
			
			
			
			
			
			//法四
/*			if(!map.containsKey(key)) {//第一次进来看是否存在袋子（由字母及其数字所组成的javabean）
				map.put(key, new Letter(key));
			}
			
			//获取具体的袋子
			Letter value = map.get(key);
			
			value.setCount(value.getCount() + 1);//count默认为0(int)
*/		}
		//3.查看每个单词出现的次数
		Set<String> keySet = map.keySet();//keySet获取map容器中所有的key值哦，么么哒
		
		Iterator<String> it = keySet.iterator();//用迭代器可以遍历所有的key值哦，哇哈哈
		
		while(it.hasNext()) {
			
			String key = it.next();
			
			Letter letter = map.get(key);
			
			System.out.println(letter.getName()+"--->"+letter.getCount());
		}
	}
}
