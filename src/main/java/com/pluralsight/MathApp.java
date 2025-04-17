package com.pluralsight;


public class MathApp {
    public static void main(String[] args) {
        //variables
         double bobSalary = 2500.00;
        double garySalary = 5000.00;
         double carPrice = 1000.00;
        double truckPrice = 2000;

         // To find the highest Salary
        double highestSalary = Math.max(bobSalary,garySalary); //Code solution
        System.out.println("The highest salary is:" + highestSalary); // Output
        System.out.println(); // to jump a new line before the next question

        //To find the smallest value
        double lowestValue = Math.min(carPrice, truckPrice); //Code solution
        System.out.println("The lowestValue is:" + lowestValue); //output

        // To generate a random number between 0 and 1
        double randomNumber = Math.random(); // code Solution
        System.out.println( "Random Number \nRandom number between 0 and 1: " + randomNumber);


    }


}
