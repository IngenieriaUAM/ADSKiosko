/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.CDKiosco;
import VO.CVOKiosco;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonathan
 */
public class CNKiosco {
    CDKiosco oDKiosco;

    public CNKiosco() {
        oDKiosco= new CDKiosco();
    }
    
    
    
    public CVOKiosco buscaKiosco(Long idKiosco) throws SQLException{
        return oDKiosco.buscaKiosco(idKiosco);
    }

    public ArrayList<CVOKiosco> getListaKiosco() throws SQLException {
        return oDKiosco.getListaKiosco();
        
    }
    
}
