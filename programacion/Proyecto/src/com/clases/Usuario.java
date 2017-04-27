/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author 7fprog03
 */
public class Usuario {

    private String idUsuario;
    private String password;
    private BigDecimal idtrabajador;
    //asosciacion con trabajador
    private Trabajador trabajador;

    public Usuario() {
    }
   
    public Usuario(String idUsuario, String password) {
        this.idUsuario = idUsuario;
        this.password = password;
    }

    public String loguearse() {
        String cat = null;
        try {
            
            Conexion.conectar();
            CallableStatement cs = Conexion.getConexion().prepareCall("{call PLOGIN.VALIDACION(?,?,?,?,?,?)}");
            cs.setString(1, idUsuario);
            cs.setNString(2, password);
            cs.registerOutParameter(3, OracleTypes.VARCHAR);
            cs.registerOutParameter(4, OracleTypes.VARCHAR);
            cs.registerOutParameter(5, OracleTypes.INTEGER);
            cs.registerOutParameter(6, OracleTypes.CURSOR);
            cs.execute();
            String categoria = cs.getString(3);
            idUsuario = cs.getString(4);
            idtrabajador= cs.getBigDecimal(5);
           Usuario u = new Usuario(idUsuario, password);
            trabajador.setUsuario(u);
            
            ResultSet rs = (ResultSet) cs.getObject(6);
            while (rs.next()) {
                
                BigDecimal id = rs.getBigDecimal("ID");
                String dni = rs.getString("dni");
                String Nombre=(rs.getString("nombre"));
                String PrimerApellido=(rs.getString("primerApellido"));
                String SegundoApellido=(rs.getString("segundoApellido"));
                String Categoria=(rs.getString("categoria"));
                String Calle=(rs.getString("calle"));
                BigDecimal Numero=(rs.getBigDecimal("numero"));
                BigDecimal Piso=(rs.getBigDecimal("piso"));
                String Mano=(rs.getString("mano"));
                String Ciudad=(rs.getString("ciudad"));
                BigDecimal CodigoPostal=(rs.getBigDecimal("codigoPostal"));
                String Provincia=(rs.getString("provincia"));
                BigDecimal MovilEmpresa=(rs.getBigDecimal("movilEmpresa"));
                BigDecimal MovilPersonal=(rs.getBigDecimal("movilPersonal"));
                BigDecimal Salario=(rs.getBigDecimal("salario"));
                String FechaNacimiento=(rs.getString("fechaNacimiento"));
                BigDecimal IdCent=(rs.getBigDecimal("CENTROS_ID"));
                
                if (Categoria.equalsIgnoreCase("la que sea")){
                     trabajador  = new Trabajador(id, dni, Nombre, PrimerApellido, 
                SegundoApellido, Categoria, Calle, Numero, Piso, Mano, Ciudad, CodigoPostal, Provincia, MovilEmpresa, MovilPersonal, Salario, FechaNacimiento, IdCent);
               
                }else{
                     trabajador  = new Trabajador(id, dni, Nombre, PrimerApellido, 
                SegundoApellido, Categoria, Calle, Numero, Piso, Mano, Ciudad, CodigoPostal, Provincia, MovilEmpresa, MovilPersonal, Salario, FechaNacimiento, IdCent);
               
                }
               
               
            }
            

            if (categoria.equalsIgnoreCase("administracion")) {
                cat = categoria;
            }

            if (categoria.equalsIgnoreCase("logistica")) {
                cat = categoria;
            }
        System.out.println(idUsuario +" "+ idtrabajador);
            Conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede efectuar la conexión, hable con el administrador del sistema \n" + ex.getMessage());
        }
        return cat;
       
    }
}
