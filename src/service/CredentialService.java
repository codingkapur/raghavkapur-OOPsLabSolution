package service;

import java.util.Random;

public class CredentialService {
	
	//Company Name:
	final String company = "LabSesh";
	
	//Random Class Object for generating random numbers. 
	Random random = new Random();
	
	//Generate Email Address
	public String generateEmail(String firstName, String lastName, String department) {
		String email = firstName.toLowerCase() + lastName.toLowerCase() +"@"+department+"."+company.toLowerCase()+".com";
		return email;
	}
	
	//Generate Password
	public String generatePassword() {
		//Generate Password:
		//Sample characters for the password:
		String password="";
		
		String alphabet[] = {"a", "b", "c","d", "e", "f","g", "h", "i","j", "k", "l","m", "n", "o","p", "q", "r","s", "t", "u","v", "w", "x","y", "z"};
		
		String chars[] = {"!", "@","#","$","%","&", "*"};
		
		//ADD THREE RANDOM LOWERCASE ALPHABETS
		for(int i =0;i<3;i++) {
			int ranNum = random.nextInt(26);
			password += alphabet[ranNum];
		}
		//ADD 1 RANDOM CHARACTER
		for(int i =0;i<1;i++) {
			int ranNum = random.nextInt(6);
			password += chars[ranNum];
		}
		//ADD 2 RANDOM NUMBERS 
		for(int i =0;i<2;i++) {
			int ranNum = random.nextInt(10);
			password += ranNum;
		}
		//ADD 2 RANDOM UPPERCASE ALPHABETS
		for(int i =0;i<2;i++) {
			int ranNum = random.nextInt(26);
			password += alphabet[ranNum].toUpperCase();
		}
		//ENCRYPTION PATTERN: 
		int encrypt[] = {7,3,5,0,6,2,1,4};
		
		String p = "";
		for(int i =0;i<encrypt.length;i++) {
			p += password.charAt(encrypt[i]);
		}
		password = p;
		return password;
	}
	//Display Credentials:
	public void showCredentials(String firstName,String email, String password) {
		System.out.println("Dear "+ firstName +", your generated credentials are as follows: ");
		System.out.println("Email --> "+ email);
		System.out.println("Password --> "+ password);
	}
	
}
