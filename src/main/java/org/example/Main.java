package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        //Healthplan
        Healthplan hp1 = new Healthplan(1, "Employee Basic Health", Plan.BASIC);
        Healthplan hp2 = new Healthplan(2, "Employee Gold Health", Plan.GOLD);

        // Employee
        Employee emp1 = new Employee(101, "Emin Mengi", "emn@example.com", "12345", new String[3]);
        emp1.addHealthPlan(0, hp1.getPlan().getName());
        emp1.addHealthPlan(1, hp2.getPlan().getName());

        // Company
        Company comp1 = new Company(201, "TechCorp", 50000.0, new String[3]);
        comp1.addEmployee(0, emp1.getFullName());

        System.out.println("=== Healthplans ===");
        System.out.println(hp1);
        System.out.println(hp2);

        System.out.println("\n=== Employee ===");
        System.out.println(emp1);

        System.out.println("\n=== Company ===");
        System.out.println(comp1);
    }
}