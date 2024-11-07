package com.napier.sem;

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
        * Gross National Proudct (GNP) of country
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
}
