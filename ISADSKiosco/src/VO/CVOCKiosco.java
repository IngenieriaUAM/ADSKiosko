package VO;

import java.sql.Date;

public class CVOCKiosco {

    private int idKiosco;
    private String ubicacionKiosco;
    private Long renta;

    /*
     * Constructor por default
     */
    public CVOCKiosco() {
    }

    public CVOCKiosco(int pidKiosco, String ubicacionK, Long renta) {
        this.setIdKiosco(pidKiosco);
        this.setRenta(renta);
        this.setUbicacion(ubicacionK);

    }

    /**
     * Metod para comprara si dos objetos de CVOCKiosco son iguales
     * @param oVOCKiosco la instacia que se va a comparar con la que lo mando a llamar
     * @return true si el identificador del kiosco, la ubicacion y la renta son iguales, false en cualquier otro caso
     */
    public boolean equals(CVOCKiosco oVOCKiosco) {
        if (oVOCKiosco.getIdKiosco() == this.idKiosco) {
            if (oVOCKiosco.getUbicacion().equalsIgnoreCase(this.getUbicacion())) {
                if (oVOCKiosco.getRenta() == this.renta) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
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
    public int getidKiosco() {
        return this.idKiosco;
    }
}
