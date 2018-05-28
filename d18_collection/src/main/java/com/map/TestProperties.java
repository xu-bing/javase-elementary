package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class TestProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//创建Properties对象
		Properties p = new Properties();

		try {
			//读取文件到输入流
			FileInputStream fis = new FileInputStream("d:\\dbConfig.properties");

			//从输入流中加载文件,properties中就存着文件中的键值对
			p.load(fis);

			// ---------------------------------------------------------------------
			// ? 能否将取值操作放在try的外面。
			//根据键取值
			String name = p.getProperty("url");
			System.out.println(name);

			//遍历
			Enumeration en = p.propertyNames();//返回所有的属性名称的枚举
			while(en.hasMoreElements()){//采用和Iterator差不多方式的遍历
				// 取键
				String propertyName = (String)en.nextElement();
				// 取值
				String value = p.getProperty(propertyName);
				//  打印
				System.out.println(propertyName + ":" + value);
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}	// main

}
