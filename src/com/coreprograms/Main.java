package com.coreprograms;

import java.util.Scanner;

import static com.coreprograms.CoreAndFunctional.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Core And Functional Programs");
        System.out.println("Please Enter Your Choice ");
        System.out.println("1.CoinFlip Programme \n 2.Even Or Odd Programme \n 3.Largest Number programme" +
                "\n 4.Leap Year Programme \n 5.Power OF Two Programme \n 6.Prime Factor Programme " +
                "\n 7.Quotient And Reminder Programme" );

        Scanner scanner = new Scanner(System.in);
        int option =scanner.nextInt();

        switch (option) {
            case 1:
                coinFlip();
                break;
            case 2:
                evenOrOdd();
                break;
            case 3:
                largestNumber();
                break;
            case 4:
                leapYear();
            case 5:
                powerOfTwo();
            case 6:
                primeFactors();
            case 7:
                quotientAndReminder();
            default:
                System.out.println("Please Enter Correct option");
        }
    }
}
