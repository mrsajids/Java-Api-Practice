package com.example.demo.model;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private ArrayList<String> hobbies;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.hobbies = new ArrayList<>(); // Initialize the ArrayList
	}

	// Getter and Setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter and Setter for hobbies
	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	// Method to add hobby to the list
	public void addHobby(String hobby) {
		this.hobbies.add(hobby);
	}
}
