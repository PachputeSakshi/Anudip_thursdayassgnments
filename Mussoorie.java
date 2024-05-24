package thursday_assignments;

//Subclass representing Mussoorie hill station
class Mussoorie extends HillStations
{
	 // Override the location method 
	 @Override
	 void location() 
	 {
	     System.out.println("Location: Mussoorie, Uttarakhand, India.");
	 }
	
	 // Override the famousFor method 
	 @Override
	 void famousFor() 
	 {
	     System.out.println("Famous for its colonial charm, lush green hills, and breathtaking views of the Himalayas.");
	 }
}