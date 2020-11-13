package com.learning;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private CanCalculate canCalculate;

    public MortgageReport(CanCalculate canCalculate) {
        this.canCalculate = canCalculate;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgageCalculator() {
        double mortgage = canCalculate.calculateMortgage();
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
