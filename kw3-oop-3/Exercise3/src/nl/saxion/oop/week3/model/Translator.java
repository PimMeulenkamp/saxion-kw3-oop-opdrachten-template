package nl.saxion.oop.week3.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Translator {
    private String language;
    private String currency;
    private double conversionRate;
    private String timeFormat;

    public Translator(String language, String timeFormat, String currency, double conversionRate) {
        this.language = language;
        this.timeFormat = timeFormat;
        this.currency = currency;
        this.conversionRate = conversionRate;
    }

    public String getGreeting() {
        return "";
    }

    public String getExplanation() {
        return "";
    }

    public String getLanguage() {
        return language;
    }

    public String getTimeInFormat() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(timeFormat));
    }

    public String getCurrency() {
        return currency;
    }

    public double convertFromEuro(int nrOfEuro) {
        return nrOfEuro * conversionRate;
    }
}
