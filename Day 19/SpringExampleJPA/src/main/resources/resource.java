package org.acme;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;

import javax.annotation.Resource;
import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



@Path("/h2jdbc")
public class H2jdbcDemo {
    @Inject
    @DataSource("h2source")
    AgroalDataSource dataSource;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        Connection conn = null;
        Statement stmt = null;


        try {
            // STEP 1: Register JDBC driver


            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = dataSource.getConnection();

            //STEP 3: Execute a query

            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql= "DROP TABLE IF EXISTS QREGISTRATION";
            stmt.executeUpdate(sql);
            String sql1 ="CREATE TABLE   QREGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql1);
            System.out.println("Created table in given database...");
            String sql2 = "INSERT INTO QREGISTRATION " + "VALUES (120, 'Drax', 'Ali', 19)";
            System.out.println("Inserted data into QREGISTRATION table in given database...");
            stmt.executeUpdate(sql2);
            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
        System.out.println("Goodbye!");
        return "Executing queries...";
    }
}