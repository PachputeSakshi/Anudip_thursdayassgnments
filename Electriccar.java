package thursday_assignments;

//using inheritance
import java.util.*;
public class Electriccar extends Car_details implements Car_services
{
	 private int batteryCapacity;

	    // Constructor
	    public Electriccar(String make, String model, int year, int batteryCapacity) 
	    {
	        super(make, model, year);
	        this.batteryCapacity = batteryCapacity;
	    }

	    // Getter and setter for batteryCapacity
	    public int getBatteryCapacity()
	    {
	        return batteryCapacity;
	    }

	    public void setBatteryCapacity(int batteryCapacity) 
	    {
	        this.batteryCapacity = batteryCapacity;
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
