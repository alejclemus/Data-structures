package com.company;

public class Débitos {
    int contador=0;
    int posición=-1;
    double [] débitos= new double [10];
    Operaciones op=new Operaciones();
    double totalDébitos =0;

    public void ingresarCréditos()
    {
        op.ingresar(débitos,contador,posición);
    }

    public void sumaDébitos()
    {
        totalDébitos =op.suma(débitos);
    }

    public void mostrarTotalDébitos()
    {
        System.out.print("Total de débitos: "+totalDébitos);
    }

    public void mostrarPromedio()
    {
        System.out.print("Promedio de débitos"+op.promedio(débitos,contador));
    }

    public void mostrarConteo()
    {
        System.out.print("Número de débitos: "+contador);
    }

    public void imprimir()
    {
        op.elementosArreglos(débitos);
    }
}
