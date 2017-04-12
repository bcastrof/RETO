/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author 7fprog03
 */
public class Administracion extends Trabajador  {

      //asociacion con parte para poder validarlo
     //private List<Parte>parte=new ArrayList<>();
   
    //asociacion con vehiculo para hacer operaciones CRUD
   // private List<Vehiculo>vehiculo = new ArrayList<>();
   
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


        public void gestionCentros(int id, String nombre, String calle,
                int numero,String ciudad,int codigoPostal,String provincia,
                int telefono) {
        Conexion.conectar();
        
        try {
            Statement smt=Conexion.getConexion().prepareStatement("INSERT INTO libros VALUES (?,?,?,?,?,?,?,?)");
          //  http://lineadecodigo.com/java/insertar-datos-con-jdbc/
            
        } catch (SQLException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
          
            Statement sentencia = Conexion.getConexion().createStatement();
           /* id=0;
            nombre=null;
            calle=null;
            numero=0;
            ciudad=null;
            codigoPostal=0;
            provincia=null;
            telefono=0;*/
            
            String sql="INSERT INTO centros VALUES ( "+id + " , '" + nombre + "', '"+ calle+ "', " + numero+ " , '" + ciudad+ "' , " + codigoPostal + ", " + provincia + " , " + telefono + ")";
            int filas = sentencia.executeUpdate(sql);
            sentencia.close();;
            Conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        }
           
	}

	public void gestionarTrabajadores() {
		// TODO - implement Administracion.gestionarTrabajadores
		throw new UnsupportedOperationException();
	}
    
}
