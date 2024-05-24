/*Write a program to create automobile service( Car Service Center ) 
 * by using inheritance , Encapsulation, Abstraction, Polymorphism*/


package thursday_assignments;

import java.util.*;

public class ass4q1_28thdec
{
        
    public static void main(String[] args)
    {
    	 Car_details regularCar = new Car_details("Toyota", "Camry", 2022);
         Electriccar electricCar = new Electriccar("Tesla", "Model 3", 2022, 75);

         performService(regularCar);
         performService(electricCar);
     }

     public static void performService(Car_services car) 
     {
         car.performService();
     }
     
    }

}

