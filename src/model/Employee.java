package model;
import service.CredentialService;

public class Employee {
	//Employee details:
	String firstName;
	String lastName;
	String email;
	String password;
	String department;
	
	public Employee(String firstName, String lastName, String department){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		//Access 
		CredentialService CS = new CredentialService();
		//Generate Email Address
		this.email = CS.generateEmail(firstName, lastName, department);
		//Generate Password
		this.password = CS.generatePassword();
		//Show Credentials
		CS.showCredentials(firstName, email, password);
		
	}
}
