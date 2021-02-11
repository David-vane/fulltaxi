/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author JOSTIN
 */
public class Conexion {
    Connection con;
    public static final String URL = "jdbc:mysql://localhost:3306/taxi?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "12345";
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Connection getConnection(){
        
        return con;
    }
}
