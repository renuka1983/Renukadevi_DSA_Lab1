package com.gl.usercreation;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		String FirstName, LastName;
		int DNo;
		
		
		System.out.println("Enter your first name: ");
		
		FirstName = name.nextLine();  // Read user input
		
		System.out.println("Enter your Second name: ");
		
		LastName = name.nextLine();  // Read user input
		
		System.out.println("Please Enter the Department from the following:\n1. Technical \n2. Admin \n3. Human Resource \n4. Legal ");
		DNo = name.nextInt();
		
		EmployeeInfo info = new EmployeeInfo();
		
		CredentialServices credential = new CredentialServices();
		
		info.EmployeeName(FirstName, LastName);
		
		
		String username = credential.generateEmailAddress(FirstName, LastName, DNo);
		String password = credential.generatePassword();
		credential.showCredentials(username, password);
		
	
	
		
		
	}

}
