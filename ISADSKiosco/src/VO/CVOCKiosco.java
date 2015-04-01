package VO;

import java.sql.Date;

public class CVOCKiosco
{
  private int idKiosco;
  private String ubicacionKiosco;
  private Long renta;

 /*
  * Constructor por default
  */
  public CVOCKiosco()
  {
  }

  public CVOCKiosco(int pidKiosco, String ubicacionK, Long renta ){
        this.setIdKiosco(pidKiosco);
        this.setRenta(renta);
        this.setUbicacion(ubicacionK);
        
  }

    public int getIdKiosco() {
        return idKiosco;
    }

    public String getUbicacion() {
        return ubicacionKiosco;
    }

    public Long getRenta() {
        return renta;
    }

    public void setIdKiosco(int idKiosco) {
        this.idKiosco = idKiosco;
    }

    public void setUbicacion(String ubicacionKiosco) {
        this.ubicacionKiosco = ubicacionKiosco;
    }

    public void setRenta(Long renta) {
        this.renta = renta;
    }

    /*
    * Obtiene la fecha de nacimiento
    * @return
    */
    public int getidKiosco(){
    	return this.idKiosco;
    }
}
