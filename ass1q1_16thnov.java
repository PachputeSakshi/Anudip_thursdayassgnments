/*1)Write a program to accept choice from the user and display the output
	1.Arithmetic operator
	2.Logical Operator
	3.Relational Operator
	4.Bitwise Operator
	5.Conditional Operator
	6.Assignment Operator*/


import java.util.*;

public class ass1q1_16thnov{
	public static void main(String[] args) 
	{
		System.out.println("1.Arithmetic operator\n 2]Logical Operator\n3]Relational Operator\n4]Bitwise Operator\n5]Conditional Operator\n6]Assignment Operator");

		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter your choice=");
		int choice=sc.nextInt();

	switch (choice) 
	{
		case 1:
			System.out.println("***ARITHEMATIC OPERATORS***");	
			System.out.println();
			System.out.println("enter first number=");
			int num1=sc.nextInt();
			System.out.println("enter second number=");
			int num2=sc.nextInt();

			// 1] Addition operator( + )
			System.out.println("Addition operator( + )");
			int addition =num1 + num2;
			System.out.println("\tAddition of " +num1+ " and " +num2+ " is = " +addition);
			System.out.println();

			// 2] subtraction operator( - )
			System.out.println("Subtraction operator( - )");
			int subtraction =num1 - num2;
			System.out.println("\tSubtraction of " +num1+ " and " +num2+ " is = " +subtraction);
			System.out.println();

			// 3] Multiplication operator( * )
			System.out.println("multiplication operator( * )");
			int multiplication =num1 * num2;
			System.out.println("\tMultiplication of " +num1+ " and " +num2+ " is = " +multiplication);
			System.out.println();

			// 4] Division operator( / )
			System.out.println("Division operator( / )");
			int Division =num1 / num2;
			System.out.println("\tDivision of " +num1+ " and " +num2+ " is = " +Division);
			System.out.println();
		break;

		case 2:
			System.out.println("***LOGICAL OPERATOR***");

			boolean first;
			boolean second;

			System.out.println("enter first  boolean condition=");
			first=sc.nextBoolean();
			System.out.println("enter second boolean condition=");
			second=sc.nextBoolean();

			System.out.println("1]logical AND(&&):");
			boolean AND_result=(first&&second);
			System.out.println("result is=" +AND_result);

			System.out.println("1]logical OR(||):");
			boolean OR_result=(first||second);
			System.out.println("result is=" +OR_result);

			System.out.println("1]logical NOT(!)):");
			boolean NOT_first= !first;
			System.out.println("result is=" +NOT_first);
			boolean NOT_second= !second;
			System.out.println("result is=" +NOT_second);
		break;

		case 3:
			System.out.println("****RELATIONAL OPERATORS****");

			System.out.println("enter first number=");
			int no_1=sc.nextInt();
			System.out.println("enter second number=");
			int no_2=sc.nextInt();

			System.out.println("1]Equal to (==):");
			boolean eqto_result= (no_1==no_2);
			System.out.println("result is=" +eqto_result);

			System.out.println("2]Not equal to (!=):");
			boolean noteqto_result=(no_1 != no_2 );
			System.out.println("result is=" +noteqto_result);

			System.out.println("3]Greater than (>):");
			boolean greaterthan_result=(no_1 > no_2 );
			System.out.println("result is=" +greaterthan_result);

			System.out.println("4]Less than (<):");
			boolean lessthan_result=(no_1 < no_2 );
			System.out.println("result is=" +lessthan_result);

			System.out.println("5]Greater than or equals to (>=):");
			boolean greatereqto_result=(no_1 >= no_2 );
			System.out.println("result is=" +greatereqto_result);

			System.out.println("5]Greater than or equals to (<=):");
			boolean lesseqto_result=(no_1 <= no_2 );
			System.out.println("result is=" +lesseqto_result);
		break;

		case 4:
			System.out.println("***BITWISE OPERATORS***");

			System.out.println("enter first no.=");
			int n1=sc.nextInt();
			System.out.println("enter second no.=");
			int n2=sc.nextInt();
			
			System.out.println("Bitwise AND(&):");
			int bitAND_RESULT=n1 & n2;
			System.out.println("result is=" +bitAND_RESULT);

			System.out.println("Bitwise OR(|):");
			int bitOR_RESULT=n1 | n2;
			System.out.println("result is=" +bitOR_RESULT);

			System.out.println("Bitwise XOR(^):");
			int bitXOR_RESULT=n1 ^ n2;
			System.out.println("result is=" +bitXOR_RESULT);

			System.out.println("Bitwise NOT(~):");
			int bitNOT_RESULT=n1 & n2;
			System.out.println("result is=" +bitNOT_RESULT);

			System.out.println("Left Shift (<<):");
			int leftshift_RESULT=n1 << 2;
			System.out.println("result is=" +leftshift_RESULT);

			System.out.println("Right Shift (>>):");
			int rightshift_RESULT=n1 >> 2;
			System.out.println("result is=" +rightshift_RESULT);
		break;

		case 5:
		    System.out.println("****CONDITIONAL OPERATORS****");
			//ALSO CALLED TERNARY OPERATORS

			System.out.println("enter a=");
			int a=sc.nextInt();
			System.out.println("enter b=");
			int b=sc.nextInt();
			
			int max=(a > b) ? a : b;

			System.out.println("result is=" +max);

		break;

		case 6:
			System.out.println("***Assignment operators*** ");
			System.out.println();
			System.out.println("enter value");
			int num=sc.nextInt();
			// 1] Simple Assignment Operator( = ) 
			
			System.out.println("1]Simple Assignment Operator( = ): ");
			num=10;
			System.out.println("\tAssigns the value " +num+ " to num");
			System.out.println();

			// 2] Add and Assign Operator( += )
			
			System.out.println("2]Add and Assign Operator( += ):");
			num += 5;
			System.out.println("\tAdd and assigns the value " +num );
			System.out.println();

			// 3] Subtract and Assign Operator( -= )
			
			System.out.println("3]Subtract and Assign Operator( -= ):");
			num -=2;
			System.out.println("\tSubtracts and assigns the value " +num );
			System.out.println();

			// 4] Multiply and Assign Operator( *= )
			
			System.out.println("4]Multiply and Assign Operator( *= ):");
			num *=5;
			System.out.println("\tMultiplies and assigns the value " +num);
			System.out.println();

			//5] Divide and Assign Operator( /= )

			System.out.println("5]Divide and Assign Operator( /= ):");
			num /=2;
			System.out.println("\tDivides and assigns the value " +num);
			System.out.println();

			//6] Modulus and Assign Operator( %= )
			
			System.out.println("6]Modulus and Assign Operator( %= ):");
			num %=2;
			System.out.println("\tassigns remainder to variable " +num);
			System.out.println();
			break;
			
		default:
			System.out.println("please enter valid choice");
			break;
	}
	sc.close();
	}
    
}
