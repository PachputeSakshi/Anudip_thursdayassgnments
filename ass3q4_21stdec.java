/*Create an interface called "BankAccount" with methods called "deposit" and "withdraw". 
Create a class called "CheckingAccount" that implements the BankAccount interface and implements
 the "deposit" and "withdraw" methods. Create an object of the CheckingAccount class and call both the 
 "deposit" and "withdraw" methods.
 
 
 */

package thursday_assignments;

import java.util.*;
interface BankAccount {

void deposit(double amount);
void withdraw(double withdrawlamt);

}

class CheckingAccount implements BankAccount{
    private double balance;
    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposited: "+amount);
    }

    @Override
    public void withdraw(double withdrawlamt) {
       if(balance >=withdrawlamt){
        balance -=withdrawlamt;
        System.out.println("Withdrawn:" +withdrawlamt);
       }
       else{
        System.out.println("insufficient amount");
       }  
}
 void displaybalance(){
        System.out.println("Current balance:"+balance);
       }
}

public class ass3q4_21stdec {
    public static void main(String[] args) {
        CheckingAccount obj=new CheckingAccount();

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter amount:");
        double amount=sc.nextDouble();
        obj.deposit(amount);

        System.err.println("Enter amount you want to withdraw:");
        double withdrawlamt=sc.nextDouble();
        obj.withdraw(withdrawlamt);

        obj.displaybalance();
    }
}
