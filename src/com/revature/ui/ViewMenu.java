package com.revature.ui;

import java.util.Scanner;

import com.revature.dao.PersonDao;
import com.revature.pojo.Person;

public class ViewMenu implements Menu {

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
		System.out.println("To view a Person, type the person's First and Last Name");
		System.out.println("Enter First Name: ");
		String firstName = scan.nextLine();
		
		System.out.println("Enter Last Name: ");
		String lastName = scan.nextLine();
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		
		personDao.getPersonByName(person);

	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void setFirstMenu(Menu firstMenu) {
		this.firstMenu = firstMenu;
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

}
