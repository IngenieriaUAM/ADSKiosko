/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import VO.CVORenta;

/**
 *
 * @author jonathan
 */
public class CDRenta {
    
    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;

    
    public CDRenta() {
        this.mDAOFactory = new CDDAOFactory();
    }

      
    /**
     * Agrega un registro de renta a la base de datos
     * @param pVORenta
     * @throws SQLException
     */
    
    public void setAgregaRenta(CVORenta pVORenta) throws SQLException {
        try {
            //String con la instrucción SQL
	    String lSQuery = "INSERT INTO Renta (idCliente, fechaInicio,idBicicleta, statRenta,idKiosco) " +
                        "VALUES( " + "'" + pVORenta.getIdCliente()+ "'," +
                                     "now()," +
                                     "'" + pVORenta.getIdBicicleta()+ "'," +
                                     "'" + pVORenta.getStatRenta()+ "'," +
                                     "'" + pVORenta.getIdKiosco()+"');";
            System.out.println(lSQuery+ "clase CDRenta"); //para efectos de depuracion
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
            System.out.println(e.getErrorCode()+""+e.getMessage());
            if (e.getErrorCode() == 1062)
                throw new SQLException("ID Repetido");
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
    
    /**
     * Hace busqueda de la renta
     * @param idRenta
     * @return
     * @throws SQLException
     */
    public CVORenta buscaRenta(Long idRenta) throws SQLException {
        String     lSQuery = "SELECT * FROM Renta WHERE idBicicleta = '"+idRenta+"'";
        System.out.println(lSQuery);
        try {
            //Obtiene una conexión con la base de datos
            this.mConexion = this.mDAOFactory.abreConexion();
            //Crea la Instrucción
            this.mInstruccionSQL = this.mConexion.createStatement();
            //Ejecuta la consulta SQL
            this.mResultSet = this.mInstruccionSQL.executeQuery(lSQuery);
            
            if(mResultSet.next()) {
                CVORenta voRenta = new CVORenta(mResultSet.getLong(1),"" + mResultSet.getString(2) ,mResultSet.getString(3),mResultSet.getLong(4),mResultSet.getLong(5),mResultSet.getString(6),mResultSet.getLong(7));
                return voRenta ;
            }
            else{
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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
