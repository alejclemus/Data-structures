package com.company;

public class Créditos {
    int contador=0;
    int posición=-1;
    double totalCréditos=0;
    double [] créditos= new double [10];

    Operaciones op=new Operaciones();
    Saldo sal=new Saldo();
    Débitos deb= new Débitos();


    public double Valor(int pos)
    {
        return this.créditos[pos];
    }

    public void ingresarCréditos()
    {
        op.ingresar(créditos,contador,posición);
    }

    public void sumaCréditos()
    {
        totalCréditos=op.suma(créditos);
    }

    public void mostrarTotalCréditos()
    {
        System.out.print("Total: "+totalCréditos);
    }

    public void mostrarConteo()
    {
        System.out.print("Número de créditos: "+contador);
    }

    public void imprimir()
    {
        op.elementosArreglos(créditos);
    }

    public void eliminarCrédito(int eliminar)
    {
        int j=0;
        double[] créditosnuevo= new double[10];
        for(int i=0; i < créditos.length; i++)
        {
            if(créditos[i] != eliminar)
                créditosnuevo[j++] = créditos[i];
        }
        créditos=créditosnuevo;
        posición--;
        contador--;
        totalCréditos=0;
        sumaCréditos();
        mostrarTotalCréditos();
        sal.saldo();
        sal.mostrarSaldo();
        deb.mostrarPromedio();
        mostrarConteo();
    }
}
