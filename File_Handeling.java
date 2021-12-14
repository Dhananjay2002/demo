package com.company;
import java.io.*;
import java.security.cert.TrustAnchor;
import java.util.*;
class SRecord
{
    int roll;
    String sID;
    String name ;
    int marks ;
    String Class ;
    String addres ;
    SRecord()
    {
        roll=0;
        marks=0;
    }
}
class StudentRecord {
    ArrayList<SRecord>arr=new ArrayList<>();
    public void add_student_info()throws IOException
    {
        SRecord tem= new SRecord();
        Scanner sc = new Scanner(System.in);// for string
        Scanner sc1 = new Scanner(System.in);// for integers
        System.out.print("Enter your student id:");
        tem.sID= sc.nextLine();
        System.out.print("Enter your name : ");
        tem.name= sc.nextLine();
        int  roll;
        while (true) {
            System.out.print("Enter your roll no(must be of 5 digits & not starting with Zero):");
            roll = sc1.nextInt();
            if ((roll / 10000 < 1) || (roll / 10000 > 9)) {
                System.out.println("Enter proper roll number !");
            } else {
                break;
            }
        }
        tem.roll=roll;
        System.out.print("Enter your class :");
        tem.Class = sc.nextLine();
        System.out.print("Enter your marks :");
        tem.marks = sc1.nextInt();
        System.out.print("Enter your Adress(Single line):");
        tem.addres = sc.nextLine();
//        sc.close();
//        sc1.close();// why it is giving me an error if i uncomment this two lines
        arr.add(tem);
        File f= new File("StudentRecord.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f,true);
        String sroll = String.valueOf(tem.roll);
        String smarks = String.valueOf(tem.marks);
        fw.write(tem.sID+","+tem.name+","+sroll+","+tem.Class+","+smarks+","+tem.addres+";\n");
        fw.close();

    }
    public void search()throws IOException
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Student ID :");
        String id =sc.nextLine();
        boolean b=true ;
        for(SRecord i :arr)
        {
            if(i.sID.equals(id))
            {
                System.out.println("Record found !");
                System.out.println("Name->"+i.name);
                System.out.println("Student ID ->"+i.sID);
                System.out.println("Roll->"+i.roll);
                System.out.println("class->"+i.Class);
                System.out.println("Marks->"+i.marks);
                System.out.println("Addres->"+i.addres);
                b=false;
                break ;
            }
        }
        if(b)
        {
            System.out.println("Student record doesent found !");
        }
    }
    public void deleteRecord() throws IOException
    {
        int counter=1;// will represent the line which we have to delete
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Student ID(which you want to delete):");
        String id ;
        id=sc.nextLine();
        for(SRecord i :arr)
        {
            if(i.sID.equals(id))
            {
                break ;
            }
            else
            {
                counter++;
            }
        }
        arr.remove(counter-1);// as couner is giving the line which we have to remove to convert it in to the index we have to do  - 1
        File f = new File("StudentRecord.txt");
        FileWriter fw= new FileWriter(f);
        fw.write("");// i hava done this to empty the file
        fw.close();
        FileWriter fw1= new FileWriter(f,true);
        for(SRecord i:arr)
        {
            String sroll=String.valueOf(i.roll);
            String smarks = String.valueOf(i.marks);
            fw1.write(i.sID+","+i.name+","+sroll+","+i.Class+","+smarks+","+i.addres+";\n");
        }
        fw1.close();
    }
    void display() throws IOException
    {
        File f = new File("StudentRecord.txt");
        Scanner sc3 =new Scanner(f);
        while(sc3.hasNextLine())
        {
            String sfd =sc3.nextLine();
            System.out.println(sfd);
        }
    }
    void clear() throws IOException
    {
        File f= new File("StudentRecord.txt");
        FileWriter fw =new FileWriter(f);
        fw.write("");
    }
    void updateRecord()  throws IOException
    {
        int counter=1;// will represent the line which we have to delete
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        System.out.print("Enter your Student ID(of whome you want to update the record):");
        String id ;
        id=sc.nextLine();
        for(SRecord i :arr)
        {
            if(i.sID.equals(id))
            {
                break ;
            }
            else
            {
                counter++;
            }
        }
        System.out.println("Enter new  Student ID :");
        arr.get(counter-1).sID=sc.nextLine();
        System.out.println("Enter new Name :");
        arr.get(counter-1).name= sc.nextLine();
        System.out.println("Enter new Roll number :");
        arr.get(counter-1).roll=sc1.nextInt();
        System.out.println("Enter new Class :");
        arr.get(counter-1).Class=sc.nextLine();
        System.out.println("Enter new Marks:");
        arr.get(counter-1).marks=sc1.nextInt();
        System.out.println("Enter new Addres");
        arr.get(counter-1).addres=sc.nextLine();
        File f = new File("StudentRecord.txt");
        FileWriter fw= new FileWriter(f);
        fw.write("");// i hava done this to empty the file
        fw.close();
        FileWriter fw1= new FileWriter(f,true);
        for(SRecord i:arr)
        {
            String sroll=String.valueOf(i.roll);
            String smarks = String.valueOf(i.marks);
            fw1.write(i.sID+","+i.name+","+sroll+","+i.Class+","+smarks+","+i.addres+";\n");
        }
        fw1.close();
    }
}
    public class File_Handeling{
        public static void main(String[] args)throws IOException {
            Scanner s =new Scanner(System.in);
            StudentRecord sr =new StudentRecord();
            while(true){
                System.out.print("Enter\n1->Add student Record\n2->Search for Student Record\n3->Delete Student Record\n4->Update a record\n5->Display Records\n6->Clear the file\n7->TO Exit\n->");
                int i=s.nextInt();
                switch (i)
                {
                    case(1):
                    {
                        sr.add_student_info();
                        break;
                    }
                    case(2):
                    {
                        sr.search();
                        break;
                    }
                    case(3):
                    {
                        sr.deleteRecord();
                        break;
                    }
                    case(4):
                    {
                        sr.updateRecord();
                        break;
                    }
                    case(5):
                    {
                        sr.display();
                        break;
                    }
                    case(6):
                    {
                        sr.clear();
                        break;
                    }
                    case(7):
                    {
                        System.exit(1);
                        break;
                    }
                    default:
                    {
                        System.out.println("Enter proper Number !");
                    }
                }
            }
        }
    }

    /*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=52161:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.File_Handeling
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->1
Enter your student id:a
Enter your name : abhay bhagwan salunke
Enter your roll no(must be of 5 digits & not starting with Zero):123
Enter proper roll number !
Enter your roll no(must be of 5 digits & not starting with Zero):123456
Enter proper roll number !
Enter your roll no(must be of 5 digits & not starting with Zero):12345
Enter your class :SE11
Enter your marks :23
Enter your Adress(Single line):loni Vyankanath ,Shrigonda,A Nagar.
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->1
Enter your student id:b
Enter your name : Dhananjay Bhagwan Salunke
Enter your roll no(must be of 5 digits & not starting with Zero):23340
Enter your class :SE11
Enter your marks :234
Enter your Adress(Single line):Ambi BK,Baramati,pune
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->2
Enter your Student ID :b
Record found !
Name->Dhananjay Bhagwan Salunke
Student ID ->b
Roll->23340
class->SE11
Marks->234
Addres->Ambi BK,Baramati,pune
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->2
Enter your Student ID :c
Student record doesent found !
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->3
Enter your Student ID(which you want to delete):b
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->4
Enter your Student ID(of whome you want to update the record):a
Enter new  Student ID :
a1
Enter new Name :
Abhay Bhagwan Salunke
Enter new Roll number :
23340
Enter new Class :
TE10
Enter new Marks:
100
Enter new Addres
Ambi BK,Baramati,Pune.
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->5
a1,Abhay Bhagwan Salunke,23340,TE10,100,Ambi BK,Baramati,Pune.;
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->6
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->5
Enter
1->Add student Record
2->Search for Student Record
3->Delete Student Record
4->Update a record
5->Display Records
6->Clear the file
7->TO Exit
->7

Process finished with exit code 1
   */