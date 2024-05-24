/*Create arraylist of doctor(id,name,specility) and generate addDoctor(),displayDoctors(),updateDoctor() methods.*/
package thursday_assignments;

import java.util.*;
import java.util.ArrayList;



public class Ass10q4_15feb 
{ 
	public static void main(String[] args) 
	{
		    Scanner sc = new Scanner(System.in);
		    ArrayList<doctor> doctors = new ArrayList<doctor>();
	
	    // Accepting doctor information from the user
	    System.out.println("Enter doctor information (id, name, specialty), type 's' to stop:");
	    
	    while (true) 
	    {
	        System.out.print("Enter doctor id: ");
	        int id;
	        String input = sc.nextLine();
	        if (input.equalsIgnoreCase("s"))
	        {
	            break;
	        }
	        try 
	        {
	            id = Integer.parseInt(input);
	        }
	        catch (NumberFormatException e) 
	        {
	            System.out.println("Invalid id. Please enter a valid integer.");
	            continue;
	        }
	
	        System.out.print("Enter doctor name: ");
	        String name = sc.nextLine();
	
	        System.out.print("Enter doctor specialty: ");
	        String specialty = sc.nextLine();
	
	        doctors.add(new doctor(id, name, specialty));
	    }
	    doctorinfo.displaydoctors();

        // Updating a doctor's specialty
        doctorinfo.updatedoctor(1, "Psychiatrist");
        doctorinfo.displaydoctors();

	    // Display list of doctors
	    System.out.println("\nList of Doctors:");
	    for (doctor doc : doctors)
	    {
	        System.out.println(doc);
	    }
	}
}
