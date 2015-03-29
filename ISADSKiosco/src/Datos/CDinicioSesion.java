/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;
import VO.CVOUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jonathan
 */
public class CDinicioSesion {
    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;
    
    
    public CDinicioSesion() {
        this.mDAOFactory = new CDDAOFactory();
    }
    
    /**
     * Muestra el inicio de sesion del sistema
     * @param pVOUsuario
     * @return
     * @throws SQLException
     */
    public boolean hayUsuario(CVOUsuario pVOUsuario)throws SQLException {
        String lSQuery = "SELECT * FROM Empleado WHERE nomUsuario = '"+ pVOUsuario.getNombreUsuario()+"' AND  contra = '"+pVOUsuario.getContra()+"'";
        System.out.println(lSQuery);
        try {
            //Obtiene una conexión con la base de datos
            this.mConexion = this.mDAOFactory.abreConexion();
            //Crea la Instrucción
            this.mInstruccionSQL = this.mConexion.createStatement();
            //Ejecuta la consulta SQL
            this.mResultSet = this.mInstruccionSQL.executeQuery(lSQuery);
            /* Al principio el ResultSet est· posicionado antes del primer registro (en donde se encuentran los metadatos),
             * por lo que hay que recorrerlo al primer registro, y si o existe ninguno
             * el resultset regresa falso.
             */
            return mResultSet.next();
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            if (this.mConexion == null) {
                throw new SQLException("No es posible establecer la conexion");
            }
        } finally {
            try {
                if(this.mResultSet != null) {
                    this.mResultSet.close();
                }
                if(this.mInstruccionSQL != null) {
                    this.mInstruccionSQL.close();
                }
                if(this.mConexion != null) {
                    this.mConexion.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                
            }
        }
        System.out.println("Aqui no llega");
        return false;
    }
    
    /**
     * Cierra la conexion 
     * @throws SQLException en caso de no poder cerrar la conexion
     */
    public void CierraConexion()throws SQLException {
        if(mConexion != null) {
            mConexion.close();
            System.out.println("Conexión cerrada." );
        }
    }
    
}
