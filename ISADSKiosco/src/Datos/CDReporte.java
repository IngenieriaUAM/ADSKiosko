/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;
import VO.CVOReporte;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author jonathan
 */
public class CDReporte {
    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;
    
    /**
     *
     */
    public CDReporte() {
        this.mDAOFactory = new CDDAOFactory();
    }
    
    /**
     * Obtiene registros de reporte de la base de datos
     * @return un ArrayList conteniendo los datos
     * @throws SQLException En caso de error SQL
     */
    public ArrayList<CVOReporte> getListaReporte()throws SQLException {
        String     lSQuery = "SELECT * FROM Reportes";
        ArrayList<CVOReporte> lALListaReportes = new ArrayList<CVOReporte>();
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
                CVOReporte lVOReportes = new CVOReporte();
                //Agregamos a la colecciÛn los VO generados en la instrucciÛn anterior
                lALListaReportes.add(lVOReportes);
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
                lALListaReportes = null;
            }
        }
        return lALListaReportes;
    }
    
    /**
     * Agrega un reporte en la base de datos
     * @param pVOReporte
     * @throws SQLException en caso de error SQL
     */
    public void setAgregaReporte(CVOReporte pVOReporte) throws SQLException {
        try {
            //String con la instrucción SQL
            System.out.println("inserta reporte");
	    String lSQuery = "INSERT INTO Reportes ( idReporte, tipoReporte, idBicicleta, tipoBicicleta, idCliente, nombreCliente, descripcion, fecha,idRenta) " +
                        "VALUES( " + "'" + pVOReporte.getIdReporte() + "', " +
		                     "'" + pVOReporte.getTipoReporte() + "', " +
		                     "'" + pVOReporte.getIdBicicleta() + "'," +
                                     "'" + pVOReporte.getTipoBicicleta()+ "'," +
                                     "'" + pVOReporte.getIdCliente()+ "'," +
                                     "'" + pVOReporte.getNombreCliente()+ "'," +
                                     "'" + pVOReporte.getDecripcionReporte()+ "'," +
                                     "" + pVOReporte.getFechaReporte()+ "," +    
                                     "'"+ pVOReporte.getIdRenta()+"');";
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
            if (e.getErrorCode() == 0)
                 JOptionPane.showMessageDialog(null, "Se agrego correctamente la devolucion","Devolucion",JOptionPane.INFORMATION_MESSAGE);
            if (e.getErrorCode() == 1062)
                throw new SQLException("ID Repedido");
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
    
}
