package Model;

import java.util.Date;
import java.util.List;

public class Causa {

    private String numExpediente;
    private String victima;
    private String victimario;
    private List<Informacion> informaciones;
    private String contexto;
    private Date fecha;

    public Causa(String numExpediente, String victima, String victimario, List<Informacion> informaciones, String contexto, Date fecha) {
        this.numExpediente = numExpediente;
        this.victima = victima;
        this.victimario = victimario;
        this.informaciones = informaciones;
        this.contexto = contexto;
        this.fecha = fecha;
    }


    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public String getVictimario() {
        return victimario;
    }

    public void setVictimario(String victimario) {
        this.victimario = victimario;
    }

    public List<Informacion> getInformaciones() {
        return informaciones;
    }

    public void setInformaciones(List<Informacion> informaciones) {
        this.informaciones = informaciones;
    }

    public String getContexto() {
        return contexto;
    }

    public void setContexto(String contexto) {
        this.contexto = contexto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
