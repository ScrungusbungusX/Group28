package com.napier.sem;

import java.sql.ResultSet;

/**
 * Represents an employee
 */
public class City
{
    /**
     * City ID
     */
    public Integer id;

    /**
     * City name
     */
    public String name;

    /**
     * Country code belonging to city
     */
    public String countryCode;

    /**
     * District city is located in
     */
    public String district;

    /**
     * City population
     */
    public Integer population;



    public void displayCities(ResultSet resultSet) {
        try {
            if (resultSet == null) {
                System.out.println("ResultSet is null.");
                return;
            }
            // Iterate through the ResultSet and print country details
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String countryCode = resultSet.getString("countryCode");
                String district = resultSet.getString("district");
                int population = resultSet.getInt("population");

                System.out.println("Name: " + name + " Country Code: " + countryCode + " district: " + district +
                        " population: " + population + "\n");
            }
        } catch (Exception e) {
            System.out.println("Failed to display city details");
        } finally {
            if (resultSet != null) {

            }
        }
    }
}