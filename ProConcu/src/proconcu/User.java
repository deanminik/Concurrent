/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proconcu;

/**
 *
 * @author DeanBF
 */
public abstract class User {
         //atributos
    private String type;
    private String name;
    private String email;
    private String comment;
    private String service;
//constructor
    public User(String type, String name, String email, String comment, String service) {
        this.type = type;
        this.name = name;
        this.email = email;
        this.comment = comment;
        this.service = service;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    /*tenemos que completar estos metodos en las clases hijas */
    public abstract void AGREGARNOMBRE();
    
    public abstract String AGREGARNOMBRE2();
    
    @Override
    public String toString() {
        return "User{" + "type=" + type + ", name=" + name + ", email=" + email + ", comment=" + comment + ", service=" + service + '}';
    }

   
}


