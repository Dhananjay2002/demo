package com.company;
//PROBLEM STATEMENT :
/* Implement a factory design pattern for the given context . Consider Car building process ,
 *  which requires many steps from allocating accessories to final makeup. These steps should
 *  be written as methods and should be called while creating an instance of specific  car type.
 *  Hatchback, Sedan, SUV , could be the subclasses Car class. Car class and Car class its subclasses
 *   , CarFactory and Test Factory Pattern should be implemented
 */
import java.util.Scanner;
abstract class Car_Factory{
    String compnay,carname;
    double budget;
    abstract void getprice(double price);
    abstract void detail(String company_name,String carname);
    abstract void accessories();

    void input() {
        Scanner scan =new Scanner (System.in);
        System.out.print("Company- ");
        compnay=scan.next();
        System.out.print("Car- ");
        carname=scan.next();
        System.out.print("Rough Budget(in Lakhs)- ");
        budget=scan.nextDouble();
    }
    void display(Car_Factory obj1) {
        obj1.getprice(budget);
        obj1.detail(compnay, carname);
        obj1.accessories();
    }

}
class Small_car extends Car_Factory{
    String Ans;
    public void getprice(double price) {
        if(price>2&&price<5)
            Ans="No";
        else
            Ans="Yes";

    }
    public void detail(String company_name,String carname) {
        System.out.println("Company- "+company_name);
        System.out.println("Name of Car- "+carname);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Petrol");
        System.out.println("Gears- Manual");
    }
    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- "+Ans);
        System.out.println("Back Wiper- "+Ans);
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- "+Ans);
    }
}
class Sedan extends Car_Factory{
    String Ans;
    public void getprice(double price) {
        if(price>6&&price<10)
            Ans="No";
        else
            Ans="Yes";
    }
    public void detail(String company_name,String carname) {
        System.out.println("Company- "+company_name);
        System.out.println("Name of Car- "+carname);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Petrol/Diesel");
        System.out.println("Gears- Auto/Manual");
    }
    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- YES");
        System.out.println("Back Wiper- YES");
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- YES");
        System.out.println("Roof Window- "+Ans);
    }
}
class Luxary extends Car_Factory{
    String Ans;
    public void getprice(double price) {
        if(price>10&&price<14)
            Ans="No";
        else
            Ans="Yes";
    }
    public void detail(String company_name,String carname) {
        System.out.println("Company- "+company_name);
        System.out.println("Name of Car- "+carname);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Diesel");
        System.out.println("Gears- Auto");
    }
    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- YES");
        System.out.println("Back Wiper- YES");
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- YES");
        System.out.println("Roof Window- YES");
        System.out.println("Automotive Garbage Cans- "+Ans);
        System.out.println("Automotice Air Freshner- "+Ans);
        System.out.println("Button Start- "+Ans);
    }
}
public class OOP_Assignment_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch;
        Car_Factory obj;
        while(true){
            System.out.println("Which Car you want to See?- ");
            System.out.println("Enter\n1->Small Car\n2->Sedan Car\n3->Luxary Car\n4->Exit\n->");
            ch=scan.nextInt();
            System.out.println();
            switch(ch) {

                case 1:
                    obj= new Small_car();
                    obj.input();
                    obj.display(obj);
                    break;

                case 2:
                    obj= new Sedan();
                    obj.input();
                    obj.display(obj);
                    break;

                case 3:
                    obj= new Luxary();
                    obj.input();
                    obj.display(obj);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("INVALID CHOICE !!");
            }
        }
    }
}
/*

"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=50170:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.OOP_Assignment_10
Which Car you want to See?-
Enter
1->Small Car
2->Sedan Car
3->Luxary Car
4->Exit
->
1

Company- pago
Car- auto
Rough Budget(in Lakhs)- 3
Company- pago
Name of Car- auto
Color- Black/White/Orange/Red
Fuel- Petrol
Gears- Manual
Types of Tyres- Alloy Wheels
Airbags- No
Back Wiper- No
Side Mirror- Two
Touch Screen Music Player- No
Which Car you want to See?-
Enter
1->Small Car
2->Sedan Car
3->Luxary Car
4->Exit
->
2

Company- mahindra
Car- bolero
Rough Budget(in Lakhs)- 8
Company- mahindra
Name of Car- bolero
Color- Black/White/Orange/Red
Fuel- Petrol/Diesel
Gears- Auto/Manual
Types of Tyres- Alloy Wheels
Airbags- YES
Back Wiper- YES
Side Mirror- Two
Touch Screen Music Player- YES
Roof Window- No
Which Car you want to See?-
Enter
1->Small Car
2->Sedan Car
3->Luxary Car
4->Exit
->
3

Company- audi
Car- 23
Rough Budget(in Lakhs)- 12
Company- audi
Name of Car- 23
Color- Black/White/Orange/Red
Fuel- Diesel
Gears- Auto
Types of Tyres- Alloy Wheels
Airbags- YES
Back Wiper- YES
Side Mirror- Two
Touch Screen Music Player- YES
Roof Window- YES
Automotive Garbage Cans- No
Automotice Air Freshner- No
Button Start- No
Which Car you want to See?-
Enter
1->Small Car
2->Sedan Car
3->Luxary Car
4->Exit
->
6

INVALID CHOICE !!
Which Car you want to See?-
Enter
1->Small Car
2->Sedan Car
3->Luxary Car
4->Exit
->
4


Process finished with exit code 0

 */