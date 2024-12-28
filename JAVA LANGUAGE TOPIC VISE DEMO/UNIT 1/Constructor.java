//write a java program to declare 2 variables roll no and name as insatnce variable.
//create a method name display details that displays rollno and name of 5 students.
//create another method to fetch the details of rollno and name of 5 diff students.
//(Hint : Create 5 diff obj of same class)
import java.util.*;
class student
{
    int rollno;
    String name;
    student()
    {
        rollno=2222;
        name="PQR";
    }
    student(int r,String n1)
    {
        rollno=r;
        name=n1;
    }
    void fetchDetails(int rollnum, String name1)
    {
        rollno=rollnum;
        name=name1;
    }
    void displayDetails()
    {
        System.out.println("Roll Number = "+rollno);
        System.out.println("Name = "+name);
    }
}
class Constructor
{
    public static void main(String[] args) 
    {
        student s1 = new student();
        student s2 = new student(1234,"Aryan");
        student s3 = new student();
        student s4 = new student(2345,"Soni");
        student s5 = new student();

        s1.fetchDetails(21,"Aryan");
        s3.fetchDetails(21,"Aryan");
        s5.fetchDetails(21,"Aryan");

        System.out.println("Displaying Details...");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
        s5.displayDetails();
    }
}