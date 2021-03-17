package com.revature.ui;

import java.util.Scanner;

import com.revature.dao.PersonDao;
import com.revature.pojo.Person;

public class AddMenu implements Menu {

	private Scanner scan;
	
	private Menu nextMenu;
	
	private Menu deleteMenu;
	
	private Menu viewMenu;
	
	private Menu updateMenu;
	
	private Menu firstMenu;
	
	private PersonDao personDao;
	
	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayOptions() {
		// TODO Auto-generated method stub
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		
		boolean valid = false;
		System.out.println("Enter a unique identifier:");
		String identifier = scan.nextLine();
		
		while (valid != true){
			System.out.println("Verify your unique identifier");
			String verification = scan.nextLine();
			if (!verification.equals(identifier)) {
				valid = false;
			}
			else {
				valid = true;
			}
		}
		
		System.out.println("Enter your father's first name");
		String dadFirstName = scan.nextLine();
				
		System.out.println("Enter your father's last name");
		String dadLastName = scan.nextLine();
				
		System.out.println("Enter your mother's first name");
		String momFirstName = scan.nextLine();
				
		System.out.println("Enter your mother's last name");
		String momLastName = scan.nextLine();
		
		Person dadPerson = new Person();
		dadPerson.setFirstName(dadFirstName);
		dadPerson.setLastName(dadLastName);
		
		Person momPerson = new Person();
		momPerson.setFirstName(momFirstName);
		momPerson.setLastName(momLastName);
		
		Person person = new Person(identifier, firstName, lastName, dadPerson, momPerson);
		personDao.addPerson(person);
		
		nextMenu = firstMenu;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
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

	public void setFirstMenu(Menu firstMenu) {
		this.firstMenu = firstMenu;
	}
	
	

}
