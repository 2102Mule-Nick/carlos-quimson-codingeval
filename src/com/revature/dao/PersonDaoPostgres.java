package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.pojo.Person;
import com.revature.util.ConnectionFactory;

public class PersonDaoPostgres implements PersonDao {

	private Logger log = Logger.getRootLogger();
	
	Connection connection = null;
	
	@Override
	public Person getPersonByName(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getRelatives(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePerson(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		connection = ConnectionFactory.getConnection();
		log.info("Connection: " + connection);
		log.info("PersonDaoPostgres.add person called");
		
		String stmt = "INSERT INTO persons (identifier, first_name, last_name) VALUES (?, ?, ?);";
		
		PreparedStatement pstmt = null;
		
		try {
			System.out.println("Preparing statement");
			pstmt = connection.prepareStatement(stmt);
			pstmt.setString(1, person.getIdentifier());
			pstmt.setString(2, person.getFirstName());
			pstmt.setString(3, person.getLastName());
			System.out.println("Statement created");
			pstmt.executeUpdate();
			System.out.println("Person added");
		}
		catch (SQLException e) {
			log.error("PersonDaoPostres.addPerson Error", e);
		}
		
		
	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub

	}

}
