/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;
import VO.CVOBicicleta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author jonathan
 */
public class CDBicicleta {
    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;
    
    /**
     *Creación del constructor
     */
    public CDBicicleta() {
        this.mDAOFactory = new CDDAOFactory();
    }

    /**
     *Consulta los datos de Bicicleta
     * @param pidBicicleta
     * @return obtiene los datos de la bicicleta buscada
     * @throws SQLException ocurre cuando no es posible establecer la conexión con la base de datos
     */
    public CVOBicicleta buscaBicicleta(Long pidBicicleta) throws SQLException{
        String     lSQuery = "SELECT * FROM Bicicleta WHERE idBicicleta = '"+pidBicicleta+"'";
        System.out.println(lSQuery);
        try {
            //Obtiene una conexión con la base de datos
            this.mConexion = this.mDAOFactory.abreConexion();
            //Crea la Instrucción
            this.mInstruccionSQL = this.mConexion.createStatement();
            //Ejecuta la consulta SQL
            this.mResultSet = this.mInstruccionSQL.executeQuery(lSQuery);
            
            if(mResultSet.next()) {
                CVOBicicleta voBicicleta = new CVOBicicleta(mResultSet.getLong(1),"" + mResultSet.getString(2) ,mResultSet.getString(3));
                return voBicicleta ;
            }
            else{
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            if (this.mConexion == null) {
                throw new SQLException("No es posible establecer la conexión");
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
