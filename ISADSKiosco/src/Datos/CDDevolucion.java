/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import VO.CVODevolucion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class CDDevolucion {

    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;

    /**
     *
     */
    
    public CDDevolucion() {
        this.mDAOFactory = new CDDAOFactory();
    }
    
    /**
     *Obtiene un listado de la devolucion
     * @param pVODevolucion
     * @throws SQLException en caso de error
     */
    
    public void setAgregaDevolucion(CVODevolucion pVODevolucion) throws SQLException{
        try {
            //String con la instrucción SQL
            
	    String lSQuery = "INSERT INTO Devolucion (idRenta, idCliente, idBicicleta, nombreCliente, fechaInicio, fechaDev, multa) " +
                        "VALUES( " + "'" + pVODevolucion.getIdrenta()+ "'," +
                                     "'" + pVODevolucion.getIdCliente() + "'," +
                                     "'" + pVODevolucion.getIdBicicleta()+ "'," +
                                     "'" + pVODevolucion.getNombreCliente()+ "'," +
                                     "" + pVODevolucion.getFechainicio()+ "," +
                                     "now()," +
                                     "'" + pVODevolucion.getMulta()+ "');";
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
            System.out.println(e.getErrorCode()+" "+e.getMessage());
            if(e.getErrorCode()==0)
                JOptionPane.showMessageDialog(null, "Se agrego correctamente la devolucion","Devolucion",JOptionPane.INFORMATION_MESSAGE);
            if (e.getErrorCode() == 1062)
                throw new SQLException("Matricula Repedida");
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
