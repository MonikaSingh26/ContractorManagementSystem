package LoginandRegister;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author roneetmichael
 */
public class DBConnection {
    
    public static Connection getConnection() 
    {  
         Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
               System.out.println("loaded");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contractor","root","monika.26");
              System.out.println("connected");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
     
      return con; 
    }
    public static void main(String[] args) {
        
        Connection con = DBConnection.getConnection();
        System.out.println("DB Connected successfully !!");
        
         
    }
}