/*"Taj Hotel" given the 5- list of Room types, cost per day Room types cost per day 
 * luxury 2500 a/c 2000 non a/c 1500 deluxe

do the hotel reservation process.
*/

package thursday_assignments;

import java.util.Scanner;

public class Ass8q1_25jan 
{

	public static void main(String[] args)
	{
		        Hotel hotel = new Hotel();
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Welcome to Taj Hotel Reservation System");

		        System.out.println("Enter your name:");
		        String c_name=sc.nextLine();
		        System.out.println("Enter your age:");
		        int c_age=sc.nextInt();
		        System.out.println("Enter your gender:");
		        String c_gender=sc.nextLine();
		        
		        // Display available room types and their costs
		        Room[] rooms = hotel.getRooms();
		        for (int i = 0; i < rooms.length; i++)
		        {
		            System.out.println((i + 1) + ". " + rooms[i].getType() + " - $" + rooms[i].getCostPerDay() + " per day");
		        }

		        // Prompt user to choose a room type
		        System.out.print("Enter the room type number you want to reserve: ");
		        int choice = sc.nextInt();

		        // Validate user input
		        if (choice < 1 || choice > rooms.length) 
		        {
		            System.out.println("Invalid choice. Please choose a number between 1 and " + rooms.length);
		            return;
		        }

		        // Calculate total cost for the reservation
		        int selectedRoomIndex = choice - 1;
		        Room selectedRoom = rooms[selectedRoomIndex];
		        System.out.print("Enter number of days you want to stay: ");
		        int numberOfDays = sc.nextInt();
		        int totalCost = selectedRoom.getCostPerDay() * numberOfDays;

		        // Display reservation details
		        System.out.println("Costumer name: " +c_name);
		        System.out.println("Costumer age: " +c_age);
		        System.out.println("Costumer gender: " +c_gender);
		        System.out.println("You have selected " + selectedRoom.getType() + " room.");
		        System.out.println("Total cost for " + numberOfDays + " days: $" + totalCost);

		        sc.close();
	}
}


