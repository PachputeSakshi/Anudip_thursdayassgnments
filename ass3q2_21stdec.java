/*Q2)WAP to create a mini calculator ask the user what operation the user wants to perform,
 and repeat the task till the user wants to perform any operation.
*/

package thursday_assignments;

import java.util.*;
public class ass3q2_21stdec 
{
    //method definitions
    static double add(double num1,double num2)
    {
        return num1+num2;
    }
    static double sub(double num1,double num2)
    {
        return num1-num2;
    }
    static double mul(double num1,double num2)
    {
        return num1*num2;
    }
    static double div(double num1,double num2)
    {
        if(num2!=0)
        {
            return num1/num2;
        }
        else
        {
            System.out.println("Error:Cannot divide by zero");
            return Double.NaN;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        char ans;
        do{
            //input section
            int choice;
            System.out.println("1]Addition\n2]Subtraction\n3]Division\n4]Multiplication\n5]Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();

            if(choice==5)
            {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.println("Enter first no.");
            double num1=sc.nextDouble();
            System.out.println("Enter second no.");
            double num2=sc.nextDouble();
            double result=0;

            switch(choice)
            {
                case 1:
                    result=add(num1,num2);
                    break;
                case 2:
                    result=sub(num1,num2);
                    break;
                case 3:
                    result=mul(num1,num2);
                    break;
                case 4:
                    result=div(num1,num2);
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
            System.out.println("Result=" +result);

            System.out.println("Do you want to perform more:");
            ans=sc.next().charAt(0);

        }while(ans=='Y' || ans=='y');
    }
}
