package com.revature.ui;

import java.util.Scanner;

import com.revature.dao.PersonDao;
import com.revature.pojo.Person;

public class DeleteMenu implements Menu {

	private Scanner scan;
	
	private PersonDao personDao;
	
	private Menu firstMenu;
	
	private Menu nextMenu;
	
	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return nextMenu;
	}

	@Override
	public void displayOptions() {
		// TODO Auto-generated method stub
		System.out.println("To delete, enter your first and last name");
		System.out.println("First Name: ");
		String firstName = scan.nextLine();
		
		System.out.println("Last Name: ");
		String lastName = scan.nextLine();
		
		System.out.println("Enter your unique identifier");
		String identifier = scan.nextLine();
		
		Person person = new Person();
		person.setIdentifier(identifier);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		
		personDao.removePerson(person);
		
		nextMenu = firstMenu;
	}

	@Override
	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScanner(Scanner scan) {
		// TODO Auto-generated method stub
		this.scan = scan;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void setFirstMenu(Menu firstMenu) {
		// TODO Auto-generated method stub
		this.firstMenu = firstMenu;
	}

}
