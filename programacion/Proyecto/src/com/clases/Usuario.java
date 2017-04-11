/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

/**
 *
 * @author 7fprog03
 */
public class Usuario {
    
    private int idUsuario;
    private String password;
    
    //asosciacion con trabajador
    private Trabajador trabajador;

    public Usuario() {
    }

    public Usuario(int idUsuario, String password) {
        this.idUsuario = idUsuario;
        this.password = password;
    }
    
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
