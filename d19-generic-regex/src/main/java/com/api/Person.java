package com.api;

public class Person implements Comparable<Person> {
    // public class Person implements Comparable{
    private String name;
    private int age;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public int compareTo(Person p){
//	public int compareTo(Object o){

        System.out.println("---------------------");
        int result = 0;

        //Person p = (Person)o;
        if(age > p.getAge()){
            result = 1;
        }else if(age < p.getAge()){
            result = -1;
        }

        return result;

    }
}

