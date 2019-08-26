package com;

import data.Employee;
import lvl1.someClass1;
import lvl1.someClass2;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Emp1","IT");
        Employee e2 = new Employee(2,"Emp2","IT");
        Employee e3 = new Employee(3,"Emp3","IT");
        Employee e4 = new Employee(4,"Emp4","IT");
        Employee e5 = new Employee(5,"Emp5","IT");
        Employee e6 = new Employee(6,"Emp6","IT");
        Employee e7 = new Employee(7,"Emp7","IT");

        someClass1 sc1 = new someClass1();
        someClass2 sc2 = new someClass2();

        sc1.addEmployee(e1);
        sc2.addEmployee(e2);

        sc1.addEmployee(e3);
        sc2.addEmployee(e4);

        sc1.addEmployee(e5);
        sc2.addEmployee(e6);

        sc1.addEmployee(e7);


        sc1.displayAllEmp();
        System.out.println();
        sc2.displayAllEmp();


    }
}
