package thursday_assignments;

import java.util.*;
public class Customer_details extends Car_details
{
	
		public Customer_details(String car_no, String model, int year) 
		{
			super(car_no, model, year);
		// TODO Auto-generated constructor stub
		}




		public String customer_name;
		public double customer_phn_no,customer_aadhar_no;
		Scanner sc=new Scanner(System.in);

		

	
public void details() 
	{
		System.out.println("Enter customer name: ");
		customer_name=sc.next();
		System.out.println("Enter customer phone number: ");
		 customer_phn_no=sc.nextDouble();
		System.out.println("Enter customer aadhar no.: ");
		 customer_aadhar_no=sc.nextDouble();
	}

}
