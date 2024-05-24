package thursday_assignments;
//Subclass representing Manali hill station
class Manali extends HillStations 
{
	 // Override the location method 
	 @Override
	 void location() 
	 {
	     System.out.println("Location: Manali, Himachal Pradesh, India.");
	 }
	
	 // Override the famousFor method 
	 void famousFor()
	 {
	     System.out.println("Famous for its snow-capped mountains, adventure sports, and picturesque landscapes.");
	 }
}