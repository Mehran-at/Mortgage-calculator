package com.learning;

public class MortgageCalculator {
    private final int loanAmount;
    private final float annualInterestRate;
    private final byte years;

    public MortgageCalculator(int loanAmount, float annualInterestRate, byte years) {
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public Double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        float numberOfPayments = getNumberOfPayments();

        return loanAmount
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate /  Main.PERCENT / Main.MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * Main.MONTHS_IN_YEAR;
    }

}
