package thursday_assignments;
//Subclass representing Gulmarg hill station
class Gulmarg extends HillStations
{
	 // Override the location method 
	 @Override
	 void location() 
	 {
	     System.out.println("Location: Gulmarg, Jammu and Kashmir, India.");
	 }
	
	 // Override the famousFor method 
	 @Override
	 void famousFor() 
	 {
	     System.out.println("Famous for its ski resorts, snow-capped peaks, and stunning landscapes.");
	 }
}