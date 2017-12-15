/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.login;

import java.util.List;
import modelo.login.Login;

/**
 *
 * @author fede_
 */
public interface ServicioUsuario {

    Boolean ValidarUsuario(String txtUsuario, String txtContraseña);

    Boolean Iniciar(String usuario, String password);

    List<Login> getAll();

    Login get(Long id);

    void save(Login item);

    void update(Login item);

    void delete(Login item);

}
