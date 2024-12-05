package com.napier.sem;

import java.sql.*;

import lombok.Getter;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class App
{
    public static void main(String[] args) {
        App coursework = new App();

        City d = new City();
        Country b = new Country();

        if (args.length < 1) {
            coursework.connect("localhost:33060", 10000);
            // tries to run on localhost, if that fails it attempts to login remotely
        } else {
            coursework.connect(args[0], Integer.parseInt(args[1]));
        }

        ResultSet city = coursework.cityByPopulation(coursework.getCon());
        d.displayCities(city);

        // runs the sql query statement then the respective display class in country/city.java

        ResultSet country = coursework.countryByPopulation(coursework.getCon());
        b.displayCountries(country);

        ResultSet cityContinent = coursework.cityByContinent(coursework.getCon());

        // Disconnect from database
        coursework.disconnect();
    }

    @Getter
    private Connection con = null;

    /*
     * Connect to the MySQL database.
     */

    public void connect(String location, int delay) {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        boolean shouldWait = false;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                if (shouldWait) {
                    // Wait a bit for db to start
                    Thread.sleep(delay);
                }

                // Connect to database
                // storing the login in plain text rad
                con = DriverManager.getConnection("jdbc:mysql://" + location
                                + "/world?allowPublicKeyRetrieval=true&useSSL=false",
                        "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());

                // loops for x number of retries

                // Let's wait before attempting to reconnect
                shouldWait = true;
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }
        /*
         * Disconnect from the MySQL database.
         */
        public void disconnect()
        {
            if (con != null)
            {
                try
                {
                    // Close connection
                    con.close();
                }
                catch (Exception e)
                {
                    System.out.println("Error closing connection to database");
                }
            }
        }

    public ResultSet countryByPopulation(Connection con)
    {
        try
        {
            ArrayList<Country> countries = new ArrayList<>();
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM country "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return if querying countries in the world is valid.
            // Check one is returned

            return rset;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get cities in countries details");
            return null;
        }
    }

    public ResultSet cityByContinent(Connection con)
    {
        try
        {
            ArrayList<Country> countries = new ArrayList<>();
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.* "
                            + "FROM city, "
                            + "    (SELECT * "
                            + "     FROM country "
                            + "     WHERE Continent = 'Asia') as q1 "
                            + "WHERE city.CountryCode = q1.code "
                            + "ORDER BY city.Population DESC";
            // would probably take in continent as user input but this works too
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return if cities in continent is valid.
            // Check one is returned

            return rset;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get cities in continents details");
            return null;
        }
    }

    public ResultSet cityByPopulation(Connection con)
    {
        try
        {
            ArrayList<City> cities = new ArrayList<>();
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM city "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return if query cities in the world is valid.
            // Check one is returned

            return rset;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
            return null;
        }
    }
}