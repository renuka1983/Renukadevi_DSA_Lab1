package com.gl.usercreation;


public class EmployeeInfo {
	public void EmployeeName(String FName, String LName)
	{
		System.out.println("Your name is: "+ FName+" "+LName);

	}
	public String DName;
	public String DeptName(int a)
	
	{
		
		switch (a) {
		  case 1:
		    DName= "Technical";
		    System.out.println("Your Department is: "+DName);	 
		    return ("tech");
		    //break;;
		  case 2:
			DName="Admin";
			System.out.println("Your Department is: "+DName);	
			return ("admin");
			//break;
			
		  case 3:
			  DName="Human Resource";
			  System.out.println("Your Department is: "+DName);	
			 // break;
			  return ("hr");
		   
		  case 4:
			 DName="Legal";
			  System.out.println("Your Department is: "+DName);	
			  //break;
			  return ("legal");
		  default:
			  DName="user";
			  System.out.println("Your Department is: "+DName);	
			  //break;
			  return (DName);
		 
			  
		}
		
		
		

		
		
	}
	

}
