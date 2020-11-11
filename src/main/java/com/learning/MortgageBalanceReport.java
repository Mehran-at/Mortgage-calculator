package com.learning;

import java.text.NumberFormat;

public class MortgageBalanceReport {

    private final NumberFormat currency;
    private final MortgageBalanceCalculator calculateBalance;

    public MortgageBalanceReport(MortgageBalanceCalculator calculateBalance) {
        this.calculateBalance = calculateBalance;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgageBalanceCalculator() {
        Main.logger.info("");
        Main.logger.info("PAYMENT SCHEDULE");
        Main.logger.info("----------------");
        for (double balance : calculateBalance.getRemainingBalances())
            Main.logger.info(currency.format(balance));
    }
}
