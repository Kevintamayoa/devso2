/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Classes.Account;
import Classes.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ConGet extends Conexion {
      public List<User> GetUsers(Connection con){
        String sql = "SELECT * FROM user WHERE type_id<>0 ;";
         List<User> list = new ArrayList<User>();
  
        try{
       
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int Id = rs.getInt(1);
                String Name = rs.getString(2);
                String Lname = rs.getString(3);         
                String Password = rs.getString(4);
                int UserType = rs.getInt(5);
                list.add(new User(Id, Name,Lname, Password, UserType));
            }
        } catch (SQLException ex) {
            //   Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<Account> GetAccounts(Connection con) throws SQLException {
        String sql = "SELECT A.id,A.description,A.type_id,A.inicial,B.description "
                + "FROM account A INNER JOIN account_type B ON(B.id=A.type_id) order by A.description asc;";
        List<Account> list = new ArrayList<Account>();
  
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int Id = rs.getInt(1);
                String Description = rs.getString(2);
                int AccountsType = rs.getInt(3);
                double Ppt = rs.getDouble(4);
                String categoria = rs.getString(5);
                list.add(new Account(Id, Description, AccountsType, Ppt,categoria));
            }

        return list;
    }
     
}
