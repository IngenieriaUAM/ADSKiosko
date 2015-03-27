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
 *
 * @author lucas
 */
public class CNDevolucion {
    
    private CDDevolucion oDDevolucion;

    public CNDevolucion() {
        oDDevolucion = new CDDevolucion();
    }
    
    public void setAgregaDevolucion(CVODevolucion poVDevolucion) throws SQLException{
        oDDevolucion.setAgregaDevolucion(poVDevolucion);
    }




}
