/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;
import java.sql.SQLException;
import java.util.ArrayList;
import VO.CVOConsultaMembresia;
import Datos.CDConsultaMembresia;
/**
 *
 * @author eliza
 */
public class CNConsultaMembresia {
    
    private CDConsultaMembresia oDcm;
    private CVOConsultaMembresia [] oVcm;

    public CNConsultaMembresia() {
        this.oDcm = new CDConsultaMembresia();
    }
    
    public ArrayList<CVOConsultaMembresia> getListaConsultaMembresia(Long idCliente) throws SQLException{
        return oDcm.getListaConsultaMembresia(idCliente);
    }
    
}
