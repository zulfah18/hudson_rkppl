/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import org.postgresql.Driver;

public class koneksi {
    
  
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/srm",
                    "postgres", "zulfah");
            
            return con;
            
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
           
            return null;
            
        }
    }
 
    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
    
   
    
   
}
