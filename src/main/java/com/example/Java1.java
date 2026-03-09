package com.example;
import com.google.gson.Gson;

public class Java1{

	public static void main(String[] args) {
		Gson gson = new Gson();
		String json = gson.toJson(new Student("Radha", 96));
		System.out.println(json);
	}

}
class Student{
	private String name;
	private int marks;
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
}