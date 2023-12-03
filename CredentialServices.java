package com.gl.usercreation;

import java.util.Random;

public class CredentialServices {
	
	public void CreateCredential(String fname, String lname, int dno) {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		int rand_int2 = rand.nextInt(1000);
		EmployeeInfo info = new EmployeeInfo();
		String dtname = info.DeptName(dno);
		String userName,passWord;
		String str = rand.ints(35, 123)
				 .filter(num -> (num>35 || num<=39)  && (num<91 || num>96))
				 .limit(5) 
				 .mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
				 .toString();

	 
		userName = fname.toLowerCase()+ lname.toLowerCase()+ "@"+dtname.toLowerCase()+".abc.com";
		
		passWord = rand_int1+str+rand_int2;
		
		System.out.println("Your email id is:" + userName);
		
		System.out.println("Your password is: "+ passWord);
		
		
		
		
	}
	
	
	

}
