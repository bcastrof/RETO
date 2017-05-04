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
import java.util.Random;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author 7fprog03
 */
public class Usuario {

    private String idUsuario;
    private String password;

    //asosciacion con trabajador
    private Trabajador trabajador;

    public Usuario() {
    }

    public Usuario(String idUsuario, String password) {
        this.idUsuario = idUsuario;
        this.password = password;
    }

    public String loguearse(String idUsuario, String password) {
        String cat = null;
        try {

            Conexion.conectar();
            CallableStatement cs = Conexion.getConexion().prepareCall("{call LOGIN(?,?,?,?,?,?)}");
            cs.setString(1, idUsuario);
            cs.setNString(2, password);
            cs.registerOutParameter(3, OracleTypes.VARCHAR);
            cs.registerOutParameter(4, OracleTypes.VARCHAR);
            cs.registerOutParameter(5, OracleTypes.INTEGER);
            cs.registerOutParameter(6, OracleTypes.CURSOR);

            cs.execute();
            String categoria = cs.getString(3);
            String idU = cs.getString(4);
            BigDecimal idtrabajador = cs.getBigDecimal(5);

            ResultSet rs = (ResultSet) cs.getObject(6);
            while (rs.next()) {

                BigDecimal id = rs.getBigDecimal("ID");
                String dni = rs.getString("dni");
                String Nombre = (rs.getString("nombre"));
                String PrimerApellido = (rs.getString("primerApellido"));
                String SegundoApellido = (rs.getString("segundoApellido"));
                categoria = (rs.getString("categoria"));
                String Calle = (rs.getString("calle"));
                BigDecimal Numero = (rs.getBigDecimal("numero"));
                BigDecimal Piso = (rs.getBigDecimal("piso"));
                String Mano = (rs.getString("mano"));
                String Ciudad = (rs.getString("ciudad"));
                BigDecimal CodigoPostal = (rs.getBigDecimal("codigoPostal"));
                String Provincia = (rs.getString("provincia"));
                BigDecimal MovilEmpresa = (rs.getBigDecimal("movilEmpresa"));
                BigDecimal MovilPersonal = (rs.getBigDecimal("movilPersonal"));
                BigDecimal Salario = (rs.getBigDecimal("salario"));
                String FechaNacimiento = (rs.getString("fechaNacimiento"));
                BigDecimal IdCent = (rs.getBigDecimal("CENTROS_ID"));

                if (categoria.equalsIgnoreCase("logistica")) {
                    /* trabajador  = new Logistica(id, dni, Nombre, PrimerApellido, 
                SegundoApellido, categoria, Calle, Numero, Piso, Mano, Ciudad, CodigoPostal, Provincia, MovilEmpresa, MovilPersonal, Salario, FechaNacimiento, IdCent);
                     */
                } else {/*
                     trabajador  = new Administracion(id, dni, Nombre, PrimerApellido, 
                SegundoApellido, categoria, Calle, Numero, Piso, Mano, Ciudad, CodigoPostal, Provincia, MovilEmpresa, MovilPersonal, Salario, FechaNacimiento, IdCent);
                     */
                }

            }

            if (categoria.equalsIgnoreCase("administracion")) {
                cat = categoria;
            }

            if (categoria.equalsIgnoreCase("logistica")) {
                cat = categoria;
            }
            System.out.println(idU + " " + categoria + " " + idtrabajador);
            Conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede efectuar la conexión, hable con el administrador del sistema \n" + ex.getMessage());
        }
        return cat;

    }

    public static String user(String nombre, String apellido) {

        String name = nombre.replaceAll(" ", "");
        String user = String.valueOf(name).concat(".").concat(apellido);

        return user;
    }

    public static String password() {

        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke1234567890";
        StringBuilder pass = new StringBuilder();
        Random rnd = new Random();

        while (pass.length() < 8) {
            int password = (int) (rnd.nextFloat() * (float) caracteres.length());
            pass.append(caracteres.charAt(password));
        }
        String password1 = pass.toString();

        return password1;
    }
    
    public boolean altaUsuario(String dni, String user, String password){
        String ido="call idTrabajador(?,?)";
        String insert = "insert into usuarios (usuario, password, TRABAJADORES_ID) values(?,?,?)";
        
        try {
            Conexion.conectar();
            CallableStatement cs = Conexion.getConexion().prepareCall(ido);
            cs.setString(1, dni);
            cs.registerOutParameter(2, OracleTypes.INTEGER);
            cs.execute();
            
            BigDecimal idu = cs.getBigDecimal(2);
            System.out.println("");
            cs.close();
            Conexion.desconectar();
            
            Conexion.conectar();
            PreparedStatement smt = Conexion.getConexion().prepareStatement(insert);
            smt.setString(1, user);
            smt.setString(2, password);
            smt.setBigDecimal(3, idu);
            
            smt.executeUpdate();
            smt.close();
            Conexion.desconectar();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede insertar el usuario" + ex.getMessage());
        }
        
        return false;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
}
