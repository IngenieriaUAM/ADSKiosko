package VO;
 import java.util.Random;
import java.sql.Date;

public class CVODevolucion {
  private Long idDevolucion;
  private Long idrenta;
  private Long idCliente;
  private Long idBicicleta;
  private String NombreCliente;
  private String fechainicio;
  private String fechadevolucion;
  private Long multa;


    public CVODevolucion(Long idDevolucion, Long idrenta, Long idCliente, Long idBicicleta, String NombreCliente, String fechainicio, String fechadevolucion, Long multa) {
        this.idDevolucion = idDevolucion;
        this.idrenta = idrenta;
        this.idCliente = idCliente;
        this.idBicicleta = idBicicleta;
        this.NombreCliente = NombreCliente;
        this.fechainicio = fechainicio;
        this.fechadevolucion = fechadevolucion;
        this.multa = multa;
    }

    public void setIdDevolucion(Long idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public void setIdrenta(Long idrenta) {
        this.idrenta = idrenta;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdBicicleta(Long idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public void setFechadevolucion(String fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public void setMulta(Long multa) {
        this.multa = multa;
    }

    public Long getIdDevolucion() {
        Random rm = new Random(4);
        return rm.nextLong();
        
    }

    public Long getIdrenta() {
        return idrenta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public Long getIdBicicleta() {
        return idBicicleta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public String getFechainicio() {
        return "now()";
    }

    public String getFechadevolucion() {
        return "now()";
    }

    public Long getMulta() {
        return 0L;
    }

 
}
