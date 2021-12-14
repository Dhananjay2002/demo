package com.company;
import  java.util.Scanner ;
class Info
{
    String name ;
    String course ;
}
class PICT_Progr
{
    int cout = 0 ;
    Info []  participates= new Info [50] ;
    String [] programs = {"DSA","java","Python","C++","AI designing","Meshin Learning"} ;
    int [] fee = {100 ,200,300,400,500,600} ;
    int [] duration = {3,4,5,6,7,8} ;
    String [] profesers ={"prof1","prof2","prof3","prof4","prof5","prof6"};
    public  void Showpogram()
    {
        System.out.println("The followings are the  available programs :");
       for(int i=0 ; i<6 ; i++)
       {
           System.out.println((i+1) + " -> "+ programs[i]);
           System.out.println("By "+profesers[i]);
           System.out.println("Duration : "+duration[i]+" weeks");
           System.out.println("Fee : "+fee[i]+" Rupees \n \n");
       }
    }
    public void apply()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name :");
        participates[cout]=new Info(); // we first have to creat the object of the class array which we do not have tocreat in the c++******************************
        participates[cout].name = sc.nextLine();
        System.out.println(participates[cout].name);
        System.out.println("Press :");
        for(int i=0 ; i<6 ; i++) {
            System.out.println((i + 1) + " for -> " + programs[i]);
        }
        int temp = sc.nextInt();
        participates[cout].course= programs[temp-1];
        cout++ ;
    }
    public void display() {
        for (int i = 0; i < cout; i++) {
            System.out.println((i + 1) + ":");
            System.out.println("Name :" + participates[i].name);
            System.out.println("Selected Course :" + participates[i].course);
            System.out.println("");
        }
        System.out.println("\n");
    }

}
public class Practical2 {
    public static void main(String[] args) {
        PICT_Progr l = new PICT_Progr();
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1-> showing the programs \n 2-> To apply for the program \n 3-> To Display the participents \n  4-> To exit ");
            int p= s.nextInt();
            switch (p)
            {
                case(1):
                {
                    l.Showpogram();
                    break;
                }
                case(2):
                {
                    l.apply();
                    break;
                }
                case(3):
                {
                    l.display();
                    break;
                }
                case(4):
                {
                    System.exit(0);// vv imp use to exit the while loop of the switch casees************************
                    break ;
                }
                default:
                {
                    System.out.println("Enter valid number");
                }

            }
        }

    }
}
