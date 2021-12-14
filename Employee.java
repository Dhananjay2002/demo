package com.company;

import java.util.Scanner;

 class employeedetails{
	String employee_name;
	int id_number;
	String address;
	long mobile_no;
	float bp ;

    employeedetails()
    {
        employee_name="no-name";
        id_number=0;
        address="no adress";
        mobile_no=0 ;
		bp=0f;
    }
 }


 class programmer extends employeedetails{
		programmer s[]= new programmer[2];
		Scanner sc = new Scanner(System.in);

		void get_details(){
			for(int i=0; i<2;i++) {
				s[i]=new programmer();
				System.out.println("enter "+(i+1)+" programmer id number");
				s[i].id_number= sc.nextInt();
				String f=sc.nextLine();
				System.out.println("enter "+(i+1) +" programmer name");
				s[i].employee_name= sc.nextLine();
				System.out.println("enter "+(i+1) +" programmer address");
				s[i].address= sc.nextLine();
				System.out.println("enter "+(i+1)+" programmer mobile no");
				s[i].mobile_no= sc.nextLong();
				System.out.println("enter "+(i+1) +" programmer basic pay ");
				s[i].bp=sc.nextFloat();
			}

		}
	void show_details() {
		System.out.println("\n");
		for(int i=0; i<2;i++) {
			System.out.println("");

			double da= 0.97*s[i].bp;
				double hra= 0.1*s[i].bp;
				double pf= 0.12*s[i].bp;
				double scf= 0.001*s[i].bp;
				double gross = s[i].bp+da+hra;
				double net = gross -pf-scf;
				System.out.println("name of programmer  is:"+s[i].employee_name);
				System.out.println("HRA="+hra+"                  "+"PF"+pf);
				System.out.println("DA="+da+"                   " +  "SCF"+scf);
				System.out.println("gross="+gross);
			 	System.out.println("the mobile no is "+s[i].mobile_no);

			System.out.println("NET SALARY :"+net);
			}

		}

	}


class Asstprofessor extends employeedetails{
   Asstprofessor s[]= new Asstprofessor[2];
	Scanner sc = new Scanner(System.in);

	void get_details(){
		for(int i=0; i<2;i++) {
			s[i]=new Asstprofessor();
			System.out.println("enter "+(i+1)+" Asstprofessor id number");
			s[i].id_number= sc.nextInt();
			String f=sc.nextLine();
			System.out.println("enter "+(i+1) +" Asstprofessor name");
			s[i].employee_name= sc.nextLine();
			System.out.println("enter "+(i+1) +" Asstprofessor address");
			s[i].address= sc.nextLine();
			System.out.println("enter "+(i+1)+" Asstprofessor mobile no");
			s[i].mobile_no= sc.nextLong();
			System.out.println("enter "+(i+1) +" Asstprofessor basic pay ");
			s[i].bp=sc.nextFloat();
		}

	}
void show_details() {
	System.out.println("\n");

	for(int i=0; i<2;i++) {
		System.out.println("");

		double da= 0.97*s[i].bp;
			double hra= 0.1*s[i].bp;
			double pf= 0.12*s[i].bp;
			double scf= 0.001*s[i].bp;
			double gross = s[i].bp+da+hra;
			double net = gross -pf-scf;
			System.out.println("name of Asstprofessor is:"+s[i].employee_name);
			System.out.println("HRA="+hra+"                  "+"PF"+pf);
			System.out.println("DA="+da+"                   " +  "SCF"+scf);
			System.out.println("gross="+gross);
			System.out.println("the mobile no is "+s[i].mobile_no);
			System.out.println("NET SALARY :"+net);
		}

	}

}


class professor extends employeedetails{
	professor s[]= new professor[1];
	Scanner sc = new Scanner(System.in);

	void get_details(){
		for(int i=0; i<1;i++) {
			s[i]=new professor();
			System.out.println("enter "+(i+1)+"  professor id number");
			s[i].id_number= sc.nextInt();
			String f=sc.nextLine();
			System.out.println("enter "+(i+1) +" professor name");
			s[i].employee_name= sc.nextLine();
			System.out.println("enter "+(i+1) +"  professor address");
			s[i].address= sc.nextLine();
			System.out.println("enter "+(i+1)+"  professor mobile no");
			s[i].mobile_no= sc.nextLong();
			System.out.println("enter "+(i+1) +"  professor basic pay ");
			s[i].bp=sc.nextFloat();
		}

	}
void show_details() {
	System.out.println("\n");

	for(int i=0; i<1;i++) {
		System.out.println("");

		double da= 0.97*s[i].bp;
			double hra= 0.1*s[i].bp;
			double pf= 0.12*s[i].bp;
			double scf= 0.001*s[i].bp;
			double gross = s[i].bp+da+hra;
			double net = gross -pf-scf;
			System.out.println("name of professer is:"+s[i].employee_name);
			System.out.println("HRA="+hra+"                  "+"PF"+pf);
			System.out.println("DA="+da+"                   " +  "SCF"+scf);
			System.out.println("gross="+gross);
		    System.out.println("the mobile no is "+s[i].mobile_no);
			System.out.println("NET SALARY :"+net);


	}

}
}



public  class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {

			System.out.println(" enter 1 -> store information of programmer \n enter 2 -> store information of Asstprofessor \n enter 3 -> sto"
					+ "re information of professor  \n enter 4 for exit \n");


			System.out.println("enter your choice");
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();

			switch (c) {

				case 1:
					programmer p = new programmer();
					p.get_details();
					p.show_details();
					break;
				case 2:
					Asstprofessor l = new Asstprofessor();
					l.get_details();
					l.show_details();
					break;
				case 3:
					professor m = new professor();
					m.get_details();
					m.show_details();
					break;

				case 4:
					System.exit(0);
					break ;
				default :
					System.out.println("Enter valid number");

			}
		}

	}

}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\lib\idea_rt.jar=60475:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dhana\Desktop\java\OOP  PRAC\out\production\OOP  PRAC" com.company.Employee
 enter 1 -> store information of programmer
 enter 2 -> store information of Asstprofessor
 enter 3 -> store information of professor
 enter 4 for exit

enter your choice
1
enter 1 programmer id number
12
enter 1 programmer name
madhu
enter 1 programmer address
loni
enter 1 programmer mobile no
123456689
enter 1 programmer basic pay
123
enter 2 programmer id number
10
enter 2 programmer name
abhay
enter 2 programmer address
vyankanath
enter 2 programmer mobile no
1234567789
enter 2 programmer basic pay
1234



name of programmer  is:madhu
HRA=12.3                  PF14.76
DA=119.31                   SCF0.123
gross=254.61
the mobile no is 123456689
NET SALARY :239.72700000000003

name of programmer  is:abhay
HRA=123.4                  PF148.07999999999998
DA=1196.98                   SCF1.234
gross=2554.38
the mobile no is 1234567789
NET SALARY :2405.0660000000003
 enter 1 -> store information of programmer
 enter 2 -> store information of Asstprofessor
 enter 3 -> store information of professor
 enter 4 for exit

enter your choice
2
enter 1 Asstprofessor id number
1
enter 1 Asstprofessor name
ajit
enter 1 Asstprofessor address
pune
enter 1 Asstprofessor mobile no
2122323534
enter 1 Asstprofessor basic pay
234
enter 2 Asstprofessor id number
124
enter 2 Asstprofessor name
anjali
enter 2 Asstprofessor address
ganpati mala
enter 2 Asstprofessor mobile no
134263565
enter 2 Asstprofessor basic pay
234235



name of Asstprofessor is:ajit
HRA=23.400000000000002                  PF28.08
DA=226.98                   SCF0.234
gross=484.38
the mobile no is 2122323534
NET SALARY :456.06600000000003

name of Asstprofessor is:anjali
HRA=23423.5                  PF28108.2
DA=227207.94999999998                   SCF234.235
gross=484866.44999999995
the mobile no is 134263565
NET SALARY :456524.01499999996
 enter 1 -> store information of programmer
 enter 2 -> store information of Asstprofessor
 enter 3 -> store information of professor
 enter 4 for exit

enter your choice
3
enter 1  professor id number
1244646
enter 1 professor name
chotya
enter 1  professor address
hadapsar
enter 1  professor mobile no
1354655634
enter 1  professor basic pay
236335



name of professer is:chotya
HRA=23633.5                  PF28360.2
DA=229244.94999999998                   SCF236.335
gross=489213.44999999995
the mobile no is 1354655634
NET SALARY :460616.9149999999
 enter 1 -> store information of programmer
 enter 2 -> store information of Asstprofessor
 enter 3 -> store information of professor
 enter 4 for exit

enter your choice
4

Process finished with exit code 0

 */

