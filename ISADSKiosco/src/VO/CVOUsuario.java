package VO;

import java.sql.Date;

/**
 *
 * @author jonathan
 */
public class CVOUsuario {
        private Long idEmpleado = 0L;
        private String nombreEmpleado = "";
        private String contra="";
        private String nomUsuario="";
    
    public CVOUsuario()
  {
  }
    public CVOUsuario(String pnomEmpleado,String pContra){
        this.setNombreUsuario(pnomEmpleado);
        this.setContra(pContra);
    }
    
    public void setidUsuario(Long pidUsuario){
	this.idEmpleado = pidUsuario;
  }
    public void setNombreUsuario(String pNombreUsuario){
	this.nombreEmpleado = pNombreUsuario;
  }
    public Long getidUsuario(){
	return this.idEmpleado;
    }
    
    public String getNombreUsuario(){
        return this.nombreEmpleado;
    }
    
    public String getContra(){
        return this.contra;
    }
    
    public void setContra(String pContra){
        this.contra=pContra;
    }
    
}
