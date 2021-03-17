package com.revature.ui;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class FirstMenu implements Menu {

	private Logger log = Logger.getRootLogger();
	
	private Scanner scan;
	
	private Menu nextMenu;
	
	private Menu addMenu;
	
	private Menu deleteMenu;
	
	private Menu viewMenu;
	
	private Menu updateMenu;
	
	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return nextMenu;
	}

	@Override
	public void displayOptions() {
		System.out.println("Welcome to Family Tree App");
		System.out.println("What would you like to do?" );
		System.out.println("Type: add, view, delete, update");
		
		String input = scan.nextLine();
		
		if ("add".equalsIgnoreCase(input)) {
			log.info("First Menu Add choses");
			nextMenu = addMenu;
		}
		else if ("delete".equalsIgnoreCase(input)) {
			nextMenu = deleteMenu;
		} 
		else if ("view".equalsIgnoreCase(input)) {
			nextMenu = viewMenu;
		}
		else if ("update".equalsIgnoreCase(input)) {
			nextMenu = updateMenu;
		}
		else {
			System.out.println("Invalid Choice. Try again");
			nextMenu = this;
		}

	}

	public void setAddMenu(Menu addMenu) {
		this.addMenu = addMenu;
	}

	public void setDeleteMenu(Menu deleteMenu) {
		this.deleteMenu = deleteMenu;
	}

	public void setViewMenu(Menu viewMenu) {
		this.viewMenu = viewMenu;
	}

	public void setUpdateMenu(Menu updateMenu) {
		this.updateMenu = updateMenu;
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

	public FirstMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
