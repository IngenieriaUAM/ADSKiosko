/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import VO.CVOUsuario;
import java.sql.SQLException;
import Datos.CDinicioSesion;
import java.util.ArrayList;
/**
 *
 * @author jonathan
 */
public class CNinicioSesion {
    
    
    private CDinicioSesion oDinicioSesion;

    /**
     * Constructor de la clase
     */
    public CNinicioSesion() {
        oDinicioSesion = new CDinicioSesion();
    }
    
    /**
     * Verifica si existe un usuario
     * @param pVOUsuario
     * @return 
     * @throws SQLException en caso de error SQL
     */
    public boolean hayUsuario(CVOUsuario pVOUsuario) throws SQLException {
        return oDinicioSesion.hayUsuario(pVOUsuario);
    }
    
}
