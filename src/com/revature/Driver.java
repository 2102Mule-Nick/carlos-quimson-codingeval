package com.revature;

import java.util.Scanner;

import com.revature.dao.PersonDao;
import com.revature.dao.PersonDaoPostgres;
import com.revature.ui.AddMenu;
import com.revature.ui.FirstMenu;
import com.revature.ui.Menu;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PersonDao personDao = new PersonDaoPostgres();
		
		Menu firstMenu = new FirstMenu();
		firstMenu.setScanner(scan);
		
		Menu addMenu = new AddMenu();
		addMenu.setScanner(scan);
		((AddMenu) addMenu).setPersonDao(personDao);
		((AddMenu) addMenu).setFirstMenu(firstMenu);
		
		((FirstMenu) firstMenu).setAddMenu(addMenu);
		
		Menu nextMenu = firstMenu;
		
		do {
			nextMenu.displayOptions();
			nextMenu = nextMenu.advance();
		} while (nextMenu != null);
	}
	
}
