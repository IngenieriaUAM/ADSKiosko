/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.sql.SQLException;
import java.util.ArrayList;
import Datos.CDRPDKiosco;
import VO.CVORPDKiosco;
/**
 *
 * @author jonathan
 */
public class CNRPDkiosco {
     private CDRPDKiosco oDRPDKiosco;
     
     public ArrayList<CVORPDKiosco> getListaRPDKiosco() throws SQLException {
        return oDRPDKiosco.getListaRPDKiosco();
    }
     public CVORPDKiosco buscaPRPDKiosco(Long idKiosco, String fecha) throws SQLException {
        return oDRPDKiosco.buscaRPDKiosco(idKiosco, fecha);
    }
}
