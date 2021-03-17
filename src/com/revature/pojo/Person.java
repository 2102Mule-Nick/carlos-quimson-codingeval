package com.revature.pojo;

public class Person {
	private String identifier;
	
	private String firstName;
	
	private String lastName;
	
	private Person father;
	
	private Person mother;

	//setters and getters
	
	public String getFirstName() {
		return firstName;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	
	// Constructor
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String identifier, String firstName, String lastName, Person father, Person mother) {
		super();
		this.identifier = identifier;
		this.firstName = firstName;
		this.lastName = lastName;
		this.father = father;
		this.mother = mother;
	}
	
	
	
	
}
