	package com.subha;
import java.util.*;


class Email
{
	public String firstname;
	public String lastname;
	public String fullname = firstname + lastname;	
	public String department;
	public String password;
	public int mbcapacity;
	public String AltEmail;
	public String company = "cogent";
	public String email;

	
	public Email()
	{
		this.fullname = Name();
//		System.out.println("Name:" + this.fullname);
		this.password = Password();
		System.out.println("The password is: " + this.password);
		this.department = Department();
		
		email = fullname.toLowerCase() + "@"
				+ department + "." + company + ".com";
	}
	

	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setMbCapacity(int mbcapacity)
	{
		this.mbcapacity = mbcapacity;
	}
	
	public void setName(String fullname)
	{
		this.fullname = fullname;
	}
	
	public void setAltEmail(String AltEmail)
	{
		this.AltEmail = AltEmail;
	}
	
	public String getName()
	{
		return fullname;
	}
	
	public String getAltEmail()
	{
		return AltEmail;
	}
	
	public int getMbCapacity()
	{
		return mbcapacity;
	}
	
	private String Password()
	{
		Random r = new Random();
		String password = Long.toString (r.nextLong () & Long.MAX_VALUE, 36);
		return password;
	}
	public String Department()
	{
		System.out.print("Department Codes:\n1 --> Sales\n2 --> Development\n3 --> Accounting\n0 --> none\nEnter department code: ");
		   Scanner in = new Scanner(System.in);
		   int depChoice = in.nextInt();
		   if (depChoice == 1) {return "sales"; }
		   else if (depChoice == 2) {return "development"; }
		   else if (depChoice == 3) {return "accounting"; }
		   else { return ""; }
	}
	
	public String Name()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firstname: ");
		firstname = sc.next();
		System.out.println("Enter lastname: ");
		String lastname = sc.next();
		System.out.println();
		
		return firstname + "." + lastname;
	}
	
	public String Display()
	{
		return "The email generated is: " + email;
	}
	
}

public class EmailGen {

	public static void main(String[] args) {	
				
				
		Email em = new Email();
		System.out.println(em.Display());
		
		em.setMbCapacity(100);
		em.setAltEmail("laxmiannap@sales.cogent.com");
		em.setPassword("Als31995");
		System.out.println(em.getAltEmail());
		System.out.println("Mail box Capacity: " + em.getMbCapacity());
		

	}

}
