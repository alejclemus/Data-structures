package com.company;

public class Pago {
    String tipoPago;
    Double monto;

    public Pago(String p, Double m){
        this.tipoPago=p;
        this.monto=m;
    }

    public Double getMonto() {
        return this.monto;
    }

    public String getTipoPago() {
        return this.tipoPago;
    }

}
