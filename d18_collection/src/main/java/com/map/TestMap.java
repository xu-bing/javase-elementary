package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMap {
	public static void main(String[] args) {
		// 1. 创建Map
		Map map = new HashMap();
		
		// 2. 添加元素
		map.put(1001, "张三");
		map.put(1002, "李四");
		map.put(1003, "王五");
		map.put(1001, "赵六");
		
		// 3. 取元素
		// 根据键取值
		String name = (String) map.get(1002);
		System.out.println(name);
		
		// 遍历
		Set keys = map.keySet();    // //获得所有的键，所有的键存在一个Set中
		
		Iterator ite = keys.iterator();
		
		while(ite.hasNext()){
			Integer key = (Integer) ite.next();  // /遍历所有的键
			String value = (String) map.get(key);  //根据键取值
			System.out.println(value);
		}
		
		// 使用Map.Entry来遍历
		Set entrySet = map.entrySet();
		
		Iterator iter = entrySet.iterator();
		
		while(iter.hasNext()){
			//每次从entrySet中取到的就是一个键值对
			Map.Entry entry = (Map.Entry) iter.next();

			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();

			System.out.println(key + ":" + value);
		}

		/*
		 * 写一个代码片断统计一个字符串中字符出现的频数，例如，
		 * 字符串“abcdbd”统计的结果为：a(1个)， b(2个)，c(1个), d(2个)
		 */
		String s = "abcdbd";

		Map resultMap = new HashMap();

		for(int i=0;i < s.length();i++){

			char c = s.charAt(i);

			/*
			 * if(hash表总没有此字符){
			 * 	存第一个
			 * }else{
			 * 	先把已经出现的次数count取出来
			 * 	count++;
			 * 	再把count++存进去
			 * }
			 */
			if(!resultMap.containsKey(c)){
				resultMap.put(c, 1);
			}else{
				Integer count = (Integer)resultMap.get(c);
				count++;
				resultMap.put(c, count);
			}


		}
		System.out.println(resultMap);
		
	}	// main
}
