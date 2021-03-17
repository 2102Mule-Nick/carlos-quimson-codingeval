package com.revature.dao;

import java.util.List;

import com.revature.pojo.Person;

public interface PersonDao {

	public Person getPersonByName(Person person);
	
	public List<Person> getRelatives(Person person);
	
	public void removePerson(Person person);
	
	public void addPerson(Person person);
	
	public void updatePerson(Person person);
	
}
