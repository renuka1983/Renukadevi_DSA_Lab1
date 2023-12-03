package com.gl.usercreation;

import java.util.Random;

public class CredentialServices {
	
	public String generateEmailAddress(String fname, String lname, int dno) {
		
		EmployeeInfo info = new EmployeeInfo();
		String dtname = info.DeptName(dno);
		
		String userName = fname.toLowerCase()+"."+ lname.toLowerCase()+ "@"+dtname.toLowerCase()+".abc.com";
		 return userName;
	}
		
		public String generatePassword() {
		
			Random rand = new Random();
			
			String str = rand.ints(35, 123)
					 .filter(num -> (num>35 || num<=39)  && (num<91 || num>96))
					 .limit(8) 
					 .mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
					 .toString();
			
			String passWord = str;
			
			return passWord;
		
		}
		
		public void showCredentials (String userName, String passWord) {
		
		System.out.println("Your email id is:" + userName);
		
		System.out.println("Your password is: "+ passWord);
		
		
		}
		
	}
	

