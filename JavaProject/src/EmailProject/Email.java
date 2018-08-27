package EmailProject;

import java.util.Scanner;

public class Email {
	private String FirstName;
	private String LastName;
	private String password;
	private String department;
	private int mailboxcapacity;
	private String alternatemail;
	private int defaultpasswordlength=10;
	private String email;
	private String companySuffix = "Company.com";
	
	public Email(String FirstName,String LastName){
		this.FirstName = FirstName;
		this.LastName = LastName;
		System.out.println("Email Created:"+this.FirstName+" "+this.LastName);
		
		this.department=setDepartment();
		System.out.println("Depatment:"+this.department);
		
		this.password=randomPassword(defaultpasswordlength);
		System.out.println("your password is:"+this.password);
		
		email= FirstName.toLowerCase()+"." +LastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("your email Id:"+email);
		
	}
	//Acess Department Deails
	private String setDepartment(){
		System.out.println("enter the department\n1 for sales\n2 for developement\n3 for Accounting\n0 for none");
		Scanner in =new Scanner(System.in);
		int deptChoice=in.nextInt();
		if(deptChoice==1){ return "sales";}
		else if(deptChoice==2){ return "development"; }
		else if(deptChoice==3){ return "Accounting"; }
		else{return " ";}
	}
	
	//Generate password
	private String randomPassword(int length){
		String passwordSet="ABCDERFG!@#$1223432";
		char[] password = new char[length];
		for(int i=0;i<length;i++){
		int rand=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
}
