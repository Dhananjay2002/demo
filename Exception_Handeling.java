package com.company;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
class My_Exception extends Exception
{
    public String toString()
       {
           return "The number is less than zero";
       }
}
public class Exception_Handeling {
    public static void main(String[] args) throws My_Exception {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter\n1->To see the handeling of the negative number exception\n2->To see the handeling of the array index out of bout exception\n3->To see the handeling of the Arthematic exception\n4->To Exit");
            int v=sc.nextInt();
            switch (v)
            {
                case(1):
                {
                    System.out.println("Enter a number :");
                    float num=sc.nextFloat();
                    try {
                        if (num < 0) {
                            throw new My_Exception();
                        }
                        else
                        {
                            System.out.println("The  entered number is  :"+num);
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    finally {
                        System.out.println("It will get printed  even if the error does not occured");
                    }
                    break;
                }
                case(2):
                {
                    int arr[]={1,2,3,4,5,6,7,8,9,10};
                    System.out.println("The array is :");
                    for (int i=0;i<10;i++)
                    {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println("\nEnter the index no of which you want to print the number :");
                    int n=sc.nextInt();
                    try
                    {
                        System.out.println("The number  at index "+n+" is "+arr[n]);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    finally {
                        System.out.println("It will get exicuted even if the error does not occured");
                    }
                    break;
                }
                case(3):
                {
                    try
                    {
                        System.out.println("Enter the  integer Devidant : ");
                        int n1=sc.nextInt();
                        System.out.println("Enter the integer Divisor : ");
                        int n2=sc.nextInt();
                        double z=n1/n2;
                        System.out.println("The answer of the Devidant/Divisor ="+z);
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println(e+ "Please enter an integer");
                        //*************************************
                        sc.nextLine();// we have to do this because when this exception happens  the floate value which we have entered is not been assigned to the any one and hence it get remains in the buffer thats why we have to do this  
                    }
                    catch(ArithmeticException y)
                    {
                        System.out.println(y);
                    }
                    catch(Exception u)
                    {
                        System.out.println(u);
                    }
                    finally {
                        System.out.println("Nice Job!");
                    }
                    break;
                }
                case(4):
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Enter a appropriate number !");
                }
            }
        }
    }
}
/*
Enter
1->To see the handeling of the negative number exception
2->To see the handeling of the array index out of bout exception
3->To see the handeling of the Arthematic exception
4->To Exit
1
Enter a number :
1
The  entered number is  :1.0
It will get printed  even if the error does not occured
Enter
1->To see the handeling of the negative number exception
2->To see the handeling of the array index out of bout exception
3->To see the handeling of the Arthematic exception
4->To Exit
1
Enter a number :
-1
The number is less than zero
It will get printed  even if the error does not occured
Enter
1->To see the handeling of the negative number exception
2->To see the handeling of the array index out of bout exception
3->To see the handeling of the Arthematic exception
4->To Exit
2
The array is :
1 2 3 4 5 6 7 8 9 10
Enter the index no of which you want to print the number :
2
The number  at index 2 is 3
It will get exicuted even if the error does not occured
Enter
1->To see the handeling of the negative number exception
2->To see the handeling of the array index out of bout exception
3->To see the handeling of the Arthematic exception
4->To Exit

2
The array is :
1 2 3 4 5 6 7 8 9 10
Enter the index no of which you want to print the number :
23
java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 10
It will get exicuted even if the error does not occured
Enter
1->To see the handeling of the negative number exception
2->To see the handeling of the array index out of bout exception
3->To see the handeling of the Arthematic exception
4->To Exit
3
Enter the  integer Devidant :
8
Enter the integer Divisor :
2
The answer of the Devidant/Divisor =4.0
Nice Job!
Enter
1->To see the handeling of the negative number exception
2->To see the handeling of the array index out of bout exception
3->To see the handeling of the Arthematic exception
4->To Exit
3
Enter the  integer Devidant :
4
Enter the integer Divisor :
0
java.lang.ArithmeticException: / by zero
Nice Job!
Enter
1->To see the handeling of the negative number exception
2->To see the handeling of the array index out of bout exception
3->To see the handeling of the Arthematic exception
4->To Exit
4

Process finished with exit code 0
 */