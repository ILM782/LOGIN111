/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.login;

import dao.login.LoginDao;
import dao.login.LoginDaoImpl;
import java.util.List;
import modelo.login.Login;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author fede_
 */
public class ServicioUsuarioImpl implements ServicioUsuario {

    private final LoginDao loginDao;
  

    public ServicioUsuarioImpl() {
        loginDao =    new LoginDaoImpl();
      
    }

    
    @Override
    public Boolean ValidarUsuario(String txtUsuario, String txtContraseña) {
        String hashed = BCrypt.hashpw ("123", BCrypt.gensalt (12));
        // validar contraseña con BCript //
        if (txtUsuario.equals("usuario") && (BCrypt.checkpw (txtContraseña, hashed))) {
            //ViewManager.changeViem(new ViewManager());
            return true;
        } else {
           
            return false;
        }

    }
    

    @Override
    public List<Login> getAll() {
        return loginDao.getAll();
    }

    @Override
    public Login get(Long id) {
        return loginDao.get(id);
    }

    @Override
    public void save(Login item) {

        loginDao.save(item);
    }

    @Override
    public void update(Login item) {

        loginDao.update(item);
    }

    @Override
    public void delete(Login item) {
        loginDao.delete(item);
    }
    @Override
    public Boolean Iniciar(String usuario,String password) {
        Login login = loginDao.get(usuario);
        if(login != null && BCrypt.checkpw(password, login.getContraseña())){
        return true;
    }else{
            return false;
        }
           
}
}