/*Write a program to create automobile service( Car Service Center ) 
 * by using inheritance , Encapsulation, Abstraction, Polymorphism*/

//


package thursday_assignments;

import java.util.*;

//using encapsulation
public class Car_details implements Car_services
{
	
	    private String car_no;
	    private String model;
	    private int year;
	    
	    public void display() 
	    {
	        System.out.println("car number:" +car_no+ "\t\tcar model:" +model+ "\t\tcar purchasing year:"+year+"");
	    }
	    public void accept()
	    {
	    	Scanner sc = new Scanner(System.in);

	        System.out.print("Enter car number: ");
	        String car_no  = sc.nextLine();

	        System.out.print("Enter model: ");
	        String model = sc.nextLine(); 
	        
	        System.out.print("Enter car purchasing year: ");
	        int year = sc.nextInt(); 

	        
	        Car_details obj = new Car_details(car_no,model,year);

	        
	        obj.display();
	    }

	    // Constructor
	    public Car_details(String car_no, String model, int year) 
	    {
	        this.car_no = car_no;
	        this.model = model;
	        this.year = year;
	    }

	    // Getter methods
	    public String getcar_no() 
	    {
	        return car_no;
	    }

	    public String getModel() 
	    {
	        return model;
	    }

	    public int getYear() 
	    {
	        return year;
	    }

	    // Setter methods
	    public void setcar_no(String car_no) 
	    {
	        this.car_no = car_no;
	    }

	    public void setModel(String model)
	    {
	        this.model = model;
	    }

	    public void setYear(int year)
	    {
	        this.year = year;
	    }

	    @override
		public void performService() 
		{

	    	String bill=" ";
			System.out.println("Services can be provided:");
			Scanner sc=new Scanner(System.in);
			System.out.println("\n1]Engine make\t\tRs.5000/-\n2]Wheel make\t\tRs.3500/-\n3]car cleaning\t\tRs.2700/-");
			System.out.println("Enter service you would prefer:");
			int choice=sc.nextInt();
			
			switch(choice) 
			{
				case 1:
					System.out.println("Engine make");
					bill+="Engine make\t\tRs.5000/-";
				break;
				
				case 2:
					System.out.println("Wheel make");
					bill+="Wheel make\\t\\tRs.3500/-";
				break;
				
				case 3:
					System.out.println("car cleaning");
					bill+="car cleaning\\t\\tRs.2700/-";
				break;
			}
			
		}


}
