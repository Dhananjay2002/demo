package com.company;
import java.util.Scanner;
import java.util.ArrayList;

class Liberary1
{
    ArrayList<Book1>s1= new ArrayList<>(); // shell for different type of book
    ArrayList<user1>users=new ArrayList<>(); // to store the user info
    Scanner sc= new Scanner(System.in);
    Scanner sc1= new Scanner(System.in);
    Liberary1()
    {
        Add_book();
    }
    void Add_book()
    {
        System.out.println("Enter the no of books you want to insert in your liberary :");
        int num =sc1.nextInt();
        for(int i =0 ;i<num;i++)
        {
            Book1 b1= new Book1();
            System.out.println("Enter the Title "+(i+1)+" book :");
            b1.title= sc.nextLine();
            System.out.println("Enter the author of "+(i+1)+" book :");
            b1.author= sc.nextLine();
            System.out.println("Enter the type of "+(i+1)+" book :");
            b1.type= sc.nextLine();
            System.out.println("Enter the number of copies of "+(i+1)+" book :");
            b1.copies=sc1.nextInt();
            System.out.println("Enter the ID of "+(i+1)+" book :");
            b1.ID=sc.nextLine();
            System.out.println("Enter the price of "+(i+1)+" book :");
            b1.price= sc1.nextFloat();
            s1.add(b1);
        }
    }
    void new_user()
    {
        user1 temp = new user1();
        System.out.println("Enter your name :");
        temp.name =sc.nextLine();
        System.out.println("Enter your ID :");
        temp.S_ID= sc.nextLine() ;
        System.out.println("Enter a New Password :");
        temp.password = sc.nextLine();
        System.out.println("Enter Your class :");
        temp.Class= sc.nextLine();
        System.out.println("Enter your Division :");
        temp.division= sc.nextLine();
        users.add(temp);
    }
    int  verify()
    {
        System.out.println("Enter your S_ID :");
        String temp = sc.nextLine();
        System.out.println("Enter your password :");
        String pass= sc.nextLine();
        user1 tt = null;
        boolean t = true ;
        int index ;
        for(user1 i:users)
        {
            if(i.S_ID.equalsIgnoreCase(temp))
            {
                tt=i ;
                t=false;
                break ;
            }
        }
        if(t)
        {
            System.out.println("verification fail !");
            System.out.println("S_ID does not found !");
            return 100;
        }
        else
        {
            if(tt.password.equals(pass))
            {
                System.out.println("verification compleat !");
                return users.indexOf(tt) ;
            }
            else
            {
                System.out.println("verification fail !");
                System.out.println("Wrong password !");
                return 100;
            }
        }

    }


}
class Book1
{
    String title ;
    String ID ;
    String author;
    String type ;
    int copies ;
    float price;
    Book1()
    {
        copies= 0 ;
        price=0f ;
    }
}
class user1
{
    String name ;
    String S_ID ;
    String password ;
    String Class;
    String division;
    ArrayList<Book1>a1= new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    void getBook(Book1 b1)
    {
        a1.add(b1);
    }
    Book1 return_book()
    {
        if(a1.isEmpty())
        {
            System.out.println("You have no book to return !");
            return null ;
        }
        else
        {
            int count=0;
            for(Book1 b :a1)
            {
                System.out.println("Enter "+count +" to return : ");
                System.out.println(b.title);
                count++;
            }
            int bcount= sc.nextInt();
            return a1.remove(count) ;
        }
    }

}

public class OOP_Case_Study {
    public static void main(String[] args) {
    Liberary1 l = new Liberary1();
    Scanner sc =new Scanner(System.in);// for string
    Scanner sc1 =new Scanner(System.in);// for integers
    while(true)
    {
        int Case ;
        System.out.println("Enter\n1->If you are new to  liberary(to resister)\n2->All ready resistered\n3->Exit");
        Case = sc1.nextInt();
        switch (Case)
        {
            case(1):
            {
                l.new_user();
                break ;
            }
            case(2):
            {
                int c; // c will be the index of the  user in the users array
                c=l.verify();
                if(c!=100)
                {
                    while(true) {
                        System.out.println("Welcome !");
                        System.out.println("Enter\n1->get book\n2->return the book\n3->Exit");
                        int k=sc1.nextInt();
                        if(k==1)
                        {
                            int count=0;
                            for(Book1 i : l.s1)
                            {
                                System.out.println("Enter "+(count)+" for :");
                                System.out.println(i.title);
                                count++;
                            }
                            int w= sc1.nextInt();
                            Book1 b = l.s1.get(w);
                            l.s1.remove(w);
                            b.copies=b.copies-1;
                            l.s1.add(b);
                            user1 temp = new user1();
                            temp=l.users.get(c);
                            temp.getBook(b);
                            l.users.remove(c);
                            l.users.add(temp);
                        }
                        else if(k==2)
                        {
                            user1 temp = new user1();
                            temp=l.users.get(c);
                            Book1 b1= new Book1();
                            b1 =temp.return_book();
                            for(Book1 i :l.s1 )
                            {
                                if(i.ID.equals(b1.ID))
                                {
                                    i.copies= i.copies +1 ;
                                    break;
                                }
                            }
                        }
                        else if(k==3)
                        {
                            break ;
                        }
                        else
                        {
                            System.out.println("Enter proper number !");
                        }
                    }
                }
                break ;
            }
            case(3):
            {
                System.exit(0);
                System.out.println("Have A Nice Day!!!!!");
                break ;
            }
            default :
            {
                System.out.println("Enter proper number !");
            }
        }
    }

    }
}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=58531:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.OOP_Case_Study
Enter the no of books you want to insert in your liberary :
4
Enter the Title 1 book :
Chhava
Enter the author of 1 book :
Shivaji Savant
Enter the type of 1 book :
Historic
Enter the number of copies of 1 book :
5
Enter the ID of 1 book :
A1
Enter the price of 1 book :
444
Enter the Title 2 book :
Every Last Fear
Enter the author of 2 book :
Karin Slaguntite
Enter the type of 2 book :
Friction
Enter the number of copies of 2 book :
5
Enter the ID of 2 book :
A2
Enter the price of 2 book :
234
Enter the Title 3 book :
The Story Of My Life
Enter the author of 3 book :
Hellen Keler
Enter the type of 3 book :
Autobiography
Enter the number of copies of 3 book :
5
Enter the ID of 3 book :
A3
Enter the price of 3 book :
2345
Enter the Title 4 book :
Long Walk To Freedom
Enter the author of 4 book :
Nelson Mandela
Enter the type of 4 book :
Autobiography
Enter the number of copies of 4 book :
4
Enter the ID of 4 book :
A4
Enter the price of 4 book :
234
Enter
1->If you are new to  liberary(to resister)
2->All ready resistered
3->Exit
1
Enter your name :
Abhay Salunke
Enter your ID :
I2K
Enter a New Password :
Abhay@321
Enter Your class :
SE11
Enter your Division :
F11
Enter
1->If you are new to  liberary(to resister)
2->All ready resistered
3->Exit
2
Enter your S_ID :
I2k
Enter your password :
Abhay@321
verification compleat !
Welcome !
Enter
1->get book
2->return the book
3->Exit
1
Enter 0 for :
Chhava
Enter 1 for :
Every Last Fear
Enter 2 for :
The Story Of My Life
Enter 3 for :
Long Walk To Freedom
3
Welcome !
Enter
1->get book
2->return the book
3->Exit
3
Enter
1->If you are new to  liberary(to resister)
2->All ready resistered
3->Exit
2
Enter your S_ID :
I2k
Enter your password :
Abhay@321
verification compleat !
Welcome !
Enter
1->get book
2->return the book
3->Exit
2
Enter 0 to return :
Long Walk To Freedom
0
Welcome !
Enter
1->get book
2->return the book
3->Exit
3
Enter
1->If you are new to  liberary(to resister)
2->All ready resistered
3->Exit
3
Have A Nice Day!!!!!

Process finished with exit code 0
 */