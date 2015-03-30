/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.sql.SQLException;
import java.util.ArrayList;
import VO.CVOCliente;
import Datos.CDBicicleta;
import VO.CVOBicicleta;
/**
 *
 * @author jonathan
 */
public class CNBicicleta {
    
    private CDBicicleta oDBicicleta;

    /**
     * Constructor de la clase
     */
    public CNBicicleta() {
        oDBicicleta = new CDBicicleta();
    }
    
    /**
     * Hace busqueda de la bicicleta en CVOBicicleta
     * @param pidBicicleta
     * @return oDBicicleta
     * @throws SQLException en caso de error SQL
     */
    public CVOBicicleta buscaBicicleta(Long pidBicicleta) throws SQLException{
        return oDBicicleta.buscaBicicleta(pidBicicleta);
    }
    
}
