/*Q3)Creating one superclass Hill stations and three subclasses Manali, Mussoorie, Gulmarg.
 *  Subclasses extend the superclass and override its location() and famousfor() method. 
 *  We will call the location() and famousfor() method by the Parent class’, i.e. Hillstations class. 
 *  As it refers to the base class object and the base class method overrides the superclass method;
 *   the base class method is invoked at runtime. 

*/
package thursday_assignments;


public class Ass8q3_25jan
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 // Create objects 
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        // Call the methods 
        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
	}

}
