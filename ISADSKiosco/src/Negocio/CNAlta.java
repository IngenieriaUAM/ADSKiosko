/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import VO.CVOCliente;
import Datos.CDAlta;


/**
 *
 * @author lucas
 */
public class CNAlta {
    
    private CDAlta oDAlta;

    public CNAlta() {
        oDAlta = new CDAlta();
    }

    /*
     * Negocia una lista con un objeto de datos
     * @return ArrayList con los registros de la base de datos
     */
    public ArrayList<CVOCliente> getListaClientes() throws SQLException {
        return oDAlta.getListaClientes();
    }

    public void setAgregaCliente(CVOCliente pVOCliente) throws SQLException {

        oDAlta.setAgregaCliente(pVOCliente);
    }

    public void setModificaCliente(CVOCliente pVOCliente) throws SQLException {

        oDAlta.setModificaCliente(pVOCliente);
    }

    public void setEliminaCliente(CVOCliente pVOCliente) throws SQLException {

        oDAlta.setEliminaCliente(pVOCliente);
    }
    
    public CVOCliente buscaCliente(Long pidCliente) throws SQLException{
        return oDAlta.buscaCliente(pidCliente);
    }
}
