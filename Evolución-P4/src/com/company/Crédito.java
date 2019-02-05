package com.company;

public class Crédito {
    Pago[][] pagosRegistrados;
    int x;
    int y;
    double totalPagos;

    public void catalogoProductos(){
       pagosRegistrados=new Pago[5][5];
        x=-1;
        y=-1;
    }

    public void ingresarPago(String t,double m)
    {
        Pago pagoTemp= new Pago(t,m);
        pagosRegistrados[x++][y++]=pagoTemp;
        totalPagos=pagosRegistrados[x][y].monto;
        x--;
        if (y==4)
        {
            x++;
        }
    }

    public String mostrarPagos(){
        return ("Total de pagos: "+totalPagos);
    }


}
