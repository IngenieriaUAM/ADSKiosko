/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.sql.SQLException;
import java.util.ArrayList;
import Datos.CDCPKiosco;
import VO.CVOCPKiosco;
/**
 *
 * @author neto
 */
public class CNCPKiosco {
     private CDCPKiosco oDRPDKiosco;
     
     public ArrayList<CVOCPKiosco> getListaRentasKiosco() throws SQLException {
        return oDRPDKiosco.getListaRentasKiosco();
    }
}
