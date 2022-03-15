package com.Collection;

import java.util.Scanner;

import com.Collection.*;

public class AddressBook {
	/*
	 * Procedure:-
	 * ===========
	 */
	public static void main(String[] args) {
		System.out.println("----------Phone Book-----------");
		Scanner sc = new Scanner(System.in);
		Services add = new Services();				//created objects
		MultipleAddressBook mult = new MultipleAddressBook();
		while (true) {					
			System.out.println("Enter to avail services: ");
			System.out.println("1: To add contact \n 2: To edit existing contact \n 3: To delete contact \n 4: To display contact list \n 5: To Exit");
			System.out.println(" 6: To Add AddressBook \n 7: To add Contacts in AddressBook");
			int choices = sc.nextInt();

			switch (choices) {
			case 1:
				add.numberOfTimes();
				break;
			case 2:
				add.edit();
				break;
			case 3:
				add.delete();
				break;
			case 4:
				add.display();
				break;
			case 5:
				sc.close();
				return;
			case 6:
				mult.addAddress();
				break;
			case 7:
				mult.addingContacts();
				break;
			case 8:
				mult.diplayBook();
				break;
			}
		}

	}

}
