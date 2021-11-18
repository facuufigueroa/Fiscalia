package Model;


import java.util.Date;

public abstract class Informacion {
    private Date fecha;

    public Informacion(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
