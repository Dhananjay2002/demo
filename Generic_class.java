package com.company;
import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader ;
import java.util.Scanner;
import java.util.ArrayList;
public class Generic_class {
    public static void main(String[] args) throws IOException {
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(in);
        ArrayList<Integer>a1= new ArrayList<>();
        System.out.println("Enter the no of integers present in your ArrayList :");
        int length = Integer.parseInt(br.readLine());
        for(int i=0;i<length;i++)
        {
            System.out.println("Enter the "+(i+1)+" integer in the Arraylist : ");
            int temp=Integer.parseInt(br.readLine());
            a1.add(temp);
        }
        int even=0,odd=0,prime =0;
        for(int i:a1)
        {
            if(i%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            if(i==2)
            {
                prime++;
            }
            else {
                int j = 2;
                while (j < i)
                {
                    if(i%j==0)
                    {
                        break;
                    }
                    j++;
                }
                if(j==i)
                {
                    prime++;
                }
            }

        }
        System.out.println("The no of even number in the ArrayList is : "+even);
        System.out.println("The no of odd number in the ArrayList is : "+odd);
        System.out.println("The no of prime number in the ArrayList is : "+prime);
        System.out.print("Enter the no of words present in your ArrayList : ");
//        int siz=Integer.parseInt(br.readLine());
        ArrayList<String>a2=new ArrayList<>();
        int pelindrome=0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter "+(i+1)+" word in the collection :");
            String temp= br.readLine();
            a2.add(temp);
        }
        for(String i:a2)
        {
            int si=i.length();
            Boolean p=true ;
            for(int j=0;j<si/2;j++)
                {
                    if(i.charAt(j)!=i.charAt(si-1-j))
                    {
                        p=false;
                        break;
                    }
                }
            if(p)
            {
                pelindrome++;
            }
        }
        System.out.println("The no of pelendrone words in the collection is : "+pelindrome);
    }
}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=51930:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.Generic_class
Enter the no of integers present in your ArrayList :
3
Enter the 1 integer in the Arraylist :
1
Enter the 2 integer in the Arraylist :
2
Enter the 3 integer in the Arraylist :
3
The no of even number in the ArrayList is : 1
The no of odd number in the ArrayList is : 2
The no of prime number in the ArrayList is : 2
Enter the no of words present in your ArrayList : 4
Enter 1 word in the collection :lol
Enter 2 word in the collection :wow
Enter 3 word in the collection :abhay
Enter 4 word in the collection :bob
The no of pelendrone words in the collection is : 3

Process finished with exit code 0

 */