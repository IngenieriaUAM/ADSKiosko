/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import VO.CVOCliente;
import Datos.CDAlta;
import Datos.CDPago;
import VO.CVOPago;
/**
 *
 * @author J o C e L y N
 */
public class CnPago {
    private CDPago oDPago;

    /**
     * Constructor de la clase
     */
    public CnPago() {
        oDPago = new CDPago();
    }

    /**
     * Negocia una lista con un objeto de datos
     * @return ArrayList con los registros de la base de datos
     * @throws SQLException en caso de error
     */
    
    public ArrayList<CVOPago> getListaPago() throws SQLException {
        return oDPago.getListaPago();
    }

    /**
     * Agrega un pago a CVOPago
     * @param pVOPago
     * @throws SQLException en caso de error SQL
     */
    public void setAgregaPago(CVOPago pVOPago) throws SQLException {

        oDPago.setAgregaPago(pVOPago);
    }
}
