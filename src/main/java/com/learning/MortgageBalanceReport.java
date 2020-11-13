package com.learning;

import java.text.NumberFormat;

public class MortgageBalanceReport {

    private final NumberFormat currency;
    private CanBalance canBalance;

    public MortgageBalanceReport(CanBalance canBalance) {
        this.canBalance = canBalance;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgageBalanceCalculator() {
        Main.logger.info("");
        Main.logger.info("PAYMENT SCHEDULE");
        Main.logger.info("----------------");
        for (double balance : canBalance.getRemainingBalances())
            Main.logger.info(currency.format(balance));
    }
}
