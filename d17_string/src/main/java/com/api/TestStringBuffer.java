package com.api;

public class TestStringBuffer {

	public static void main(String[] args) {
		// preparations
		String intro = "��Һã�����";
		String name = "����";
		int age = 20;
		
		// create
		StringBuffer  sb = new StringBuffer(intro);
		
		// invoke methods
		// append
		sb.append(name);
		sb.append(age);
		System.out.println(sb);
		
		// delete
		sb.delete(3,7);		// ������end
		System.out.println(sb);
		
		// ƴ���ַ���
		// sql: select * from emp where empno = 7796 and job = CLERK 
		String strSql = "SELECT emp FROM emp WHERE empno = ";
		String empno = "7796";
		String job = "CLERK";
			
	}	// main
}	// TestStringBuffer
