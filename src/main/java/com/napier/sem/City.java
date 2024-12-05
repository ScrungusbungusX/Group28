package com.napier.sem;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Represents an employee
 */
public class City
{
    /**
     * City ID
     */
    public static Integer id;

    /**
     * City name
     */
    public static String name;

    /**
     * Country code belonging to city
     */
    public static String countryCode;

    /**
     * District city is located in
     */
    public static String district;

    /**
     * City population
     */
    public static Integer population;

    public void displayCities(ResultSet resultSet) {
        try {
            if (resultSet == null) {
                System.out.println("ResultSet is null.");
                return;
            }
            // Iterate through the ResultSet and print city details
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String countryCode = resultSet.getString("countryCode");
                String district = resultSet.getString("district");
                int population = resultSet.getInt("population");
                // there must be a population, getObject not required

                System.out.println("ID: " + id + " Name: " + name + " Country Code: " + countryCode + " District: " + district +
                        " Population: " + population + "\n");
            }
        } catch (Exception e) {
            System.out.println("Failed to display city details");
        } finally {
            try{
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}