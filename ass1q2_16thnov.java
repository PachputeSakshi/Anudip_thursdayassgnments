/*2)Write a program to accept age and gender from the user and check the ROI according to condition

above 60
M: 7%
F: 7.5%

below 60
M,F: 5%

eg( age : 20 G: M  ROI=7%)

 */

import java.util.*;

public class ass1q2_16thnov {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter age of person=");
        int age=sc.nextInt();
        System.out.println("Choose a gender option:");
        System.out.println("1. Male");
        System.out.println("2. Female");
        
        int gender =sc.nextInt();

    if(age>60)
    {
        if(gender==1)
        {
            System.out.println("Rate of Interest= 7%");
        }
        else 
        {
            System.out.println("Rate of Interest= 7.5%");
        }
    }
    else
    {
        System.out.println("Rate of interest =5%");
    }
    }
}
