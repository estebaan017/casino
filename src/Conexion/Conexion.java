/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
/**
 *
 * @author esteb
 */

public class Conexion {

    Connection conn;
    ResultSet res;
    Statement state;

    public static Conexion instance;
    
    /**
     * Metodo que realiza la conexion a la base de datos 
     */
   
    private Conexion() {
        try {

            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull", "root", "");
                Class.forName("com.mysql.jdbc.Driver");

            } catch (CommunicationsException exc) {
                JOptionPane.showMessageDialog(null, "error de conexion");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * 
     * @return Metodo que retorna la conexion 
     */
    public static Conexion saberestado() {

        if (instance == null) {

            instance = new Conexion();
        }

        return instance;

    }
    /**
     * Metodo que cierra la conexion a la base de datos 
     */

    public void cerrarconexion() {
        instance = null;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public ResultSet getRes() {
        return res;
    }

    public void setRes(ResultSet res) {
        this.res = res;
    }

    public Statement getState() {
        return state;
    }

    public void setState(Statement state) {
        this.state = state;
    }

}
