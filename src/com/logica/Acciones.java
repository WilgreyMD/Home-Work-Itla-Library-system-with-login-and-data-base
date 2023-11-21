
package com.logica;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Acciones {
    Conexion cn = new Conexion();
    
    public Acciones(){
        
    }
    
    private  boolean validarExistencia(String nombre,String apellido) throws SQLException, ClassNotFoundException{
        Connection ConexionValidar = cn.Conectar();
        try(PreparedStatement accionEnLaBase = ConexionValidar.prepareStatement("Select COUNT(*) FROM usuarios where nombre= ? and apellido = ?")){
            accionEnLaBase.setString(1, nombre);
            accionEnLaBase.setString(2, apellido);
            accionEnLaBase.execute();   
            try(ResultSet resultado = accionEnLaBase.executeQuery()){ 
                if(resultado.next() && resultado.getInt(1)>0){
                    return true;
                }  
            }
        }
        return false;   
    }
    
    public boolean compararCredenciales(String nombre, String Apellido,String pass) throws SQLException, ClassNotFoundException{
        
        Connection conexionValidar = cn.Conectar();
        
        try (PreparedStatement hacerConsulta = conexionValidar.prepareStatement("select Pass from usuarios where Nombre = ? and Apellido = ?;")){
            hacerConsulta.setString(1, nombre);
            hacerConsulta.setString(2, Apellido);
           
            try (ResultSet resultadoDeConsulta = hacerConsulta.executeQuery()){
                
                if(resultadoDeConsulta.next()){
                    
                    String almacenarPass = resultadoDeConsulta.getString("Pass");
                    
                    if(!pass.equals(almacenarPass)){
                       
                        JOptionPane.showMessageDialog(null, "La Contraseña es incorrecta...");
                        
                        return false;
                    }
                    return true;
                }
                
            }
        }
        
        return false;
    }
    
    
    public void agregarUs(String nombre,String apellido,String pass) throws SQLException, ClassNotFoundException{
        Connection cnA = (Connection) cn.Conectar();
        
        if(validarExistencia(nombre.toLowerCase(), apellido.toLowerCase())){
            JOptionPane.showMessageDialog(null, "Prueba con otro Nombre o Apellido");
            return;
        }
        
        try (CallableStatement agregar = cnA.prepareCall("{call AgregarUsuario(?,?,?)}")){
            agregar.setString(1, nombre.toLowerCase());
            agregar.setString(2, apellido.toLowerCase());
            agregar.setString(3, pass);
            agregar.execute();
            JOptionPane.showMessageDialog(null, "Usuario creado\nSe bienvenido "+nombre);
            
        }        
    }
    
}
