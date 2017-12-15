/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import vistas.login.IniciarSesion;

/**
 *
 * @author fede_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ViewManager.setVisible(new IniciarSesion());
        
    }

}
