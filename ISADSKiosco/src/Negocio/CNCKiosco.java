/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import VO.CVOCKiosco;
import Datos.CDCKiosco;


/**
 *
 * @author lucas
 */
public class CNCKiosco {
    
    private CDCKiosco oDAlta;

    public CNCKiosco() {
        oDAlta = new CDCKiosco();
    }

    /*
     * Negocia una lista con un objeto de datos
     * @return ArrayList con los registros de la base de datos
     */
    public ArrayList<CVOCKiosco> getListaClientes() throws SQLException {
        return oDAlta.getListaClientes();
    }

}
