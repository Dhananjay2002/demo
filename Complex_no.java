package com.company;
import java.util.Scanner ;
class Complex
{
    int real1,imag1,real2,imag2;
    public Complex()
    {
        real1=real2=imag1=imag2=0 ;
    }
    public Complex(int ireal1,int iimag1,int ireal2,int iimag2)
    {
        real1 = ireal1 ;
        imag1 = iimag1 ;
        real2 = ireal2 ;
        imag2 = iimag2 ;
    }
    public void sub()
    {
        System.out.println("The subtraction is :");
        System.out.println("("+(real1-real2 )+")+i("+(imag1-imag2)+")");
    }
    public void add()
    {
        System.out.println("The addition is :");
        System.out.println("("+(real1+real2) +")+i("+(imag1+imag2)+")");
    }
    public void mult()
    {
        System.out.println("the multiplication is :");
        System.out.println("("+((real1*real2)-(imag1*imag2))+")+i("+(((real1*imag2)+(real2*imag1)))+")");
    }

}
public class Complex_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  real number of the first complen no : ");
        int r1 = sc.nextInt();
        System.out.println("enter the  imag number of the first complen no : ");
        int i1 = sc.nextInt();
        System.out.println("enter the  real number of the second complen no : ");
        int r2 = sc.nextInt();
        System.out.println("enter the  imag number of the second complen no : ");
        int i2 = sc.nextInt();
        Complex comp1 = new Complex(r1, i1, r2, i2);
        while (true) {
            System.out.println("Enter 1 for ->addition ,2 for-> subtraction , 3 for-> multiplication and 4 for -> exit");
            int num = sc.nextInt();
            switch (num) {
                case (1) -> comp1.add();
                case (2) -> comp1.sub();
                case (3) -> comp1.mult();
                case(4) -> System.exit(0);
                default -> System.out.println("Enter valid number");
            }
        }
    }
}
