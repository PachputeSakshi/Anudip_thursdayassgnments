/*Write a Java program which creates only one object.
If user attempts to create second object, he should not be able to create it. 
(Using user defined Exception).*/

package thursday_assignments;

public class Ass5q4_4thjan 
{

	public static void main(String[] args) throws Exception 
	{
		try 
		{
			//create first object
			singleobject firstinstance=singleobject.getinstance();
			System.out.println("First instance is created succefully...");
		
			//attempt to create second object
			singleobject secondinstance=singleobject.getinstance();
		}
		catch(Singleobj e){
			System.out.println("error: " +e.getMessage() );
		}

	}

}
