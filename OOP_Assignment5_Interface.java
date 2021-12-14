package com.company;
        import java.util.Scanner;
interface Vehicle
{
    public void apply_break();
    public void change_gear();
    public void speed_up();
}
class Bicycle implements Vehicle
{
    int max_speed;
    float speed ;
    int gear ;
    Scanner sc=new Scanner(System.in);
    Bicycle()
    {
        max_speed=40;
        speed =0;// max speed
        gear=0;//4 gears
    }
    public void apply_break()
    {
        System.out.println("Now the speed of the Bicycle is :"+speed);
        System.out.println("Now the gear of the Bicycle is :"+gear);
        System.out.println("By how much do you want to decrease the speed : ");
        float decrement=sc.nextFloat();
        if(speed<decrement)
        {
            speed=0;
        }
        else
        {
            speed=speed-decrement;
        }
        if((speed>0)&&(speed<=10))
        {
            gear=1;
        }
        else if(speed==0)
        {
            gear=0;//the Bicycle is nutral
        }
        else if((speed>10)&&(speed<=20))
        {
            gear=2;
        }
        else if((speed>20)&&(speed<=30))
        {
            gear=3;
        }
        else//for speed greater than 30 and less than the max speed
        {
            gear=4;
        }
    }
    public void change_gear()
    {
        System.out.println("Now the speed of the Bicycle is :"+speed);
        System.out.println("Now the gear of the Bicycle is :"+gear);
        System.out.println("Do you want to increase the gear or decrease it:\n Enter 1 to increase \n Enter 0 to decrease \n");
        int temp=sc.nextInt();
        switch (temp)
        {
            case(1):
            {
                System.out.println("By How much do you want to increase the gear :");
                int increase=sc.nextInt();
                if((gear + increase)>4)
                {
                    gear=4;// the Bicycle will bo on the top gear
                }
                else
                {
                    gear+=increase;
                    speed+=(increase*10);
                }
                break;
            }
            case(2):
            {
                System.out.println("By How much do you want to decrease the gear :");
                int decrease=sc.nextInt();
                if((gear - decrease)<0)
                {
                    gear=0;// the Bicycle will bo on the lowest  gear
                }
                else
                {
                    gear-=decrease;
                    if(gear==0)
                    {
                        speed=0;
                    }
                    else
                    {
                        speed-=(decrease*10);
                    }
                }
                break;
            }
            default:
            {
                System.out.println("Enter the proper number!");
            }
        }
    }
    public void speed_up() {
        System.out.println("Now the speed of the Bicycle is :" + speed);
        System.out.println("Now the gear of the Bicycle is :" + gear);
        System.out.println("By How much do you want to increase the speed :");
        int increase = sc.nextInt();
        if ((speed + increase) > 40) {
            speed = 40;// the Bicycle will bo on the top gear
        } else {
            speed += increase;
        }

        if ((speed > 0) && (speed <= 10)) {
            gear = 1;
        } else if (speed == 0) {
            gear = 0;//the Bicycle is nutral
        } else if ((speed > 10) && (speed <= 20)) {
            gear = 2;
        } else if ((speed > 20) && (speed <= 30)) {
            gear = 3;
        } else//for speed greater than 30 and less than the max speed
        {
            gear = 4;
        }
    }

}
class Bike implements Vehicle {
    int max_speed;
    float speed;
    int gear;
    Scanner sc = new Scanner(System.in);

    Bike() {
        max_speed = 140;
        speed = 0;// max speed
        gear = 0;//4 gears
    }

    public void apply_break() {
        System.out.println("Now the speed of the Bike is :" + speed);
        System.out.println("Now the gear of the Bike is :" + gear);
        System.out.println("By how much do you want to decrease the speed : ");
        float decrement = sc.nextFloat();
        if (speed < decrement) {
            speed = 0;
        } else {
            speed = speed - decrement;
        }
        if ((speed > 0) && (speed <= 20)) {
            gear = 1;
        } else if (speed == 0) {
            gear = 0;//the Bicycle is nutral
        } else if ((speed > 20) && (speed <= 40)) {
            gear = 2;
        } else if ((speed > 40) && (speed <= 60)) {
            gear = 3;
        } else//for speed greater than 60 and less than the max speed
        {
            gear = 4;
        }
    }

    public void change_gear() {
        System.out.println("Now the speed of the Bike is :" + speed);
        System.out.println("Now the gear of the Bike is :" + gear);
        System.out.println("Do you want to increase the gear or decrease it:\n Enter 1 to increase \n Enter 0 to decrease \n");
        int temp = sc.nextInt();
        switch (temp) {
            case (1): {
                System.out.println("By How much do you want to increase the gear :");
                int increase = sc.nextInt();
                if ((gear + increase) > 4) {
                    gear = 4;// the Bike will bo on the top gear
                } else {
                    gear += increase;
                    speed += (increase * 10);
                }
                break;
            }
            case (2): {
                System.out.println("By How much do you want to decrease the gear :");
                int decrease = sc.nextInt();
                if ((gear - decrease) < 0) {
                    gear = 0;// the Bike will bo on the lowest  gear
                } else {
                    gear -= decrease;
                    if (gear == 0) {
                        speed = 0;
                    } else {
                        speed -= (decrease * 20);
                    }
                }
                break;
            }
            default: {
                System.out.println("Enter the proper number!");
            }
        }
    }

    public void speed_up() {
        System.out.println("Now the speed of the Bike is :" + speed);
        System.out.println("Now the gear of the Bike is :" + gear);
        System.out.println("By How much do you want to increase the speed :");
        int increase = sc.nextInt();
        if ((speed + increase) > 140) {
            speed = 140;// the Bike will bo on the top gear
        } else {
            speed += increase;
        }

        if ((speed > 0) && (speed <= 20)) {
            gear = 1;
        } else if (speed == 0) {
            gear = 0;//the Bicycle is nutral
        } else if ((speed > 20) && (speed <= 40)) {
            gear = 2;
        } else if ((speed > 40) && (speed <= 60)) {
            gear = 3;
        } else//for speed greater than 60 and less than the max speed
        {
            gear = 4;
        }
    }
}
class Car implements Vehicle
{
    int max_speed;
    float speed;
    int gear;
    Scanner sc = new Scanner(System.in);

    Car() {
        max_speed = 240;
        speed = 0;// max speed
        gear = 0;//4 gears
    }

    public void apply_break() {
        System.out.println("Now the speed of the Car is :" + speed);
        System.out.println("Now the gear of the Car  is :" + gear);
        System.out.println("By how much do you want to decrease the speed : ");
        float decrement = sc.nextFloat();
        if (speed < decrement) {
            speed = 0;
        } else {
            speed = speed - decrement;
        }
        if ((speed > 0) && (speed <= 40)) {
            gear = 1;
        } else if (speed == 0) {
            gear = 0;//the Bicycle is nutral
        } else if ((speed > 40) && (speed <= 80)) {
            gear = 2;
        } else if ((speed > 80) && (speed <= 120)) {
            gear = 3;
        } else//for speed greater than 120 and less than the max speed
        {
            gear = 4;
        }
    }

    public void change_gear() {
        System.out.println("Now the speed of the Car is :" + speed);
        System.out.println("Now the gear of the Car is :" + gear);
        System.out.println("Do you want to increase the gear or decrease it:\n Enter 1 to increase \n Enter 0 to decrease \n");
        int temp = sc.nextInt();
        switch (temp) {
            case (1): {
                System.out.println("By How much do you want to increase the gear :");
                int increase = sc.nextInt();
                if ((gear + increase) > 4) {
                    gear = 4;// the Car will bo on the top gear
                } else {
                    gear += increase;
                    speed += (increase * 40);
                }
                break;
            }
            case (2): {
                System.out.println("By How much do you want to decrease the gear :");
                int decrease = sc.nextInt();
                if ((gear - decrease) < 0) {
                    gear = 0;// the Car will bo on the lowest  gear
                } else {
                    gear -= decrease;
                    if (gear == 0) {
                        speed = 0;
                    } else {
                        speed -= (decrease * 40);
                    }
                }
                break;
            }
            default: {
                System.out.println("Enter the proper number!");
            }
        }
    }

    public void speed_up() {
        System.out.println("Now the speed of the Car is :" + speed);
        System.out.println("Now the gear of the Car is :" + gear);
        System.out.println("By How much do you want to increase the speed :");
        int increase = sc.nextInt();
        if ((speed + increase) > 240) {
            speed = 240;// the Car will bo on the top gear
        } else {
            speed += increase;
        }

        if ((speed > 0) && (speed <= 40)) {
            gear = 1;
        } else if (speed == 0) {
            gear = 0;//the Bicycle is nutral
        } else if ((speed > 40) && (speed <= 80)) {
            gear = 2;
        } else if ((speed > 80) && (speed <= 120)) {
            gear = 3;
        } else//for speed greater than 120 and less than the max speed
        {
            gear = 4;
        }
    }
}


public class OOP_Assignment5_Interface {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter 1->Car\nEnter 2->Bike\nEnter 3->Bicycle\nEnter 4 ->To Exit\n");
            int num=s.nextInt();
            switch (num)
            {
                case(1):
                {
                    Car c1=new Car();
                    while (true)
                    {
                        System.out.println("To acces the Car methode do as Followed : ");
                        System.out.println("Enter 1->Change gear\nEnter 2->speed up\nEnter 3->Apply Breake\nEnter 4 ->To Exit\n");
                        int c=s.nextInt();
                        if(c==1)
                        {
                            c1.change_gear();
                        }
                        else if(c==2)
                        {
                            c1.speed_up();
                        }
                        else if(c==3)
                        {
                            c1.apply_break();
                        }
                        else if(c==4)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Enter valid number!\n");
                        }

                    }
                    break ;
                }
                case(2):
                {
                    Bike b1=new Bike();
                    while (true)
                    {
                        System.out.println("To acces the Bike methode do as Followed : ");
                        System.out.println("Enter 1->Change gear\nEnter 2->speed up\nEnter 3->Apply Breake\nEnter 4 ->To Exit\n");
                        int c=s.nextInt();
                        if(c==1)
                        {
                            b1.change_gear();
                        }
                        else if(c==2)
                        {
                            b1.speed_up();
                        }
                        else if(c==3)
                        {
                            b1.apply_break();
                        }
                        else if(c==4)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Enter valid number!\n");
                        }

                    }
                    break ;
                }
                case(3):
                {
                    Bicycle b2=new Bicycle();
                    while (true)
                    {
                        System.out.println("To acces the Bicycle methode do as Followed : ");
                        System.out.println("Enter 1->Change gear\nEnter 2->speed up\nEnter 3->Apply Breake\nEnter 4 ->To Exit\n");
                        int c=s.nextInt();
                        if(c==1)
                        {
                            b2.change_gear();
                        }
                        else if(c==2)
                        {
                            b2.speed_up();
                        }
                        else if(c==3)
                        {
                            b2.apply_break();
                        }
                        else if(c==4)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Enter valid number!\n");
                        }

                    }
                    break ;
                } case(4): {
                System.out.println("Thanks for using my program!\n");
                System.exit(0);
                break;
            }
                default:
                {
                    System.out.println("Enter proper number !\n");
                }
            }
        }
    }
}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=62076:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.OOP_Assignment5_Interface
Enter 1->Car
Enter 2->Bike
Enter 3->Bicycle
Enter 4 ->To Exit

1
To acces the Car methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

1
Now the speed of the Car is :0.0
Now the gear of the Car is :0
Do you want to increase the gear or decrease it:
 Enter 1 to increase
 Enter 0 to decrease

1
By How much do you want to increase the gear :
2
To acces the Car methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

2
Now the speed of the Car is :80.0
Now the gear of the Car is :2
By How much do you want to increase the speed :
50
To acces the Car methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

3
Now the speed of the Car is :130.0
Now the gear of the Car  is :4
By how much do you want to decrease the speed :
120
To acces the Car methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

1
Now the speed of the Car is :10.0
Now the gear of the Car is :1
Do you want to increase the gear or decrease it:
 Enter 1 to increase
 Enter 0 to decrease

0
Enter the proper number!
To acces the Car methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit


4
Enter 1->Car
Enter 2->Bike
Enter 3->Bicycle
Enter 4 ->To Exit

2
To acces the Bike methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

1
Now the speed of the Bike is :0.0
Now the gear of the Bike is :0
Do you want to increase the gear or decrease it:
 Enter 1 to increase
 Enter 0 to decrease

1
By How much do you want to increase the gear :
2
To acces the Bike methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

2
Now the speed of the Bike is :20.0
Now the gear of the Bike is :2
By How much do you want to increase the speed :
12
To acces the Bike methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

3
Now the speed of the Bike is :32.0
Now the gear of the Bike is :2
By how much do you want to decrease the speed :
34
To acces the Bike methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

4
Enter 1->Car
Enter 2->Bike
Enter 3->Bicycle
Enter 4 ->To Exit

3
To acces the Bicycle methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

1
Now the speed of the Bicycle is :0.0
Now the gear of the Bicycle is :0
Do you want to increase the gear or decrease it:
 Enter 1 to increase
 Enter 0 to decrease

1
By How much do you want to increase the gear :
3
To acces the Bicycle methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

2
Now the speed of the Bicycle is :30.0
Now the gear of the Bicycle is :3
By How much do you want to increase the speed :
23
To acces the Bicycle methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

3
Now the speed of the Bicycle is :40.0
Now the gear of the Bicycle is :4
By how much do you want to decrease the speed :
234
To acces the Bicycle methode do as Followed :
Enter 1->Change gear
Enter 2->speed up
Enter 3->Apply Breake
Enter 4 ->To Exit

4
Enter 1->Car
Enter 2->Bike
Enter 3->Bicycle
Enter 4 ->To Exit

4
Thanks for using my program!


Process finished with exit code 0

 */