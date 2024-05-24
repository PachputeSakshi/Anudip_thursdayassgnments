package thursday_assignments;

public class Hotel
{
	private Room[] rooms;

    public Hotel() 
    {
	 rooms = new Room[5]; // Assuming there are 5 types of rooms
     rooms[0] = new Room("Luxury", 2500);
     rooms[1] = new Room("A/C", 2000);
     rooms[2] = new Room("Non A/C", 1500);
     rooms[3] = new Room("Deluxe", 1800);
     rooms[4] = new Room("Economy", 1200);
 }

 public Room[] getRooms() 
 {
     return rooms;
 }
}
