/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 7fprog03
 */
public class Centro {
    
    private int IDCent;
	private String Nombre;
	private String Calle;
	private int Numero;
	private String Ciudad;
	private int CodigoPostal;
	private String Provincia;
	private int Telefonos;

        //asociacion con trabajadores
        private List <Trabajador> trabajador = new ArrayList<>();
        
    public Centro() {
    }

    public Centro(int IDCent, String Nombre, String Calle, int Numero, String Ciudad, int CodigoPostal, String Provincia, int Telefonos) {
        this.IDCent = IDCent;
        this.Nombre = Nombre;
        this.Calle = Calle;
        this.Numero = Numero;
        this.Ciudad = Ciudad;
        this.CodigoPostal = CodigoPostal;
        this.Provincia = Provincia;
        this.Telefonos = Telefonos;
    }

    public int getIDCent() {
        return IDCent;
    }

    public void setIDCent(int IDCent) {
        this.IDCent = IDCent;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public int getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(int Telefonos) {
        this.Telefonos = Telefonos;
    }

    @Override
    public String toString() {
        return "Centro{" + "IDCent=" + IDCent + 
                ", Nombre=" + Nombre + 
                ", Calle=" + Calle + 
                ", Numero=" + Numero + 
                ", Ciudad=" + Ciudad + 
                ", CodigoPostal=" + CodigoPostal + 
                ", Provincia=" + Provincia + 
                ", Telefonos=" + Telefonos + '}';
    }
        
    
}
