package com.company;

public class RecibodeCompra {
    Compra infoC=new Compra();
    Crédito infoP=new Crédito();
    double total;

    public void Saldo(){
        total+=infoC.totalCompra-infoP.totalPagos;
    }

    public String mostrarSaldoPendiente(){
       return ("Saldo pendiente: "+total);
    }
}
