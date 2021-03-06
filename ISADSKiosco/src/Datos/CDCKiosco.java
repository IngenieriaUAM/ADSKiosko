/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import VO.CVOCKiosco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class CDCKiosco {

    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;

    /*
     * Obtiene registros de la base de datos
     * @return un ArrayList conteniendo los datos
     * @throws SQLException En caso de error SQL
     */
    public CDCKiosco() {
        this.mDAOFactory = new CDDAOFactory();
    }
    
    /*
      * Obtiene registros de la base de datos
      * @return un ArrayList conteniendo los datos
      * @throws SQLException En caso de error SQL
      */
    public ArrayList<CVOCKiosco> getListaClientes()throws SQLException {
        String     lSQuery = "SELECT r.idKiosco, k.ubicacion, r.idRenta FROM Renta r, Kiosco k WHERE r.idKiosco = k.idKiosco";
        ArrayList<CVOCKiosco> lALListaClientes = new ArrayList<CVOCKiosco>();
        
        System.out.println(lSQuery);
        try {
            //Obtiene una conexión con la base de datos
            this.mConexion = this.mDAOFactory.abreConexion();
            //Crea la Instrucción
            this.mInstruccionSQL = this.mConexion.createStatement();
            //Ejecuta la consulta SQL
            this.mResultSet = this.mInstruccionSQL.executeQuery(lSQuery);
            /* Al principio el ResultSet est· posicionado antes del primer registro (en donde se encuentran los metadatos),
             * por lo que hay que recorrerlo al primer registro, y si no existe ninguno
             * el resultset regresa falso.
             */

            while(mResultSet.next()) {
                //Con rs.getXXXX podemos obtener datos del ResultSet, de tipo int, float, etc.
                CVOCKiosco lVOClientes = new CVOCKiosco(mResultSet.getInt(1),mResultSet.getString(2),mResultSet.getLong(3));
                //Agregamos a la colecciÛn los VO generados en la instrucciÛn anterior
                lALListaClientes.add(lVOClientes);
            } //fin de while
        //Regresamos los datos contenidos en la colecciÛn haciendo un cast y
        //convirtiendo la colecciÛn en ArrayList
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
                lALListaClientes = null;
            }
        }
        return lALListaClientes;
    }

    /*
     * Cierra la conexión
     * @throws SQLException En caso de no poder cerrar la conexiÛn
     */
    public void CierraConexion()throws SQLException {
        if(mConexion != null) {
            mConexion.close();
            System.out.println("Conexión cerrada." );
        }
    }  
}
