
package com.institucionlistaestudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionDB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/prueba3";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection conectar(){
        try {
            JOptionPane.showMessageDialog(null, "Base de datos conectada con exito");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException ex){
            System.out.println("no se pudo realizar la conexion");
            return null;
        }
    }
}
