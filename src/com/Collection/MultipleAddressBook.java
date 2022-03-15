package com.Collection;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleAddressBook {
	Map<String,Services> addressBook = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	public void addAddress()
	{
		System.out.println("Enter the name of Address Book: ");
		
		String bookName = sc.next();
		
		if (addressBook.containsKey(bookName))
		{
			System.out.println("Book Already Exist");
		}
		else {
			Services service = new Services();
			addressBook.put(bookName, service);
		}
	}
	
	public void addingContacts() {
		System.out.println("Enter name of Address Book");
		String findBook = sc.next();
		Services scr = addressBook.get(findBook);
		if(scr == null)
		{
			System.out.println("Book Not Exist");
		}
		else {
			addressBook.get(findBook).addPerson();
		}
	}
	public void diplayBook() {
		for(String i:addressBook.keySet()) {
			System.out.println(i);
			System.out.println(addressBook.get(i).contacts);
		}
	}
}
