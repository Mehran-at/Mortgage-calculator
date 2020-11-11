package com.learning;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private final MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgageCalculator() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        Main.logger.info("");
        Main.logger.info("MORTGAGE APP");
        Main.logger.info("------------");
        Main.logger.info("Monthly Payments: " + mortgageFormatted);
    }
//    private MortgageBalanceCalculator calculateBalance;
//    public MortgageReport(MortgageBalanceCalculator calculateBalance) {
//        this.calculateBalance = calculateBalance;
//        currency = NumberFormat.getCurrencyInstance();
//    }
//    public void printMortgageBalanceCalculator() {
//        logger.info("");
//        logger.info("PAYMENT SCHEDULE");
//        logger.info("----------------");
//        for (double balance : calculateBalance.getRemainingBalances())
//            logger.info(currency.format(balance));
//    }

}
