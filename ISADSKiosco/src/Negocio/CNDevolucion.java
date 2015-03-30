/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import VO.CVODevolucion;
import Datos.CDDevolucion;

/**
 * @author lucas
 */

public class CNDevolucion {
    
    private CDDevolucion oDDevolucion;

    /**
     * Constructor de la clase
     */
    public CNDevolucion() {
        oDDevolucion = new CDDevolucion();
    }
    
    /**
     * Agrega una devolucion en CVODevolucion
     * @param poVDevolucion
     * @throws SQLException en caso de error SQL
     */
    public void setAgregaDevolucion(CVODevolucion poVDevolucion) throws SQLException{
        oDDevolucion.setAgregaDevolucion(poVDevolucion);
    }
    
}
