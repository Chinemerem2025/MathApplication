package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        double chinemeremSalary = 2500.00; // declare variables here
        double philipSalary = 5000.00; // declare variables here

        double highestSalary = Math.max ( chinemeremSalary, philipSalary);// then the solution

        System.out.println( "     Lest Check");
        System.out.println( "chinemerem Salary: $" + philipSalary);
        System.out.println( "philip Salary: $" + chinemeremSalary );
        System.out.println( "The highest Salary is: $" + highestSalary);

        double carPrice = 1000.00;
        double truckPrice = 2000;

        double lowestPrice = Math.min( carPrice, truckPrice);

        System.out.println("      Next! ");
        System.out.println("Car Price: $ " + carPrice);
        System.out.println("Truck Price: $ " + truckPrice);
        System.out.println( "The lowest price is: $ " + lowestPrice);


        double randomNumber = Math.random();

        System.out.println( "    Random Number" );

        System.out.println("""
                Random number between 0 and 1: """ + randomNumber);




        System.out.println("Any more Question");
    }
}