/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.login.Login;

/**
 *
 * @author fede_
 */
public class LoginControlador {
     public static int addUsuarios(Login usuarios) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
                Connection connection;
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/logindb", "root", "1234");
                
                String query = "INSERT INTO USUARIOS VALUES ('" + usuarios.getId() + "' , '" + usuarios.getNombre() + "', '" + usuarios.getContraseña() + "', '" + usuarios.getNombreDeUsuario() + "', '" + usuarios.getApellido() + "')";
    Statement stm = connection.createStatement();
    
    
    int executeUpdate = stm.executeUpdate(query);
    return executeUpdate;
    
    }
}

