package thursday_assignments;
class doctor
{
	private int id;
	private String name;
	private String speciality;
	
	public doctor(int id,String name,String speciality)
	{
		this.id=id;
		this.name=name;
		this.speciality=speciality;
	}
	
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getspeciality()
	{
		return speciality;
	}
	public void setspeciality(String speciality)
	{
		this.speciality=speciality;
	}
	
	@override
	public String toString() 
	{
		return "Doctor ( " + "id= " +id+ ", name= " +name+ '\'' +", speciality= " +speciality + '\'' + ')';
	}
}
