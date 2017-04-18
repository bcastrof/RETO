/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;
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
        
       // public static DefaultTableModel model= (DefaultTableModel) gc.getjTable1().getModel();
        
    public Centro() {
    }

    public Centro(String Nombre, String Calle, int Numero, String Ciudad, int CodigoPostal, String Provincia, int Telefonos) {
       
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
    
    //ESTO FUNCIONA 12C
    	public void gestionCentros() {
        Conexion.conectar();
        
        try {
           PreparedStatement smt=Conexion.getConexion().prepareStatement("insert into centros (nombre,calle,numero,ciudad,codigoPostal,provincia,telefono) values (?,?,?,?,?,?,?)");
           smt.setString(1, Nombre); 
           smt.setString(2, Calle);
           smt.setInt(3, Numero);
           smt.setString(4, Ciudad);
           smt.setInt(5,CodigoPostal);
           smt.setString(6, Provincia);
           smt.setInt(7, Telefonos); 
           
           smt.executeUpdate();
	
	   smt.close();
	   smt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        }
  
           
	}
        
        //alta centros para 11G
        public boolean gestionCentros1() {
        Conexion.conectar();
        
        try {
           PreparedStatement smt=Conexion.getConexion().prepareStatement("insert into centros (id, nombre,calle,numero,ciudad,codigoPostal,provincia,telefono) values (?,?,?,?,?,?,?,?)");
          
           smt.setInt(1, IDCent);
           smt.setString(2, Nombre); 
           smt.setString(3, Calle);
           smt.setInt(4, Numero);
           smt.setString(5, Ciudad);
           smt.setInt(6,CodigoPostal);
           smt.setString(7, Provincia);
           smt.setInt(8, Telefonos); 

           smt.executeUpdate();
           
	   smt.close();
	   Conexion.desconectar();
           return true;
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"No se puede efectuar la conexión, hable con el administrador del sistema" +ex.getMessage());
            return false;
        }    
	}
        
        //auto incrementado para 11g
        public int autoincremente(){
        int id=-1;
        try {  
            Conexion.conectar();
            CallableStatement cs = Conexion.getConexion().prepareCall("{call incrementCenter(?)}");
            cs.registerOutParameter(1, OracleTypes.INTEGER);
            cs.execute();
            int idc;
              idc = cs.getInt(1);
           id = idc;       
            Conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se puede efectuar la conexión, hable con el administrador del sistema"+ex.getMessage());       
        }
        return id;
    }
        
      /*  public static void verCentros() throws ClassNotFoundException, SQLException{	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LOGISTICA", "deh74f5c");
	
	String sql="{call seleccionarCentros (?)}";
        
	CallableStatement llamada = conexion.prepareCall(sql);
	
	llamada.registerOutParameter("c", OracleTypes.CURSOR);
	
	llamada.executeUpdate();
	
	ResultSet rs = (ResultSet) llamada.getObject("c");
	
	
	while (rs.next()) {
	
	BigDecimal resultado1 = rs.getBigDecimal(1);
	String resultado2 = rs.getString(2);
	String resultado3 = rs.getString(3);
	BigDecimal resultado4 = rs.getBigDecimal(4);
	String resultado5 = rs.getString(5);
	BigDecimal resultado6 = rs.getBigDecimal(6);
	String resultado7 = rs.getString(7);
	BigDecimal resultado8 = rs.getBigDecimal(8);
	
        
	model.addRow(new Object[]{resultado1,resultado2,resultado3,resultado4,resultado5,resultado6,resultado7,resultado8 });
	
	
	}
	
	rs.close();
	llamada.close();
	conexion.close();
}
*/
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
