package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
abstract class Shape
{
    float dim1 ;
    float dim2 ;
    public float getDim1() {
        return dim1;
    }

    public void setDim1(float dim1) {
        this.dim1 = dim1;
    }

    public float getDim2() {
        return dim2;
    }

    public void setDim2(float dim2) {
        this.dim2 = dim2;
    }
    abstract public  void comput_area();
}
class Triangle extends Shape
{
    @Override
    public void comput_area()
    {
        System.out.println("Area of the triangle is : "+(dim1*dim2*0.5));
    }
    public void set_hight(float hight)
    {
        super.setDim1(hight);
    }
    public void set_base(float base)
    {
        super.setDim2(base);
    }

}
class Rectangle extends Shape
{
    @Override
    public void comput_area()
    {
        System.out.println("Area of the Rectangle is : "+(dim1*dim2));
    }
    public void set_length(float length)
    {
        super.setDim1(length);
    }
    public void set_breadth(float breadth)
    {
        super.setDim2(breadth);
    }
}
public class OOP_Assignment4_DinamicBinding
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while(true)
            {
                System.out.println("Enter 1->to set hight and base of triangle and get its area\nEnter 2->set length and bredth of rectangle and get its area\nEnter->3 to Exit");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case(1):
                    {
                        Triangle t1 = new Triangle();
                        System.out.println("Enter the hight of the triangle :");
                        float hight = sc.nextFloat();
                        t1.set_hight(hight);
                        System.out.println("Enter the base of the triangle :");
                        float base = sc.nextFloat();
                        t1.set_base(base);
                        System.out.println("the hight of the triangle is : "+t1.getDim1()+"\n");
                        System.out.println("the base of the triangle is : "+t1.getDim2()+"\n");
                        t1.comput_area();
                        System.out.println("1" +
                                "");
                        break;
                    }
                    case(2):
                    {
                        Rectangle r1 = new Rectangle();
                        System.out.println("Enter the length of the Rectangle :");
                        float length = sc.nextFloat();
                        r1.set_length(length);
                        System.out.println("Enter the base of the Rectangle :");
                        float breadth = sc.nextFloat();
                        r1.set_breadth(breadth);
                        System.out.println("the length of the Rectangle is : "+r1.getDim1()+"\n");
                        System.out.println("the breadth of the Rectangle is : "+r1.getDim2()+"\n");
                        r1.comput_area();
                        System.out.println("");
                        break ;
                    }
                    case(3):
                    {
                        System.out.println("Thanks !");
                        System.exit(0);
                        break ;
                    }
                    default:
                    {
                        System.out.println("Enter valid number !");
                    }
                }

            }
        }

}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=58816:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.OOP_Assignment4_DinamicBinding
Enter 1->to set hight and base of triangle and get its area
Enter 2->set length and bredth of rectangle and get its area
Enter->3 to Exit
1
Enter the hight of the triangle :
5
Enter the base of the triangle :
4
the hight of the triangle is : 5.0

the base of the triangle is : 4.0

Area of the triangle is : 10.0
1
Enter 1->to set hight and base of triangle and get its area
Enter 2->set length and bredth of rectangle and get its area
Enter->3 to Exit
2
Enter the length of the Rectangle :
10
Enter the base of the Rectangle :
20
the length of the Rectangle is : 10.0

the breadth of the Rectangle is : 20.0

Area of the Rectangle is : 200.0

Enter 1->to set hight and base of triangle and get its area
Enter 2->set length and bredth of rectangle and get its area
Enter->3 to Exit
3
Thanks !

Process finished with exit code 0
 */