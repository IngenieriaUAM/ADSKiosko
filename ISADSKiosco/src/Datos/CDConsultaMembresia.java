/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import VO.CVOConsultaMembresia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author eliza
 */
public class CDConsultaMembresia {
    
    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;

    public CDConsultaMembresia() {
        this.mDAOFactory = new CDDAOFactory();
    }

    public ArrayList<CVOConsultaMembresia> getListaConsultaMembresia(Long idCliente) throws SQLException {
        String     lSQuery = "SELECT b.idBicicleta,b.tipoBicicleta,r.fechaInicio,r.fechaDev,c.nombreCliente FROM Renta r, Cliente c, Bicicleta b WHERE r.idCliente='"+idCliente+"' and b.idBicicleta=r.idBicicleta";
        ArrayList<CVOConsultaMembresia> listaUm = new ArrayList<CVOConsultaMembresia>();
        
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
                CVOConsultaMembresia lVOum = new CVOConsultaMembresia(mResultSet.getLong(1),"" + mResultSet.getString(2) ,mResultSet.getString(3),mResultSet.getString(4),mResultSet.getString(5));
                //Agregamos a la colecciÛn los VO generados en la instrucciÛn anterior
                listaUm.add(lVOum);
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
                listaUm = null;
            }
        }
        return listaUm;
    }
    
    
}
