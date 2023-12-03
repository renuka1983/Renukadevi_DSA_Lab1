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
			int rand_int1 = rand.nextInt(1000);
			int rand_int2 = rand.nextInt(1000);
			String str = rand.ints(35, 123)
					 .filter(num -> (num>35 || num<=39)  && (num<91 || num>96))
					 .limit(5) 
					 .mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
					 .toString();
			
			String passWord = rand_int1+str+rand_int2;
			
			return passWord;
		
		}
		
		public void showCredentials (String userName, String passWord) {
		
		System.out.println("Your email id is:" + userName);
		
		System.out.println("Your password is: "+ passWord);
		
		
		}
		
	}
	

