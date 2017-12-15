/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.login;

/**
 *
 * @author Ruben
 */
public class ServicioAdminImpl implements ServicioAdmin {

    @Override
    public Boolean ValidarAdmin(String txtUsuario, String txtContraseña) {
        if (txtUsuario.equals("fede") && txtContraseña.equals("123")) {
            //ViewManager.changeViem(new ViewManager());
            return true;
        } else {
           
            return false;
        }

    }
}



