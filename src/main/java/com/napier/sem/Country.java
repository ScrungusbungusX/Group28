package com.napier.sem;

import java.sql.ResultSet;

public class Country {
        /**
         * Country code (primary key)
         */
        public String code;

        /**
         * Country name
         */
        public String name;

        /**
         * Continent country is located in
         */
        public String continent;

        /**
         * Region within continent
         */
        public String region;

        /**
         * Surface area of country (square kilometers)
         */
        public Double surfaceArea;

        /**
         * Year of independence (if applicable)
         */
        public Integer indepYear;

        /**
         * Country population
         */
        public Integer population;

        /**
        * Life expectancy
        */
        public Float lifeExpectancy;

        /**
        * Gross National Product (GNP) of country
        */
        public Double gnp;

        /**
        * Old variant ^
        */
        public Double gnpOld;

        /**
        * Local name of country
        */
        public String localName;

        /**
        * Form of government
        */
        public String governmentForm;

        /**
        * Head of state
        */
        public String headOfState;

        /**
        * Capital city ID (foreign key links city table)
        */
        public Integer capital;

        /**
        * Country 2 letter code
        */
        public String code2;

        public void displayCountries(ResultSet resultSet) {
                try {
                        if (resultSet == null) {
                                System.out.println("ResultSet is null.");
                                return;
                        }
                        // Iterate through the ResultSet and print country details
                        while (resultSet.next()) {
                                String code = resultSet.getString("code");
                                String name = resultSet.getString("name");
                                String continent = resultSet.getString("continent");
                                String region = resultSet.getString("region");
                                Double surfaceArea = resultSet.getDouble("surfaceArea");
                                int indepYear = resultSet.getInt("indepYear");
                                int population = resultSet.getInt("population");
                                Float lifeExpectancy = resultSet.getFloat("lifeExpectancy");
                                Double gnp = resultSet.getDouble("gnp");
                                Double gnpOld = resultSet.getDouble("gnpOld");
                                String localName = resultSet.getString("localName");
                                String governmentForm = resultSet.getString("governmentForm");
                                String headOfState = resultSet.getString("headOfState");
                                int capital = resultSet.getInt("capital");
                                String code2 = resultSet.getString("code2");

                                System.out.println("Code: " + code + " Name: " + name + " Continent: " + continent +
                                        " Region: " + region + " Surface Area: " + surfaceArea +
                                        " Independence Year: " + indepYear + " Population: " + population +
                                        " Life Expectancy: " + lifeExpectancy + " GNP: " + gnp + " Old GNP: " + gnpOld +
                                        " Local Name: " + localName + " Government Form: " + governmentForm +
                                        " Head of State: " + headOfState + " Capital: " + capital + " Two Letter Code: " + code2 +"\n");
                        }
                } catch (Exception e) {
                        System.out.println("Failed to display city details");
                } finally {
                        if (resultSet != null) {

                        }
                }
        }
}
