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

		//����Properties����
		Properties p = new Properties();

		try {
			//��ȡ�ļ���������
			FileInputStream fis = new FileInputStream("d:\\dbConfig.properties");

			//���������м����ļ�,properties�оʹ����ļ��еļ�ֵ��
			p.load(fis);

			// ---------------------------------------------------------------------
			// ? �ܷ�ȡֵ��������try�����档
			//���ݼ�ȡֵ
			String name = p.getProperty("url");
			System.out.println(name);

			//����
			Enumeration en = p.propertyNames();//�������е��������Ƶ�ö��
			while(en.hasMoreElements()){//���ú�Iterator��෽ʽ�ı���
				// ȡ��
				String propertyName = (String)en.nextElement();
				// ȡֵ
				String value = p.getProperty(propertyName);
				//  ��ӡ
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
