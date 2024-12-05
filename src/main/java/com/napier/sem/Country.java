package com.napier.sem;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Country {
        /**
         * Country code (primary key)
         */
        public static String code;

        /**
         * Country name
         */
        public static String name;

        /**
         * Continent country is located in
         */
        public static String continent;

        /**
         * Region within continent
         */
        public static String region;

        /**
         * Surface area of country (square kilometers)
         */
        public static Double surfaceArea;

        /**
         * Year of independence (if applicable)
         */
        public static Integer indepYear;

        /**
         * Country population
         */
        public static Integer population;

        /**
        * Life expectancy
        */
        public static Double lifeExpectancy;

        /**
        * Gross National Product (GNP) of country
        */
        public static Double gnp;

        /**
        * Old variant ^
        */
        public static Double gnpOld;

        /**
        * Local name of country
        */
        public static String localName;

        /**
        * Form of government
        */
        public static String governmentForm;

        /**
        * Head of state
        */
        public static String headOfState;

        /**
        * Capital city ID (foreign key links city table)
        */
        public static Integer capital;

        /**
        * Country 2 letter code
        */
        public static String code2;

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
                                int population = resultSet.getInt("population");
                                // getObject is required for fields that could return null
                                // signified by the capital letter variant
                                Integer capital = (Integer) resultSet.getObject("capital");
                                String code2 = resultSet.getString("code2");

                                System.out.println("Code: " + code + " Name: " + name + " Continent: " + continent +
                                        " Region: " + region +
                                        " Population: " + population +
                                        " Capital: " + capital + " Two Letter Code: " + code2 +"\n");
                        }
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Failed to display country details");
                }

        }
}
