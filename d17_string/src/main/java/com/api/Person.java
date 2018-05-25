package com.api;

public class Person {
	private String username;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Person) {	// ÅĞ¶ÏÊÇ·ñÎªperson
			Person p = (Person)obj;
			if (username.equals(p.username) && age == p.age){
				result = true;
			}
		}
		
		return result;
	}

	
}	// Person
