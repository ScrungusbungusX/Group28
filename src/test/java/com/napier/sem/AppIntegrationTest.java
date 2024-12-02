package com.napier.sem;

import com.sun.jdi.connect.spi.Connection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;
    static Connection con;

    @BeforeAll
    static void init()
    {
        app = new App();
        try {
            con = (Connection) DriverManager.getConnection("jdbc.mysql://db:3306/world?useSSL=false", "root", "example");
        } catch (SQLException e){
            e.printStackTrace();
        }
        app.connect("localhost:33060", 30000);

    }

    @Test
    void testGetCity()
    {
        try {
            Connection con = (Connection) app.getCon();

            City city = (City) app.cityByPopulation((java.sql.Connection) con);
            assertEquals(City.id, 7000);
            assertEquals(City.name, "test");
            assertEquals(City.countryCode, "PPP");
            assertEquals(City.district, "Insert epic name");
            assertEquals(City.population, 200000);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Integration test failed");
        }
    }
}