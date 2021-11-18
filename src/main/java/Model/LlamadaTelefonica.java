package Model;

import java.util.Date;

public class LlamadaTelefonica extends Informacion{

    private long numeroReceptor;
    private long numeroEmisor;
    private long duracion;

    public LlamadaTelefonica(Date fecha, long numeroReceptor, long numeroEmisor, long duracion) {
        super(fecha);
        this.numeroReceptor = numeroReceptor;
        this.numeroEmisor = numeroEmisor;
        this.duracion = duracion;
    }


    public long getNumeroReceptor() {
        return numeroReceptor;
    }

    public void setNumeroReceptor(long numeroReceptor) {
        this.numeroReceptor = numeroReceptor;
    }

    public long getNumeroEmisor() {
        return numeroEmisor;
    }

    public void setNumeroEmisor(long numeroEmisor) {
        this.numeroEmisor = numeroEmisor;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }
}
