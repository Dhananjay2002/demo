//problem Statement
/*
  Implement and apply Strategy Design pattern for simple Shopping Cart where three payment
  strategies are used such as Credit Card, PayPal, Bit Coin. Create an interface for strategy pattern
  and give concrete implementation for payment.
*/
package com.company;
import java.util.Scanner;
interface PaymentProcessor {

    void pay(int amount);

}

class CreditCard implements PaymentProcessor {
    Scanner sc =new Scanner (System.in);
    Scanner sc1 =new Scanner (System.in);
    String name,ExpDate;
    double CardNo;
    CreditCard(){
        System.out.print("Card holder Name->");
        this.name =sc.nextLine();
        System.out.print("Card Number->");
        this.CardNo =sc1.nextDouble();
        System.out.print("Card Expire Date->");
        this.ExpDate =sc.nextLine();
    }
    @Override
    public void pay(int amount) {
        System.out.println("CreditCard payment: Charg ->" + amount);
    }
}
class PayPal implements PaymentProcessor {
    PayPal(){
        System.out.println("");
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paying through PayPal payment: Charg ->" + amount);
    }

}
class BitCoin implements PaymentProcessor {
    Scanner sc =new Scanner (System.in);
    String add;
    BitCoin(){
        super();
        System.out.print("Enter Transaction 'Input Address' -> ");
        add= sc.next();
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying through BitCoin payment: Charg" + amount);
    }

}
class Order {
    private PaymentProcessor paymentProcessor;
    private  int amount;
    public Order(int amount, PaymentProcessor paymentProcessor) {
        this.amount = amount;
        this.paymentProcessor = paymentProcessor;
    }
    public void process() {
        paymentProcessor.pay(amount);
    }
}
public class OOP_Assignment11 {
    public static void main(String[] args) {
        int c,amot=0;
        Order order;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter\n1->Credit Card \n2->PayPal \n3->BitCoin \n4->Exit");
            System.out.print("Enter the Choice ->");
            c=sc.nextInt();
            if(c==1||c==2||c==3) {
                System.out.print("Enter amount tobe Tranfer ->");
                amot = sc.nextInt();
            }
            switch(c) {
                case 1:
                    order = new Order(amot, new CreditCard());
                    order.process();
                    break;

                case 2://for input c == 2
                    order = new Order(amot, new PayPal());
                    order.process();
                    break;

                case 3://for input c == 3
                    order = new Order(amot, new BitCoin());
                    order.process();
                    break;

                case 4:
                    System.out.println("\nThank you For Shopping !!!! ");
                    System.out.println("----------------------------------------------------------");
                    return;

                default:
                    System.out.println("Invalid Payment Mode !!!");
                    System.out.println("----------------------------------------------------------");
            }
        }
    }
}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=56427:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.OOP_Assignment11
Enter
1->Credit Card
2->PayPal
3->BitCoin
4->Exit
Enter the Choice ->1
Enter amount tobe Tranfer ->12
Card holder Name->abhay salunke
Card Number->1232 3453 2322
Card Expire Date->1234
CreditCard payment: Charg ->12
Enter
1->Credit Card
2->PayPal
3->BitCoin
4->Exit
Enter the Choice ->2
Enter amount tobe Tranfer ->1242

Paying through PayPal payment: Charg ->1242
Enter
1->Credit Card
2->PayPal
3->BitCoin
4->Exit
Enter the Choice ->3
Enter amount tobe Tranfer ->12222
Enter Transaction 'Input Address' -> 23123
Paying through BitCoin payment: Charg12222
Enter
1->Credit Card
2->PayPal
3->BitCoin
4->Exit
Enter the Choice ->5
Invalid Payment Mode !!!
----------------------------------------------------------
Enter
1->Credit Card
2->PayPal
3->BitCoin
4->Exit
Enter the Choice ->4

Thank you For Shopping !!!!
----------------------------------------------------------

Process finished with exit code 0


 */
