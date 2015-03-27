/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import Datos.CDPago;
import VO.CVOPago;
/**
 *
 * @author J o C e L y N
 */
public class CNPago {
    private CDPago oDPago;

    public CNPago() {
        oDPago = new CDPago();
    }

    /*
     * Negocia una lista con un objeto de datos
     * @return ArrayList con los registros de la base de datos
     */
    public ArrayList<CVOPago> getListaPago() throws SQLException {
        return oDPago.getListaPago();
    }

    public void setAgregaPago(CVOPago pVOPago) throws SQLException {

        oDPago.setAgregaPago(pVOPago);
    }

    public CVOPago buscaPago(Long idCliente) throws SQLException {
        return oDPago.buscaPago(idCliente);
    }
}
