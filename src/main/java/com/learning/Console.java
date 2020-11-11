package com.learning;


public class Console {

    private Console() {
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            Main.logger.info(prompt);
            value = Main.scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            Main.logger.info("Enter a value between " + min + " and " + max);
        }

        return value;
    }

}
