/*Write a program to do the process by using inheritance. create a class which will having
 the process of prime number  series, check the given no is palindrome number.
  Create another class which will check the given no is armstrong number or not .
and also will display teh following pattern generate below pattern.
1      
121
12321
1234321
Multilevel Inheritance*/

package thursday_assignments;

import java.util.*;

class check
{
  //Method to check no. is prime or not
  boolean isprime(int num)
  {
      if(num<=1)
      {
        return false;
      }
      for(int i=2;i<=num/2;i++)
      {
        if(num%i==0)
        {
          return false;
        }
      }
      return true;
  }
  //Method to check no. is palindrome or not
  boolean ispalindrome(int num)
  {
    int original=num;
    int temp =0;
      while(num!=0)
      {
        int digit=num%10;
        temp=temp*10+digit;
        num=num/10;
      }
      return original==temp;
  }
  //Method to generate prime no. series
  void primeseries(int limit)
  {
    System.out.println("--Prime number series--");
    for(int i=2;i<=limit;i++)
    {
      if(isprime(i))
      {
        System.out.print(i+" ");
      }
    }
  }
  }

  //Class to check no. is armstrong or not
  class armstrongpattern extends check{

    //Method to check is armstrong no
  boolean isarmstrong(int num){
      int original=num;
      int length=0;
      while(original !=0){
        original/=10;
        length++;
      }
      int sum=0;
      original=num;
      while(original !=0){
        int totaldigit=original%10;
        sum+=Math.pow(totaldigit,length);
        original/=10;
      }
    return original==sum;
    }

  //Method to display pattern
  void displaypattern(int rows)
  {
    System.out.println("\n--Pattern--");
    for(int i=1;i<=rows;i++) {
      for(int j=1;j<=i;j++) {
        System.out.print(j);
      }
        
        for (int l=i-1;l>=1;l--) {
          System.out.print(l);
      }
    System.out.println();
    }
  }
}

public class ass3q1_21stdec 
{
    public static void main(String[] args)
    {
      int number,limit,rows;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number:");
      number=sc.nextInt();
      System.out.println("Enter limit for prime series:");
      limit=sc.nextInt();
      System.out.println("Enter no.of rows for pattern:");
      rows=sc.nextInt();

//check if no. is palindrome
    armstrongpattern obj=new armstrongpattern();
    if(obj.ispalindrome(number))
    {
      System.out.println(+number+ " is palindrome Number.");
    }
    else
    {
      System.out.println(+number+ " is not palindrome Number.");
    }
//check if no. is armstrong
    if(obj.isarmstrong(number))
    {
      System.out.println(+number+ " is armstrong Number.");
    }
    else
    {
      System.out.println(+number+ " is not armstrong Number.");
    }
//print prime series
    obj.primeseries(limit);

//display pattern
    obj.displaypattern(rows);
  }
}
