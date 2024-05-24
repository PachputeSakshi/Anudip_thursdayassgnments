/*  Create a arraylist of students name and remove name of students who start with ‘S’ using lambda expression.*/

package thursday_assignments;

import java.util.*;
import java.util.ArrayList;
public class Ass10q3_15feb
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		//create arraylist to store names
		ArrayList<String> studentnames=new ArrayList<String>();

		//take input from user
		System.out.println("Enter names of students(Type 'y' to finish):");
		String input;
		
		while(true)
		{
			input=sc.nextLine().trim();
			if(input.equalsIgnoreCase("y"))
			{
				break;
			}
			studentnames.add(input);
		}
		
		//remove names starting with 's'using lambda expression
		studentnames.removeIf(names ->names.toLowerCase().startsWith("s"));
	
		//display updated list
		System.out.println("Student names after removing names starting with 's':");
	
		for(String names:studentnames)
		{
			System.out.println(names);
		}
	}
}
