package com.revature.service;

import org.apache.log4j.Logger;

import com.revature.dao.PersonDao;
import com.revature.pojo.Person;

public class TreeServicePostgres implements TreeService {

	private Logger log = Logger.getRootLogger();
	
	private PersonDao personDao;
	
	@Override
	public boolean existingPerson(Person person) {
		
		try {
			if (personDao.getPersonByName(person) != null) {
				return true;
			}
		} 
		catch (Exception e) {
			log.error("TreeServicePostgres.existingPerson error", e);
		}
		
		return false;
	}

	@Override
	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyPerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

}
