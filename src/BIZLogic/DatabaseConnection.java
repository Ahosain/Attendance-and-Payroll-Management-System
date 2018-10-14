/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BIZLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Anwar Hosain
 */
public class DatabaseConnection {
    
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String url = "jdbc:mysql://localhost:3306/teacherattendance";
    final static String user = "root";
    final static String pass = "";

    public static Connection connection(){
        
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null,"Database connect");
            return conn;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,"Didn't Connect");
            return null;
        }
    }
    
}
