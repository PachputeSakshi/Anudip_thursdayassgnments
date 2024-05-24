package thursday_assignments;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem 
{
    private Map<String, String> userDatabase;

    public LoginSystem() 
    {
        userDatabase = new HashMap< String, String>();
    }

    // Method to register a new user
    public void registerUser(String username, String password)
    {
        userDatabase.put(username,password);
        System.out.println("User registered successfully!");
    }

   
    public boolean loginUser(String username, String password) 
    {
        // Check if the username exists in the database
        if (userDatabase.containsKey(username)) 
        {
            // Check if the password matches the stored password for the given username
            return userDatabase.get(username).equals(password);
        }
        return false; // Username not found
    }

   public void check()
    {
    	char des;
    	String usernameInput; 
    	String passwordInput ;
        LoginSystem loginSystem = new LoginSystem();
        Scanner sc= new Scanner(System.in);
        
        do {
        System.out.println("Do you have already registered yourself (yes/no)/..");
		char ans= sc.next().charAt(0);

        if(ans=='y' || ans=='Y') 
		{
	        // Login process
	        System.out.println("Enter username: ");
	        usernameInput = sc.next();
	
	        System.out.println("Enter password: ");
	        passwordInput = sc.next();
		
	        // Validate user credentials
	        if (loginSystem.loginUser(usernameInput, passwordInput))
	        {
	            System.out.println("Login successful!");
	            
	            classroom cs=new classroom();
	            classroom.generateUniqueId();
	            cs.createid();
	   
	            CourseEnrollment ce=new CourseEnrollment();
	            ce.accept();
	        } 
	        else 
	        {
	            System.out.println("Invalid username or password. Login failed.");
	        }
		}
        
        else 
        {
        	System.out.println("First register yourself..");
        	System.out.println("Enter username for your account:");
        	String user_name=sc.next();
        	
        	System.out.println("Enter password for your account:");
        	String user_password=sc.next();
        	// Register a user
            loginSystem.registerUser(user_name,user_password);
        }
        
       System.out.println("please press y...");
       des= sc.next().charAt(0);
        }while(des=='y'||  des=='Y');
        // Close the scanner  
        sc.close();
    }
}
