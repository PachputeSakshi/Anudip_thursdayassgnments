/*3)Write a program to accept choice from the user and perform the operation
	1.Find out greater between 3 NO
	2.Check given no is even or odd
	3.Checkk the given character is vowel or not
	4.check the given no is divible by 5 or not*/


import java.util.*;

public class assq3_16thnov {
    public static void main(String[] args) 
    {
        System.out.println("1]Find out greater between 3 NO\n2]Check given no is even or odd\n3]Checkk the given character is vowel or not\n4]check the given no is divible by 5 or not\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice=");
        int choice= sc.nextInt();

    switch (choice) {
        case 1:
            System.out.println("To find greatest between 3 numbers");
            System.out.println("Enter first number=");
            int num1=sc.nextInt();
            System.out.println("Enter second number=");
            int num2=sc.nextInt();
            System.out.println("Enter third number=");
            int num3=sc.nextInt();

            //to find greatest
            if (num1 >= num2 && num1 >= num3) 
            {
                System.out.println("The greatest number is: " + num1);
            } 
            else if (num2 >= num1 && num2 >= num3) 
            {
                System.out.println("The greatest number is: " + num2);
            }
            else
            {
                System.out.println("The greatest number is: " + num3);
            }
    
            break;

        case 2:
            System.out.println("To check given no. is even or odd");
            System.out.println("Enter number=");
            int num=sc.nextInt();
            if (num%2==0)
            {
                System.out.println("Given no.+num+ " +num+ "  is even");      
            }
            else
            {
                System.out.println("Given no."  +num+ " is odd");
            }
            break;

        case 3:
            System.out.println("To check given character is vowel or not");
            System.out.println("enter character=");
            char ch=sc.next().charAt(0);

            if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
            {
                System.out.println("Given character" +ch+ " is vowel");
            }
            else
            {
                System.out.println("Given character is not a vowel");
            }
            break;
        case 4:
            System.out.println("To check divisibility by 5");
            System.out.println("Enter number=");
            int number=sc.nextInt();

            if (number%5==0)
            {
                System.out.println(+number+ " is divisible by 5");
            }
            else
            {
                System.out.println(+number+ " is not dvisible by 5");
            }
            break;

            default:
                System.out.println("Enter valid choice");
            break;
    }
    sc.close();
    }
}
