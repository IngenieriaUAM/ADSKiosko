/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

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
 * @author lucas
 */
public class CDAlta {

    private Connection   mConexion = null;
    private CDDAOFactory mDAOFactory = null;
    private Statement    mInstruccionSQL = null;
    private ResultSet    mResultSet = null;

    /*
     * Obtiene registros de la base de datos
     * @return un ArrayList conteniendo los datos
     * @throws SQLException En caso de error SQL
     */
    public CDAlta() {
        this.mDAOFactory = new CDDAOFactory();
    }
    
    /*
      * Obtiene registros de la base de datos
      * @return un ArrayList conteniendo los datos
      * @throws SQLException En caso de error SQL
      */
    public ArrayList<CVOCliente> getListaClientes()throws SQLException {
        String     lSQuery = "SELECT * FROM CLIENTE";
        ArrayList<CVOCliente> lALListaClientes = new ArrayList<CVOCliente>();
        
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
                CVOCliente lVOClientes = new CVOCliente(mResultSet.getLong(1),"" + mResultSet.getString(2) ,mResultSet.getDate(3),mResultSet.getString(4).charAt(0),mResultSet.getInt(5),mResultSet.getInt(6),""+mResultSet.getString(7),mResultSet.getDate(8),mResultSet.getInt(9),mResultSet.getString(10),mResultSet.getLong(11));
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
     * Agrega un registro a la base de datos
     * @param alumno VoAlumno con los datos a a gregar
     * @throws SQLException En caso de Error
     */
    public void setAgregaCliente(CVOCliente pVOCliente) throws SQLException {
        try {
            //String con la instrucción SQL
            
	    String lSQuery = "INSERT INTO CLIENTE ( idCliente, NombreCliente, FechaNacimiento, Sexo, Tarjeta, CodigoTarjeta, Direccion, FechaInsc,estadoPago,saldo, idKiosco) " +
                        "VALUES( " + "'" + pVOCliente.getidCliente().toString() + "', " +
		                     "'" + pVOCliente.getNombreCliente() + "', " +
		                     "'" + pVOCliente.getFechaNacimiento() + "'," +
                                     "'" + pVOCliente.getSexo()+ "'," +
                                     "'" + pVOCliente.getTarjeta()+ "'," +
                                     "'" + pVOCliente.getCodigoTarjeta()+ "'," +
                                     "'" + pVOCliente.getDireccion()+ "'," +
                                     "'" + pVOCliente.getFechaInsc()+ "'," +    
                                     "'Pendiente'," +    
                                     "'200'," +    
                                     "'" + "1" + "');";
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
            if(e.getErrorCode()==0)
                JOptionPane.showMessageDialog(null, "Cliente agregado correctamente");
            System.out.println(e.getErrorCode());
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
     * Elimina un registro
     * @param alumno VoAlumno con los valores del registro a eliminar
     * @throws SQLException En caso de error
     */
    public void setModificaAlumno(CVOCliente pVOCliente) {
        try {
            String lSQuery = "UPDATE CLIENTE SET " + 
                                     "NombreCliente = '" + pVOCliente.getNombreCliente() + "', " +
                                     "FechaNacimiento = '" + pVOCliente.getFechaNacimiento() + "', " +
                                     "Sexo = '" + pVOCliente.getSexo() + "', " +
                                     "Tarjeta = '" + pVOCliente.getTarjeta()+"'," + 
                                     "CodigoTarjeta = '" + pVOCliente.getCodigoTarjeta()+"'," + 
                                     "Direccion = '"+ pVOCliente.getDireccion()+"',"+
                                     "FechaInsc = '" + pVOCliente.getFechaInsc()+"' " + 
                                     "WHERE idCliente = '" + pVOCliente.getidCliente() + "'";
        
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
     * Elimina un registro
     * @param alumno VoAlumno con los valores del registro a eliminar
     * @throws SQLException En caso de error
     */
    public void setEliminaCliente(CVOCliente pVOCliente) {
        try {
            String lSQuery = "DELETE FROM CLIENTE WHERE " +
                                     "idCliente = '" + pVOCliente.getidCliente() + "'" ;

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

    public CVOCliente buscaCliente(Long pidCliente) throws SQLException{
        String     lSQuery = "SELECT * FROM CLIENTE WHERE idCliente = '"+pidCliente+"'";
        System.out.println(lSQuery);
        
        try {
            //Obtiene una conexión con la base de datos
            this.mConexion = this.mDAOFactory.abreConexion();
            //Crea la Instrucción
            this.mInstruccionSQL = this.mConexion.createStatement();
            //Ejecuta la consulta SQL
            this.mResultSet = this.mInstruccionSQL.executeQuery(lSQuery);
            
            if(mResultSet.next()) {
                CVOCliente voCliente = new CVOCliente(mResultSet.getLong(1),"" + mResultSet.getString(2) ,mResultSet.getDate(3),mResultSet.getString(4).charAt(0),mResultSet.getInt(5),mResultSet.getInt(6),""+mResultSet.getString(7),mResultSet.getDate(8),mResultSet.getInt(9),mResultSet.getString(10),mResultSet.getLong(11));
                return voCliente ;
            }
            else{
                return null;
            }
        } catch (SQLException ex) {
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
