package thursday_assignments;

public class Room
{
	 private String type;
	    private int costPerDay;

	    public Room(String type, int costPerDay)
	    {
	        this.type = type;
	        this.costPerDay = costPerDay;
	    }

	    public String getType()
	    {
	        return type;
	    }

	    public int getCostPerDay() 
	    {
	        return costPerDay;
	    }
	    
}
