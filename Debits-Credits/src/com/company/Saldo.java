package com.company;

public class Saldo {
    double totalSaldo=0;
    Créditos cred=new Créditos();
    Débitos deb=new Débitos();
    public void saldo()
    {
        totalSaldo=cred.totalCréditos+deb.totalDébitos;
    }

    public void mostrarSaldo()
    {
        System.out.print("Saldo"+totalSaldo);
    }
}
