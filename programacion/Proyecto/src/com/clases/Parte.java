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
public class Parte {
    
        private String fecha;
	private int kmInicial;
	private int kmFinal;
	private double gastoPeaje;
	private double gastoDietas;
	private double gastoCombustible;
	private double gastoVarios;
	private String incidencias;
	private String notasAdministrativas;
	private boolean estado;
        private boolean validado;
        
        //asociacion con aviso
        private Aviso aviso;
        //asosiacion con logistica
        private Logistica logistica;
        //asociacion con administracion
        private Administracion administracio;
        //asociciacion con vehiculos
        private List<Vehiculo>vehiculo = new ArrayList<>();
        //asociacion con viajes 
        private List<Viaje>viaje=new ArrayList<>();
        
           public Parte() {
    }

    public Parte(String fecha, int kmInicial, int kmFinal, double gastoPeaje, double gastoDietas, double gastoCombustible, double gastoVarios, String incidencias, String notasAdministrativas, boolean estado, boolean validado) {
        this.fecha = fecha;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.gastoPeaje = gastoPeaje;
        this.gastoDietas = gastoDietas;
        this.gastoCombustible = gastoCombustible;
        this.gastoVarios = gastoVarios;
        this.incidencias = incidencias;
        this.notasAdministrativas = notasAdministrativas;
        this.estado = estado;
        this.validado = validado;
    }

    public String getFecha() {
        return fecha;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public double getGastoPeaje() {
        return gastoPeaje;
    }

    public double getGastoDietas() {
        return gastoDietas;
    }

    public double getGastoCombustible() {
        return gastoCombustible;
    }

    public double getGastoVarios() {
        return gastoVarios;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public String getNotasAdministrativas() {
        return notasAdministrativas;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean isValidado() {
        return validado;
    }

   

    
}
