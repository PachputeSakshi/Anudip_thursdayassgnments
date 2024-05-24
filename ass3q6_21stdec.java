/*Q5)Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
 Create a child class called "Student" that inherits from Person and has an additional attribute
  called "grade" and a method called "study". Create an object of the Student class and call both the "speak" 
  and "study" methods. */


package thursday_assignments;

//import java.util.*;
public class ass3q6_21stdec 
{
    public static void main(String[] args) 
    {
        student obj=new student("samarth",21,8);
        obj.speak();
        obj.study();
    } 
}

class Person
{
    String name;
    int age;
    
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

   public void speak()
    {
        System.out.println("hello my name is "+name+ " and my age is " +age);
    }
}  

class student extends Person
{
    int grade;
    public student(String name, int age,int grade)
    {
        super(name, age);
        this.grade=grade;
    }

    public void study()
    {
        System.out.println(name+ " secured " +grade);
    }
}