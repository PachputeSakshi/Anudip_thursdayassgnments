/*  Define Product class with name, price,  and sort it price wise (use comparable interface) .
*/
package thursday_assignments;

import java.util.Scanner;

class Product implements Comparable<Product> 
{
    private String name;
    private double price;

    //constructor
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    @override
    public int compareTo(Product other) 
    {
        if (this.price < other.price)
            return -1;
        else if (this.price > other.price)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString()
    {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

public class Ass10q1_15feb 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        // array to store products
        Product[] products = new Product[n];

        // Input from user
        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.print("Enter name for product " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter price for product " + (i + 1) + ": ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        // Sort the products based on price
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (products[j].compareTo(products[j + 1]) > 0) 
                {
                    // Swap products
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }

        // Display sorted products
        System.out.println("Sorted Products:");
        for (Product product : products)
        {
            System.out.println(product);
        }

        sc.close();
    }
}
