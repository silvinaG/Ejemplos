/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Federico
 */
@Named(value = "loginBean1")
@SessionScoped
public class LoginBean1 implements Serializable {

    private String user;
    private String clave;
    /**
     * Creates a new instance of LoginBean1
     */
    public LoginBean1() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
        
    }
    
    
}
