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

    public String getNombre() {
        return Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public int getNumero() {
        return Numero;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public String getProvincia() {
        return Provincia;
    }

    public int getTelefonos() {
        return Telefonos;
    }

	

    
}
