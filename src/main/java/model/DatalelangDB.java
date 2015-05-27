/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.koneksi;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.sql.DataSource;

/**
 *
 * @author sonjaya
 */

@ManagedBean(name="datalelang")
@SessionScoped

public class DatalelangDB implements Serializable{
    
    private DataSource ds;
    
    public List<Datalelang> getTampilData() throws SQLException{
 
//		if(ds==null)
//			throw new SQLException("Can't get data source");
 
		//get database connection
		Connection con = koneksi.getConnection();
// 
//		if(con==null)
//			throw new SQLException("Can't get database connection");
 
		PreparedStatement ps 
			= con.prepareStatement(
			   "SELECT * FROM lelang"); 
 
		//get customer data from database
		ResultSet result =  ps.executeQuery();
 
		List<Datalelang> list = new ArrayList<>();
 
		while(result.next()){
			Datalelang dl = new Datal
 
			dl.setId_lelang(result.getInt("id_lelang"));
                        dl.setNamaToko(result.getString("namatoko"));
                        dl.setPengaju(result.getString("pengaju"));
                        dl.setJumlahAJuan(result.getInt("jumlahajuan"));
                        dl.setDeskripsi(result.getString("deskripsi"));
 
			//store all data into a List
			list.add(dl);
		}
 
		return list;
	}
    
    
        public List<Datalelang> getTampilDataById(int id) throws SQLException{
 
//		if(ds==null)
//			throw new SQLException("Can't get data source");
 
		//get database connection
		Connection con = koneksi.getConnection();
// 
//		if(con==null)
//			throw new SQLException("Can't get database connection");
 
		PreparedStatement ps 
			= con.prepareStatement(
			   "SELECT * FROM lelang WHERE id_lelang ="+id); 
 
		//get customer data from database
		ResultSet result =  ps.executeQuery();
 
		List<Datalelang> list = new ArrayList<>();
 
		while(result.next()){
			Datalelang dl = new Datalelang();
 
			
                        dl.setNamaToko(result.getString("namatoko"));
                        dl.setPengaju(result.getString("pengaju"));
                        dl.setJumlahAJuan(result.getInt("jumlahajuan"));
                        dl.setDeskripsi(result.getString("deskripsi"));
 
			//store all data into a List
			list.add(dl);
		}
 
		return list;
	}
    

    
}
