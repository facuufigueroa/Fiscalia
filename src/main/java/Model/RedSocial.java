package Model;

import java.util.Date;

public class RedSocial extends Informacion{



    private String tipo;
    private String perfil;
    private String descripcion;

    public RedSocial(Date fecha, String tipo, String perfil, String descripcion) {
        super(fecha);
        this.tipo = tipo;
        this.perfil = perfil;
        this.descripcion = descripcion;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
