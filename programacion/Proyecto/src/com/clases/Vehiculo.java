/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author 7fprog03
 */
public class Vehiculo {

    private BigDecimal idVehiculo;
    private String matricula;
    private String marca;
    private String modelo;
    
    //asociacion con parte
    private Parte parte;
    //asociacion con administracion
    //private Administracion administracion; 

    public Vehiculo() {
    }

    public Vehiculo(BigDecimal idVehiculo, String matricula, String marca, String modelo) {
        this.idVehiculo = idVehiculo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public BigDecimal getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(BigDecimal idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //26/04 Miriam FUNCIONA!!!!
    public static List<Vehiculo> listarVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Conexion.conectar();

        try {

            CallableStatement cs = Conexion.getConexion().prepareCall("{call pvehiculos.listarVehiculos(?)}");

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();

            ResultSet rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {
                Vehiculo v = new Vehiculo();

                v.setIdVehiculo(rs.getBigDecimal("id"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("modelo"));
                v.setMatricula(rs.getString("matricula"));
                vehiculos.add(v);
                System.out.println(v);
            }
            rs.close();
            Conexion.desconectar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede efectuar la conexión, hable con el administrador del sistema" + ex.getMessage());
        }
        return vehiculos;
    }


    public static Vehiculo filtrarvehiculo(String matricula) {
        Vehiculo v;

        Conexion.conectar();
        String sql = "call pvehiculos.filtrarVehiculo(?,?,?,?,?)";

        try {
            CallableStatement cs = Conexion.getConexion().prepareCall(sql);
            cs.setString(1, matricula);
            cs.registerOutParameter(2, OracleTypes.INTEGER);
            cs.registerOutParameter(3, OracleTypes.VARCHAR);
            cs.registerOutParameter(4, OracleTypes.VARCHAR);
            cs.registerOutParameter(5, OracleTypes.VARCHAR);
            cs.execute();
            v = new Vehiculo (cs.getBigDecimal(2),cs.getString(3),cs.getString(4),cs.getString(5));
            
            cs.close();
            Conexion.desconectar();
           return v;
        } catch (SQLException ex) {
                 //JOptionPane.showMessageDialog(null, "No se han encontrado vehiculos" + ex.getMessage());
            return null;
        }

    }
    
    public boolean modificarVehiculo(BigDecimal idv){
        Conexion.conectar();
        String sql = "update vehiculos set marca=?, modelo=?, matricula=? where id=?";
        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setString(3, matricula);
            ps.setBigDecimal(4, idv);
            ps.executeUpdate();
            ps.close();
            Conexion.desconectar();
            return true;
        } catch (SQLException ex) {
       
        }
        
        
        
        return false;
    }
    
}
