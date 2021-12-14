package com.company;
class Static
{
    String name;
    static int roll =0;
    Double averageperc ;
    Static()
    {
        name="Noname";
        roll++ ;
        averageperc=0d ;
    }
    void setName(String name )
    {
        this.name=name ;
    }
    void setAverageperc(Double averageperc)
    {
        this.averageperc=averageperc ;
    }
    void display()
    {
        System.out.println("The name is : "+name);
        System.out.println("The roll num is : "+roll);
        System.out.println("The averagepercentage is : "+averageperc);
    }


}
public class Static_Ex_23340 {
    public static void main(String[] args) {
        Static s1 = new Static();
        s1.setName("Abhay");
        s1.setAverageperc(10d);
        s1.display();
        Static s2 = new Static();
        s1.setName("Ajit");
        s1.setAverageperc(11d);
        s1.display();
    }
}
/*"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=51277:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.Static_Code
The name is : Abhay
The roll num is : 1
The averagepercentage is : 10.0
The name is : Ajit
The roll num is : 2
The averagepercentage is : 11.0

Process finished with exit code 0
*/