package com.company;
import java .util.Scanner ;
class Publication
{
   String title ;
   int price ;
   int copies ;
   Publication(String title ,int price)
   {
       this.price=price ;
       copies=0;
       this.title=title;
   }

    public int getCopies() {
        return copies;
    }
    void Display()
    {
        System.out.println("Title->"+title+"\nPrice->"+price+"\ncopies->"+copies);
    }
    public void setCopies(int copies) {
        this.copies = copies;
    }
    void sell_Copies(int quant) {
        System.out.println("The total  publications sell is : " + (quant * price));

    }
}
class Books extends Publication
{
    String author ;
    Books(String author,String title ,int price)
    {
        super(title , price);
        this.author=author;
    }
    @Override
    void sell_Copies(int quant)
    {
        System.out.println("The total  Books sell is : "+(quant*price));
    }
    @Override
    void Display()
    {
        super.Display();
        System.out.println("Authore->"+author);
    }
}
class Magzine extends  Publication
{
    private int orderQuant ;
    private String curtIssue ;
    Magzine(String title ,int price)
    {
        super(title , price) ;
        orderQuant=0;
        curtIssue="NULL";
    }
    void set_Current_Issue(String curtIssue)
    {
        this.curtIssue=curtIssue ;
    }
    @Override
    void sell_Copies(int quant)
    {
        System.out.println("The total  Magzine sell is : "+(quant*price));
    }
    void Display()
    {
        super.Display();
        System.out.println("Current Issue->"+curtIssue+"Ordered Quantities->"+orderQuant);
    }

    public void setOrderQuant(int orderQuant) {
        this.orderQuant = orderQuant;
        copies=orderQuant ;
    }

}
public class OOP_Assignment_No_2 {
    public static void main(String[] args) {
        Books obj1=new Books("Abhay","Way",1010);
        obj1.setCopies(12);
        obj1.sell_Copies(10);
        obj1.Display();
        Magzine obj2=new Magzine("On My Way",2002);
        obj2.setOrderQuant(32);
        obj2.sell_Copies(22);
        obj2.set_Current_Issue("November Issue");
        obj2.Display();

    }
}
/*
The total  Books sell is : 10100
Title->Way
Price->1010
copies->12
Authore->Abhay
The total  Magzine sell is : 44044
Title->On My Way
Price->2002
copies->32
Current Issue->November IssueOrdered Quantities->32
 */
