package com.pluralsight;
import java.util.Scanner;
import static java.lang.Math.pow;

public class MortgageCalculator {
    public static void main(String[] args) {
        int calculatorOption;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select which calculator to use: \n" +
                "1. Mortgage Calculator \n" +
                "2. Future Value \n" +
                "3. Present Value \n");
        calculatorOption = scanner.nextInt();

//        Calculator 1: A mortgage calculator
        if  (calculatorOption == 1) {
            Calculator1();
        }
//        Calculator 2: A calculator that determines the future value of a one-time deposit assuming compound interest
        else if (calculatorOption == 2) {
            Calculator2();
        }
//        Calculator 3: A calculator that determines the present value of an ordinary annuity
        else if (calculatorOption == 3) {
            Calculator3();
        }
        else{
            System.out.println("Invalid option");
        }
    }

    public static void Calculator3() {
        double monthlyPayout;
        double yearlyInterestRate;
        int years;
        double presentValue;
        Scanner scanner = new Scanner(System.in);

//        a. It would accept the monthly payout, expected interest rate, and years to pay out from the user
        System.out.print("Enter deposit: ");
        monthlyPayout = scanner.nextDouble();
        System.out.print("Enter interest rate (e.g 2.5): ");
        yearlyInterestRate = scanner.nextDouble();
        System.out.print("Enter loan length years: ");
        years = scanner.nextInt();

        double monthlyInterestRate = (yearlyInterestRate / 100) / 12; // convert % to decimals and dividing yearly interest to monthly
        int months = years * 12; // finding the total months in given years

//        PV = deposit × [1 - (1 + r)^(-n)] / r
//            •	PV (annuity) = present value of the annuity
//            •	deposit (monthlyPayout) = monthly payout
//            •	r (monthlyInterestRate) = monthly interest rate
//            •	n (months) = total number of monthly payments
        presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -months)) / monthlyInterestRate;

//         b. It would display the present value of that annuity
        // %,.2f formats number to 2 decimal places and adds comma (e.g 36,115.99)
        // %n at the end for newline but same as \n
        System.out.printf("\nFunds required for annuity that pays $%,.2f monthly for %d years is: $%,.2f%n", monthlyPayout, years, presentValue);
    }

    public static void Calculator2() {
//        a. It would accept the deposit, interest rate, and number of years from the user
        double deposit;
        double yearlyInterestRate;
        int years;
        double totalCompoundAmount;
        double totalInterestEarned;
        Scanner scanner = new Scanner(System.in);
//        Example: If you deposit $1,000 in a CD that earns 1.75% interest and matures in 5 years, your CD's ending balance will be $ 1,091.44 and you would have earned $91.44 in interest

        System.out.print("Enter deposit: ");
        deposit = scanner.nextDouble();
        System.out.print("Enter interest rate (e.g 1.75): ");
        yearlyInterestRate = scanner.nextDouble();
        System.out.print("Enter loan length years: ");
        years = scanner.nextInt();

        double dailyInterestRate = (yearlyInterestRate / 100) / 365; // convert % to decimals and dividing yearly interest to daily
        int months = years * 365; // finding the total days in given years

//        FV = P × (1 + (r / 365))^(365 × t)
        totalCompoundAmount = deposit * Math.pow((1 + dailyInterestRate), (months));
        totalInterestEarned = totalCompoundAmount - deposit;
//        b. It would display the future value and the total interest earned
        // %,.2f formats number to 2 decimal places and adds comma (e.g 36,115.99)
        // %n at the end for newline but same as \n
        System.out.printf("\nTotal compound amount: $%,.2f%n", totalCompoundAmount);
        System.out.printf("Interest rate yearly: $%,.2f%n", totalInterestEarned);
    }

    public static void Calculator1() {
        double principal;
        double yearlyInterestRate;
        int loanTerm;
        double monthlyPayment;
        double totalInterestPayment;
        Scanner scanner = new Scanner(System.in);

//        a. It would accept the principal, interest rate, and loan length from the user
        System.out.print("Enter principal: ");
        principal = scanner.nextDouble();
        System.out.print("Enter interest rate (e.g 7.625): ");
        yearlyInterestRate = scanner.nextDouble();
        System.out.print("Enter loan length years: ");
        loanTerm = scanner.nextInt();

//        Example: A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment with a total interest of $36,115.99
//	      i (intrestRatePercentage) = 7.625 / 12 = 0.07625
//	      i (intrestRate) = 0.07625 / 12 = 0.0063541667
//	      n (12 months * 15 years) = 15 * 12 = 180
        double monthlyInterestRate = (yearlyInterestRate / 100) / 12; // convert % to decimals and dividing yearly interest to monthly
        double monthlyLoanTerm = loanTerm * 12; // finding the total months in given years

//        formula: M = P * [ i(1 + i)^n ] / [ (1 + i)^n - 1 ]
        monthlyPayment = principal * (monthlyInterestRate * pow((1 + monthlyInterestRate), monthlyLoanTerm))/ (pow((1 + monthlyInterestRate), monthlyLoanTerm) - 1);
        totalInterestPayment = (monthlyPayment * monthlyLoanTerm) - principal;

//        b. It would display the expected monthly payment and total interest paid
        // %,.2f formats number to 2 decimal places and adds comma (e.g. 36,115.99). %n at the end for newline but same as \n
        System.out.printf("\nMonthly interest payment is: $%,.2f%n" , monthlyPayment);
        System.out.printf("Total interest is: $%,.2f%n" , totalInterestPayment);
    }
}