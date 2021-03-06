package Model;

import java.util.Date;

public class MovimientoBancario extends Informacion{

    private String cuenta;
    private String usuario;
    private String tipoTransaccion;
    private double monto;
    private String moneda;
    private String datoCajero;


    public MovimientoBancario(Date fecha, String cuenta, String usuario, String tipoTransaccion, double monto, String moneda, String datoCajero) {
        super(fecha);
        this.cuenta = cuenta;
        this.usuario = usuario;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
        this.moneda = moneda;
        this.datoCajero = datoCajero;
    }


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getDatoCajero() {
        return datoCajero;
    }

    public void setDatoCajero(String datoCajero) {
        this.datoCajero = datoCajero;
    }
}
