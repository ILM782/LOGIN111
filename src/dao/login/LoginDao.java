/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.login;

import java.util.List;
import modelo.login.Login;

/**
 *
 * @author fede_
 */
public interface LoginDao {

    List<Login> getAll();

    Login get(Long id);

    Login get(String nombreDeUsuario);

    void save(Login item);

    void update(Login item);

    void delete(Login item);

}
