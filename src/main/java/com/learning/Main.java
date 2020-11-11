package com.learning;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static final Logger logger = Logger.getLogger(String.valueOf(Console.class));
    public static final Scanner scanner = new Scanner(System.in);

    public static final short MONTHS_IN_YEAR = 12;
    public static final byte PERCENT = 100;

    public static void main(String[] args) {

        int loanAmount = (int) Console.readNumber("Requested Loan Amount: ", 1000, 1000000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        MortgageCalculator inputData = new MortgageCalculator(loanAmount, annualInterestRate, years);
        MortgageReport mortgageReport = new MortgageReport(inputData);

        MortgageBalanceCalculator inputData2 = new MortgageBalanceCalculator(loanAmount, annualInterestRate, years);
        MortgageBalanceReport reportBalance = new MortgageBalanceReport(inputData2);

        mortgageReport.printMortgageCalculator();
        reportBalance.printMortgageBalanceCalculator();
    }

}
