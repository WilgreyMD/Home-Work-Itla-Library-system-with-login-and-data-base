
package com.logica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection cn;
    
    public Conexion(){
        
    }
    
    public Connection Conectar() throws SQLException, ClassNotFoundException{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libros","root","1234");
        
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error En la conexion");
        }
        return cn;
    }
    
}
