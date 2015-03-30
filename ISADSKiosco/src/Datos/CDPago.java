/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import VO.CVOCliente;
import VO.CVOPago;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author J o C e L y N
 */
public class CDPago {
    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;

    public CDPago() {
        mDAOFactory=new CDDAOFactory();
    }
    
    
    
    public ArrayList<CVOPago> getListaPago()throws SQLException {
        String     lSQuery = "SELECT * FROM Pago";
        ArrayList<CVOPago> lALListaPago = new ArrayList<CVOPago>();
        
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
                CVOPago lVOPago = new CVOPago(mResultSet.getLong(1), mResultSet.getLong(2) ,mResultSet.getLong(3),mResultSet.getString(4));
                //Agregamos a la colecciÛn los VO generados en la instrucciÛn anterior
                lALListaPago.add(lVOPago);
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
                lALListaPago = null;
            }
        }
        return lALListaPago;
    }

    public void setAgregaPago(CVOPago pVOPago) throws SQLException {
        try {
            //String con la instrucción SQL
            
	    String lSQuery = "INSERT INTO Pago (monto, idCliente, nombreCliente,fechaPago) " +
                        "VALUES( " + "'" + pVOPago.getMonto() + "', " +
		                     "'" + pVOPago.getIdCliente() + "', " +
                                     "'" + pVOPago.getNombreCliente() + "', " +
		                     "now());";
            System.out.println(lSQuery); //para efectos de depuracion
            //Obtiene una conexiÛn con la base de datos
            this.mConexion = mDAOFactory.abreConexion();
            //Crea la InstrucciÛn
            this.mInstruccionSQL = mConexion.createStatement();
            //Ejecuta la sentencia SQL
            this.mInstruccionSQL.execute(lSQuery);
            //Guarda los cambios
            this.mConexion.commit();
	} 
        catch (SQLException e) {
            System.out.println(e.getErrorCode());
            if (e.getErrorCode() == 0 )
                JOptionPane.showMessageDialog(null, "Se ha agregado el pago correctamente");
            if (e.getErrorCode() == 1062)
                throw new SQLException("Id Repedido");
            if (this.mConexion == null) {
                throw new SQLException("No es posible establecer la conexion");
            }
	}
        finally {
            try {
                //Cierra el statement
                if(this.mInstruccionSQL != null) {
                    this.mInstruccionSQL.close();
                }
                //Cerramos conexion
                if(this.mConexion != null) {
                    this.mConexion.close();
                }
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
	}
        
    }
    
    public CVOPago buscaPago(Long pidCliente) throws SQLException{
        String     lSQuery = "SELECT * FROM Pago P WHERE P.idCliente = '"+pidCliente+"'";
        System.out.println("query de datos"+lSQuery);
        try {
            //Obtiene una conexión con la base de datos
            this.mConexion = this.mDAOFactory.abreConexion();
            //Crea la Instrucción
            this.mInstruccionSQL = this.mConexion.createStatement();
            //Ejecuta la consulta SQL
            this.mResultSet = this.mInstruccionSQL.executeQuery(lSQuery);
            
            if(mResultSet.next()) {
                CVOPago voPago = new CVOPago(mResultSet.getLong(1),mResultSet.getLong(2) ,mResultSet.getLong(3),mResultSet.getString(4));
                System.out.println(voPago.getMonto());
                return voPago ;
            }
            else{
                System.out.println("Nulo");
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()+" "+ex.getErrorCode() );
            if (this.mConexion == null) {
                throw new SQLException("No es posible establecer la conexion");
            }
        }catch(NullPointerException npe){
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
}
