/*1.Create a parent class called "Vehicle" with attributes such as brand, 
 model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and 
 has an additional attribute called "color" and a method called "honk". Create an object of the Car class and
  call both the "drive" and "honk" methods.  */

package thursday_assignments;

class Vehicle
{
  String brand,model;
  int year;

  public Vehicle(String brand,String model,int year)
  {
    this.brand=brand;
    this.model=model;
    this.year=year;
  }

  void drive()
  {
    System.out.println("Car is in motion..");
  }
}

class car extends Vehicle
{
    String color;

    public car(String brand,String model,int year,String color)
    {
      super(brand, model, year);
      this.color=color;
    }

    void honk()
    {
      System.out.println("car is honking...");
    }
  
}

public class ass3q5_21stdec
{
  public static void main(String[] args)
  {
    car obj=new car("toyota","zyr",2000,"red");
    obj.drive();
    obj.honk();
  }
  
}




