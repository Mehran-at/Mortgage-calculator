package com.learning;

public class MortgageBalanceCalculator {
    private final int loanAmount;
    private final float annualInterestRate;
    private final byte years;

    public MortgageBalanceCalculator(int loanAmount, float annualInterestRate, byte years) {
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterestRate = getMonthlyInterestRate();
        float numberOfPayments = getNumberOfPayments();

        return loanAmount
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments)
                - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        double[] payments = new double[getNumberOfPayments()];
        for (short month = 1; month <= payments.length; month++)
            payments[month - 1] = calculateBalance(month);

        return payments;
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / Main.MONTHS_IN_YEAR / Main.PERCENT;
    }

    private int getNumberOfPayments() {
        return years * Main.MONTHS_IN_YEAR;
    }

}
