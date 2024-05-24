//singleobject class allowing only one object creation

package thursday_assignments;

public class singleobject 
{
	private static singleobject instance=null;
	
	private singleobject() throws Exception
	{
		//check if instance already exists or not
		if(instance!=null)
		{
			throw new Exception("This class allows only one object to create" );
		}
	}


public static singleobject getinstance() throws Exception
{
	//intialization of instance
	if(instance==null) 
	{
		instance=new singleobject();
	}
	return instance;
}

}