package com.pojo;

public class Details extends Student_Details{

	public static void main(String[] args) {
		
		Details obj=new Details();
		
		obj.setName("Arthi");
		obj.setAge(5);
		
		String name = obj.getName();
		System.out.println(name);
		
		int i = obj.getAge();
		System.out.println(i);
	}
}
