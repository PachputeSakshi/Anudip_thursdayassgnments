/*Q3)Design a class named ShowRoom with the following description: Instance variables/data members:
String name: to store the name of the customer.
 long mobno: to store the mobile number of the customer.
double cost: to store the cost of the items purchased. double dis: to store the discount amount.
double amount: to store the amount to be paid after discount.
Member methods:
 ShowRoom(): default constructor to initialize data members.
void input(): to input customer name, mobile number, cost.
void calculate(): to calculate discount on the cost of purchased items, based on the following criteria:
COST                                                         DISCOUNT (IN PERCENTAGE) <=to Rs. 10000                                                5%
> Rs. 10000 <=Rs. 20000                             10%
> Rs. 20000 <= Rs. 35000                           15%
> Rs. 35000 20%
 void display(): to display customer name, mobile number, amount to be paid after discount.
 Write a main() method to create an object of the class and call the above member methods.
    */
package thursday_assignments;

import java.util.*;
public class ass3q3_21stdec 
{
    public static void main(String[] args)
     {
        ShowRoom obj=new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

class ShowRoom 
{
    String name;
    long mobno;
    double dis,cost,amount;

    //default constructor
    public ShowRoom()
    {
        name=" ";
        mobno=0;
        dis=cost=amount=0;
    }
    //class methods
        void input()
        {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter name of costumer:");
            name=sc.next();

            System.out.println("Enter mobile number of customer");
            mobno=sc.nextLong();

            System.out.println("Enter cost of item purchased:");
            cost=sc.nextDouble();

        }

        void calculate()
        {
            if(cost<=10000)
            {
                System.out.println("discount:5%");
                dis=cost*0.05;
            }
            else if(cost>10000 && cost<=20000)
            {
                System.out.println("discount:10%");
                dis=cost*0.10;
            }
            else if(cost>20000 && cost<=35000)
            {
                System.out.println("discount:15%");
                dis=cost*0.15;
            }
            else
            {
                System.out.println("discount:20%");
                dis=cost*0.20;
            }
            amount=cost-dis;
        }

        void display()
        {
            System.out.println("Costumer name: " +name);
            System.out.println("costumer mobile number: " +mobno);
            System.out.println("amount to be paid after discount: " +amount);
        }
}
