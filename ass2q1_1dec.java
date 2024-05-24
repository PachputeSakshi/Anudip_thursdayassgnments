package thursday_assignments;
// A program describing food ordering system and displaying total bill amount at end.

import java.util.*;

public class ass2q1_1dec {
    public static void main(String[] args)
    {
        System.out.println("\t-------WELCOME to Pachpute_Sakshi's dining house-------");
        int choice,quantity;
        char ans;
        float totalbill=0;
        String bill=" ";
        Scanner sc=new Scanner(System.in);

        do
        {
        System.out.println("\n1]Vegitarians section\n2]Non-vegitarians section");
        System.out.println("\nWhich would you like to prefer sir/mam=");
        choice=sc.nextInt();

        switch (choice) {

            //vegitarians section
            case 1:
                System.out.println("**\t\tGo green ,Go veggie\t\t**");
                System.out.println("\nHere's the menu displayed\n");
                System.out.println("1]Starters\n2]main course\n3]Dessert\n4]Drinks\n\nchoice is yours..");
                int ch=sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Starters available :");
                        System.out.println("\t\t\tMenu\t\t\t\tPrice");
                        System.out.println("\t\t-Aloo cheese croquettes\t\t\tRs.150/-\n \t\t-tandoori paneer tikka\t\t\tRs.140/-\n \t\t-chilli potatoes\t\t\tRs.160/-\n \t\t-Steamed Wontons\t\t\tRs.180/-");
                        System.out.println("What would you like to order:");
                        int item=sc.nextInt();
                        System.out.println("\nEnter quantity:");
                        quantity=sc.nextInt();

                        if(item==1){
                            totalbill+=150*quantity;
                            bill+="\n-Aloo cheese croquettes\t\tRs.150/-\t\t" +quantity+" ";
                        }
                        else if(item==2){
                            totalbill+=140*quantity;
                            bill+="\n-tandoori paneer tikka\t\tRs.140/-\t\t" +quantity+" ";
                        }
                        else if(item==3){
                            totalbill+=160*quantity;
                            bill+="\n-chilli potatoes\t\tRs.160/-\t\t" +quantity+" ";
                        }
                        else {
                            totalbill+=180*quantity;
                            bill+="\n-Steamed Wontons\t\tRs.180/-\t\t" +quantity+" ";
                        }
                       
                    break;

                    case 2:
                        System.out.println("Main course available :");
                        System.out.println("\t\t\tMenu\t\t\tPrice");
                        System.out.println("\t\t-Paneer paratha\t\t\tRs.250/-\n \t\t-Baingan Bharta\t\t\tRs.240/-\n \t\t-kala chana kadhi \t\tRs.260/-\n \t\t-palak kofta reciepe\t\tRs.280/-");
                        System.out.println("What would you like to order:");
                        int item1=sc.nextInt();
                        System.out.println("\nEnter quantity");
                        quantity=sc.nextInt();

                        if(item1==1){
                            totalbill+=250*quantity;
                            bill+="\n-Paneer paratha\t\t\tRs.250/-\t\t" +quantity+" ";
                        }
                        else if(item1==2){
                            totalbill+=240*quantity;
                            bill+="\n-Baingan Bharta\t\tRs.240/-\t\t" +quantity+" ";
                        }
                        else if(item1==3){
                            totalbill+=260*quantity;
                            bill+="\n-kala chana kadhi \t\tRs.260/-\t\t" +quantity+" ";
                        }
                        else {
                            totalbill+=280*quantity;
                            bill+="\n-palak kofta reciepe\t\tRs.280/-\t\t" +quantity+" ";
                        }
                    break;

                    case 3:
                        System.out.println("Dessert available :");
                        System.out.println("\t\t\tMenu\t\t\tPrice");
                        System.out.println(" \t\t-Beetroot halwa\t\t\tRs.150/-\n \t\t-multigrain laddu\t\tRs.140/-\n \t\t-kalakand \t\t\tRs.160/-\n \t\t-bhapa doi\t\t\tRs. 180/-");
                        System.out.println("What would you like to order:");
                        int item2=sc.nextInt();
                        System.out.println("\nEnter quantity");
                         quantity=sc.nextInt();

                        if(item2==1){
                            totalbill+=150*quantity;
                            bill+="\n-Beetroot halwa\t\t\tRs.150/-\t\t" +quantity+" ";
                        }
                        else if(item2==2){
                            totalbill+=140*quantity;
                            bill+="\n-multigrain laddu\t\t\tRs.140/-\t\t" +quantity+" ";
                        }
                        else if(item2==3){
                            totalbill+=160*quantity;
                            bill+="\n-kalakand\t\t\tRs.160/-\t\t" +quantity+" ";
                        }
                        else {
                            totalbill+=180*quantity;
                            bill+="\n-bhapa doi\t\t\ttRs. 180/-\t\t" +quantity+" ";
                        }
                        break;

                    case 4:
                        System.out.println("Drinks available :");
                        System.out.println("\t\t\tMenu\t\t\tPrice");
                        System.out.println("\t\t-Blackberry-lime porch punch\tRs.150/-\n \t\t-Rosemary-and-ginger mule\tRs.140/-\n \t\t-Peach lemonade\t\t\tRs.160/-\n \t\t-Margarita mocktail\t\tRs.180/-");
                        System.out.println("\nWhat would you like to order:");
                        int item3=sc.nextInt();
                        System.out.println("\nEnter quantity");
                        quantity=sc.nextInt();
                        if(item3==1){
                            totalbill+=150*quantity;
                            bill+="\n-Blackberry-lime porch punch\tRs.150/-\t\t" +quantity+" ";
                        }
                        else if(item3==2){
                            totalbill+=140*quantity;
                            bill+="\n-Rosemary-and-ginger mule\tRs.140/-\t\t" +quantity+" ";
                        }
                        else if(item3==3){
                            totalbill+=160*quantity;
                            bill+="\n-Peach lemonade\t\t\tRs.160/-\t\t" +quantity+" ";
                        }
                        else {
                            totalbill+=180*quantity;
                            bill+="\n-Margarita mocktail\t\t\tRs.180/-\t\t" +quantity+" "; 
                        }
                        break;
                    default:
                        System.out.println("Out of service..sorry");
                        break;
                }
                break;

            //non-vegitarians section
            case 2:
                System.out.println("**\t\tI may not be a fan of vegetables, but I will eat anything wrapped in bacon.\t\t**");
                System.out.println("\nHere's the menu displayed\n");
                System.out.println("1]Starters\n2]main course\n3]Drinks\nchoice is yours..");
                int c=sc.nextInt();

                switch (c) {
                    case 1:
                        System.out.println("Starters available :");
                        System.out.println("\t\t\tMenu\t\t\tPrice");
                        System.out.println("\t\t-Chiken spring rolls\t\tRs.150/-\n \t\t-Fish and chicken pakora\tRs.140/-\n \t\t-chilli prawns\t\t\tRs.160/-\n \t\t-Chicken manchurian\t\tRs.180/-");
                        System.out.println("What would you like to order:");
                        int item=sc.nextInt();
                        System.out.println("\nEnter quantity");
                        quantity=sc.nextInt();

                        if(item==1){
                            totalbill+=150*quantity;
                            bill+="\n-Chiken spring rolls\t\tRs.150/-\t\t" +quantity+" "; 
                        }
                        else if(item==2){
                            totalbill+=140*quantity;
                            bill+="\n-Fish and chicken pakora\tRs.140/-\t\t" +quantity+" ";
                        }
                        else if(item==3){
                            totalbill+=160*quantity;
                            bill+="\n-chilli prawns\t\t\tRs.160/-\t\t" +quantity+" ";
                        }
                        else {
                            totalbill+=180*quantity;
                            bill+="\n-Chicken manchurian\t\tRs.180/-\t\t" +quantity+" ";
                        }
                        break;                  
                    case 2:
                        System.out.println("Main course available :");
                        System.out.println("\t\t\tMenu\t\t\tPrice");
                        System.out.println("\t\t-Mutton curry\t\t\tRs.250/-\n \t\t-Prawn curry\t\t\tRs.240/-\n \t\t-chicken shawarma\t\tRs.260/-\n \t\t-Chicken biryani reciepe\tRs.280/-");
                        System.out.println("What would you like to order:");
                        int item1=sc.nextInt();
                        System.out.println("Enter quantity= ");
                        quantity=sc.nextInt();
                        if(item1==1){
                            totalbill+=250*quantity;
                            bill+="\n-Mutton curry\t\t\tRs.250/-\t\t" +quantity+" ";
                        }
                        else if(item1==2){
                            totalbill+=240*quantity;
                            bill+="\n-Prawn curry\t\t\tRs.240/-\t\t" +quantity+" ";
                        }
                        else if(item1==3){
                            totalbill+=260*quantity;
                            bill+="\n-chicken shawarma\t\t\tRs.260/-\t\t" +quantity+" ";
                        }
                        else {
                            totalbill+=280*quantity;
                            bill+="\n-Chicken biryani reciepe\t\tRs.280/-\t\t" +quantity+" ";
                        }
                        break;
                    case 3:
                        System.out.println("Drinks available :");
                        System.out.println("\t\tMenu\t\tPrice");
                        System.out.println("\t\t-Beer\t\tRs.550/-\n \t\t-Rum\t\tRs.440/-\n \t\t-Gin\t\tRs.660/-\n \t\t-Sake\t\tRs.480/-");
                        System.out.println("What would you like to order:");
                        int item2=sc.nextInt();
                        System.out.println("Enter quantity= ");
                        quantity=sc.nextInt();
                        if(item2==1){
                            totalbill+=550*quantity;
                            bill+="\n-Beer\t\t\t\tRs.550/-\t\t" +quantity+" ";
                        }
                        else if(item2==2){
                            totalbill+=440*quantity;
                            bill+="\n-Rum\t\t\t\tRs.440/-\t\t" +quantity+" ";
                        }
                        else if(item2==3){
                            totalbill+=660*quantity;
                            bill+="\n-Gin\t\t\t\tRs.660/-\t\t" +quantity+" ";
                        }
                        else {
                            totalbill+=480*quantity;
                            bill+="\n-Sake\t\t\t\tRs.480/-\t\t" +quantity+" ";
                        }    
                        break;
                
                    default:
                        System.out.println("out of service sorry...");
                        break;
                }
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        
        }
        System.out.println("\nDo you want to order anything else..");
        ans=sc.next().charAt(0);
    }while(ans=='Y' || ans=='y');
    System.out.println("\tMenu\t\t\tPrice\t\tQuantity");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.println(""+bill);
    System.out.println("--------------------------------------------------------------------------------------");
     System.out.println("total bill is= "+totalbill+" ");
    System.out.println("--------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("\n\t\t**Thank you**\n \t\t*****visit again*****");
        
    sc.close();
    }
    
}
