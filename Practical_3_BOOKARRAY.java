package com.company;
import java.util.Scanner ;
class Book
{
    int cost ;
    String bookName ;
    String publication ;
    int num_authers ;
    String  authers[] =new String[6] ;
    Book()
    {
        num_authers=0;
        bookName="NoName";
        publication = "NoPublication";
        cost = 0 ;
    }
}
class Liberary
{
    int length ;
    Book  books []= new Book[10];
    Scanner sc = new Scanner(System.in);
    Liberary(int x) {
        length = x;
        for (int i = 0; i <length; i++) {
               books[i] = new Book();
        }
    }
    void set_Books()
    {
        for(int i=0 ;i<length;i++)
        {
            System.out.println("Enter the name if the "+(i+1)+" Book");
            books[i].bookName=sc.nextLine();
            System.out.println("Enter the name if the"+(i+1)+" Book publication");
            books[i].publication=sc.nextLine();
            System.out.println("Enter the cost of the "+(i+1)+" Book");
            books[i].cost=sc.nextInt();
            System.out.println("Enter the number of the authors for the "+(i+1)+" Book");
            books[i].num_authers=sc.nextInt();
            String k=sc.nextLine();
            for (int j=0 ;j<books[i].num_authers;j++)
            {
                System.out.println("Enter the name of the "+(j+1)+" author of the "+(i+1)+" Book");
                books[i].authers[j]=sc.nextLine();
            }
        }
    }

    void display()
    {
        for(int i=0 ;i<length;i++)
        {
            System.out.println("The name of the "+(i+1)+" Book is  :"+books[i].bookName);
            System.out.println("The name of the publisher of "+(i+1)+" Book is   : "+books[i].publication);
            System.out.println("The cost of the "+(i+1)+" Book is : "+books[i].cost);
            System.out.println("The authors of the "+(i+1)+" Book is as followed : ");
            for(int j=0 ;j<books[i].num_authers;j++ )
            {
                System.out.println(books[i].authers[j]+" ");
            }
        }
    }


}
public class Practical_3_BOOKARRAY {
    public static void main(String[] args) {
        Liberary l10 = new Liberary(3) ;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter \n1->set_Books\n2->disolay\n3->Exit");
            int num;
            num= s.nextInt();
            switch(num)
            {
                case(1):
                {
                    l10.set_Books();
                    break;
                }
                case(2):
                {
                    l10.display();
                    break ;
                }
                case(3):
                {
                    System.exit(0);
                }
            }
        }



    }
}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=54662:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.Practical_3_BOOKARRAY
Enter
1->set_Books
2->disolay
3->Exit
1
Enter the name if the 1 Book
Abhay
Enter the name if the1 Book publication
Salunke
Enter the cost of the 1 Book
1010
Enter the number of the authors for the 1 Book
1
Enter the name of the 1 author of the 1 Book
bhagwan salunke
Enter the name if the 2 Book
wings of fire
Enter the name if the2 Book publication
Vikas
Enter the cost of the 2 Book
10001
Enter the number of the authors for the 2 Book
1
Enter the name of the 1 author of the 2 Book
A.p.j.Abdul kalam
Enter the name if the 3 Book
Dhananjay
Enter the name if the3 Book publication
Salunke
Enter the cost of the 3 Book
2002
Enter the number of the authors for the 3 Book
1
Enter the name of the 1 author of the 3 Book
rajani salunke
Enter
1->set_Books
2->disolay
3->Exit
2
The name of the 1 Book is  :Abhay
The name of the publisher of 1 Book is   : Salunke
The cost of the 1 Book is : 1010
The authors of the 1 Book is as followed :
bhagwan salunke
The name of the 2 Book is  :wings of fire
The name of the publisher of 2 Book is   : Vikas
The cost of the 2 Book is : 10001
The authors of the 2 Book is as followed :
A.p.j.Abdul kalam
The name of the 3 Book is  :Dhananjay
The name of the publisher of 3 Book is   : Salunke
The cost of the 3 Book is : 2002
The authors of the 3 Book is as followed :
rajani salunke
Enter
1->set_Books
2->disolay
3->Exit
3

Process finished with exit code 0

 */