package com.napier.sem;

public class CountryLanguage {

    /**
     * Code of country where language is spoken (foreign key)
     */
    public String countryCode;

    /**
     * Name of language
     */
    public String language;

    /**
     * Indicates if the language is official (T true or F false)
     */
    public String isOfficial;

    /**
     * Percentage of population speaking language
     */
    public Double percentage;
}
