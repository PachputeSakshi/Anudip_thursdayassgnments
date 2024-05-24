/*Q."Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,


VariableName   Data Type
empName        String
isIndian        boolean
empSal        double

This method should return a double taxAmount.
The business logic for calculating the tax  is as follows, this has to be implemented inside the method,
If the employee is not a Indian
The calculator should throw a CountryNotValidException
If the employee name is null or empty
The calculator should throw a EmployeeNameInvalidException
If  empSal is greater than one lakh and isIndian true
taxAmount =empSal *8/100
Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
taxAmount =empSal *6/100
Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
taxAmount =empSal *5/100
Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
taxAmount =empSal *4/100
Otherwise
The calculator should throw a TaxNotEligibleException.
Develop a main class CalculatorSimulator  , implement the following logic in main method
1.  Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>
2.  In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate
 exception print the stack trace and display the following messages,
a.  Country not valid:  “The employee should be an Indian citizen for calculating tax”
b.  Employee name not valid:  “The employee name cannot be empty”
c.  Not eligible for Tax calculation:“The employee does not need to pay tax”"*/




package thursday_assignments;

import java.util.*;


class TaxCalculator
{ 
	public double calculateTax(String empName, boolean isIndian, double empSal)
        throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{

    // Validate country
    if (!isIndian) 
    {
        throw new CountryNotValidException("Nationality must be indian to tax");
    }

    // Validate employee name
    if (empName == null || empName.isEmpty())
    {
        throw new EmployeeNameInvalidException("The employee name cannot be empty");
    }

    double taxAmount;

    // Calculate tax based on salary range
    if (empSal > 100000)
    {
        taxAmount = empSal * 8 / 100;
    } 
    else if (empSal >= 50000 && empSal <= 100000)
    {
        taxAmount = empSal * 6 / 100;
    } 
    else if (empSal >= 30000 && empSal < 50000) 
    {
        taxAmount = empSal * 5 / 100;
    }
    else if(empSal >= 10000 && empSal < 30000) 
    {
        taxAmount = empSal * 4 / 100;
    } 
    else
    {
        throw new TaxNotEligibleException("The employee does not need to pay tax");
    }

    return taxAmount;
}
}


public class Ass6q1_11thjan
{

	public static void main(String[] args) 
	{
		  TaxCalculator taxCalculator = new TaxCalculator();

		  Scanner sc= new Scanner(System.in);
		  
		  System.out.println("Enter emp name:");
		  String empName=sc.next();
		  
		  System.out.println("Is emp nationality indian:(True/false)");
		  boolean isIndian=sc.next() != null;
		  
		  System.out.println("Enter emp salary:");
		  double empSal=sc.nextDouble();
		  
		  try 
	        {
	            // Case 1: Tax calculation successful
	            double taxAmount1 = taxCalculator.calculateTax(empName,isIndian,empSal);
	            System.out.println("Tax amount is: " + taxAmount1);

	          
	        } 
			  catch (CountryNotValidException e)
			  {
		            System.out.println("Country not valid: " + e.getMessage());
		            e.printStackTrace();
		        }
			  catch (EmployeeNameInvalidException e) 
			  {
		            System.out.println("Employee name not valid: " + e.getMessage());
		            e.printStackTrace();
		        }
			  catch (TaxNotEligibleException e) 
			  {
		            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
		            e.printStackTrace();
		        }
	}

}
