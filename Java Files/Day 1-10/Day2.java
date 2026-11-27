import java.util.Scanner;

public class Employee{
    double salary;
    String name;
    String employer;

    Employee(String name, String employer, double salary){
        this.salary=salary;
        this.name=name;
        this.employer=employer;
    }

    void giveRaise(double raise){
        this.salary=this.salary+((this.salary/100.0)*raise);
        System.out.println("salary Raised");
    }

    void showDetails(){
        System.out.println(name + " Works at " + employer + " And earns " + salary + " Money.");
    }
}

public class Day2{
    public static void main(String agrs[]){
        double salary, raise;
        String name, employer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        name = sc.nextLine();
        System.out.println("Enter Employee Employer : ");
        employer = sc.nextLine();
        System.out.println("Enter Employee Salary : ");
        salary = sc.nextDouble();
        Employee emp1 = new Employee(name, employer, salary);
        emp1.showDetails();
        System.out.println("Enter Raise Percentage : ");
        raise = sc.nextDouble();
        emp1.giveRaise(raise);
        emp1.showDetails();


        // Employee emp1 = new Employee("John", "Google", 1000);
        // emp1.showDetails();
        // emp1.giveRaise(10);
        // emp1.showDetails();   
    }
}