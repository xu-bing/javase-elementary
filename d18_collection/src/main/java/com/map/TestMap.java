package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMap {
	public static void main(String[] args) {
		// 1. ����Map
		Map map = new HashMap();
		
		// 2. ���Ԫ��
		map.put(1001, "����");
		map.put(1002, "����");
		map.put(1003, "����");
		map.put(1001, "����");
		
		// 3. ȡԪ��
		// ���ݼ�ȡֵ
		String name = (String) map.get(1002);
		System.out.println(name);
		
		// ����
		Set keys = map.keySet();    // //������еļ������еļ�����һ��Set��
		
		Iterator ite = keys.iterator();
		
		while(ite.hasNext()){
			Integer key = (Integer) ite.next();  // /�������еļ�
			String value = (String) map.get(key);  //���ݼ�ȡֵ
			System.out.println(value);
		}
		
		// ʹ��Map.Entry������
		Set entrySet = map.entrySet();
		
		Iterator iter = entrySet.iterator();
		
		while(iter.hasNext()){
			//ÿ�δ�entrySet��ȡ���ľ���һ����ֵ��
			Map.Entry entry = (Map.Entry) iter.next();

			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();

			System.out.println(key + ":" + value);
		}

		/*
		 * дһ������Ƭ��ͳ��һ���ַ������ַ����ֵ�Ƶ�������磬
		 * �ַ�����abcdbd��ͳ�ƵĽ��Ϊ��a(1��)�� b(2��)��c(1��), d(2��)
		 */
		String s = "abcdbd";

		Map resultMap = new HashMap();

		for(int i=0;i < s.length();i++){

			char c = s.charAt(i);

			/*
			 * if(hash����û�д��ַ�){
			 * 	���һ��
			 * }else{
			 * 	�Ȱ��Ѿ����ֵĴ���countȡ����
			 * 	count++;
			 * 	�ٰ�count++���ȥ
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
