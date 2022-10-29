package assignmentTwo;

import java.util.Scanner;

public class Student {
	
	int num;
	String name;
	String email;
	long phone;
	String address;
	String status;

	Student(String name, String email, long phone, String address, String status)
	{

	this.name=name;
	this.email=email;
	this.phone=phone;
	this.address=address;
	this.status=status;
	
	}
	public void display() {
		System.out.println("Name - "+this.name);
		System.out.println("Email - "+this.email);
		System.out.println("PHONE - "+this.phone);
		System.out.println("ADDRESS - "+this.address);
		System.out.println("status - "+this.status);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number of student: ");
		int num =s.nextInt();
		
		Student arr[]= new Student[num];
		
		for (int i=0;i<arr.length;i++)
		{	
					
			System.out.println("Please enter the name:");
			String name= s.next();
			
			System.out.println("Please enter the email:");
			String email= s.next();
			
			System.out.println("Please enter the phone number:");
			long phone=s.nextLong();
			
			System.out.println("Please enter the address:");
			String address= s.next();
			
			System.out.println("Please enter the status:");
			String status= s.next();
			

			Student tstudent=new Student(name,email,phone,address,status);
			
			arr[i]=tstudent;		
		}	
		
		System.out.println("Please enter which student detail are you looking for");
		int no = s.nextInt();
		arr[no].display();
		s.close();
	}

}
