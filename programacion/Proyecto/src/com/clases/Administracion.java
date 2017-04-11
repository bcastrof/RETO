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
public class Administracion extends Trabajador  {

   private List<Parte>parte=new ArrayList<>();
    
    
    
    
    public Administracion() {
    }

    public Administracion(int id, String dni, String nombre, String primerApellido, String segundoApellido, String categoria, String calle, int numero, int piso, String mano, String ciudad, int codigoPostal, String provincia, int movilEmpresa, int movilPersonal, double salario, String fechaNacimiento) {
        super(id, dni, nombre, primerApellido, segundoApellido, categoria, calle, numero, piso, mano, ciudad, codigoPostal, provincia, movilEmpresa, movilPersonal, salario, fechaNacimiento);
    }
   
    
    public void enviarAviso() {
		// TODO - implement Administracion.enviarAviso
		throw new UnsupportedOperationException();
	}

	public void gestionParte() {
		// TODO - implement Administracion.gestionParte
		throw new UnsupportedOperationException();
	}

	public void gestionVehiculo() {
		// TODO - implement Administracion.gestionVehiculo
		throw new UnsupportedOperationException();
	}

	public void gestionCentros() {
		// TODO - implement Administracion.gestionCentros
		throw new UnsupportedOperationException();
	}

	public void gestionarTrabajadores() {
		// TODO - implement Administracion.gestionarTrabajadores
		throw new UnsupportedOperationException();
	}
    
}
