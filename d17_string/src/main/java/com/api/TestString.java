package com.api;

public class TestString {

	public static void main(String[] args) {
		// -------------------------------
		// �����ַ���
		String s = "Hello World";
		System.out.println(s);
		
		char[] cs = {'t','o','m'};
		String s1 = new String(cs);
		System.out.println(s1);
		
		String s2 = new String("jack");
		System.out.println(s2);
		
		// ------------------------------
		// �����ַ���ĳ��λ���ϵ��ַ�
		char c = s.charAt(0);	// ����λ�ô�0��ʼ
		System.out.println(c);
		
		// ƴ���ַ���
		System.out.println(s1.concat(s2)); 
		
		// ����һ���ַ����ַ����е�һ�γ��ֵ�λ��
		System.out.println(s.indexOf('h'));	// -1
		System.out.println(s.indexOf('H'));
		
		// �����ַ����ĳ���
		System.out.println(s.length());
		
		// �ַ��滻
		System.out.println(s.replace('l', '*'));
		
		// �ָ��ַ���
		String s4 = "tom,jack,hellen";
		String[] ss = s4.split(",");
		for (String sss : ss){
			System.out.println(sss);
		}
		
		// ת����д
		System.out.println(s.toUpperCase());
		
		// ȥ���ַ���ǰ��հ�
		String s5 = "	 hello  world	  ";
		System.out.println(s5.length());
		s5 = s5.trim();
		System.out.println(s5.length());
		
		// �� "helloworld" ��ת���,���Ϊdlrowolleh
		char[] css = s.toCharArray();
		for (int i = css.length -1; i >=0; i--){
			System.out.print(css[i]);
		}
		
		// ��ȡurl��ַ�е�����(login.html): http://www.sohu.com/login.html
		System.out.println();
		String url = "http://www.sohu.com/login.html";
		// 1
		// String sub = url.substring(url.length() - "login.html".length(), url.length());
		// System.out.println(sub);
		
		// 2.
		int begin = url.lastIndexOf("/") + 1;
		int end = url.length();
		String sub = url.substring(begin, end);
		System.out.println(sub);
		
		// 138****1988
		// 13815331988
		
	}	// main
	
}	// TestString
