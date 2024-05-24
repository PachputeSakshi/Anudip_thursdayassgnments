package thursday_assignments;

import java.util.ArrayList;

class doctorinfo
{
	private static ArrayList<doctor> doctors =new ArrayList<doctor>();
	public void addDoctor(int id,String name,String speciality)
	{
		doctor doc=new doctor(id,name,speciality);
		doctors.add(doc);
	}
	public static void displaydoctors()
	{
		System.out.println("list of doctors:");
		for(doctor doc:doctors)
		{
			System.out.println(doc);
		}
	}
	
	public static void updatedoctor(int id,String speciality)
	{
		for(doctor doc:doctors)
		{
			if(doc.getid()==id)
			{
				doc.setspeciality(speciality);
				System.out.println("Doctor with ID " +id+ "updated successfully..");
				return;
			}
		}
		System.out.println("Doctor with ID " +id+ "not found.");
	}
}