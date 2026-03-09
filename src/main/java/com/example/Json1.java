package com.example;
import com.google.gson.Gson;

public class Json1 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		String json = gson.toJson(new Person("John", 30));
		System.out.println(json);
	}

}
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
}
}
