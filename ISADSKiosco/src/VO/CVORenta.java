package VO;

/**
 *
 * @author jonathan
 */
public class CVORenta {
    private Long idRenta;
    private String fechaInicio;
    private String fechaDev;
    private Long idCliente;
    private Long idBicicleta;
    private String statRenta;
    private Long idKiosco;
    
    public CVORenta(){
        
    }
    public CVORenta(Long pidRenta,String pfechaInicio,String pfechaDev, Long pidCliente, Long pidBicicleta, String pstatRenta,Long pidKiosco){
        idRenta=pidRenta;
        fechaInicio=pfechaInicio;
        fechaDev=pfechaDev;
        idCliente=pidCliente;
        idBicicleta=pidBicicleta;
        statRenta=pstatRenta; 
        idKiosco=pidKiosco;
    }

    public void setIdKiosco(Long idKiosco) {
        this.idKiosco = idKiosco;
    }

    public void setIdRenta(Long idRenta) {
        this.idRenta = idRenta;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaDev(String fechaDev) {
        this.fechaDev = fechaDev;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdBicicleta(Long idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public void setStatRenta(String statRenta) {
        this.statRenta = statRenta;
    }

    public Long getIdRenta() {
        return idRenta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaDev() {
        return fechaDev;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public Long getIdBicicleta() {
        return idBicicleta;
    }

    public String getStatRenta() {
        return statRenta;
    }

    public Long getIdKiosco() {
        return idKiosco;
    }
    
    
}
