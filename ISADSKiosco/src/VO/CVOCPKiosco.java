package VO;

/**
 *
 * @author neto
 */
public class CVOCPKiosco {
    private Long idKiosko;
    private String ubicacionKiosko;
    private Long idRenta;

    public CVOCPKiosco() {
    }

    public CVOCPKiosco(Long idKiosko, String ubicacionKiosko, Long idRenta) {
        this.idKiosko = idKiosko;
        this.ubicacionKiosko = ubicacionKiosko;
        this.idRenta = idRenta;
    }

    public Long getIdKiosko() {
        return idKiosko;
    }

    public String getUbicacionKiosko() {
        return ubicacionKiosko;
    }

    public Long getIdRenta() {
        return idRenta;
    }

    public void setIdKiosko(Long idKiosko) {
        this.idKiosko = idKiosko;
    }

    public void setUbicacionKiosko(String ubicacionKiosko) {
        this.ubicacionKiosko = ubicacionKiosko;
    }    
}
