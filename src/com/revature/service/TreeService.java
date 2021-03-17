package com.revature.service;

import com.revature.pojo.Person;

public interface TreeService {

	public boolean existingPerson(Person person);
	
	public Person addPerson(Person person);
	
	public boolean verifyPerson(Person person);
	
}
