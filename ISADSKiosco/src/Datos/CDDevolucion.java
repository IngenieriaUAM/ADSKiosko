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

    /*
     * Obtiene registros de la base de datos
     * @return un ArrayList conteniendo los datos
     * @throws SQLException En caso de error SQL
     */
    public CDDevolucion() {
        this.mDAOFactory = new CDDAOFactory();
    }
    
    /*
     * Elimina un registro
     * @param alumno VoAlumno con los valores del registro a eliminar
     * @throws SQLException En caso de error
     */
   
    public void setAgregaDevolucion(CVODevolucion pVODevolucion) throws SQLException{
        try {
            //String con la instrucción SQL
            
	    String lSQuery = "INSERT INTO Devolucion ( idDevolucion, idRenta, idCliente, idBicicleta, nombreCliente, fechaInicio, fechaDev, multa) " +
                        "VALUES( " + "'"+ "1"+"', " +
		                     "'" + pVODevolucion.getIdrenta() + "', " +
		                     "'" + pVODevolucion.getIdCliente() + "'," +
                                     "'" + pVODevolucion.getIdBicicleta()+ "'," +
                                     "'" + pVODevolucion.getNombreCliente()+ "'," +
                                     "" + pVODevolucion.getFechainicio()+ "," +
                                     "" + pVODevolucion.getFechadevolucion()+ "," +
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
                JOptionPane.showMessageDialog(null, "Se registró correctamente la devolucion", "Correcto", JOptionPane.INFORMATION_MESSAGE);
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
    
    public void setDevuelve(Long idrenta) {

        try {
            String lSQuery ="UPDATE `bdbicicletas`.`renta` SET `statRenta`='DEV' WHERE `idrenta`="+ idrenta;
            // UPDATE `BDEscuela`.`Alumno` SET `NomAlumno`='esteban', `FechNacAlumno`='eeeeeaaa' WHERE `Matricula`='eeeee';


            System.out.println(lSQuery); //para efectos de depuracion
            //Obtiene una conexiÛn con la base de datos
            this.mConexion = mDAOFactory.abreConexion();
            //	Crea el statement
            mInstruccionSQL = mConexion.createStatement();
            //Ejecuta la sentencia SQL
            mInstruccionSQL.execute(lSQuery);
            //Guarda los cambios
            //mConexion.commit();
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
   
    public ResultSet devolucion(String id){
        try {
            String lSQuery ="SELECT R.idBicicleta, R.idRenta, R.idCliente, C.nombreCliente FROM renta R, cliente C, bicicleta B "
                    + "WHERE R.idBicicleta ='"+id+"' AND R.idBicicleta=B.idBicicleta AND R.idCliente = C.idCliente" ;
            // UPDATE `BDEscuela`.`Alumno` SET `NomAlumno`='esteban', `FechNacAlumno`='eeeeeaaa' WHERE `Matricula`='eeeee';

            this.mConexion = mDAOFactory.abreConexion();
            //	Crea el statement
            mInstruccionSQL = mConexion.createStatement();
            //Ejecuta la sentencia SQL
            mResultSet=mInstruccionSQL.executeQuery(lSQuery);
            
            //Guarda los cambios
            //mConexion.commit();
        
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        return mResultSet;
    }
    public void actualizaTablaBicicleta(String idBicicleta){
        try {
            String lSQuery ="UPDATE `bdbicicletas`.`bicicleta` SET `statBicicleta`='Disponible' WHERE `idBicicleta`="+ idBicicleta;
                    
            // UPDATE `BDEscuela`.`Alumno` SET `NomAlumno`='esteban', `FechNacAlumno`='eeeeeaaa' WHERE `Matricula`='eeeee';

            this.mConexion = mDAOFactory.abreConexion();
            //	Crea el statement
            mInstruccionSQL = mConexion.createStatement();
            //Ejecuta la sentencia SQL
            mInstruccionSQL.executeUpdate(lSQuery);
            
            //Guarda los cambios
            //mConexion.commit();
        
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void eliminaRegistroRenta(String idBicicleta){
        try {
            String lSQuery = "DELETE FROM renta WHERE " +
                                     "idBicicleta = '" + idBicicleta+ "'" ;

            System.out.println(lSQuery); //para efectos de depuracion
            //Obtiene una conexiÛn con la base de datos
            this.mConexion = mDAOFactory.abreConexion();
            //	Crea el statement
            mInstruccionSQL = mConexion.createStatement();
            //Ejecuta la sentencia SQL
            mInstruccionSQL.executeUpdate(lSQuery);
            //Guarda los cambios
            //mConexion.commit();
        }
        catch (SQLException e) {
            System.out.println("*****************************NO ELIMINA");
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
    }
    public void actualizarTablaDevolucion(String idRenta, String idCliente, String idBicicleta, String nombreCliente){
        try {
            String lSQuery = "INSERT INTO `bdbicicletas`.`devolucion` (`idRenta`, `idCliente`, `idBicicleta`, `nombreCliente`, `fechaInicio`, `fechaDevolucion`, `multa`) VALUES ('"+idRenta+"', '"+idCliente+"', '"+idBicicleta+"', '"+nombreCliente+"', '0000-00-00','0000-00-00', '0')";
            

            System.out.println(lSQuery); //para efectos de depuracion
            //Obtiene una conexiÛn con la base de datos
            this.mConexion = mDAOFactory.abreConexion();
            //	Crea el statement
            mInstruccionSQL = mConexion.createStatement();
            //Ejecuta la sentencia SQL
            mInstruccionSQL.execute(lSQuery);
            //Guarda los cambios
            //mConexion.commit();
            
            System.out.println("*****************SI SE CNETO CON DEVOLUCIO¨******************");
        }
        catch (SQLException e) {
            System.out.println("****************No se hizo la actualizacion de devolucion*****************");
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
    }
}
