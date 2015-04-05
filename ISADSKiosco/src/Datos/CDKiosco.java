/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import VO.CVOKiosco;

import java.util.ArrayList;
import VO.CVOCliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan
 */
public class CDKiosco {
    
     private Connection   mConexion;
    private CDDAOFactory mDAOFactory;
    private Statement    mInstruccionSQL;
    private ResultSet    mResultSet;

    public CDKiosco() {
        mDAOFactory = new CDDAOFactory();
    }
    
    
    
    public CVOKiosco buscaKiosco(Long pidKiosco) throws SQLException{
        String     lSQuery = "SELECT * FROM Kiosco WHERE idKiosco = '"+pidKiosco+"'";
        System.out.println("Query buscakiosco"+lSQuery);
        try {
            //Obtiene una conexión con la base de datos
            
            this.mConexion = this.mDAOFactory.abreConexion();
            //Crea la Instrucción
            this.mInstruccionSQL = this.mConexion.createStatement();
            //Ejecuta la consulta SQL
            
            this.mResultSet = this.mInstruccionSQL.executeQuery(lSQuery);
            
            if(mResultSet.next()) {
                
                CVOKiosco voKiosco = new CVOKiosco(mResultSet.getLong(1),mResultSet.getString(2));
                
                return voKiosco ;
            }
            else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()+" "+ex.getErrorCode() );
            if (this.mConexion == null) {
                throw new SQLException("No es posible establecer la conexion");
            }
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage() );
            return null;
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
        return null;
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

    public ArrayList<CVOKiosco> getListaKiosco()throws SQLException {
        String     lSQuery = "SELECT * FROM Kiosco";
        ArrayList<CVOKiosco> lALListaClientes = new ArrayList<CVOKiosco>();
        
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
                CVOKiosco lVOKiosco = new CVOKiosco(mResultSet.getLong(1),"" + mResultSet.getString(2));
                //Agregamos a la colecciÛn los VO generados en la instrucciÛn anterior
                lALListaClientes.add(lVOKiosco);
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
    
}
