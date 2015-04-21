/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sonjaya
 */
public class UserDAO {
        
     public static boolean login(String user, String password) {
        Connection con = null;
        PreparedStatement ps;
        try {
            con = koneksi.getConnection();
            ps = con.prepareStatement(
                    "select \"user\", pass from userinfo where \"user\"= ? and \"pass\"= ? ");
            ps.setString(1, user);
            ps.setString(2, password);
  
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                System.out.println(rs.getString("user"));
                return true;
            }
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error in login() -->" + ex.getMessage());
            return false;
        } finally {
            koneksi.close(con);
        }
    }
}

